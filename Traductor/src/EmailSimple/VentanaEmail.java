package EmailSimple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import javax.swing.*;

public class VentanaEmail {

	private JFrame frame;
	private JTextField destinatario;
	private JLabel lblNewLabel_1;
	private JTextField asunto;
	private JLabel lblNewLabel_2;
	private JTextField cuerpo;
	private JMenu menuPpal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmail window = new VentanaEmail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaEmail() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para");
		lblNewLabel.setBounds(180, 10, 44, 23);
		frame.getContentPane().add(lblNewLabel);
		
		destinatario = new JTextField();
		
		destinatario.setBounds(234, 11, 137, 20);
		frame.getContentPane().add(destinatario);
		destinatario.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Asunto");
		lblNewLabel_1.setBounds(178, 68, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		asunto = new JTextField();
		asunto.setBounds(234, 57, 137, 36);
		frame.getContentPane().add(asunto);
		asunto.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Mensaje");
		lblNewLabel_2.setBounds(164, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		cuerpo = new JTextField();
		cuerpo.setBounds(234, 116, 137, 134);
		frame.getContentPane().add(cuerpo);
		cuerpo.setColumns(10);
		
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.enviarEmail(destinatario.getText(), asunto.getText(), Body.leerCuerpo("C:\\Users\\CFGS.LAB-35-PC04\\Desktop\\DDI\\Traductor\\src\\Ventanas\\example.txt"));
				
			}
		});
		enviar.setBounds(70, 227, 89, 23);
		frame.getContentPane().add(enviar);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menuPpal = new JMenu("Menú Principal\r\n");
		menuPpal.setForeground(Color.BLACK);
		menuPpal.setBorderPainted(true);
		menuPpal.setBackground(Color.RED);
		menuPpal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(menuPpal);
		
		JMenuItem submenu = new JMenuItem("Submenú");
		menuPpal.add(submenu);
		
		JMenu cambiar = new JMenu("Cambiar");
		menuPpal.add(cambiar);
		
		JMenuItem cambiarFondo = new JMenuItem("Cambiar Fondo\r\n");
		cambiar.add(cambiarFondo);
		cambiarFondo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
	}
}
