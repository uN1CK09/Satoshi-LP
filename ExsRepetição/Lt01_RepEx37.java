//Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx37 {
    public static void main (String arg []){
        int inc, v1 = 0, v2 = 1, resul, num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro"));
        
        for (inc = 0; inc < num; inc++){
            resul = v1 + v2;
            

            v2 = v1;
            v1 = resul;
            System.out.println("Termo " + (inc + 1) + ": " + resul);
        }
    }
}