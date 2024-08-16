//Calcule e mostre o quadrado dos números entre 10 e 150.

package ExsModularização.src;
public class Lt02_ModEx31 {
    public static void main(String[] args) {
        int num = 10;
        while (num <= 150){
            System.out.println(num + "² = " + FuncQuadrados(num));
            num++;
        }
    }
    public static int FuncQuadrados(int n){
        int calc;
        calc = n*n;
        return calc;
    }
}
