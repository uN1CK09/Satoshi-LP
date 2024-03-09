//Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde 
//Casa: 1	2	3	4	...	64 
//Qdte:	1	2	4	8	...	N

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx39 {
    public static void main(String[] args) {
        double inc, grao, soma = 0;
        
        for (inc = 0; inc < 64; inc ++){
            grao = Math.pow(2, inc);
            soma += grao;
        }
        JOptionPane.showMessageDialog(null, "Total de grãos no tabuleiro: " + soma);
    }
}
