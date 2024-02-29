//Receba um número inteiro. Calcule e mostre o seu fatorial.

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx32 {
    public static void main(String[] args) {
        int n, fat = 1, inc;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor inteiro desejado"));
        
        for(inc = 1; inc <= n; inc++){
            fat = fat * inc;
        }
        JOptionPane.showMessageDialog(null,"O fatorial de " + n + " é: " + fat);
    }
}