class Conta {
    int codContaC;
    String nomeClienteC;
    double saldoContaC;
    double limiteContaC;
    int tipoContaC;

    Conta(){
        this(0, "", 0.0, 0.0, 0);
    }

    Conta(int cod, String nome, double saldo, double limite, int tipo){
        codContaC = cod;
        nomeClienteC = nome;
        saldoContaC = saldo;
        limiteContaC = limite;
        tipoContaC = tipo;
    }
}
