package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Login extends JPanel {
	private JPanel panel;
	private JTextField campoUser;
	private JTextField campoContra;

	public Login() {
		setBounds(0,0,1920,1080);
		panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		add(panel);
		panel.setLayout(null);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 50));
		usuario.setBounds(322, 619, 382, 155);
		panel.add(usuario);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 76));
		titulo.setBounds(714, 107, 831, 206);
		panel.add(titulo);
		
		campoUser = new JTextField();
		campoUser.setBounds(926, 670, 449, 66);
		panel.add(campoUser);
		campoUser.setColumns(10);
		
		campoContra = new JTextField();
		campoContra.setBounds(926, 853, 449, 66);
		panel.add(campoContra);
		campoContra.setColumns(10);
		
		JLabel contrasena = new JLabel("Contraseña");
		contrasena.setFont(new Font("Tahoma", Font.PLAIN, 50));
		contrasena.setBounds(322, 853, 302, 78);
		panel.add(contrasena);

	}
}
