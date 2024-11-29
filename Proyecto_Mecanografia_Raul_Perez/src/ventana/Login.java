package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import ficheros.LeerUsuarios;
import ficheros.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JPanel {
	private JPanel panel;
	private JTextField campoUser;
	private JTextField campoContra;

	public Login() {
		setBounds(0, 0, 1920, 1080);
		panel = new JPanel();//creamos un nuevo panel
		panel.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		add(panel);//añadimos este panel al panel contenedor
		panel.setLayout(null);
		/**
		 * @param titulo									Etiqueta con el título del panel
		 * @param usuario									Etiqueta para inducar al usuario donde poner su usuario
		 * @param campoUser									Campo que recoge el nombre de usuario 
		 * @param contrasena 								Etiqueta que indica al usuario donde poner la contraseña
		 * @param campoContra								Campo que recoge la contraseña y muestra pntos por pantalla
		 * @param error										Etiqueta que muestra que estará invisible por defecto y se
		 * 													mostrará cuando el usuario o contraseña no coinciden con 
		 * 													ninguna de los usuarios cargados en el fichero	
		 * @param inicio									Botón que permitirá avanzar a la siguiente pantalla si 
		 * 													el nombre y contraseña son correctos									
		 */
		
		JLabel titulo = new JLabel("Inicio de sesión");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 76));
		titulo.setBounds(714, 107, 831, 206);
		panel.add(titulo);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 50));
		usuario.setBounds(322, 619, 382, 155);
		panel.add(usuario);

		campoUser = new JTextField();
		campoUser.setFont(new Font("Tahoma", Font.PLAIN, 50));
		campoUser.setBounds(926, 670, 449, 66);
		panel.add(campoUser);
		campoUser.setColumns(10);

		campoContra = new JPasswordField();
		campoContra.setFont(new Font("Tahoma", Font.PLAIN, 50));
		campoContra.setBounds(926, 853, 449, 66);
		panel.add(campoContra);
		campoContra.setColumns(10);

		JLabel contrasena = new JLabel("Contraseña");
		contrasena.setFont(new Font("Tahoma", Font.PLAIN, 50));
		contrasena.setBounds(322, 853, 302, 78);
		panel.add(contrasena);

		JLabel error = new JLabel("Usuario o contraseña incorrectos, intentalo otra vez");
		error.setVisible(false);
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.PLAIN, 17));
		error.setBounds(799, 468, 438, 55);
		panel.add(error);
		
		JButton inicio = new JButton("Iniciar sesión\r\n");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comprobarLogin(campoUser.getText(), campoContra.getText(),error);
				Frame.cambiarVentana("menu");
			}
		});
		inicio.setBounds(1639, 935, 188, 55);
		panel.add(inicio);
		
		
	}

	private void comprobarLogin(String user, String pwd, JLabel error) {
		/**
		 * Comprueba que el usuario es correcto y avanza a la siguiente ventana
		 */
		boolean correcto = false;
		ArrayList<Usuario> users = (new LeerUsuarios()).users();
		do {
			for (Usuario u : users) {
				if (u.getNombre().equals(user)&&u.getContrasena().equals(pwd)) {
					correcto=true;
					error.setVisible(false);
					Frame.cambiarVentana("menu");
				}
				else {
					error.setVisible(true);
				}
			}
		} while (!correcto);
	}
}
