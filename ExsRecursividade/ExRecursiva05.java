package ExsRecursividade;
import javax.swing.JOptionPane;
public class ExRecursiva05 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        JOptionPane.showMessageDialog(null, "Resultado da Série: " + FuncSerie05(num));
    }
    
    public static int FuncSerie05(int n){
        int soma;
        if (n == 1){
            return n;
        }
        soma = FuncFat(n) + FuncSerie05(n - 1);
        return soma;
    }

    static int FuncFat(int f){
        int fat;
        if (f > 1){
            fat = (f*FuncFat(f-1));
            return fat;
        }
        else{
            return 1;
        }
    }
}
