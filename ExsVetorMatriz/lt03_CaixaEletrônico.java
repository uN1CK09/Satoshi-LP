package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_CaixaEletrônico {
    static int somanotas = 0;
    public static void main(String[] args) {
        int opc = 0;
        int vetornotas[] = new int[6];

        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Notas no caixa \n 2 - Retirar Notas \n 3 - Estatísica \n 9 - Finalizar"));

            switch (opc) {
                case 1:
                    vetornotas = CarregarNotas(vetornotas);
                    break;
                case 2:
                    vetornotas = RetirarNotas(vetornotas);
                    break;
                case 3:
                    //Estatisticas();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
    
    static int[] CarregarNotas(int vt[]){
        for(int i = 0; i < 6; i++){
            //Carregando valores
            switch(i){
                case 0:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 100 reais"));
                    break;
                case 1:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 50 reais"));
                    break;
                case 2:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 20 reais"));
                    break;
                case 3:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 10 reais"));
                    break;
                case 4:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 5 reais"));
                    break;
                case 5:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 2 reais"));
                    break;
            }
            somanotas += vt[i];
        }
        return vt;
    }

    static int[] RetirarNotas(int vt[]){
        int saque = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor desejado para saque?"));

        while(saque > 0){

        }
        return vt;
    }
}