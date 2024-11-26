package ventana;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame extends JPanel {
	public JFrame frame = new JFrame("Mecanografía");
	private static CardLayout cl = new CardLayout();
	public static JPanel contenedor = new JPanel();
	private int salir;
	private BarraCarga bc;
	private Login login;
	private Dificultad dificultad;
	private Juego juego;

	public Frame() {
		bc = new BarraCarga();
		login = new Login();
		dificultad = new Dificultad();
		juego = new Juego();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				salir = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de querer salir?", "Aviso",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (salir == JOptionPane.YES_OPTION) {
					frame.dispose();
				}
			}
		});
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setMinimumSize(screenSize);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().add(contenedor);
		contenedor.setLayout(cl);
		contenedor.add(bc, "barraCarga");
		contenedor.add(login, "login");
		contenedor.add(dificultad, "dificultad");
		contenedor.add(juego, "juego");
		cl.show(contenedor, "barraCarga");

	}

	public static void cambiarVentana(String id) {
		cl.show(contenedor, id);
	}
}
