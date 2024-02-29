//Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

package ExsSequenciais;
import javax.swing.JOptionPane;
public class Lt01_SeqEx04 {
    public static void main (String args [ ] ) {   
        double C, F;
        
        C = Float.parseFloat(JOptionPane.showInputDialog("Insira a temperatura em Celsius"));        
        F = (9 * C +160)/5;
        
        JOptionPane.showMessageDialog(null,"Temperatura após conversão: " + F);
    }
}
