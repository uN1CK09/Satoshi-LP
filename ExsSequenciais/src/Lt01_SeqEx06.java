//Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

package ExsSequenciais.src;
import javax.swing.JOptionPane;
public class Lt01_SeqEx06 {
    public static void main (String args [ ] ) {
        int x, y, z;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y: "));
        z = x;
        x = y;
        y = z;
        
        JOptionPane.showMessageDialog(null,"Valor de X após a troca: " + x);
        JOptionPane.showMessageDialog(null,"Valor de Y após a troca: " + y);
    }
}
