package ventana;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;


public class Frame extends JPanel {
	private JFrame frame = new JFrame("Frame");
	private CardLayout cl = new CardLayout();
	private JPanel contenedor = new JPanel();
	private JPanel pantallaCarga = new JPanel();
	private JPanel pantallaLogin = new JPanel();

	public Frame() {
		frame.setLayout(cl);
		pantallaCarga  = crearPanel("Cargando");
		add(pantallaCarga, "Pantalla de carga");
		add(pantallaLogin, "Inicio de sesión");

	
	}
	private JPanel crearPanel(String nombre) {
	      JPanel panel = new JPanel(new GridBagLayout());
	      panel.add(new JLabel(nombre));
	      return panel;
	   }
}
