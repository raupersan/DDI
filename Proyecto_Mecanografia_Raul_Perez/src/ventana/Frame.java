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
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Frame {
	Timer timer;

	public JFrame frame;

	public Frame() {
		initialize();
	}
	public void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 2000, 1080);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(829, 939, 314, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JProgressBar barraCarga = new JProgressBar();
		barraCarga.setBounds(0, 0, 314, 44);
		barraCarga.setValue(0);
		barraCarga.setStringPainted(true);
		barraCarga.setMaximum(6);
		panel.add(barraCarga);
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
