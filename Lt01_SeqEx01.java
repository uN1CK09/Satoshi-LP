//Calcular área do quadrado
import javax.swing.JOptionPane;
public class Lt01_SeqEx01 {
    public static void main (String args [ ] ) {
        int lado1, lado2, area;
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        area = (lado1*lado2);
        JOptionPane.showMessageDialog(null,"A área do quadrado é: " + area);
    }
}