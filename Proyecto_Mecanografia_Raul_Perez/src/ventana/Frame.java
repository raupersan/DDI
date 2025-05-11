package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame {
    
    private JFrame frame;
    private static CardLayout cl = new CardLayout();
    public static JPanel contenedor = new JPanel();
    
    private BarraCarga bc;
    private Login login;
    private Menu menu;
    private Juego juego;
    
    public Frame() {
        frame = new JFrame("Mecanografía");
        
        bc = new BarraCarga();
        login = new Login();
        menu = new Menu();
        juego = new Juego();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(new BorderLayout());
        
        contenedor.setLayout(cl);
        contenedor.add(bc, "barraCarga");
        contenedor.add(login, "login");
        contenedor.add(menu, "menu");
        contenedor.add(juego, "juego");
        
        frame.getContentPane().add(contenedor, BorderLayout.CENTER);
        
        // Asegurar que el JFrame reciba eventos del teclado
        frame.setFocusable(true);
        frame.requestFocusInWindow(); // Solicitar el foco para el JFrame

        // Configuración del KeyListener para la ventana
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char tecla = Character.toUpperCase(e.getKeyChar()); // Convertir a mayúscula
                juego.marcarBoton(tecla); // Iluminar el botón correspondiente
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char tecla = Character.toUpperCase(e.getKeyChar()); // Convertir a mayúscula
                juego.desmarcarBoton(tecla); // Restaurar el color original del botón
            }
        });
        
        // Mostrar la ventana
        frame.setVisible(true);

        // Iniciar con la barra de carga
        Frame.cambiarVentana("barraCarga");
    }

    // Método para cambiar de panel dentro del contenedor
    public static void cambiarVentana(String id) {
        cl.show(contenedor, id);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Frame());
    }
}
