package ventana;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraCarga extends JPanel {
	private JProgressBar progressBar;

	public BarraCarga(JPanel panel) {
		setLayout(null);

		JProgressBar pb =new JProgressBar();
		pb.setBounds(169, 244, 146, 17);
		pb.setStringPainted(true);
		add(pb);
		new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (1 == 1) {
					((Timer) e.getSource()).stop();
					System.out.println("Progress completed!");
				}
			}
		}).start();
	}
}
