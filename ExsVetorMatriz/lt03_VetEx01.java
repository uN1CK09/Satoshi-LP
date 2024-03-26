// Criar e coletar um vetor [50] inteiro. Calcular e exibir
// a. A média dos valores entre 10 e 200;
// b. A soma dos números ímpares.

package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_VetEx01 {
    public static void main(String[] args) {
        int vetor [] = new int [50];
        int media = 0;
        int soma = 0;
        int cta = 0;
        for (int inc = 0; inc < 50; inc++){
            vetor [inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
            if (vetor[inc]>=10 && vetor[inc]<=200){
                media += vetor[inc];
                cta++;
            }
            if (vetor[inc] % 2 != 0){
                soma += vetor[inc];
            }
        }
        media = media/cta;
        System.out.println("Média dos valores entre 10 e 200: " + media);
        System.out.println("Soma dos valores ímpares: " + soma);
    }
}
