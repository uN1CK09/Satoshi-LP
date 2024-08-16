//Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
//Mostre os 4 números em ordem crescente.

package ExsModularização.src;
import javax.swing.JOptionPane;
public class Lt02_ModEx23 {
    public static void main(String[] args) {
        int vet[] = new int[4], inc;

        for(inc = 0; inc < 4; inc++){
            vet[inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro"));

        }
        FuncOrdem(vet);
        System.out.println("Valores em ordem crescente");
        for(inc = 0; inc < 4; inc++){
            System.out.println(vet[inc]);
        }
    }
    static int[] FuncOrdem(int vt[]){
        int i, j, temp;
        for (i = 0; i < 4; i++){
            for (j = 0; j<(3-i); j++){
                if (vt[j] > vt[j+1]){
                    temp = vt[j];
                    vt[j] = vt[j+1];
                    vt[j+1] = temp;
                }
            }
        }
        return vt;
    }
}