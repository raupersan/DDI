package imagenDeFondo;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagenFondo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagenFondo window = new ImagenFondo();
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
	public ImagenFondo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(800, 400, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(createContenPanelConFondo());
	}
	private Component createContenPanelConFondo() {
		final Image imagenFondo=requestImage();
		JPanel miPanel= new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(imagenFondo, 0, 0, getWidth(),getHeight(), null);
			};
		};
		miPanel.setSize(512, 512);
		return miPanel;
	}
	private Image requestImage() {
		BufferedImage imagen=null;
		try {
			imagen=ImageIO.read(new File("src/imagenDeFondo/136524.png"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return imagen;
	}

}
