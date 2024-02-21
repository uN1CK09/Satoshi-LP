//Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
import javax.swing.JOptionPane;
public class Lt01_SeqEx09 {
    public static void main (String Args[ ]) {
        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        soma = (num1*num1)+(num2*num2);
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é: " + soma);
    }
}
