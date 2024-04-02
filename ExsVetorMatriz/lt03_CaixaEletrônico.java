package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_CaixaEletrônico {
    static int somanotas = 0;
    public static void main(String[] args) {
        int opc = 0;
        int vetornotas[] = new int[6];

        //Menu Principal
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Notas no caixa \n 2 - Retirar Notas \n 3 - Estatísica \n 9 - Finalizar"));

            switch (opc) {
                case 1:
                    vetornotas = CarregarNotas(vetornotas);
                    break;
                case 2:
                    vetornotas = RetirarNotas(vetornotas);
                    somanotas = FuncSomaNotas(vetornotas);
                    if(somanotas <= 0){
                        JOptionPane.showMessageDialog(null, "CAIXA ESGOTADO");
                    }
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
        }
        
        somanotas = FuncSomaNotas(vt);
        
        return vt;
    }

    static int[] RetirarNotas(int vt[]){
        int saque = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor desejado para saque?"));
        int notas[] = new int[6];

        while(saque > 0){
            for(int i = 0; i < 6; i++){
                switch (i) {
                    case 0:
                        notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 100"));
                        vt[i] -= notas[i];
                        System.out.println("Notas de 100: " + notas);
                        //notas *= 100;
                        //saque -= notas;
                        break;
                
                }
            }
        }
        return vt;
    }

    static int FuncSomaNotas(int vt[]){
        int soma = 0;

        for(int inc = 0; inc < vt.length; inc++){
            soma += vt[inc];
        }

        return soma;
    }

    static void Estatisticas(){

    }
}