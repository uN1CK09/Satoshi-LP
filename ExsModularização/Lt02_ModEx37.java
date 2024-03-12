//Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx37 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));
        FuncFibonacci(num);
    }

    static int FuncFibonacci(int n){
        int resul, v1 = 0, v2 = 1;
        for (int inc = 0; inc < n; inc++){
            resul = v1 + v2;
            
            v2 = v1;
            v1 = resul;
            System.out.println("Termo " + (inc + 1) + ": " + resul);
        }
        return -1;
    }
}