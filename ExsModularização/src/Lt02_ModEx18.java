//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx18 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor do primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor do segundo número"));
        
        JOptionPane.showMessageDialog(null, "Diferença: " + FuncDif(num1, num2));
    }
    static int FuncDif(int n1, int n2){
        int dif;

        if (n1 > n2){
            dif = (n1 - n2);
            return dif;
        }
        else{
            dif = (n2 - n1);
            return dif;
        }
    }
}
