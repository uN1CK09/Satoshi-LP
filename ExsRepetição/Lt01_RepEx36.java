//Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx36 {
    public static void main(String[] args) {
        double calc = 0, inc, num, soma = 0, fat = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));

        for (inc = 1; inc <= num; inc++){
            for (int i = 1; i <= inc; i++){
                fat = fat * i;
            }
            calc = (1/fat);
            soma += calc;
            fat = 1;
        }
        System.out.println("Somatória: " + soma);
    }
}