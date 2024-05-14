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
                }
                escrita.write(Integer.toString(votacao[i].secao));
                escrita.newLine();

                votacao[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog(candidatos));
                escrita.write(Integer.toString(votacao[i].codCandidato));
                escrita.newLine();

                votacao[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor"));
                //TODO:Verificação do número do eleitor
                
            }
        }
        else if(option == 2){

        }
        
        
        return votacao;
    }



}
