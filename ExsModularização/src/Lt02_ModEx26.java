//Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx26 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor inteiro"));

        if (FuncMultiplo(num1, num2)){
            JOptionPane.showMessageDialog(null,"O maior é múltiplo do menor");
        }
        else{
            JOptionPane.showMessageDialog(null,"O maior não é múltiplo do menor");
        }
    }
    public static boolean FuncMultiplo(int n1, int n2){
        if (n1 > n2) {
            if (n1 % n2 == 0) {
                return true;
            }    
            else{
                return false;
            }
        }
        else{
            if (n2 % n1 == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}