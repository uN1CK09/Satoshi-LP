//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
package ExsRepetição.src;
public class Lt01_RepEx45 {
    public static void main(String[] args) {
        double inc, calc, soma = 0;

        for (inc = 1; inc <= 15; inc++){
            calc = (inc/(inc*inc));
            System.out.println(inc + " / " + (inc*inc) + " = " + calc);
            soma += calc;
        }
        System.out.println("Soma da série: " + soma);
    }
}
