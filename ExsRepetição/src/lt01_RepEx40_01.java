//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
// Versão bem feita
package ExsRepetição.src;
import javax.swing.JOptionPane;
public class lt01_RepEx40_01 {
    public static void main(String[] args) {
        int num1, num2;
        boolean primo;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));

        primo = false;
        for(int inc = num1; inc <= num2; inc++){
            if (inc == 2){
                System.out.println(inc);
            }
            for (int i = 2; i < inc; i ++){
                if (inc % i == 0){
                    primo = false;
                    break;
                }
                else{
                    primo = true;
                }
            }
            if (primo==true) {
                System.out.println(inc);
            }
        }
    }
}