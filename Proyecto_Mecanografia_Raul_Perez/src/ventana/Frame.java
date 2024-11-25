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
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;

public class Frame extends JPanel {
	private JFrame frame = new JFrame("Frame");
	private static CardLayout cl = new CardLayout();
	private BarraCarga bc;
	public static JPanel contenedor = new JPanel();
	private Login login;
	private JPanel pantallaLogin = new JPanel();
	private final JButton iniciarSesion = new JButton("Iniciar Sesión");

	public Frame() {
		bc = new BarraCarga();
		login = new Login();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setMinimumSize(screenSize);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().add(contenedor);
		contenedor.setLayout(cl);
		contenedor.add(bc, "barraCarga");
		contenedor.add(login, "login");
		cl.show(contenedor, "barraCarga");

	}

	public static void cambiarVentana(String num) {
		cl.show(contenedor, num);
	}
}
