// A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).

package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_VetEx07 {
    public static void main(String[] args) {
        int vetor[] = new int [5];
        int opc = 0;

        // Main - Menu e chamada de funções
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Vetor \n2 - Classficar Vetor \n3 - Procurar Valor \n9 - Fim"));
            switch (opc) {
                case 1:
                    //Carrega Vetor
                    vetor = CarregarVetor(vetor);      
                    break;
                
                case 2:
                    //Ordena Vetor
                    vetor = BubbleSort(vetor);
                    System.out.println("*************************");
                    for(int inc = 0; inc < vetor.length; inc++){
                        System.out.println("Vetor[" + inc + "] = " + vetor[inc]);
                    }  
                    System.out.println("*************************");
                    break;
                
                case 3:
                    //Captação do valor a ser persquisado e pesquisa
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que será procurado no vetor"));
                    int pesq = PesquisaBin(valor, vetor);
                    
                    //Verificação de retorno
                    if (pesq == -1){
                        JOptionPane.showMessageDialog(null,"VALOR NÃO ENCONTRADO");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Valor encontrado no índice: " + pesq);
                    }
                    break;
                
                case 9:
                    //Finalização
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }   
        } 
    }
    
    static int[] CarregarVetor(int vt[]){
        for(int inc = 0; inc < vt.length; inc++){
            vt[inc] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
        JOptionPane.showMessageDialog(null,"Vetor carregado");
        return vt;
    }

    static int[] BubbleSort(int vt[]){
        int aux;
        for(int i = 0; i < vt.length; i++){
            for(int j = 0; j < (vt.length - 1); j++){
                if (vt[j] > vt[j+1]){
                    aux = vt[j];
                    vt[j] = vt[j+1];
                    vt[j+1] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Vetor ordenado");
        return vt;
    }

    static int PesquisaBin(int valor, int vt[]){
        int inicio = 0, fim = (vt.length-1), meio;
        while(inicio <= fim){
            meio = (fim + inicio)/2;
            
            if (vt[meio] == valor){
                return meio;
            }
            else if (vt[meio] > valor){
                fim = (meio-1);
            }
            else if (vt[meio] < valor){
                inicio = (meio+1);
            }
        }
        return -1;
    }
}