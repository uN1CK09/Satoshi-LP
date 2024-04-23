import javax.swing.JOptionPane;

public class ClasseMetodos {
    public Estatisticas[] FuncReg(Estatisticas[] Estatisticas){
        for(int i = 0; i < 10; i++){
            Estatisticas[i].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade " + (i+1) + ": "));
            Estatisticas[i].NomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade " + (i+1) + ": ");
            Estatisticas[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes da cidade " + (i+1) + ": "));
        }
        return Estatisticas;
    }

    public void ConsultaQtd(Estatisticas[] Estatisticas){
        System.out.println("*Cidades com quantidade de acidentes entre 100 e 500*");
        for(int i = 0; i < 9; i++){
            if(Estatisticas[i].QtdAcidentes > 100 && Estatisticas[i].QtdAcidentes < 500){
                System.out.println("\nCódigo da cidade: "+Estatisticas[i].CodCidade + "\nNome da cidade: " + Estatisticas[i].NomeCidade + "\nQuantidade de acidentes: " + Estatisticas[i].QtdAcidentes);
            }
        }
        System.out.println("**********************");
        return;
    }

    public void Maior_Menor(Estatisticas[] Estatisticas){
        int menor = Estatisticas[0].QtdAcidentes;
        int maior = Estatisticas[0].QtdAcidentes;
        int indMaior = 0;
        int indMenor = 0;

        for(int i = 0; i < 10; i++){
            if(Estatisticas[i].QtdAcidentes < menor){
               menor = Estatisticas[i].QtdAcidentes;
               indMenor = i; 
            }
            
            if(Estatisticas[i].QtdAcidentes > maior){
                maior = Estatisticas[i].QtdAcidentes;
                indMaior = i;
            }
        }
        //Menor Quantidade
        System.out.println("\n*Menor quantidade de acidentes*" + "\nCódigo da cidade: "+Estatisticas[indMenor].CodCidade + "\nNome da cidade: " + Estatisticas[indMenor].NomeCidade + "\nQuantidade de acidentes: " + Estatisticas[indMenor].QtdAcidentes);
        //Maior Quantidade
        System.out.println("\n*Maior quantidade de acidentes*" + "\nCódigo da cidade: "+Estatisticas[indMaior].CodCidade + "\nNome da cidade: " + Estatisticas[indMaior].NomeCidade + "\nQuantidade de acidentes: " + Estatisticas[indMaior].QtdAcidentes);
        System.out.println("**********************");
        return;
    }

    public void AcimaMedia(Estatisticas[] Estatisticas){
        int media = 0;
        for(int i = 0; i < 10; i++){
            media += Estatisticas[i].QtdAcidentes;
        }
        
        media /= 10; //Cálculo média
        System.out.println("\nMédia de acidentes no ano: " + media + "\nCidades acima da média");
        
        for(int i = 0; i < 10; i++){
            if(Estatisticas[i].QtdAcidentes > media){
                System.out.println("\nCódigo da cidade: "+Estatisticas[i].CodCidade + "\nNome da cidade: " + Estatisticas[i].NomeCidade + "\nQuantidade de acidentes: " + Estatisticas[i].QtdAcidentes + "\n");
            }
        }
        System.out.println("**********************");
    }
}