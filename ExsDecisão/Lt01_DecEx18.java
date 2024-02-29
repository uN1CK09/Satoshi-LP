//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.

package ExsDecisão;
import javax.swing.JOptionPane;

public class Lt01_DecEx18 {
    public static void main(String[] args) {
        int num1, num2, dif;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor do primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor do segundo número"));
        
        if (num1 > num2) {
            dif = (num1 - num2);
            JOptionPane.showMessageDialog(null, "Diferença: " + dif);
            }
        else {
                dif = (num2 - num1);
                JOptionPane.showMessageDialog(null, "Diferença: " + dif);
            }
    }
}