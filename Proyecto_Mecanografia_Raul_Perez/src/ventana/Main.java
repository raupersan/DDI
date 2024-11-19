package ventana;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana ventana = new Ventana();
					ventana.frame.setVisible(true);
					ventana.timer.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
