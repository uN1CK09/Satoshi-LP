//Atualização de preços Ex28

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx28 {
    public static void main(String[] args) {
        double vendas, preço;
        
        vendas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número de vendas"));
        preço = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o preço dos produtos"));

        JOptionPane.showMessageDialog(null,"Preço novo: " + FuncPreço(vendas, preço));
    }    
    public static double FuncPreço(double vend, double prec){
        double novopreço;
        if (vend < 500 && prec < 30) {
            novopreço = prec * 1.10;
            return novopreço;
        }
        else if (vend >= 500 && vend < 1000 && prec >=30 && prec < 80) {
            novopreço = prec * 1.15;
            return novopreço;
        }
        else if (vend >= 1000 && prec >= 80) {
            novopreço = prec * 0.95;
            return novopreço;
        }
        else {
            JOptionPane.showMessageDialog(null,"Não houve mudança no preço");
            return prec;
        }
    }
}
