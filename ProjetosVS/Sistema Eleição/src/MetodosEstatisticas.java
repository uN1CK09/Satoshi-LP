import javax.swing.JOptionPane;
public class MetodosEstatisticas {
    public void classificacao(Votacao[] apuracao, int option){
        Eleitor[] auxCandidatos = new Eleitor[4];
        for(int i = 0; i < auxCandidatos.length; i++){
            auxCandidatos[i] = new Eleitor();
        }
        /*
         * Candidatos
         * 1 - José
         * 2 - Maria
         * 3 - Branco
         * 4 - Nulo
         * nomeEleitor - Candidato
         * numEleitor - Número do candidato
         * secao - quantidade de votos
         * 
         * option 1 - Vencedor
         * option 2 - Segundo colocado
         */

        //Carregando campos do objeto
        auxCandidatos[0].nomeEleitor = "José";
        auxCandidatos[1].nomeEleitor = "Maria";
        auxCandidatos[2].nomeEleitor = "Branco";
        auxCandidatos[3].nomeEleitor = "Nulo";
        
        for(int i = 0; i < auxCandidatos.length; i++){
            auxCandidatos[i].numEleitor = (i+1); //Carregando número de votação dos candidatos
        }

        for(int i = 0; i < apuracao.length; i++){
            auxCandidatos[apuracao[i].codCandidato-1].secao++; //Contagem de votos
        }

        auxCandidatos = bubbleSortSecao(auxCandidatos);
        
        if(option == 1){ //Vencedor
            JOptionPane.showMessageDialog(null, "Vencedor: " + auxCandidatos[auxCandidatos.length-1].nomeEleitor + "\nQuantidade de votos: " + auxCandidatos[auxCandidatos.length-1].secao);

        }
        else if(option == 2){ //Segundo Colocado
            JOptionPane.showMessageDialog(null, "Vencedor: " + auxCandidatos[auxCandidatos.length-2].nomeEleitor + "\nQuantidade de votos: " + auxCandidatos[auxCandidatos.length-2].secao);
        }

    }
    
    private Eleitor[] bubbleSortSecao(Eleitor[] auxCandidatos){
        Eleitor auxEleitor = new Eleitor();
        for(int i = 0; i < auxCandidatos.length; i++){
            for(int j = 0; j < auxCandidatos.length-1; j++){
                if(auxCandidatos[j].secao > auxCandidatos[j+1].secao){
                    auxEleitor = auxCandidatos[j];
                    auxCandidatos[j] = auxCandidatos[j+1];
                    auxCandidatos[j+1] = auxEleitor;
                }
            }
        }
        return auxCandidatos;
    }

    public void votosBrancos(Votacao[] apuracao){
        int cta = 0; //Contadora de votos
        for(int i = 0; i < apuracao.length;i++){
            if(apuracao[i].codCandidato == 3){
                cta++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de votos em branco: " + cta);
    }
    
    public void votosNulos(Votacao[] apuracao){
        int cta = 0; //Contadora de votos
        for(int i = 0; i < apuracao.length;i++){
            if(apuracao[i].codCandidato == 4){
                cta++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de votos nulos: " + cta);
    }

    public void mostraEleitores(Votacao[] apuracao, Eleitor[] eleitores){
        String voto = "";
        for(int i = 0; i < apuracao.length; i++){
            for(int j = 0; j < eleitores.length; j++){
                if(apuracao[i].numEleitor == eleitores[j].numEleitor){
                    switch (apuracao[i].codCandidato) {
                        case 1:
                            voto = "José";
                            break;
                        case 2:
                            voto = "Maria";
                            break;
                        case 3:
                            voto = "Branco";
                            break;
                        case 4:
                            voto = "Nulo";
                            break;
                    }
                    System.out.println("\nNome do eleitor: " + eleitores[j].nomeEleitor + "\nNúmero do eleitor: " + eleitores[j].numEleitor + "\nSeção de voto: " + apuracao[i].secao + "\nCandidato votado: " + voto);
                }
            }
        }
    }
    
    public void votosApurados(Votacao[] apuracao){
        int cta = 0;
        for(int i = 0; i < apuracao.length; i++){
            if(apuracao[i].codCandidato != 0){
                cta++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade votos apurados: " + cta);
    }
}
