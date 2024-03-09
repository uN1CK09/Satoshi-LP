package Random;
import javax.swing.JOptionPane;

public class L01_Ex25_blackbox {
    public static void main(String[] args) {
        int hi, mi, hf, mf, dhora = 0, dmin = 0;

        hi = Integer.parseInt(JOptionPane.showInputDialog("Hora inicial: "));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial: "));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Hora final: "));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Minuto final: "));

        // Calcula a diferença de minutos
        if (mf >= mi) {
            dmin = mf - mi;
        } else {
            dmin = (mf - mi) + 60;
            dhora -= 1; // Subtrai uma hora, se necessário
        }

        // Calcula a diferença de horas
        if (hf >= hi) {
            dhora += hf - hi;
        } else {
            dhora += (hf - hi) + 24;
        }

        JOptionPane.showMessageDialog(null, "Tempo do jogo: " + dhora + " horas e " + dmin + " minutos.");
    }
}