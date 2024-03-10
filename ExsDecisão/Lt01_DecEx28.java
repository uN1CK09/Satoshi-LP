//Atualização de preços Ex28

package ExsDecisão;
import javax.swing.JOptionPane;
public class Lt01_DecEx28 {
    public static void main(String[] args) {
        double vendas, preço, novopreço;
        
        vendas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número de vendas"));
        preço = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o preço dos produtos"));
        
        if (vendas < 500 && preço < 30) {
                novopreço = preço * 1.10;
                JOptionPane.showMessageDialog(null,"Novo Preço: " + novopreço);
        }
        else if (vendas >= 500 && vendas < 1000 && preço >=30 && preço < 80) {
                novopreço = preço * 1.15;
                JOptionPane.showMessageDialog(null,"Novo Preço: " + novopreço);
        }
        else if (vendas >= 1000 && preço >= 80) {
                novopreço = preço * 0.95;
                JOptionPane.showMessageDialog(null,"Novo Preço: " + novopreço);
        }
        else {
                JOptionPane.showMessageDialog(null,"Não houve mudança no preço");
        }
    }
}
