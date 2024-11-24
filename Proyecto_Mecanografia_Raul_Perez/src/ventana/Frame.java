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
	private CardLayout cl = new CardLayout();
	private JPanel contenedor = new JPanel();
	private JPanel pantallaCarga = new JPanel();
	private JPanel pantallaLogin = new JPanel();
	private final JButton iniciarSesion = new JButton("Iniciar Sesión");

	public Frame() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setMinimumSize(screenSize);

		frame.getContentPane().add(contenedor);
		frame.setResizable(false);
		;
		frame.pack();
		frame.setVisible(true);

		contenedor.setLayout(cl);
		contenedor.add(pantallaCarga, "1");
		pantallaCarga.setLayout(null);

		JProgressBar barraCarga = new JProgressBar();
		barraCarga.setStringPainted(true);
		barraCarga.setBounds(600, 941, 727, 57);
		pantallaCarga.add(barraCarga);
		contenedor.add(pantallaLogin, "2");
		pantallaLogin.setLayout(null);
		iniciarSesion.setBounds(982, 950, 95, 23);

		pantallaLogin.add(iniciarSesion);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 46, 14);
		pantallaLogin.add(lblNewLabel);
		cl.show(contenedor, "1");
		new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				barraCarga.setValue(barraCarga.getValue() + 16);
				if (barraCarga.getValue() == 100) {
					((Timer) e.getSource()).stop();
					cl.show(contenedor, "2");
				}
			}
		}).start();

	}
}
