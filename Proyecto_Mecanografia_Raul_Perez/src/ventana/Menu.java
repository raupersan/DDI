package ventana;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {
	private JPanel panel;
	private JTextField campoUser;
	private JTextField campoContra;

	public Menu() {
		setBounds(0, 0, 1920, 1080);
		panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		add(panel);
		panel.setLayout(null);

		JLabel titulo = new JLabel("Menu");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 76));
		titulo.setBounds(856, 11, 283, 206);
		panel.add(titulo);

		JButton facil = new JButton("Fácil");
		facil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO cargar archivo dificil
			}
		});
		facil.setBounds(856, 397, 188, 55);
		;
		panel.add(facil);

		JButton dificil = new JButton("Dificil");
		dificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO cargar archivo dificil
			}
		});
		dificil.setBounds(856, 502, 188, 55);
		;
		panel.add(dificil);

		JButton volver = new JButton("Volver");
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.cambiarVentana("login");
			}
		});

		volver.setBounds(1696, 953, 114, 47);
		panel.add(volver);
		
		JButton stats = new JButton("Ver estadísticas");
		stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		stats.setBounds(856, 604, 188, 55);
		panel.add(stats);

	}
}
