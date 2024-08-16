//Receba 2 valores reais. Calcule e mostre o maior deles.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx19 {
    public static void main(String[] args) {
        double num1, num2;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do segundo número"));
        
        JOptionPane.showMessageDialog(null,"Maior valor: " + FuncMaior(num1, num2));
    }
    static double FuncMaior(double n1, double n2){
        if (n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
