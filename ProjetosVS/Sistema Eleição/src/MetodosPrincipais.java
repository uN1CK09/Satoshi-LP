import javax.swing.JOptionPane;
import java.io.*;
public class MetodosPrincipais {
    public Eleitor[] cadastraEleitor(Eleitor[] cadastro) throws IOException{
        String fileCadastro = "Cadastro_Eleitor.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(fileCadastro));

        for(int i = 0; i < cadastro.length; i++){
            cadastro[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do eleitor"));
            escrita.write(Integer.toString(cadastro[i].numEleitor));
            escrita.newLine();

            cadastro[i].nomeEleitor = JOptionPane.showInputDialog("Insira o nome do eleitor");
            escrita.write(cadastro[i].nomeEleitor);
            escrita.newLine();

            cadastro[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da seção"));
            escrita.write(Integer.toString(cadastro[i].secao));
            escrita.newLine();

        }
        System.out.println("Arquivo de cadastro gerado");
        escrita.close();
        return cadastro;
    }
    
    public Votacao[] cadastraVotos(Votacao[] votacao, Eleitor[] cadastro, int option)throws IOException{
        /*
         * Função para cadastro de votos 
         * operação por opção
         * option == 1 - Cadastra votação 1
         * option == 2 - Cadastra votação 2
         */
        if(option == 1){
            String fileVotacao1 = "Votação1.txt";
            BufferedWriter escrita = new BufferedWriter(new FileWriter(fileVotacao1));
    
            String candidatos = """
                    1 - José
                    2 - Maria 
                    3 - Branco 
                    4 - Nulo
                    """;
            for(int i  = 0; i < votacao.length; i++){
                //coleta e verifica se a seção é válida para aquela votação
                boolean coletaSecao = false;
                while(coletaSecao == false){
                    votacao[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
                    for(int j = 0; j < Principal.vetorSecoes.length-3; j++){
                        if(votacao[i].secao == Principal.vetorSecoes[j]){
                            coletaSecao = true;
                            break;
                        }
                    }
                    if(coletaSecao == false){
                        JOptionPane.showMessageDialog(null, "Seção inválida");
                    }
                }

                votacao[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog(candidatos));

                //Coleta e verifica se o número de eleitor é válido 
                boolean coletaNum = false;
                while(coletaNum == false){
                    votacao[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor"));
                    for(int j = 0; j < cadastro.length; j++){
                        if (votacao[i].numEleitor == cadastro[j].numEleitor){
                            coletaNum = true;
                            break;
                        }
                    }
                    if(coletaNum == false){
                        JOptionPane.showMessageDialog(null,"Número inválido");
                    }
                }
            }
            
            votacao = bubbleSortVotos(votacao); //Objeto ordenado
            for(int i = 0; i < votacao.length; i++){
                //Laço de escrita do arquivo
                escrita.write(Integer.toString(votacao[i].secao));
                escrita.newLine();
                
                escrita.write(Integer.toString(votacao[i].codCandidato));
                escrita.newLine();
                
                escrita.write(Integer.toString(votacao[i].numEleitor));
                escrita.newLine();
            }
            System.out.println("Arquivo da primeira votação gerado");
            escrita.close();
        }
        else if(option == 2){
            String fileVotacao2 = "Votação2.txt";
            BufferedWriter escrita = new BufferedWriter(new FileWriter(fileVotacao2));
    
            String candidatos = """
                    1 - José
                    2 - Maria 
                    3 - Branco 
                    4 - Nulo
                    """;
            for(int i  = 0; i < votacao.length; i++){
                //coleta e verifica se a seção é válida para aquela votação
                boolean coletaSecao = false;
                while(coletaSecao == false){
                    votacao[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
                    for(int j = 3; j < Principal.vetorSecoes.length; j++){
                        if(votacao[i].secao == Principal.vetorSecoes[j]){
                            coletaSecao = true;
                            break;
                        }
                    }
                    if(coletaSecao == false){
                        JOptionPane.showMessageDialog(null, "Seção inválida");
                    }
                }

                votacao[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog(candidatos));
                
                /*TODO:IDEIA
                {Teste para OptionDialog}
                String[] candidatosVet = {"José", "Maria", "Branco", "Nulo"};
                votacao[i].codCandidato = JOptionPane.showOptionDialog(null,"Escolha o seu voto","Votação",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,candidatos,candidatos[0]);
                */
                
                //Coleta e verifica se o número de eleitor é válido 
                boolean coletaNum = false;
                while(coletaNum == false){
                    votacao[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor"));
                    for(int j = 0; j < cadastro.length; j++){
                        if (votacao[i].numEleitor == cadastro[j].numEleitor){
                            coletaNum = true;
                            break;
                        }
                    }
                    if(coletaNum == false){
                        JOptionPane.showMessageDialog(null,"Número inválido");
                    }
                }
            }
            votacao = bubbleSortVotos(votacao); //Objeto ordenado
            for(int i = 0; i < votacao.length; i++){
                //Laço de escrita do arquivo
                escrita.write(Integer.toString(votacao[i].secao));
                escrita.newLine();
                
                escrita.write(Integer.toString(votacao[i].codCandidato));
                escrita.newLine();
                
                escrita.write(Integer.toString(votacao[i].numEleitor));
                escrita.newLine();
            }
            System.out.println("Arquivo da segunda votação gerado");
            escrita.close();
        }
        return votacao;
    }

    private Votacao[] bubbleSortVotos(Votacao[] votacao){
        Votacao aux = new Votacao();
        for(int i = 0; i < votacao.length; i++){
            for(int j = 0; j < votacao.length-1; j++){
                if(votacao[j].codCandidato > votacao[j+1].codCandidato){
                    aux = votacao[j];
                    votacao[j] = votacao[j+1];
                    votacao[j+1] = aux;
                }
            }
        }
        return votacao;
    }

    public Votacao[] agruparApuracao(Votacao[] apuracao, Votacao[] votacao1, Votacao[] votacao2)throws IOException{
        String fileApuracao = "Apuração.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(fileApuracao));
        for(int i = 0; i < votacao1.length; i++){
            apuracao[i] = votacao1[i];
        }

        for(int i = 0; i < votacao1.length; i++){
            apuracao[i+5] = votacao2[i];
        }
        
        apuracao = bubbleSortVotos(apuracao); //Apuração ordenada
        for(int i = 0; i < apuracao.length; i++){ //Gravaçõo em arquivo do objeto de apuração
            escrita.write(Integer.toString(apuracao[i].secao));
            escrita.newLine();

            escrita.write(Integer.toString(apuracao[i].codCandidato));
            escrita.newLine();

            escrita.write(Integer.toString(apuracao[i].numEleitor));
            escrita.newLine();
        }
        System.out.println("Arquivo de apuração gerado");
        escrita.close();
        return apuracao;
    }

}
