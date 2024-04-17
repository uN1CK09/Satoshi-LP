import java.util.Random;
public class Metodos {
    public int[][] CarregaMatriz(int mat[][]){
        Random r = new Random();

        for(int x = 0; x < mat.length; x++){
            for(int y = 0; y < mat[0].length; y++){
                mat[x][y] = r.nextInt(100,300);
            }
        }
        return mat;
    }

    public int[][] ClassificaMatriz(int mat[][]){
        int vet[] =  new int[(mat.length * mat[0].length)];
        int i = 0;
        for(int x = 0; x < mat.length; x++){
            for(int y = 0; y < mat[0].length; y++){
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
        for(int x = 0; x < mat.length; x++){
            for(int y = 0; y < mat[0].length; y++){
                mat[x][y] = vet[i];
                i++;
            }
        }
        
        //Mostra
        for(int x = 0; x < mat.length; x++){
            for(int y = 0; y < mat[0].length; y++){
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
        return mat;  
    }
}