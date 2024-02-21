//Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
// volume = (comprimento.largura.altura)
import javax.swing.JOptionPane;
public class Lt01_SeqEx07 {
    public static void main (String args [ ] ) {
        int comprimento, altura, largura, volume;
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do comprimento: "));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da largura: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura: "));
        volume = (comprimento*largura*altura);
        JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é: " + volume);
    }
}