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
	private BarraCarga bc;

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
		JPanel pantallaCarga = new JPanel();
		pantallaCarga.setVisible(true);
		pantallaCarga.setBounds(829, 939, 314, 44);
		frame.getContentPane().add(pantallaCarga);
		pantallaCarga.setLayout(null);
		bc = new BarraCarga(new JProgressBar(),0,100,false);
		bc.setBounds(0, 0, 314, 44);
		pantallaCarga.add(bc);
	    bc.setStringPainted(true);
	    bc.start();
		JPanel login = new JPanel();
		login.setBounds(0, 0, 434, 261);
		login.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(login);
		login.setLayout(null);
		
		
	}
}