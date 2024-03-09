//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
package ExsRepetição;

public class Lt01_RepEx42 {
    public static void main(String[] args) {
        double inc, i = 1, calc;
        for (inc = 1; inc <=50; inc ++){
            calc = (inc / i);
            System.out.println(inc + " / " + i + " = " + calc);
            i+=2;
        }
    }    
}
