//Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
import javax.swing.JOptionPane;
public class Lt01_SeqEx17 {
    public static void main(String[] args) {
        double LGastos, distância, tempo, velmédia;
        tempo = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o tempo de viagem"));
        velmédia = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a velocidade média da viagem"));
        distância = (tempo*velmédia);
        LGastos = (distância/12);
        JOptionPane.showMessageDialog(null,"Litros de combustível gastos na viagem: " + LGastos);
    }
}