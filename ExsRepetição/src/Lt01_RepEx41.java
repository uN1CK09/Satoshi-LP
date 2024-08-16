//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.

package ExsRepetição.src;
public class Lt01_RepEx41 {
    public static void main(String[] args) {
        int dado1, dado2, inc;
        dado1 = 1;
        dado2 = 6;

        for (inc = 1; inc <= 6; inc++){
            if (dado1+dado2==7){
                System.out.println(dado1 + " + " + dado2 + " = 7");
            }
            dado1++;
            dado2--;
        }
    }
}