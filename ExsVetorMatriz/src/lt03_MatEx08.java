//Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
// a.A quantidade de cada produto vendido no mês;
// b.A quantidade de produtos vendidos por semana;
// c.O total de produtos vendidos no mês.

package ExsVetorMatriz.src;
import javax.swing.JOptionPane;
public class lt03_MatEx08 {
    public static void main(String[] args) {
        int Matriz[][] = new int[4][3];
        int x, y, totalvendas = 0;
        
        //Carregamento e total
        for(x = 0; x < 4; x++){
            for(y = 0; y < 3; y++){
                Matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do produto " + (y+1) + " na semana " + (x+1)));
                totalvendas += Matriz[x][y];
            }
        }

        //total de cada produto no mês
        for(y = 0; y < 3; y++){
            int totalmês = 0;
            for (x = 0; x < 4; x++){
                totalmês += Matriz[x][y];
            }
            System.out.println("Quantidade de vendas do produto " + (y+1) + " no mês: " + totalmês);
        }

        //total por semana
        for(x = 0; x < 4; x++){
            int totalsem = 0;
            for(y = 0; y < 3; y++){
                totalsem += Matriz[x][y];
            }
            System.out.println("Total de vendas na semana " + (x+1) + ": " + totalsem);
        }

        System.out.println("Total de vendas no mês: " + totalvendas);
    }
}
