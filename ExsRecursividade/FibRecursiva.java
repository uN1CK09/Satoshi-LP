package ExsRecursividade;
import java.util.Scanner;
public class FibRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual termo da série de fibonacci você deseja saber? ");
        int num = scan.nextInt();

        System.out.println(num + "° Termo da série de fibonacci: " + funcFib(num));
        scan.close();
    }

    static int funcFib(int n){
        int fib;
        //F(n) = F(n-1) + F(n - 2)
        if (n == 0 || n == 1){
            return n;
        }
        fib = funcFib(n-1) + funcFib(n - 2);
        return fib;
    }
}