package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class Juego extends JPanel{

	private JPanel panel;

	public Juego() {
		setBounds(0,0,1920,1080);
		panel = new JPanel();
		panel.setBounds(0, 0, 1920, 615);
		setLayout(null);
		add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 1920, 615);
		panel.add(textPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 614, 1920, 467);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 10, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.CYAN);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("New button");
		panel_1.add(button);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_1.add(btnNewButton_11);		
		JButton btnNewButton_12 = new JButton("New button");
		panel_1.add(btnNewButton_12);		
		JButton btnNewButton_13 = new JButton("New button");
		panel_1.add(btnNewButton_13);		
		JButton btnNewButton_14 = new JButton("New button");
		panel_1.add(btnNewButton_14);		
		JButton btnNewButton_15 = new JButton("New button");
		panel_1.add(btnNewButton_15);		
		JButton btnNewButton_16 = new JButton("New button");
		panel_1.add(btnNewButton_16);		
		JButton btnNewButton_17 = new JButton("New button");
		panel_1.add(btnNewButton_17);		
		JButton btnNewButton_18 = new JButton("New button");
		panel_1.add(btnNewButton_18);
		
	}
}
