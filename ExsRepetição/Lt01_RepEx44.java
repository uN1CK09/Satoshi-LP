//Receba o número da base e do expoente. Calcule e mostre o valor da potência.
package ExsRepetição;
import javax.swing.JOptionPane;
public class Lt01_RepEx44 {
    public static void main(String[] args) {
        int base, expoente, potencia = 1, inc;

        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do expoente"));

        if (expoente == 1){
            System.out.println("Potência: " + base);
        }

        for (inc = 1; inc <= expoente; inc ++){
            potencia = potencia * base;

        }
        System.out.println("Potência: " + potencia);
    }
}
