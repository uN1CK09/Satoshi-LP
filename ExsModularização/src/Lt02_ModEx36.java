//Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx36 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));

        System.out.println("Somatória da série: " + FuncSoma(num));
    }   

    static double FuncSoma(int n){
        double soma = 0;
        
        for(int inc = 1; inc <= n; inc++){
            soma += (1/FuncFat(inc));
        }
        return soma;
    }

    static double FuncFat(int i){
        int fat = 1;
        
        if (i == 0){
            return 1;
        }
        
        for (int inc = 1; inc <= i; inc++){
            fat *= inc;
        }
        return fat;
    }
}
