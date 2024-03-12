//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

package ExsModularização;
public class Lt02_ModEx42 {
    public static void main(String[] args) {
        double soma = 0, i = 1;
        for(double inc = 1; inc <= 50; inc++){
            soma+= FuncCalc(inc, i);
            i+=2;
        }
        System.out.println("Valor da somatória dos elementos da série: " + soma);
    }
    static double FuncCalc(double inc, double i){
        double calc;
        calc = (inc/i);
        System.out.println(inc + " / " + i + " = " + calc);
        return calc;
    }
}
