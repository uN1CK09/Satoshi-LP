class Celular{
    String Marca;
    String Processador;
    int Serial;

    Celular(){
        this("","",0);
    }

    Celular(String m, String p, int s){
        Marca = m;
        Processador = p;
        Serial = s;
    }
}