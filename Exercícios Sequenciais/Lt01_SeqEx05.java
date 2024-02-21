//Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
import javax.swing.JOptionPane;
public class Lt01_SeqEx05 {
    public static void main (String args [ ] ) {
        double A, B, C, Delta, x1, x2;
        A = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de A"));
        B = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de B"));
        C = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de C"));
        Delta = (B*B)-(4*A*C);
        x1 = (-B+Math.sqrt(Delta))/(2*A);
        x2 = (-B-Math.sqrt(Delta))/(2*A);
        JOptionPane.showMessageDialog(null,"O valor de x1 é: " + x1);
        JOptionPane.showMessageDialog(null,"O valor de x2 é: " + x2);
    }
}