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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		btnQ.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		panel_1.add(btnQ);
		
		JButton btnW = new JButton("W");
		btnW.setBackground(Color.CYAN);
		panel_1.add(btnW);
		
		JButton btnE = new JButton("E");
		panel_1.add(btnE);
		
		JButton btnR = new JButton("R");
		panel_1.add(btnR);
		
		JButton btnT = new JButton("T");
		panel_1.add(btnT);
		
		JButton btnY = new JButton("Y");
		panel_1.add(btnY);
		
		JButton btnU = new JButton("U");
		panel_1.add(btnU);
		
		JButton btnI = new JButton("I");
		panel_1.add(btnI);
		
		JButton btnO = new JButton("O");
		panel_1.add(btnO);
		
		JButton btnP = new JButton("P");
		panel_1.add(btnP);
		
		JButton btnA = new JButton("A");
		panel_1.add(btnA);
		
		JButton btnS = new JButton("S");
		panel_1.add(btnS);		
		
		JButton btnD = new JButton("D");
		panel_1.add(btnD);		
		
		JButton btnF = new JButton("F");
		panel_1.add(btnF);	
		
		JButton btnG = new JButton("G");
		panel_1.add(btnG);	
		
		JButton btnH = new JButton("H");
		panel_1.add(btnH);	
		
		JButton btnJ = new JButton("J");
		panel_1.add(btnJ);	
		
		JButton btnK = new JButton("K");
		panel_1.add(btnK);
		
		JButton btnL = new JButton("L");
		panel_1.add(btnL);
		
		JButton btnNN = new JButton("Ñ");
		panel_1.add(btnNN);
		
		JButton btnZ = new JButton("Z");
		panel_1.add(btnZ);
		
		JButton btnX = new JButton("X");
		panel_1.add(btnX);
		
		JButton btnC = new JButton("C");
		panel_1.add(btnC);
		
		JButton btnV = new JButton("V");
		panel_1.add(btnV);
		
		JButton btnB = new JButton("B");
		panel_1.add(btnB);
		
		JButton btnN = new JButton("N");
		panel_1.add(btnN);
		
		JButton btnM = new JButton("M");
		panel_1.add(btnM);
	}
}
