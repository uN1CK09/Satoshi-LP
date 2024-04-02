package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_CaixaEletrônico {
    public static void main(String[] args) {
        int opc = 0;
        int vetornotas[] = new int[6];

        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Notas no caixa \n 2 - Retirar Notas \n 3 - Estatísica \n 9 - Finalizar"));

            switch (opc) {
                case 1:
                    vetornotas = CarregarNotas();
                    break;
                case 2:
                    RetirarNotas();
                    break;
                    
                case 3:
                    Estatisticas();
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
}
