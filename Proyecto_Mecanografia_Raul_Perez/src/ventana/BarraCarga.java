package ventana;

import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraCarga extends JProgressBar {
	private JProgressBar progressBar;
	private Timer timer;
	private int valInicial;
	private int valFinal;
	private boolean cargado;

	public int getValInicial() {
		return valInicial;
	}

	public int getValFinal() {
		return valFinal;
	}

	public boolean isCargado() {
		return cargado;
	}

	public void setCargado(boolean cargado) {
		this.cargado = cargado;
	}

	public BarraCarga(JProgressBar progressBar, int valInicial, int valFinal, boolean cargado) {
		this.progressBar = progressBar;
		this.valInicial = valInicial;
		this.valFinal = valFinal;
		this.cargado = cargado;
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				incrementar();
			}
		});
	}

	@Override
	public int getMaximum() {
		return this.valFinal;
	}

	public void start() {
		timer.start();
	}

	private void incrementar() {
		this.setValue(this.getValue() + 16);
		if (this.getValue() == this.getValFinal()) {
			timer.stop();
			this.setCargado(true);
			System.out.println("Progress completed!");
		}
	}
}
