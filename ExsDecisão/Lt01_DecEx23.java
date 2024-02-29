//Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
//Mostre os 4 números em ordem crescente.

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx23 {
    public static void main(String[] args) {
        int v1, v2, v3, v4;

        v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro valor"));
        v4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o quarto valor"));
        
        if (v4<v1) {
                JOptionPane.showMessageDialog(null,"Ordem crescente: " + v4 + "," + v1 + "," + v2 + "," + v3);
        }
        else {
                if(v4<v2 && v4>v1) {
                        JOptionPane.showMessageDialog(null,"Ordem crescente: " + v1 + "," + v4 + "," + v2 + "," + v3);
                }
                else {
                        if (v4<v3 && v4>v2) {
                                JOptionPane.showMessageDialog(null,"Ordem crescente: " + v1 + "," + v2 + "," + v4 + "," + v3);
                        }
                        else {
                                JOptionPane.showMessageDialog(null,"Ordem crescente: " + v1 + "," + v2 + "," + v3 + "," + v4);
                        }
                }
        }
    }
}