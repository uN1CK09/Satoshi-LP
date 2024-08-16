//Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
//Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
//Demais tipos não serão considerados.

package ExsDecisão.src;
import javax.swing.JOptionPane;
public class Lt01_DecEx29 {
    public static void main(String[] args) {
        int invest;
        double valor, novovalor;

        invest = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do tipo de investimento"));
        valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor que será investido"));

        switch (invest) {
                case 1:
                    novovalor = valor*1.03;
                    JOptionPane.showMessageDialog(null,"Novo valor após correção: " + novovalor);
                    break;
                case 2:
                    novovalor = valor*1.05;
                    JOptionPane.showMessageDialog(null,"Novo valor após correção: " + novovalor);
                    break;
        }
    }
}