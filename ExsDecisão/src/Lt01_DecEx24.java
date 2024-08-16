//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

package ExsDecisão.src;
import javax.swing.JOptionPane;
public class Lt01_DecEx24 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número que irá ser verificado"));

        if (num % 2 == 0 && num % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número é divisível por 2 e 3" + "\n" + "Valor: " + num);
        }
        else {
                JOptionPane.showMessageDialog(null,"O número não é divisível por 2 e 3" + "\n" + "Valor: " + num);
        }
    }
}
