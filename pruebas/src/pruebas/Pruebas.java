package pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pruebas {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruebas window = new Pruebas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pruebas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel login = new JPanel();
		login.setBounds(0, 0, 434, 261);
		login.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(login);
		login.setLayout(null);
		
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
