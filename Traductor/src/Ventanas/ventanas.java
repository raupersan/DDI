package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ventanas {

	private JFrame frmAshdis;
	private JTextField sESP;
	private JTextField sTraducida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanas window = new ventanas();
					window.frmAshdis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAshdis = new JFrame();
		frmAshdis.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanas.class.getResource("/Ventanas/27-05-19-17-46-36-tazapng.png")));
		frmAshdis.setTitle("ashdis");
		frmAshdis.setBounds(100, 100, 450, 300);
		frmAshdis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAshdis.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Traductor DAM\r\n");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel.setBounds(201, 11, 159, 14);
		frmAshdis.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Palabra traducida\r\n");
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(97, 168, 86, 14);
		frmAshdis.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Introduce palabra a traducir");
		lblNewLabel_2.setBounds(47, 67, 253, 14);
		frmAshdis.getContentPane().add(lblNewLabel_2);
		
		sESP = new JTextField();
		sESP.setBounds(274, 64, 120, 20);
		frmAshdis.getContentPane().add(sESP);
		sESP.setColumns(10);
		
		sTraducida = new JTextField();
		sTraducida.setEnabled(false);
		sTraducida.setBounds(274, 165, 120, 20);
		frmAshdis.getContentPane().add(sTraducida);
		sTraducida.setColumns(10);
		
		JButton btnNewButton = new JButton("Traducir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabraESP= sESP.getText();
				traducirING(palabraESP);
			}
			protected String traducirING(String palabra) {
				String cadena=null;
				Document documento=null;
				String webpage = "https://www.ingles.com/traductor/" + palabra;
				try {
					documento=Jsoup.connect(webpage).get();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				return palabra;
			}
			
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		frmAshdis.getContentPane().add(btnNewButton);
		
	}
}
