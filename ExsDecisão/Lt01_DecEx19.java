//Receba 2 valores reais. Calcule e mostre o maior deles.

package ExsDecisão;
import javax.swing.JOptionPane;

public class Lt01_DecEx19 {
    public static void main(String[] args) {
        double num1, num2;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do segundo número"));
        
        if (num1 > num2) {
                JOptionPane.showMessageDialog(null, "Maior valor: " + num1);
            }
        else {
                JOptionPane.showMessageDialog(null, "Maior valor: " + num2);
            }
    }    
}