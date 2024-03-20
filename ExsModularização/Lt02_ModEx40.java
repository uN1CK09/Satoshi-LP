//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx40 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor inteiro"));
        for (int inc = num1; inc <= num2; inc ++){
            if (FuncPrimo(inc)){
                System.out.println(inc);
            }
        }
    }

    static boolean FuncPrimo(int i){
        if (i <= 1){
            return false;
        }
        
        if (i <= 3){
            return true;
        }
        
        for (int inc = 2; inc < i; inc ++){
            if (i % inc == 0){
                return false;
            }
        }
        return true;
    }
}
