//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx24 {
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));
        if (FuncDiv(num)){
            System.out.println("O número é divisível por 2 e 3");
        }
        else{
            System.out.println("O número não é divisível por 2 e 3");
        }
    }
    public static boolean FuncDiv(int n){
        if (n % 2 == 0 && n % 3 == 0){
            return true;
        }
        else{
            return false;
        }
    }    
}
