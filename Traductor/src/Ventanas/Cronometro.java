package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Cronometro {

	private JFrame frame;
	Timer timer;
	int i = 0;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro window = new Cronometro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cronometro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		JProgressBar progressBar = new JProgressBar();
		
		progressBar.setStringPainted(true);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Empezar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = 10;
				progressBar.setValue(0);
				timer.start();
				
			}
		});
		btnNewButton.setBounds(82, 179, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("10");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(276, 112, 158, 58);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Cronómetro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(158, 0, 109, 87);
		frame.getContentPane().add(lblNewLabel_1);

		
		progressBar.setMaximum(10);
		progressBar.setBounds(230, 188, 146, 14);
		frame.getContentPane().add(progressBar);

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				i --;
				lblNewLabel.setText(String.valueOf(i));
				progressBar.setValue(progressBar.getValue() + 1);
				if (i == 0) {
					BufferedImage imagen = null;
					try {
						imagen = ImageIO.read(new File("src/imagenDeFondo/136524.png"));

					} catch (IOException e1) {
						e1.printStackTrace();
					}

					lblNewLabel.setText("STOP");
					lblNewLabel.setVisible(true);
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
