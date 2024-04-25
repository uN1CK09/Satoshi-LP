
class Estatisticas {
    int CodCidade;
    String NomeCidade;
    int QtdAcidentes;

    Estatisticas(){
        this(0, "" ,0);
    }

    Estatisticas(int cod, String nome, int Qtd){
        CodCidade = cod;
        NomeCidade = nome;
        QtdAcidentes = Qtd;
    }
}