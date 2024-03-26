// Criar e coletar em um vetor [vetor.length] real e calcular e exibir.
// a. A média do grupo;
// b. A quantidade de notas acima da média no grupo;
// c. As posições dos valores abaixo da média do grupo.

package ExsVetorMatriz;
import java.util.Random;
public class lt03_VetEx04 {
    public static void main(String[] args) {
        float vetor [] = new float [30];
        float media = 0;
        int acima = 0;

        Random r = new Random();
        
        for(int inc = 0; inc < vetor.length; inc++){
            vetor[inc] = r.nextInt(10);
            media += vetor[inc];
        }
        media /= vetor.length;
        System.out.println("Média do grupo: " + media);

        for (int inc = 0; inc < vetor.length; inc++){
            if(vetor[inc] > media){
                acima++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + acima);

        for (int inc = 0; inc < vetor.length; inc++){          
            if (vetor[inc] < media){
                System.out.println("Valor abaixo da média em Vetor [" + inc + "]");
            }
        }
    }
}