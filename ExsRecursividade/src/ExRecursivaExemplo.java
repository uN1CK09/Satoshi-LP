package ExsRecursividade.src;
import javax.swing.JOptionPane;
public class ExRecursivaExemplo {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        System.out.println("Fatorial de " + num + ": " + Ffat(num));
    }
    public static int Ffat(int n){
        int fat;
        if (n > 1){
            fat = (n*Ffat(n-1));
            return fat;
        }
        else{
            return 1;
        }
    }
}
