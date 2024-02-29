//Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
//Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre

package ExsDecisão;
import javax.swing.JOptionPane;

public class Lt01_DecEx20 {
    public static void main(String[] args) {
            int A, B, C;
            double delta, x1, x2;
            
            A = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de A"));
            B = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de B"));
            C = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de C"));

            delta = (B*B)-(4*A*C);

            if (delta < 0) {
                    JOptionPane.showMessageDialog(null, "Não existem raízes reais" + "\n" + "Delta = 0");
                    //System.exit(0);  -- comando para sair do programa
            }
            else {
                    if (delta == 0)
                        {
                            x1 = (-B + delta)/(2*A);
                            JOptionPane.showMessageDialog(null, "Existe uma raiz real:" + "\n" + "Raiz = " + x1);
                    }
                    else
                        {
                            x1 = (-B - delta)/(2*A);
                            x2 = (-B + delta)/(2*A);
                            JOptionPane.showMessageDialog(null, "Existem duas raízes reais:" + "\n" + "Raiz 1 = " + x1);
                            JOptionPane.showMessageDialog(null, "Existem duas raízes reais:" + "\n" + "Raiz 1 = " + x2);
                    }
            }
    }
}