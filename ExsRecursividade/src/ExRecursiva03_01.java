// Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
// Pós correção
package ExsRecursividade.src;
import javax.swing.JOptionPane;
public class ExRecursiva03_01 {
    public static void main(String[] args) {
        float num;

        num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        JOptionPane.showMessageDialog(null, "Resultado da Série: " + FuncSerie03(num));
    }
    
    public static float FuncSerie03(float n){
        float calc;
        if (n == 1){
            return n;
        }
        else{
            calc = (1/n) + FuncSerie03(n-1);
            return calc;
        }
    }
}
