//Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

package ExsSequenciais;
import javax.swing.JOptionPane;
public class Lt01_SeqEx15 {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        
        cateto1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do primeiro cateto"));
        cateto2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do segundo cateto"));
        hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
        
        System.out.println(hipotenusa);
    }
}