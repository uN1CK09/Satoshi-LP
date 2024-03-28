//Criar uma matriz [8][8] onde o programa irá carregar segundo:
//Casa: 1	2	3	4	...	64 
//Qdte:	1	2	4	8	...	N

package ExsVetorMatriz;
public class lt03_MatEx10 {
    public static void main(String[] args) {
        double mat[][] = new double[8][8];
        double valor = 1;

        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                mat[x][y] = valor;
                valor *= 2;        
            }
        }
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                System.out.println("Matriz [" + x + "][" + y + "] = " + mat[x][y]);
            }
        }
    }
}
