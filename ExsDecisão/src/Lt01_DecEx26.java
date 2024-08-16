//Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

package ExsDecisão.src;
import javax.swing.JOptionPane;
public class Lt01_DecEx26 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do segundo número")); 
       
       if (num1>num2) {
           if (num1 % num2 == 0) {
                        JOptionPane.showMessageDialog(null,"O maior valor é múltiplo do menor");
                }
                else  {
                        JOptionPane.showMessageDialog(null,"O maior valor não é múltiplo do menor");
                }
        }
        else {
                if (num2 % num1 == 0) {
                        JOptionPane.showMessageDialog(null,"O maior valor é múltiplo do menor");
                }
                else {
                        JOptionPane.showMessageDialog(null,"O maior valor não é múltiplo do menor");
                }
        }
    }
}
