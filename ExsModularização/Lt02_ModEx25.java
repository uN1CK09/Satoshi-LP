package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx25 {
    public static int hora0, horaf, min0, minf, horaj = 0, minj;
    public static void main(String[] args) {
            
        hora0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora de início do jogo"));  
        min0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto de início do jogo"));  
        horaf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora de final do jogo"));  
        minf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto de final do jogo")); 

        ProcMin();
        ProcHora();
        JOptionPane.showMessageDialog(null,"Tempo de jogo: " + horaj + "h" + minj + "min");
    }
    public static void ProcMin(){
        minj = minf - min0;
        if (minj >= 60) {
                minj = minj - 60;
                horaj++;    
        }
        else if (minj < 0) {
                minj += 60;
                horaj--;
        }
    }
    public static void ProcHora(){

        horaj += horaf - hora0;
        if (horaj < 0){
            horaj += 24;
        }
        if (horaj >= 24 && minj > 0 || horaj == 0 && minj == 0){
            JOptionPane.showMessageDialog(null,"Tempo de jogo ultrapassa o limite");
            System.exit(0);
        }
    }
}