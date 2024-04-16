//Main - Registro Lógico - Entendimento
public class Main {
    public static void main(String[] args) {
        Celular[] cel = new Celular[1];
        cel[0] = new Celular();
        
        cel = FuncReg(cel);

        System.out.println(cel[0].Marca);
        System.out.println(cel[0].Processador);
        System.out.println(cel[0].serial);
    }

    static Celular[] FuncReg (Celular[] cel){
        cel[0].Marca = "Samsung";
        cel[0].Processador = "Octa-core";
        cel[0].serial = 586005;
        
        return cel;
    }
}