//Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx27 {
    public static void main(String[] args) {
        int voltas, exten, tempo, vel;
        voltas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de voltas"));
        exten = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o tamanho do circuito(em metros)"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o tempo de duração(em minutos)"));

        exten = (voltas * exten);
        tempo = tempo/60;
        vel = (exten/1000)/tempo;

        JOptionPane.showMessageDialog(null,"Velocidade média do circuito: " + vel + " km/h");
    }
}