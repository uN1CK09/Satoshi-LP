//Receba 2 números reais. Calcule e mostre a diferença desses valores.

package ExsSequenciais.src;
import javax.swing.JOptionPane;
public class Lt01_SeqEx10 {
    public static void main (String args [ ] ) {
        double A, B, dif;
        
        A = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        B = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Segundo número"));
        dif = A - B;
        
        JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
    }
}
