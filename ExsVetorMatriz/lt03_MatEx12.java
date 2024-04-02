//Carregar códigos das peças em um tabuleiro de xadrez, onde:
// Código:  1   | 2     | 3     | 4      | 5      | 6   | 7
// Peça:    Peão| Torre | Bispo | Cavalo | Rainha | Rei | Vazio
//Calcular e mostrar a soma das peças do tabuleiro.
//Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças

package ExsVetorMatriz;
import java.util.Random;
public class lt03_MatEx12 {
    public static void main(String[] args) {
        int vet [] = new int[8];
        int mat[][] = new int[8][8];

        Random r = new Random();

        for (int x = 0; x < 8; x++){
            for (int y = 0; y < 8; y++){
                mat[x][y] = r.nextInt(1, 8);
                vet[mat[x][y]]++;
            }
        }

        for (int x = 0; x < 8; x++){
            System.out.println("Vetor [" + x + "] = " + vet[x]);
        }
    }
}