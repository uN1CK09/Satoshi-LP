//Receba um número. Calcule e mostre os resultados da tabuada desse número.

package ExsRepetição.src;
import javax.swing.JOptionPane;
public class Lt01_RepEx34 {
    public static void main(String[] args) {
        int inc, num, calc;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));

        for (inc = 1; inc <= 10; inc++){
            calc = num * inc;
            System.out.println(num + " X " + inc + " = " + calc);
        }
    }
}
