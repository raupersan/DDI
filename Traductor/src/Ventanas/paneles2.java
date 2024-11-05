package Ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;

public class paneles2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paneles2 window = new paneles2();
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
	public paneles2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBackground(Color.GREEN);
		frame.getContentPane().add(panel_3, "name_13672034856600");
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(182, 209, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel_1, "name_13672045666200");
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setBounds(182, 209, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.PINK);
		frame.getContentPane().add(panel_2, "name_13672055234600");
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Next");
		btnNewButton_3.setBounds(182, 209, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setVisible(false);
		panel_4.setBackground(Color.BLUE);
		frame.getContentPane().add(panel_4, "name_13892923999700");
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Next");
		btnNewButton_4.setBounds(182, 209, 89, 23);
		panel_4.add(btnNewButton_4);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);

			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
		
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		
	}
}
