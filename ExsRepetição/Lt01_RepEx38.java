//Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.

package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx38 {
    public static void main(String[] args) {
        int num, maior, menor, inc;

        maior = 0;
        menor = 99999;

        for (inc = 0; inc < 100; inc++){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nMenor valor: " + menor);
    }
}
