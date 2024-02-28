//Reajuste de salário
package ExsSequenciais;
import javax.swing.JOptionPane;
public class Lt01_SeqEx02 {
    public static void main (String args [ ] ) {
        double sal, novosal;
            sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o total do salário"));
            novosal = sal * 1.15;
            JOptionPane.showMessageDialog(null,"O novo salário é: " + novosal);
    }       
}
