//Calcule e mostre o quadrado dos números entre 10 e 150.

package ExsRepetição.src;
public class Lt01_RepEx31 {
    public static void main(String[] args) {
        int num, calc;
        
        for(num = 10; num <=150; num++){
            calc = num * num;
            System.out.println(num + " ao quadrado é: " + calc);
        }
    }
}