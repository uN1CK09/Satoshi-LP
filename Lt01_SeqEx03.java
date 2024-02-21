// Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
// area = base * altura/2 
import javax.swing.JOptionPane;
public class Lt01_SeqEx03 {
    public static void main (String args [ ] ) {
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura: "));
        area = (base*altura)/2;
        System.out.println("A area do triâgulo é: " + area);
    }
}