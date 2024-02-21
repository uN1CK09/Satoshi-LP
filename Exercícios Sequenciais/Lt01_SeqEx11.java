//Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência
import javax.swing.JOptionPane;
public class Lt01_SeqEx11 {
    public static void main (String args [ ] ) {
        double raio, comprimento;
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do Raio"));
        comprimento = (2*3.14*raio);
        System.out.println(comprimento);        
    }
}
