package ventana;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame extends JPanel {
	/**
	 * 			@param frame				Crea un Jframe sobre el que montaremos la aplicación con el título Mecanografía
	 * 			@param cl 					Crea uun CardLayout, que es el mecanismo que emplearemos para pasar de una
	 * 										ventana a otra
	 * 			@param contenedor			JPanel que tendrá el CardLayout, su función será contener al resto de paneles
	 * 			@param salir				Variable auxiliar con la que saldremos de la aplicación más adelante
	 * 			@param bc 					Objeto Barra de carga, tendrá todo lo relacionado con este panel
	 * 			@param login				Objeto Login, tendrá todo lo relacionado con el inicio de sesión del usuario
	 * 			@param Menu					Objeto Menu, donde  el usuario eligirá la dificultad, ver sus estadísticas etc
	 * 			@param juego				Objeto juego, se encarga de la gestión del juego, de reconocer los parámetros 
	 * 										del teclado, de leer el texto, contar errores...
	 * 
	 */
	public JFrame frame = new JFrame("Mecanografía");			
	private static CardLayout cl = new CardLayout();
	public static JPanel contenedor = new JPanel();
	private int salir;
	private BarraCarga bc;
	private Login login;
	private Menu menu;
	private Juego juego;

	public Frame() {
		/**
		 * Iniciamos estancias de cada clase panel
		 */
		bc = new BarraCarga();
		login = new Login();
		menu = new Menu();
		juego = new Juego();
		
		/**
		 * Este evento nos permite añadir una ventana de aviso cuando el usuario intente cerrar la aplicación
		 * 
		 */
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				salir = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de querer salir?", "Aviso",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (salir == JOptionPane.YES_OPTION) {
					frame.dispose();
				}
			}
		});
		/**
		 * DO_NOTHING_ON_CLOSE sirve para que la propia ventana de confirmación se cierre si el usuario clicka "no"
		 */
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		/**
		 * 		@param screenSize 				Obtenemos el tamaño de la pantalla y hacemos que el tamaño mínimo del frame
		 * 										sea este y que no se pueda redimensionar, de manera que el programa siempre 
		 * 										estará a pantalla completa
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setMinimumSize(screenSize);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().add(contenedor);
		contenedor.setLayout(cl); 			//asociamos el card layout al contenedor
		contenedor.add(bc, "barraCarga");	//añadimos cada panel al contenedor
		contenedor.add(login, "login");
		contenedor.add(menu, "menu");
		contenedor.add(juego, "juego");
		cl.show(contenedor, "barraCarga");	//empezamos mostrando la barra de carga

	}
	/**
	 * 
	 * @fun cambiarVentana			funcion a la que llamaremos desde todos los paneles para pasar al siguiente, 
	 * 								recibiendo como parámetro el identificador del próximo panel
	 */
	public static void cambiarVentana(String id) {
		cl.show(contenedor, id);
	}
}
