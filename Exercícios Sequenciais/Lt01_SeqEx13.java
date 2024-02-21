//Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
import javax.swing.JOptionPane;
public class Lt01_SeqEx13 {
    public static void main (String args [ ] ) {
        int quantidade, duracao;
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de comida em quilos"));
        duracao = (quantidade*1000)/50;
        JOptionPane.showMessageDialog(null,"A quantidade de comida durará: " + duracao + " dias");;
    }    
}