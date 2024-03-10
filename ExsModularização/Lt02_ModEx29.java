//Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
//Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
//Demais tipos não serão considerados.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx29 {
    static int invest;
    static double valor;
    public static void main(String[] args) {
        invest = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do tipo de investimento"));
        valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor que será investido"));

        ProcRendimento();
    }
    public static void ProcRendimento(){
        double novovalor = 0;
        switch(invest){
            case 1:
                novovalor *= 1.03;
                JOptionPane.showMessageDialog(null,"Novo valor após correção: " + novovalor);
                break;
            case 2:
                novovalor *= 1.05;
                JOptionPane.showMessageDialog(null,"Novo valor após correção: " + novovalor);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
        }
    }
}