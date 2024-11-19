package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class calc {

	private JFrame frame;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 332, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 176, 316, 325);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(6, 4, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		JButton btnNewButton_6 = new JButton("New button");
		panel.add(btnNewButton_6);
		JButton btnNewButton_7 = new JButton("New button");
		panel.add(btnNewButton_7);
		JButton btnNewButton_8 = new JButton("New button");
		panel.add(btnNewButton_8);
		JButton btnNewButton_9 = new JButton("New button");
		panel.add(btnNewButton_9);
		JButton btnNewButton_10 = new JButton("New button");
		panel.add(btnNewButton_10);
		JButton btnNewButton_11 = new JButton("New button");
		panel.add(btnNewButton_11);
		JButton btnNewButton_12 = new JButton("New button");
		panel.add(btnNewButton_12);
		JButton btnNewButton_13 = new JButton("New button");
		panel.add(btnNewButton_13);
		JButton btnNewButton_14 = new JButton("New button");
		panel.add(btnNewButton_14);
		JButton btnNewButton_15 = new JButton("New button");
		panel.add(btnNewButton_15);
		JButton btnNewButton_16 = new JButton("New button");
		panel.add(btnNewButton_16);
		JButton btnNewButton_17 = new JButton("New button");
		panel.add(btnNewButton_17);
		JButton btnNewButton_18 = new JButton("New button");
		panel.add(btnNewButton_18);
		JButton btnNewButton_19 = new JButton("New button");
		panel.add(btnNewButton_19);
		JButton btnNewButton_20 = new JButton("New button");
		panel.add(btnNewButton_20);
		JButton btnNewButton_21 = new JButton("New button");
		panel.add(btnNewButton_21);
		JButton btnNewButton_22 = new JButton("New button");
		panel.add(btnNewButton_22);
		JButton btnNewButton_23 = new JButton("New button");
		panel.add(btnNewButton_23);
		
	}
}
