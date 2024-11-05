package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class paneles {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paneles window = new paneles();
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
	public paneles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel_1 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_4 = new JPanel();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 2, 0));
		

		panel_1.setBackground(Color.CYAN);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Mostar_Panel_1\r\n");
		btnNewButton.setBounds(49, 96, 128, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);
		
	
		panel_2.setVisible(false);
		panel_2.setBackground(Color.GREEN);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton_1 = new JButton("Mostrar_Panel_2");
		btnNewButton_1.setBounds(58, 96, 131, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
			}
		});
		panel_2.setLayout(null);
		panel_2.add(btnNewButton_1);
		
		
		panel_3.setVisible(false);
		panel_3.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_3);
		
		JButton btnNewButton_2 = new JButton("Mostrar_Panel_3\r\n");
		btnNewButton_2.setBounds(51, 96, 143, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btnNewButton_2);
		
	
		panel_4.setVisible(false);
		panel_4.setBackground(Color.RED);
		frame.getContentPane().add(panel_4);
		
		JButton btnNewButton_3 = new JButton("Mostrar_Panel_4");
		btnNewButton_3.setBounds(64, 96, 142, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_4.setVisible(false);
				panel_3.setVisible(false);

			}
		});
		panel_4.setLayout(null);
		panel_4.add(btnNewButton_3);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_1, panel_2, btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3}));
	}

}
