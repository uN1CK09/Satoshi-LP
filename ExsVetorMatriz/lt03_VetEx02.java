// Criar e coletar um vetor [100] inteiro e exibir:
// a. O maior e o menor valor;
// b. A média dos valores.

package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_VetEx02 {
    public static void main(String[] args) {
        int vetor[] = new int[100];
        
        CarregaVetor(vetor); 
        int maior = FuncMaior(vetor);
        int menor = FuncMenor(vetor);
        float media = FuncMedia(vetor);
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
    }
    
    static void CarregaVetor(int vt[]){
        for (int inc = 0; inc < vt.length; inc++){
            vt[inc] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro"));
        }
        JOptionPane.showMessageDialog(null, "Vetor Carregado");
    }

    static int FuncMaior(int vt[]){
        int maior = vt[0];
        for(int inc = 0; inc < vt.length; inc++){
            if(vt[inc] > maior){
                maior = vt[inc];
            }    
        }
        return maior;
    }

    static int FuncMenor(int vt[]){
        int menor = vt[0];
        for(int inc = 0; inc < vt.length; inc++){
            if(vt[inc] < menor){
                menor = vt[inc];
            }
        }
        return menor;
    }

    static float FuncMedia(int vt[]){
        float media = 0;
        for(int inc = 0; inc < vt.length; inc++){
            media += vt[inc];
        }
        media /= vt.length;
        return media;
    }
}