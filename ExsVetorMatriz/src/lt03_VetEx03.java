// Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
//Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
package ExsVetorMatriz.src;
import javax.swing.JOptionPane;
public class lt03_VetEx03 {
    public static void main(String[] args) {
        int vetor1 [] = new int[3];
        int vetor2 [] = new int[3]; 
        int vetor3 [] = new int[6]; 

        for (int inc = 0; inc < 3; inc++){
            vetor1[inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro para o primeiro vetor"));
            vetor3[inc] = vetor1[inc];
        }
        for(int inc = 0; inc < 3; inc++){
            vetor2[inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro para o segundo vetor"));
            vetor3[inc+3] = vetor2[inc];
        }
        System.out.println("Valores concatenados");
        
        for(int inc = 0; inc < 6; inc ++){
            System.out.println("Vetor3[" + inc +"] = " + vetor3[inc]);
        }
    }
}
