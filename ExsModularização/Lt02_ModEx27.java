//Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx27 {
    public static void main(String[] args) {
        int voltas, exten, tempo;

        voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de voltas"));
        exten = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a extensão do circuito"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tempo de duração"));

        JOptionPane.showMessageDialog(null,"Velocidade média do circuito: " + FuncVel(voltas, exten, tempo));
    }
    public static int FuncVel(int voltas, int exten, int tempo){
        int vel;
        exten = (exten*voltas);
        tempo = (tempo/60);
        vel = ((exten/1000)/tempo);
        return vel;

    }
}
