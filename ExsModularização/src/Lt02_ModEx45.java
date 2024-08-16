//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

package ExsModularização.src;
public class Lt02_ModEx45 {
    public static void main(String[] args) {
        double soma = 0, inc;
        for (inc = 1; inc <= 15; inc++){
            if (inc % 2 == 0){
                soma-= FuncPotencia(inc);
            }
            else{
                soma+= FuncPotencia(inc);
            }
        }
        System.out.println("Somatória da série: " + soma);
    }
    
    static double FuncPotencia(double inc){
        double calc;
        double i = (inc*inc);

        calc = (inc/i);
        return calc;
    }
}
