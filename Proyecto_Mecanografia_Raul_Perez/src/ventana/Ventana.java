package ventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;

public class Ventana {
	Timer timer;

	public JFrame frame;

	public Ventana() {
		initialize();
	}
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JProgressBar barraCarga = new JProgressBar();
		frame.getContentPane().add(barraCarga, BorderLayout.SOUTH);
		barraCarga.setStringPainted(true);
		barraCarga.setValue(0);
		barraCarga.setMaximum(6);
		timer = new Timer(1000, new ActionListener() {
			int i = barraCarga.getMaximum();
			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				barraCarga.setValue(barraCarga.getValue() + 1);
				if (i == 0) {
					timer.stop();
				}
				barraCarga.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {

					}
				});
			}
		});
	}
}
