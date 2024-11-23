package ventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JPanel {
	
	public Login() {
	textField = new JTextField();
	textField.setBounds(249, 86, 115, 20);
	login.add(textField);
	textField.setColumns(10);
	
	JLabel Usuario = new JLabel("Usuario");
	Usuario.setBounds(88, 89, 74, 14);
	login.add(Usuario);
	
	JLabel contrasena = new JLabel("Contraseña");
	contrasena.setBounds(88, 177, 74, 14);
	login.add(contrasena);
	
	textField_1 = new JTextField();
	textField_1.setBounds(249, 174, 115, 20);
	login.add(textField_1);
	textField_1.setColumns(10);
	
	JLabel titulo = new JLabel("Mecanografía");
	titulo.setBounds(159, 11, 140, 50);
	login.add(titulo);
	
	JButton enviar = new JButton("Iniciar sesión");
	enviar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	enviar.setBounds(271, 227, 140, 23);
	login.add(enviar);
	}
}
