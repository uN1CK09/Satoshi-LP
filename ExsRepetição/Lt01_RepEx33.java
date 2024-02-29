//Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx33 {
    public static void main (String [] arg){
        double calc = 0, inc, num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));

        for (inc = 1; inc <= num; inc++){
            calc = calc + (1/inc);
        }

        JOptionPane.showMessageDialog(null, "Valor da somatória: " + calc);
    }
}