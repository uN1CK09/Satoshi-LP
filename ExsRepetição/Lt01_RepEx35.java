//Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx35 {
    public static void main(String arg[]){
        int num1, num2, soma = 0, inc;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor inteiro"));

        if (num1 > num2){
            for(inc=num1; inc>num2; inc--){
                if (inc % 2 != 0){
                    soma += inc;
                }
            } 
        }
        else{
            for(inc=num2; inc>num1; inc--){
                if (inc % 2 != 0){
                    soma += inc;
                }
            } 
        }
        System.out.println("Somatória dos ímpares: " + soma);
    }  
}