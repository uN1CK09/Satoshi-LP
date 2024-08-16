//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.

package ExsModularização.src;
public class Lt02_ModEx41 {
    public static void main(String[] args) {
        int dado1 = 1, dado2 = 6;
        for (int inc = 1; inc <= 6; inc ++){
            if (FuncDado(dado1,dado2)){
                System.out.println(dado1 + " + " + dado2 + " = 7");
            }
            dado1++;
            dado2--;
        }
    }
    static boolean FuncDado(int dado1, int dado2){
        if (dado1 + dado2 == 7){
            return true;
        }
        return false;
    }
}
