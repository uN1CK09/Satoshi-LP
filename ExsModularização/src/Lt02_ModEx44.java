//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx44 {
    public static void main(String[] args) {
        int base, expoente;

        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da base" ));
        expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do expoente" ));

        System.out.println("Resultado: " + FuncPot(expoente, base));
    }
    static int FuncPot(int expoente, int base){
        int potencia = 1;
        if (expoente == 1){
            return base;
        }

        for (int inc = 1; inc <= expoente; inc ++){
            potencia = potencia * base;

        }
        return potencia;
    }
}
