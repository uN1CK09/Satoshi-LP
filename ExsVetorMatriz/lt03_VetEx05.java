// Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
// 10
// ∑ (A[1] – A[21–1])
// i = 1

package ExsVetorMatriz;
import java.util.Random;
public class lt03_VetEx05 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int soma = 0;
        
        Random r = new Random();
        for (int inc = 0; inc < 20; inc ++){
            vetor[inc] = r.nextInt(200);
        }

        for(int inc = 0; inc < 10; inc++){
            soma = soma + (vetor[inc] - vetor[19 - inc]);
        }
        System.out.println(soma);
    }
}
