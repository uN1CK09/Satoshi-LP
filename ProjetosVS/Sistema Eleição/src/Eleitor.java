class Eleitor{
    int numEleitor;
    String nomeEleitor;
    int secao;

    Eleitor(){
        this(0,"",0);
    }

    Eleitor(int num, String nome, int sec){
        numEleitor = num;
        nomeEleitor = nome;
        secao = sec;
    }
}