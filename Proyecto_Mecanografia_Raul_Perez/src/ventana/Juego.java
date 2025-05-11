package ventana;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Juego extends JPanel {

    private JPanel panel;
    ArrayList<JButton> teclas = new ArrayList<JButton>();

    public Juego() {
        setBounds(0, 0, 1920, 1080);
        panel = new JPanel(); // Creamos un nuevo panel
        panel.setBackground(Color.RED);
        panel.setBounds(0, 0, 1920, 615);
        setLayout(null);
        add(panel); // Añadimos este panel al panel contenedor
        panel.setLayout(null);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(0, 0, 1920, 615);
        panel.add(textPane);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 615, 1920, 465);
        add(panel_1);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{192, 192, 192, 192, 192, 192, 192, 192, 192, 192, 0};
        gbl_panel_1.rowHeights = new int[]{116, 116, 116, 116, 0};
        gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);

        // Crear botones con letras de la A a la Ñ
        String[] botones = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ", "Z", "X", "C", "V", "B", "N", "M"};
        int x = 0;
        int y = 0;
        for (String letra : botones) {
            JButton btn = new JButton(letra);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(0, 0, 5, 5);
            gbc.gridx = x;
            gbc.gridy = y;
            panel_1.add(btn, gbc);
            teclas.add(btn);

            // Incrementar la posición para la siguiente tecla
            x++;
            if (x > 9) {
                x = 0;
                y++;
            }
        }

        // Añadir el espacio
        JButton espacio = new JButton("Espacio");
        GridBagConstraints gbc_espacio = new GridBagConstraints();
        gbc_espacio.gridwidth = 3;
        gbc_espacio.fill = GridBagConstraints.BOTH;
        gbc_espacio.insets = new Insets(0, 0, 0, 5);
        gbc_espacio.gridx = 3;
        gbc_espacio.gridy = 3;
        panel_1.add(espacio, gbc_espacio);
        teclas.add(espacio);
    }

    // Método para iluminar el botón
    public void marcarBoton(char tecla) {
        String t = String.valueOf(tecla);
        for (JButton boton : teclas) {
            if (boton.getText().equals(t)
                    || (tecla == ' ' && boton.getText().equalsIgnoreCase("Espacio"))) {
                boton.setBackground(Color.YELLOW); // Cambiar color al presionar
            }
        }
    }

    // Método para restaurar el color del botón
    public void desmarcarBoton(char tecla) {
        for (JButton boton : teclas) {
            if (boton.getText().equalsIgnoreCase(String.valueOf(tecla))
                    || (tecla == ' ' && boton.getText().equalsIgnoreCase("Espacio"))) {
                boton.setBackground(null); // Restaurar color original
            }
        }
    }
}
