//Receba um número. Calcule e mostre os resultados da tabuada desse número.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx34 {
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));
        for (int inc = 1; inc <= 10; inc ++){
            System.out.println(num + " X " + inc + " = " + FuncTabuada(num, inc));
        }
    }
    public static int FuncTabuada(int n, int i){
        int calc;
        calc = n*i;
        return calc;
    }
}
