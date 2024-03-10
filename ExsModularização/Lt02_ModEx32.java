//Receba um número inteiro. Calcule e mostre o seu fatorial.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx32 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro"));
        System.out.println(num + "! = " + FuncFat(num));
    }
    public static int FuncFat(int n){
        int fat = 1;
        for (int inc = 1; inc <= n; inc ++){
            fat *= inc;
        }
        return fat;
    }
}
