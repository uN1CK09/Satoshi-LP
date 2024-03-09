//Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_RepEx30 {
    public static void main (String [] arg){
        int anoN, mesN, diaN, anoA, mesA, diaA, anoidade = 0, mesidade = 0, diasidade = 0;
        
        anoN = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano de nascimento"));
        mesN = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mês de nascimento"));
        diaN = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia de nascimento"));
        anoA = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano atual"));
        mesA = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mês atual"));
        diaA = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia atual"));

        anoidade = anoA - anoN;
        if ((mesA < mesN) || ((mesA == mesN) && (diaA < diaN))) {
            anoidade--;
        }
        diasidade = diaA -  diaN;
        mesidade = mesA - mesN;
        if (mesidade < 0){
            mesidade += 12;
        }

        if (anoA % 4 == 0 && mesA == 02 &&  diaA > 28) {
            diasidade++;
        }

        System.out.println("Idade: " + anoidade + " anos " + mesidade + " meses " + diasidade + " dias");
    }
}