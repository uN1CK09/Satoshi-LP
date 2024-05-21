class Movimento {
    int codContaM;
    double valorMovimentoM;
    int tipoMovimentoM;
    int statusM;

    Movimento(){
        this(0, 0, 0, 0);
    }

    Movimento(int cod, double valor, int tipo, int status){
        codContaM = cod;
        valorMovimentoM = valor;
        tipoMovimentoM = tipo;
        statusM = status;

    }
}
