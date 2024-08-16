//Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx35 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor inteiro"));

        System.out.println("Somatória dos ímpares: " + FuncSoma(num1, num2));
    }
    public static int FuncSoma(int n1, int n2){
        int soma = 0;
        if (n1<n2){
            for(int inc = n1; inc <= n2; inc++){
                if (inc % 2 != 0){
                    soma += inc;
                }
            }
        }
        else{
            for(int inc = n2; inc <= n1; inc++){
                if (inc % 2 != 0){
                    soma += inc;
                }
            }
        }
        return soma;
    }    
}
