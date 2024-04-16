class Celular{
    String Marca;
    String Processador;
    int serial;

    Celular(){
        this("","", 0);
    }

    Celular(String m, String p, int n){
        Marca = m;
        Processador = p;
        serial = n;
    }
}