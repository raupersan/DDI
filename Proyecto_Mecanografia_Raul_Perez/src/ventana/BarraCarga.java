package ventana;

import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraCarga {
    private JProgressBar progressBar;
    private Timer timer;

    public BarraCarga(JProgressBar progressBar) {
        this.progressBar = progressBar;
        this.progressBar.setStringPainted(true);
        this.progressBar.setValue(0);
        this.progressBar.setMaximum(6);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementar();
            }
        });
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    private void incrementar() {
        progressBar.setValue(progressBar.getValue() + 1);
        if (progressBar.getValue() == progressBar.getMaximum()) {
            stop();
            System.out.println("Progress completed!");
        }
    }
}
