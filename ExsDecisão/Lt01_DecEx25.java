//Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx25 {
    public static void main(String[] args) {
        int hora0, horaf, min0, minf, horaj, minj;
            
        hora0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora de início do jogo"));  
        min0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto de início do jogo"));  
        horaf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora de final do jogo"));  
        minf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto de final do jogo"));  
        
        horaj = 0; //inicialização
        minj = minf - min0;
        if (minj >= 60) {
                minj = minj - 60;
                horaj++;    
        }
        else if (minj < 0) {
                minj += 60;
        }
        horaj = horaj + (horaf-hora0);
        if (horaj < 0) {
                horaj += 24;
        }
        if (horaj >= 24) {
                JOptionPane.showMessageDialog(null,"Tempo de jogo ultrapassa o limite");
        }
        else {
                JOptionPane.showMessageDialog(null,"Tempo de jogo: " + horaj + "h" + minj + "min");
        }
    } 
}