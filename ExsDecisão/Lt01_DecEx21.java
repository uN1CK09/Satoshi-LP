//Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
//a. Se a média for >= 6,0 exibir “APROVADO”;
//b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
//c. Se a média for < 3,0 exibir “RETIDO”

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx21 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceita nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));

        media = ((n1+n2+n3+n4)/4);
        
        if (media>=6) {
                JOptionPane.showMessageDialog(null, "Média: " + media + "\n" + "APROVADO");
            }
        else {
                if (media>=3 && media<6) {
                        JOptionPane.showMessageDialog(null, "Média: " + media + "\n" + "EXAME");
                    }
                else {
                        if (media<3) 
                            {
                                JOptionPane.showMessageDialog(null, "Média: " + media + "\n" + "RETIDO");    
                            }
                    }
            }
    }
}