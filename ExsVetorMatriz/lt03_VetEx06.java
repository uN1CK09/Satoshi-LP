//Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_VetEx06 {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        
        Carregar(vetor);
        vetor = BubbleSort(vetor);
        System.out.print("Vetor Ordenado: ");
        
        for(int inc = 0; inc < (vetor.length); inc++){
            System.out.print(vetor[inc] + ", ");
        }

    }
    
    static void Carregar(int vt[]){
        for(int inc = 0; inc < vt.length; inc++){
            vt[inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        }
    }

    static int[] BubbleSort(int vt[]){
        int aux;
        for(int i = 0; i < vt.length; i++){
            for (int j = 0; j < ((vt.length-1) - i); j++){
                if (vt[j] > vt[j+1]){
                    aux = vt[j];
                    vt[j] = vt [j+1];
                    vt[j+1] = aux;
                }
            }
        }
        return vt;
    }
}