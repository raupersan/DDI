package ventana;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

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
import javax.swing.JLabel;
import java.awt.Font;

public class BarraCarga extends JPanel {
	private JPanel panel;
	ArrayList<Usuario> usuarios;
	public BarraCarga() {
		setBounds(0,0,1920,1080);
		panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		add(panel);
		panel.setLayout(null);
		
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
		

		new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				barraCarga.setValue(barraCarga.getValue() + 16);
				if(barraCarga.getValue() ==60) {
					//TODO Terminar la lectura de los usuarios en LeerUsuarios
					usuarios= (new LeerUsuarios()).users();
				}
				if (barraCarga.getValue() == 100) {
					((Timer) e.getSource()).stop();
					Frame.cambiarVentana("login");
				}
			}
		}).start();
	}
}
