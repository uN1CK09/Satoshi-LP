// Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
package ExsRecursividade.src;
import javax.swing.JOptionPane;
public class ExRecursiva03 {
    public static void main(String[] args) {
        float num;

        num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        JOptionPane.showMessageDialog(null, "Resultado da Série: " + FuncSerie03(num));
    }
    
    public static float FuncSerie03(float n){
        if (n > 1){
            float div = (1/n);
            return div + FuncSerie03(n-1);
        }
        else{
            return n;
        }
    }
}
