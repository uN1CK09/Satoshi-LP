//Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

package ExsSequenciais.src;
import javax.swing.JOptionPane;
public class Lt01_SeqEx14 {
    public static void main (String args [ ] ) {
        int ang1, ang2, ang3;
        
        ang1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do primeiro ângulo:"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do segundo ângulo:"));
        ang3 = 180 - (ang1 + ang2);
        
        System.out.println(ang3);
    }
}