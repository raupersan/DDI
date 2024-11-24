package ventana;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Rectangle;
import java.awt.Dimension;


public class Frame extends JPanel {
	private JFrame frame = new JFrame("Frame");
	private CardLayout cl = new CardLayout();
	private JPanel contenedor = new JPanel();
	private BarraCarga pantallaCarga = new BarraCarga(new JPanel());
	private JPanel pantallaLogin = new JPanel();

	public Frame() {
		contenedor.setLayout(cl);
		contenedor.add(pantallaCarga, "1");
		contenedor.add(pantallaLogin, "2");
		cl.show(contenedor, "1");
		cl.show(contenedor, "2");

		
		frame.getContentPane().add(contenedor);
		frame.setResizable(false);
		frame.setMinimumSize(new Dimension(1800, 1000));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
