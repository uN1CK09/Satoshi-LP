class votacao{
    int NumeroSecao;
    int NumeroCandidato;

    votacao(){
        this(0,0);
    }

    votacao(int numSecao, int numCandidato){
        NumeroSecao = numSecao;
        NumeroCandidato = numCandidato;
    }
}