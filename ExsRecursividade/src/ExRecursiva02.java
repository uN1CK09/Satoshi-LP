// Serie2 = (N) + (N-1) + (N-2) + ... + (1)
package ExsRecursividade.src;
import javax.swing.JOptionPane;
public class ExRecursiva02 {
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        System.out.println("Resultado da série: " + FuncSoma02(num));
    }

    public static int FuncSoma02(int n){
        int soma = 0;
        if (n > 1){
            soma = n + FuncSoma02(n - 1);
            return soma;
        }
        else{
            return 1;
        }
    }
}