import javax.swing.JOptionPane;
public class MetodosEstatisticas {
    public void vencedor(Votacao[] apuracao){
        int[] vetVotos = new int[4];
        
        for(int i = 0; i < apuracao.length; i++){
            vetVotos[(apuracao[i].codCandidato)]++;
        }
        
        vetVotos = bubbleSortVetor(vetVotos);
        //FIXME: Está printando quantidade de votos e não o candidato vencedor
        /*
         * Ideia: Usar um objeto auxiliar pra armazenar os candidatos e os votos que receberam
         * Ordenar esse objeto pra saber qual recebeu mais votos e assim mostrar o vencedor
         * TODO: Implementar essa ideia e não perder a cabeça o processo
         * Possibilidade: Usar o objeto Eleitor
         * nome - Candidato
         * numEleitor - Número do candidato
         * secao - número de votos
         */
        JOptionPane.showMessageDialog(null, "Vencedor: " + vetVotos[(vetVotos.length-1)]);
        return;
    }

    private int[] bubbleSortVetor(int[] vet){
        int aux;
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length-1; j++){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;             
                }
            }
        }
        return vet;
    }
    
}
