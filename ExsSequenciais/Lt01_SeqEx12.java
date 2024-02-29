 //Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
package ExsSequenciais;
import javax.swing.JOptionPane;
public class Lt01_SeqEx12 {
   public static void main (String args [ ] ) {
        int nascimento, anoatual, idade, idadefut;
        
        nascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu ano de nascimento"));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano atual"));
        idade = anoatual - nascimento;
        idadefut = idade + 17;
        
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos");
        JOptionPane.showMessageDialog(null, "Sua idade daqui 17 anos será: " + idadefut + " anos");
   } 
}
