//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

package ExsRepetição.src;
import javax.swing.JOptionPane;
public class Lt01_RepEx40 {
    public static void main(String[] args) {
        int num1, num2, inc;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor inteiro"));

        for (inc = num1; inc <= num2; inc++){
            if (inc <= 1){
                continue;
            }
            if (inc <= 3){
                System.out.println(inc);
                continue;
            }
            if (inc % 2 == 0 || inc % 3 == 0 || inc % 5 == 0 || inc % 7 == 0){
                continue;
            }
            for (int i = 2; i * i <= inc; i++) {
                if (inc % i == 0 || inc % (i+2) == 0){
                    break;
                }
            }
            System.out.println(inc);
        }
    }
}