//Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx17 {
    public static void main(String[] args) {
        double tempo, velmedia;

        tempo = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o tempo de percuro"));
        velmedia = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a velocidade média da viagem"));

        JOptionPane.showMessageDialog(null, "Litros de combutível gastos na viagem: " + FuncGasto(tempo, velmedia));
    }    
    static double FuncGasto(double t, double vel){
        double distância, LGastos;
        
        distância = (t*vel);
        LGastos = (distância/12);
        return LGastos;
    }
}
