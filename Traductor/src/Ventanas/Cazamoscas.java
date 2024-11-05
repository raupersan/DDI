package Ventanas;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;
import java.awt.event.MouseEvent;

public class Cazamoscas {

	private JFrame frame;

	Random aleatorio= new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cazamoscas window = new Cazamoscas();
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
	public Cazamoscas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Carta = new JLabel("Posición ratón");
		Carta.setBounds(10, 412, 86, 14);
		frame.getContentPane().add(Carta);
		Carta.setIcon(new ImageIcon(Cazamoscas.class.getResource("png-clipart-computer-icons-orion-s-star-quilt-50x50.png")));
		
		ImageIcon miniCarta = new ImageIcon(Cazamoscas.class.getResource("png-clipart-computer-icons-orion-s-star-quilt-50x50.png"));
		Image cartaCambiada=miniCarta.getImage().getScaledInstance(50, 50, Image.SCALE_FAST);
		
		Carta.setBounds(0, 0, 50, 50);
		frame.getContentPane().add(Carta, BorderLayout.WEST);
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int punterox =  e.getX();
				int punteroy = e.getY();
				
				int labelx= Carta.getX();
				int labely = Carta.getY();
				
				int tamx=Carta.getWidth();
				int tamy = Carta.getHeight();
				
				Carta.setText("X: " +labelx + " Y: " + labely);
			//	lblCoorPunt.setText("X: " +labelx + " Y: " + labely);
				
				int distanciax=Math.abs(labelx-punterox);
				int distanciay=Math.abs(labely-punteroy);
				
				int radio=50;
				
				if(distanciax<radio && distanciay < radio) {
					int moverx= aleatorio.nextInt(101)-50;
					int movery = aleatorio.nextInt(101)-50;
					
					int nuevax=Math.max(0, Math.min(labelx+moverx, frame.getWidth()-2*tamx));
					int nuevay=Math.max(0, Math.min(labely+movery, frame.getHeight()-2*tamy));
					
					Carta.setLocation(nuevax, nuevay);
				}
				
				
				
			}
		});
	}

}
