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
import javax.swing.JLabel;

public class Juego extends JPanel{

	private JPanel panel;

	public Juego() {
		setBounds(0,0,1920,1080);
		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 1920, 615);
		setLayout(null);
		add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 1920, 615);
		panel.add(textPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 615, 1920, 465);
		add(panel_1);
		panel_1.setLayout(new GridLayout(0, 10, 0, 0));
		
		JButton btnQ = new JButton("Q");
		panel_1.add(btnQ);
		
		JButton btnNewButton = new JButton("W");
		btnNewButton.setBackground(Color.CYAN);
		panel_1.add(btnNewButton);
		
	
		
		JButton btnNewButton_1 = new JButton("E");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("R");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("T");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Y");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("U");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("I");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("O");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("P");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("A");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("S");
		panel_1.add(btnNewButton_11);		
		
		JButton btnNewButton_13 = new JButton("D");
		panel_1.add(btnNewButton_13);		
		
		JButton btnNewButton_14 = new JButton("F");
		panel_1.add(btnNewButton_14);	
		
		JButton btnNewButton_15 = new JButton("G");
		panel_1.add(btnNewButton_15);	
		
		JButton btnNewButton_16 = new JButton("H");
		panel_1.add(btnNewButton_16);	
		
		JButton btnNewButton_17 = new JButton("New button");
		panel_1.add(btnNewButton_17);	
		
		JButton btnNewButton_18 = new JButton("New button");
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_29 = new JButton("New button");
		panel_1.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("New button");
		panel_1.add(btnNewButton_30);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_19 = new JButton("New button");
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("New button");
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("New button");
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("New button");
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("New button");
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("New button");
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("New button");
		panel_1.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("New button");
		panel_1.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("New button");
		panel_1.add(btnNewButton_27);
		
		
		
		
		
	}
}
