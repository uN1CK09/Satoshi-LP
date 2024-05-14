class Votacao {
    int secao;
    int codCandidato;
    int numEleitor;

    Votacao(){
        this(0,0,0);
    }
    
    Votacao(int sec, int cod, int num){
        secao = sec;
        codCandidato = cod;
        numEleitor = num;
    }

}
