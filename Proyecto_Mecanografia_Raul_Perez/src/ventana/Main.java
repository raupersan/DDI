package ventana;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame ventana = new Frame();
					ventana.frame.setVisible(true);
					ventana.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
