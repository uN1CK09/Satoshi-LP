import java.util.Random;
public class Metodos {
    public int[][] CarregaMatriz(int mat[][]){
        Random r = new Random();

        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                mat[x][y] = r.nextInt(300);
            }
        }
        return mat;
    }

    public int[][] ClassificaMatriz(int mat[][]){
        int vet[] =  new int[(10*10)];
        int i = 0;
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                vet[i] = mat[x][y];
                i++;
            }
        }

        //Bubble sort
        int aux;
        for(i = 0; i < vet.length; i++){
            for(int j = 0; j < (vet.length-1); j++){
                if (vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        
        //Matriz classficada
        i = 0;
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                mat[x][y] = vet[i];
                i++;
            }
        }
        
        //Mostra
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
        return mat;  
    }
}