import java.io.*;
import java.util.Random;
public class ClasseMetodos {
    public votacao[] funcCadastraVotacao(votacao[] eleitores) throws IOException{
        Random rand = new Random();
        
        for(int i = 0; i < eleitores.length; i++){
            eleitores[i].NumeroSecao = rand.nextInt(10);
            eleitores[i].NumeroCandidato = rand.nextInt(300);
        }
        
        return eleitores;
    }
    
    public votacao[] funcBubbleSortObjeto(votacao[] eleitores) throws IOException{ 
        /* 
         * Bubble sort que classifica o os campos do objeto por seção
        */
        votacao aux = new votacao();
        aux = new votacao();

        for(int i = 0; i < eleitores.length; i++){
            for(int j = 0; j < eleitores.length - 1; j++){
                if(eleitores[j].NumeroSecao > eleitores[j+1].NumeroSecao){
                    aux = eleitores[j];
                    eleitores[j] = eleitores[j+1];
                    eleitores[j+1] = aux;
                }
            }
        }
        return eleitores;
        
    }
    

    public votacao[] funcClassificaSecao(votacao[] eleitores) throws IOException{ 
        eleitores = funcBubbleSortObjeto(eleitores);
        System.out.println("\nDados classficados por seção");
        return eleitores;
    }

    public votacao[] funcGravaVotacao(votacao[] eleitores) throws IOException{
        String file = "Votação2024.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for(int i = 0; i < eleitores.length; i++){
            writer.write(Integer.toString(eleitores[i].NumeroSecao)); //Escreve no arquivo o número da seção
            writer.newLine();

            writer.write(Integer.toString(eleitores[i].NumeroCandidato)); //Escreve no arquivo o número do candidato
            writer.newLine();
        }
        writer.close();
        System.out.println("\nArquivo gerado");
        return eleitores;
    }

    
    //Procedimentos do segundo menu
    public int[] contagemDeEleitores(votacao[] eleitores)throws IOException{
        int EleitoresAux[] = new int[10];
        
        for(int i = 0; i < eleitores.length; i++){
            EleitoresAux[eleitores[i].NumeroSecao]++;
        }
        return EleitoresAux;
    }

    public void eleitoresPorSecao(votacao[] eleitores) throws IOException{
        int EleitoresPorSecao[] = new int[10];
        EleitoresPorSecao = contagemDeEleitores(eleitores);
        
        //Print Eleitores
        System.out.println("\nEleitores por seção");
        for(int i = 0; i < EleitoresPorSecao.length; i++){
            System.out.println("Seção: " + i + " - Quantidade de eleitores: " + EleitoresPorSecao[i]);
        }
        
        return;
    }
    
    public void maiorMenor(votacao[] eleitores) throws IOException{
        int EleitoresPorSecao[] = new int[10];
        EleitoresPorSecao = contagemDeEleitores(eleitores);

        int maior = EleitoresPorSecao[0];
        int menor = EleitoresPorSecao[0];
        int indMenor = 0;
        int indMaior = 0;

        for(int i = 0; i < EleitoresPorSecao.length; i++){
            if(EleitoresPorSecao[i] > maior){
                maior = EleitoresPorSecao[i];
                indMaior = i;
            }
            if(EleitoresPorSecao[i] < menor){
                menor = EleitoresPorSecao[i];
                indMenor = i;
            } 
        }
        System.out.println("\nSeção com maior número de eleitores: " + indMaior + " - Quantidade de eleitores: " + maior);
        System.out.println("Seção com menor número de eleitores: " + indMenor + " - Quantidade de eleitores: " + menor);
        return;
        
    }
    
    public int[] contagemDeVotos(votacao[] eleitores) throws IOException{
        int votosAux[] = new int[300];
        for(int i = 0; i < eleitores.length; i++){
            votosAux[(eleitores[i].NumeroCandidato)]++;
        }
        return votosAux;
    }
    
    
    public void votosCandidatos(votacao[] eleitores) throws IOException{
        int votos[] = new int[300];
        votos = contagemDeVotos(eleitores);
        
        //Print votos
        System.out.println("\nVotos por candidatos");
        for(int i = 0; i < votos.length; i++){
            System.out.println("Candidato: " + i + " - Quantidade de votos: " + votos[i]);
        } 
        return;
    }
    
    static int[][] funcBubbleSortMatriz(int mat[][]){
        int aux, aux2;
        for(int i = 0; i < mat[0].length; i++){
            for(int j = 0; j < mat[0].length - 1; j++){
                if(mat[1][j] > mat[1][j+1]){
                    aux = mat[1][j];
                    mat[1][j] = mat[1][j+1];
                    mat[1][j+1] = aux;

                    aux2 = mat[0][j];
                    mat[0][j] = mat[0][j+1];
                    mat[0][j+1] = aux2;
                }
            }
        }
        return mat;
    }

    public void candidatosMaisVotados(votacao[] eleitores) throws IOException{
        int matrizMaisVotados[][] = new int[2][300];
        int votos[] = new int[300];
        votos = contagemDeVotos(eleitores);

        matrizMaisVotados[1] = votos;
        int z = 0;
        for(int i = 0; i < matrizMaisVotados[0].length; i++){
            matrizMaisVotados[0][i] = z; 
            z++;
        }
        matrizMaisVotados = funcBubbleSortMatriz(matrizMaisVotados);

        System.out.println("\nCandidatos mais votados");
        for(int i = matrizMaisVotados[0].length - 1; i > matrizMaisVotados[0].length - 11; i--){
            System.out.println("Candidato: " + matrizMaisVotados[0][i] + " Votos: " + matrizMaisVotados[1][i]);
        }
        return;
    }

    public void lerRegistro(votacao[] eleitores)throws IOException{
        String file = "Votação2024.txt";
        BufferedReader read = new BufferedReader(new FileReader(file));

        for(int i = 0; i < eleitores.length; i++){
            eleitores[i] = new votacao();
        }
        
        for(int i = 0; i < eleitores.length; i++){
            eleitores[i].NumeroSecao = Integer.parseInt(read.readLine());
            eleitores[i].NumeroCandidato = Integer.parseInt(read.readLine());
        }
        read.close();
        return;
    }
}
