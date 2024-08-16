// Serie1 = (1+2+3+...+100)
package ExsRecursividade.src;

public class ExRecursiva01 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Resultado da Somatória: " + FuncSoma(num));
    }    
    
    public static int FuncSoma(int n){
        int soma = 0;
        if (n < 100){
            soma = (n + FuncSoma(n+1));
            return soma;
        }
        else{
            return 100;
        }
    }
}
