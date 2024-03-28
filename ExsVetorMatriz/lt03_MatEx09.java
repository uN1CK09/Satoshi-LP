//Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo Math.pow(4, x)

package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt03_MatEx09 {
    public static void main(String[] args) {
        double mat[][] = new double[4][4];
        int x, y;

        for(x = 0; x < 4; x++){
            for(y = 0; y < 4; y++){
                double inc = y;
                if (x == y){
                    mat[x][y] = Math.pow(4, inc);
                }
                else{
                    mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                }
            }
        }
        //Print
        for(x = 0; x < 4; x++){
            for(y = 0; y < 4; y++){
                System.out.println("Matriz [" + x + "][" + y + "] = " + mat[x][y]);
            }
        }
    }
}
