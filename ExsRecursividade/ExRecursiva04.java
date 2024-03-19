package ExsRecursividade;
import javax.swing.JOptionPane;
public class ExRecursiva04 {
    public static void main(String[] args) {
        float num1, num2 = 1;

        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor desejado"));
        System.out.println("Resultado da Série: " + FuncSerie04(num1, num2));
    }

    public static float FuncSerie04(float n1, float n2){
        float calc;
        if (n1 == 1){
            return n1/n2;
        }
        else{
            calc = (n1/n2 + (FuncSerie04(n1 - 1, n2 + 1)));
            return calc;
        }
    }
}
