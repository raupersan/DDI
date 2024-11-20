package ventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Frame {
	public JFrame frame;
	public Timer timer;

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

		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 0, 314, 44);
		panel.add(progressBar);
		progressBar.setValue(0);
		progressBar.setMaximum(6);
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue() + 1);
				if (progressBar.getValue() == progressBar.getMaximum()) {
					BufferedImage imagen = null;
					timer.stop();
				}
				progressBar.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
					}
				});
			}
		});
	}
}