//Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx22 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do segundo número"));

        if (num1==num2) {
            JOptionPane.showMessageDialog(null,"Valores iguais");
        }
        else {
            JOptionPane.showMessageDialog(null, FuncOrdem(num1, num2));
        }
    }
    static String FuncOrdem(int n1, int n2){
        if (n1 > n2){
            return "Valores em ordem crescente\n" + n2 + "," + n1;
        }
        else {
            return "Valores em ordem crescente\n" + n1 + "," + n2;
        }
    }
}