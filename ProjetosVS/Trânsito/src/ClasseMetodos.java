import javax.swing.JOptionPane;
import java.io.*;
public class ClasseMetodos {
    public Estatisticas[] FuncReg(Estatisticas[] Cidades) throws IOException {
        String file = "Registro_Trânsito.txt";
        BufferedWriter  escrita = new BufferedWriter(new FileWriter(file));

        for(int i = 0; i < Cidades.length; i++){
            Cidades[i].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade " + (i+1) + ": "));
            escrita.write(Integer.toString(Cidades[i].CodCidade)); //Escreve o campo no arquivo
            escrita.newLine(); //Nova linha

            Cidades[i].NomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade " + (i+1) + ": ");
            escrita.write(Cidades[i].NomeCidade);
            escrita.newLine();

            Cidades[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes da cidade " + (i+1) + ": "));
            escrita.write(Integer.toString(Cidades[i].QtdAcidentes));
            escrita.newLine();
        }
        System.out.println("GRAVAÇÃO REALIZADA");
        escrita.close(); //Fecha a escrita // FECHAR O OBJETO É *MUITO* IMPORTANTE
        return Cidades;
    }

    public void ConsultaQtd(Estatisticas[] Cidades) throws IOException{
        System.out.println("*Cidades com quantidade de acidentes entre 100 e 500*");
        for(int i = 0; i < Cidades.length; i++){
            if(Cidades[i].QtdAcidentes > 100 && Cidades[i].QtdAcidentes < 500){
                System.out.println("\nCódigo da cidade: "+Cidades[i].CodCidade + "\nNome da cidade: " + Cidades[i].NomeCidade + "\nQuantidade de acidentes: " + Cidades[i].QtdAcidentes);
            }
        }
        System.out.println("\n**********************");
        return;
    }

    public void Maior_Menor(Estatisticas[] Cidades)throws IOException{
        int menor = Cidades[0].QtdAcidentes;
        int maior = Cidades[0].QtdAcidentes;
        int indMaior = 0;
        int indMenor = 0;

        for(int i = 0; i < Cidades.length; i++){
            if(Cidades[i].QtdAcidentes < menor){
               menor = Cidades[i].QtdAcidentes;
               indMenor = i; 
            }
            
            if(Cidades[i].QtdAcidentes > maior){
                maior = Cidades[i].QtdAcidentes;
                indMaior = i;
            }
        }
        //Menor Quantidade
        System.out.println("\n*Menor quantidade de acidentes*" + "\nCódigo da cidade: "+Cidades[indMenor].CodCidade + "\nNome da cidade: " + Cidades[indMenor].NomeCidade + "\nQuantidade de acidentes: " + Cidades[indMenor].QtdAcidentes);
        //Maior Quantidade
        System.out.println("\n*Maior quantidade de acidentes*" + "\nCódigo da cidade: "+Cidades[indMaior].CodCidade + "\nNome da cidade: " + Cidades[indMaior].NomeCidade + "\nQuantidade de acidentes: " + Cidades[indMaior].QtdAcidentes);
        System.out.println("\n**********************");
        return;
    }

    public void AcimaMedia(Estatisticas[] Cidades)throws IOException{
        int media = 0;
        for(int i = 0; i < Cidades.length; i++){
            media += Cidades[i].QtdAcidentes;
        }
        
        media /= Cidades.length; //Cálculo média
        System.out.println("\nMédia de acidentes no ano: " + media + "\nCidades acima da média");
        
        for(int i = 0; i < Cidades.length; i++){
            if(Cidades[i].QtdAcidentes > media){
                System.out.println("\nCódigo da cidade: "+Cidades[i].CodCidade + "\nNome da cidade: " + Cidades[i].NomeCidade + "\nQuantidade de acidentes: " + Cidades[i].QtdAcidentes + "\n");
            }
        }
        System.out.println("\n**********************");
    }

    public void LerArquivo(Estatisticas[] Cidades) throws IOException{
        String file = "Registro_Trânsito.txt";
        BufferedReader leitura = new BufferedReader(new FileReader(file));
        
        for(int i = 0; i < Cidades.length; i++){
            Cidades[i] = new Estatisticas();
        }
        
        for(int i = 0; i < Cidades.length; i++){
            Cidades[i].CodCidade = Integer.parseInt(leitura.readLine());
            Cidades[i].NomeCidade = leitura.readLine();
            Cidades[i].QtdAcidentes = Integer.parseInt(leitura.readLine());
        }

        leitura.close(); //Fecha a leitura // FECHAR O OBJETO É *MUITO* IMPORTANTE
        return;
    }
}