//Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package ExsSequenciais.src;
import javax.swing.JOptionPane;
public class Lt01_SeqEx08 {
    public static void main (String args [ ] ) {   
        double valor0, rendimento, valorfinal;
        
        valor0 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de depósito"));
        rendimento = (valor0*0.013);
        valorfinal = valor0 + rendimento;
        
        JOptionPane.showMessageDialog(null,"Valor após rendimento: " + valorfinal);
    }
}