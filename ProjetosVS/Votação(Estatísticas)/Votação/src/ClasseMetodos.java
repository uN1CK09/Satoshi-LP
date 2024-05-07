import java.io.*;
import java.util.Random;
public class ClasseMetodos {
    public votacao[] funcCadastraVotacao(votacao[] eleitores) throws IOException{
        Random rand = new Random();
        
        for(int i = 0; i < 200; i++){
            eleitores[i].NumeroSecao = rand.nextInt(10);
            eleitores[i].NumeroCandidato = rand.nextInt(300);
        }
        
        return eleitores;
    }

    public int[] contagemDeVotos(votacao[] eleitores) throws IOException{
        int votosAux[] = new int[eleitores.length];
        for(int i = 0; i < 200; i++){
            votosAux[eleitores[i].NumeroCandidato]++;
        }
        return votosAux;
    }

    
    public votacao[] funcBubbleSort(votacao[] eleitores, int camp, int votos[]) throws IOException{ //Bubble sort
        /* 
         * camp == 1 - classifica por seção
         * camp == 2 - classifica por votos
        */
        votacao aux = new votacao();
        aux = new votacao();

        if(camp == 1){
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
        else if(camp == 2){
            /* 
            for(int i = 0; i < eleitores.length; i++){
                for(int j = 0; j < eleitores.length - 1; j++){
                    if(eleitores[j].NumeroCandidato > eleitores[j+1].NumeroCandidato){
                        aux = eleitores[j];
                        eleitores[j] = eleitores[j+1];
                        eleitores[j+1] = aux;
                    }
                }
            }
            return eleitores;
            */
        } 
        return eleitores;
    }
    

    public votacao[] funcClassificaSecao(votacao[] eleitores) throws IOException{ 
        eleitores = funcBubbleSort(eleitores, 1, null);
        System.out.println("Dados classficados por seção");
        return eleitores;
    }

    public votacao[] funcGravaVotacao(votacao[] eleitores) throws IOException{
        String file = "Votação2024.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for(int i = 0; i < 200; i++){
            writer.write(Integer.toString(eleitores[i].NumeroSecao)); //Escreve no arquivo o número da seção
            writer.newLine();

            writer.write(Integer.toString(eleitores[i].NumeroCandidato)); //Escreve no arquivo o número do candidato
            writer.newLine();
        }
        writer.close();
        return eleitores;
    }

    
    //Procedimentos do segundo menu
    public void eleitoresPorSecao(votacao[] eleitores) throws IOException{
        return;
    }
    
    public void maiorMenor(votacao[] eleitores) throws IOException{
        return;
    }
    
    public void votosCandidatos(votacao[] eleitores) throws IOException{
        int votos[] = new int[eleitores.length];
        votos = contagemDeVotos(eleitores);
        //TODO: Print votos
        return;
    }

    public void candidatosMaisVotados(votacao[] eleitores) throws IOException{
        return;
    }
}
