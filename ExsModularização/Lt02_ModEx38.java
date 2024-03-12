//Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx38 {
    public static void main(String[] args) {
        int num, maior = 0, menor = 9999999;
        
        for (int inc = 0; inc < 100; inc ++){
    
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));
            maior = FuncMaior(maior, num);
            menor = FuncMenor(menor, num);
        }
    }
    static int FuncMaior(int n, int maior){
        if (n > maior){
            return n;
        }
        else{
            return maior;
        }
    }
    static int FuncMenor(int n, int menor){
        if (n < menor){
            return n;
        }
        else{
            return menor;
        }
    }
}
