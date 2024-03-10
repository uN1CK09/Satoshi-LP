//Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
//a. Se a média for >= 6,0 exibir “APROVADO”;
//b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
//c. Se a média for < 3,0 exibir “RETIDO”

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx21 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da primeira nota"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da segunda nota"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da terceira nota"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da quarta nota"));

        JOptionPane.showMessageDialog(null, FuncNota(n1,n2,n3,n4));
    }

    public static String FuncNota(int n1, int n2, int n3, int n4){
        double media;
        
        media = ((n1+n2+n3+n4)/4);

        if (media >= 6){
            return "Aprovado";
        }
        else if (media >= 3 && media < 6){
            return "Exame";
        }
        else {
            return "Retido";
        }
    } 
}
