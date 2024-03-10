//Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx33 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro"));
        System.out.println("Valor da somatória: " + FuncSoma(num));
    }
    public static double FuncSoma (int num){
        double soma = 0, inc;
        for(inc = 1; inc <= num; inc++){
            soma += (1/inc); 
        }
        return soma;
    }
}
