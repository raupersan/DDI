package ventana;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import ficheros.ComprobarArchivos;
import ficheros.LeerUsuarios;
import ficheros.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPopupMenu;

public class BarraCarga extends JPanel {
	private JPanel panel;
	private PopupFactory pf = new PopupFactory();
	Popup popup;
	public BarraCarga() {
		setBounds(0,0,1920,1080);
		panel = new JPanel();//creamos un nuevo panel
		panel.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		add(panel);//añadimos este panel al panel contenedor
		panel.setLayout(null);
		/**
		 * @param barraCarga								Barra de carga que asociaremos a un Timer para su progreso
		 * @param titulo									Etiqueta con el título del panel
		 * @param error										Etiqueta que muestra un mensaje de error. No estará visible 
		 * 													por defecto, se mostrará cuando haya un error al cargar 
		 * 													los ficheros										
		 */
		
		
		JProgressBar barraCarga = new JProgressBar();
		barraCarga.setBounds(725, 942, 437, 66);
		barraCarga.setValue(0);
		barraCarga.setStringPainted(true);
		barraCarga.setAlignmentY(1.0f);
		//TODO imagen de fondo
		panel.add(barraCarga);
	
		JLabel titulo = new JLabel("MECANOGRAFIA");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		titulo.setBounds(753, 162, 504, 335);
		panel.add(titulo);
		
		JLabel error = new JLabel("Ha habido un error al cargar los archivos, reinicia el programa");
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.PLAIN, 30));
		error.setVisible(false);
		error.setBounds(533, 399, 1070, 140);
		panel.add(error);
		
/*
 * @param Timer											Timer que empezará nada más arranca el programa, tardando unos 6
 * 														segundos en completarse. En caso de que que hubiera algún problema
 * 														cargando los ficheros, el timer pararía y abortaría el programa 
 * 														2 segundos después
 * 
 * 
 */
		new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				barraCarga.setValue(barraCarga.getValue() + 16);
				if(barraCarga.getValue() >=60) {
					//la segunda parte está puesta porque comprobarArchivos no está terminado, se eliminará cuando se termine
					if(!(new ComprobarArchivos()).comprobar()&&1==2) {
						((Timer) e.getSource()).stop();
						SwingUtilities.invokeLater(() -> {
		                    error.setVisible(true); // Asegura que se ejecute en el EDT
		                    // Salir del programa después de mostrar la ventana
		                    new Timer(2000, ev -> {
		                        System.exit(0);
		                    }).start();
		                });
					
					
					}
				}
				if (barraCarga.getValue() == 100) {
					((Timer) e.getSource()).stop();
					Frame.cambiarVentana("login");
				}
			}
		}).start();
	}
}
