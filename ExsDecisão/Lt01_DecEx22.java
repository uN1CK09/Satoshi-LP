//Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx22 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do segundo número"));
        
        if (num1==num2) {
                JOptionPane.showMessageDialog(null,"Valores iguais");
        }
        else {
                if (num1 > num2) {
                        JOptionPane.showMessageDialog(null, "Valores em ordem crescente:" + "\n" + num2 + ", " + num1);
                }
                else {
                        JOptionPane.showMessageDialog(null, "Valores em ordem crescente:" + "\n" + num1 + ", " + num2);
                }    
        }
    }
}
