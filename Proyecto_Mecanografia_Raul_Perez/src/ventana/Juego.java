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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Juego extends JPanel implements KeyListener {

	private JPanel panel;
	ArrayList<JButton> teclas = new ArrayList<JButton>();
	public Juego() {
		setBounds(0, 0, 1920, 1080);
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
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 192, 192, 192, 192, 192, 192, 192, 192, 192, 192, 0 };
		gbl_panel_1.rowHeights = new int[] { 116, 116, 116, 116, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnQ = new JButton("Q");
		btnQ.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		GridBagConstraints gbc_btnQ = new GridBagConstraints();
		gbc_btnQ.fill = GridBagConstraints.BOTH;
		gbc_btnQ.insets = new Insets(0, 0, 5, 5);
		gbc_btnQ.gridx = 0;
		gbc_btnQ.gridy = 0;
		panel_1.add(btnQ, gbc_btnQ);

		JButton btnW = new JButton("W");
		GridBagConstraints gbc_btnW = new GridBagConstraints();
		gbc_btnW.fill = GridBagConstraints.BOTH;
		gbc_btnW.insets = new Insets(0, 0, 5, 5);
		gbc_btnW.gridx = 1;
		gbc_btnW.gridy = 0;
		panel_1.add(btnW, gbc_btnW);

		JButton btnE = new JButton("E");
		GridBagConstraints gbc_btnE = new GridBagConstraints();
		gbc_btnE.fill = GridBagConstraints.BOTH;
		gbc_btnE.insets = new Insets(0, 0, 5, 5);
		gbc_btnE.gridx = 2;
		gbc_btnE.gridy = 0;
		panel_1.add(btnE, gbc_btnE);

		JButton btnR = new JButton("R");
		GridBagConstraints gbc_btnR = new GridBagConstraints();
		gbc_btnR.fill = GridBagConstraints.BOTH;
		gbc_btnR.insets = new Insets(0, 0, 5, 5);
		gbc_btnR.gridx = 3;
		gbc_btnR.gridy = 0;
		panel_1.add(btnR, gbc_btnR);

		JButton btnT = new JButton("T");
		GridBagConstraints gbc_btnT = new GridBagConstraints();
		gbc_btnT.fill = GridBagConstraints.BOTH;
		gbc_btnT.insets = new Insets(0, 0, 5, 5);
		gbc_btnT.gridx = 4;
		gbc_btnT.gridy = 0;
		panel_1.add(btnT, gbc_btnT);

		JButton btnY = new JButton("Y");
		GridBagConstraints gbc_btnY = new GridBagConstraints();
		gbc_btnY.fill = GridBagConstraints.BOTH;
		gbc_btnY.insets = new Insets(0, 0, 5, 5);
		gbc_btnY.gridx = 5;
		gbc_btnY.gridy = 0;
		panel_1.add(btnY, gbc_btnY);

		JButton btnU = new JButton("U");
		GridBagConstraints gbc_btnU = new GridBagConstraints();
		gbc_btnU.fill = GridBagConstraints.BOTH;
		gbc_btnU.insets = new Insets(0, 0, 5, 5);
		gbc_btnU.gridx = 6;
		gbc_btnU.gridy = 0;
		panel_1.add(btnU, gbc_btnU);

		JButton btnI = new JButton("I");
		GridBagConstraints gbc_btnI = new GridBagConstraints();
		gbc_btnI.fill = GridBagConstraints.BOTH;
		gbc_btnI.insets = new Insets(0, 0, 5, 5);
		gbc_btnI.gridx = 7;
		gbc_btnI.gridy = 0;
		panel_1.add(btnI, gbc_btnI);

		JButton btnO = new JButton("O");
		GridBagConstraints gbc_btnO = new GridBagConstraints();
		gbc_btnO.fill = GridBagConstraints.BOTH;
		gbc_btnO.insets = new Insets(0, 0, 5, 5);
		gbc_btnO.gridx = 8;
		gbc_btnO.gridy = 0;
		panel_1.add(btnO, gbc_btnO);

		JButton btnP = new JButton("P");
		GridBagConstraints gbc_btnP = new GridBagConstraints();
		gbc_btnP.fill = GridBagConstraints.BOTH;
		gbc_btnP.insets = new Insets(0, 0, 5, 0);
		gbc_btnP.gridx = 9;
		gbc_btnP.gridy = 0;
		panel_1.add(btnP, gbc_btnP);

		JButton btnA = new JButton("A");
		GridBagConstraints gbc_btnA = new GridBagConstraints();
		gbc_btnA.fill = GridBagConstraints.BOTH;
		gbc_btnA.insets = new Insets(0, 0, 5, 5);
		gbc_btnA.gridx = 0;
		gbc_btnA.gridy = 1;
		panel_1.add(btnA, gbc_btnA);

		JButton btnS = new JButton("S");
		GridBagConstraints gbc_btnS = new GridBagConstraints();
		gbc_btnS.fill = GridBagConstraints.BOTH;
		gbc_btnS.insets = new Insets(0, 0, 5, 5);
		gbc_btnS.gridx = 1;
		gbc_btnS.gridy = 1;
		panel_1.add(btnS, gbc_btnS);

		JButton btnD = new JButton("D");
		GridBagConstraints gbc_btnD = new GridBagConstraints();
		gbc_btnD.fill = GridBagConstraints.BOTH;
		gbc_btnD.insets = new Insets(0, 0, 5, 5);
		gbc_btnD.gridx = 2;
		gbc_btnD.gridy = 1;
		panel_1.add(btnD, gbc_btnD);

		JButton btnF = new JButton("F");
		GridBagConstraints gbc_btnF = new GridBagConstraints();
		gbc_btnF.fill = GridBagConstraints.BOTH;
		gbc_btnF.insets = new Insets(0, 0, 5, 5);
		gbc_btnF.gridx = 3;
		gbc_btnF.gridy = 1;
		panel_1.add(btnF, gbc_btnF);

		JButton btnG = new JButton("G");
		GridBagConstraints gbc_btnG = new GridBagConstraints();
		gbc_btnG.fill = GridBagConstraints.BOTH;
		gbc_btnG.insets = new Insets(0, 0, 5, 5);
		gbc_btnG.gridx = 4;
		gbc_btnG.gridy = 1;
		panel_1.add(btnG, gbc_btnG);

		JButton btnH = new JButton("H");
		GridBagConstraints gbc_btnH = new GridBagConstraints();
		gbc_btnH.fill = GridBagConstraints.BOTH;
		gbc_btnH.insets = new Insets(0, 0, 5, 5);
		gbc_btnH.gridx = 5;
		gbc_btnH.gridy = 1;
		panel_1.add(btnH, gbc_btnH);

		JButton btnJ = new JButton("J");
		GridBagConstraints gbc_btnJ = new GridBagConstraints();
		gbc_btnJ.fill = GridBagConstraints.BOTH;
		gbc_btnJ.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ.gridx = 6;
		gbc_btnJ.gridy = 1;
		panel_1.add(btnJ, gbc_btnJ);

		JButton btnK = new JButton("K");
		GridBagConstraints gbc_btnK = new GridBagConstraints();
		gbc_btnK.fill = GridBagConstraints.BOTH;
		gbc_btnK.insets = new Insets(0, 0, 5, 5);
		gbc_btnK.gridx = 7;
		gbc_btnK.gridy = 1;
		panel_1.add(btnK, gbc_btnK);

		JButton btnL = new JButton("L");
		GridBagConstraints gbc_btnL = new GridBagConstraints();
		gbc_btnL.fill = GridBagConstraints.BOTH;
		gbc_btnL.insets = new Insets(0, 0, 5, 5);
		gbc_btnL.gridx = 8;
		gbc_btnL.gridy = 1;
		panel_1.add(btnL, gbc_btnL);

		JButton btnNN = new JButton("Ñ");
		GridBagConstraints gbc_btnNN = new GridBagConstraints();
		gbc_btnNN.fill = GridBagConstraints.BOTH;
		gbc_btnNN.insets = new Insets(0, 0, 5, 0);
		gbc_btnNN.gridx = 9;
		gbc_btnNN.gridy = 1;
		panel_1.add(btnNN, gbc_btnNN);

		JButton btnZ = new JButton("Z");
		GridBagConstraints gbc_btnZ = new GridBagConstraints();
		gbc_btnZ.fill = GridBagConstraints.BOTH;
		gbc_btnZ.insets = new Insets(0, 0, 5, 5);
		gbc_btnZ.gridx = 0;
		gbc_btnZ.gridy = 2;
		panel_1.add(btnZ, gbc_btnZ);

		JButton btnX = new JButton("X");
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.fill = GridBagConstraints.BOTH;
		gbc_btnX.insets = new Insets(0, 0, 5, 5);
		gbc_btnX.gridx = 1;
		gbc_btnX.gridy = 2;
		panel_1.add(btnX, gbc_btnX);

		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 2;
		panel_1.add(btnC, gbc_btnC);

		JButton btnV = new JButton("V");
		GridBagConstraints gbc_btnV = new GridBagConstraints();
		gbc_btnV.fill = GridBagConstraints.BOTH;
		gbc_btnV.insets = new Insets(0, 0, 5, 5);
		gbc_btnV.gridx = 3;
		gbc_btnV.gridy = 2;
		panel_1.add(btnV, gbc_btnV);

		JButton btnB = new JButton("B");
		GridBagConstraints gbc_btnB = new GridBagConstraints();
		gbc_btnB.fill = GridBagConstraints.BOTH;
		gbc_btnB.insets = new Insets(0, 0, 5, 5);
		gbc_btnB.gridx = 4;
		gbc_btnB.gridy = 2;
		panel_1.add(btnB, gbc_btnB);

		JButton btnN = new JButton("N");
		GridBagConstraints gbc_btnN = new GridBagConstraints();
		gbc_btnN.fill = GridBagConstraints.BOTH;
		gbc_btnN.insets = new Insets(0, 0, 5, 5);
		gbc_btnN.gridx = 5;
		gbc_btnN.gridy = 2;
		panel_1.add(btnN, gbc_btnN);

		JButton btnM = new JButton("M");
		GridBagConstraints gbc_btnM = new GridBagConstraints();
		gbc_btnM.fill = GridBagConstraints.BOTH;
		gbc_btnM.insets = new Insets(0, 0, 5, 5);
		gbc_btnM.gridx = 6;
		gbc_btnM.gridy = 2;
		panel_1.add(btnM, gbc_btnM);

		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 7;
		gbc_lblNewLabel.gridy = 2;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 8;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 9;
		gbc_lblNewLabel_1.gridy = 2;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 3;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 3;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);

		JButton espacio = new JButton("Espacio");
		GridBagConstraints gbc_espacio = new GridBagConstraints();
		gbc_espacio.gridwidth = 3;
		gbc_espacio.fill = GridBagConstraints.BOTH;
		gbc_espacio.insets = new Insets(0, 0, 0, 5);
		gbc_espacio.gridx = 3;
		gbc_espacio.gridy = 3;
		panel_1.add(espacio, gbc_espacio);

		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 6;
		gbc_label.gridy = 3;
		panel_1.add(label, gbc_label);

		JLabel label2 = new JLabel("");
		GridBagConstraints gbc_label1 = new GridBagConstraints();
		gbc_label1.insets = new Insets(0, 0, 0, 5);
		gbc_label1.gridx = 7;
		gbc_label1.gridy = 3;
		panel_1.add(label2, gbc_label1);

		JLabel lblNewLabel_6 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 8;
		gbc_lblNewLabel_6.gridy = 3;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		teclas.add(btnA);
		teclas.add(btnB);
		teclas.add(btnC);
		teclas.add(btnD);
		teclas.add(btnE);
		teclas.add(btnF);
		teclas.add(btnG);
		teclas.add(btnH);
		teclas.add(btnI);
		teclas.add(btnJ);
		teclas.add(btnK);
		teclas.add(btnL);
		teclas.add(btnM);
		teclas.add(btnN);
		teclas.add(btnO);
		teclas.add(btnP);
		teclas.add(btnQ);
		teclas.add(btnR);
		teclas.add(btnS);
		teclas.add(btnT);
		teclas.add(btnU);
		teclas.add(btnV);
		teclas.add(btnW);
		teclas.add(btnX);
		teclas.add(btnY);
		teclas.add(btnZ);
		teclas.add(espacio);
		requestFocusInWindow();
		 setFocusable(true);
		addKeyListener(this);
	}

	 @Override
	    public void keyTyped(KeyEvent e) {
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	        char tecla = Character.toUpperCase(e.getKeyChar()); // Convertir a mayúscula
	        marcarBoton(tecla);
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
	        char tecla = Character.toUpperCase(e.getKeyChar()); // Convertir a mayúscula
	        desmarcarBoton(tecla);
	    }

	    private void marcarBoton(char tecla) {
	        String t = String.valueOf(tecla);
	        for (JButton boton : teclas) {
	            if (boton.getText().equals(t)
	                    || (tecla == ' ' && boton.getText().equalsIgnoreCase("Espacio"))) {
	                boton.setBackground(Color.YELLOW); // Cambiar el color del botón
	            }
	        }
	    }

	    private void desmarcarBoton(char tecla) {
	        for (JButton boton : teclas) {
	            if (boton.getText().equalsIgnoreCase(String.valueOf(tecla))
	                    || (tecla == ' ' && boton.getText().equalsIgnoreCase("Espacio"))) {
	                boton.setBackground(null); // Restaurar el color original
	            }
	        }
	    }
	}