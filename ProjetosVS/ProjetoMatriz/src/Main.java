import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int matriz[][] = new int[10][10];
        int opc = 0;
        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Matriz \n2 - Classifica Matriz \n9 - Fim"));
            switch (opc) {
                case 1:
                    matriz = m.CarregaMatriz(matriz);
                    break;
                case 2:
                    matriz = m.ClassificaMatriz(matriz);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
