//Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde 
//Casa: 1	2	3	4	...	64 
//Qdte:	1	2	4	8	...	N

package ExsModularização;
public class Lt02_ModEx39 {
    public static void main(String[] args) {
        double soma = 0;

        for (int inc = 0; inc <64; inc++){
            soma += FuncGrao(inc);
        }
        System.out.println("Somatória : " + soma);
    }
    static double FuncGrao(int i){
        double grao = Math.pow(2, i);
        System.out.println("Casa " + (i + 1) + " : " + grao);
        return grao;
    }
}
