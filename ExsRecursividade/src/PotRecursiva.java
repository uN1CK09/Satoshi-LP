package ExsRecursividade.src;
import java.util.Scanner;
public class PotRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira um valor inteiro: ");
        
        int num = scan.nextInt();
        scan.close();
        
        int b = 2;
        int result = FuncPot(num, b);
        System.out.println(result);
    }
    static int FuncPot(int n, int b){
        if(b == 1){
            return n;
        }
        else{
            int pot = n * FuncPot(n, b - 1);
            return pot;
        }
    }    
}
