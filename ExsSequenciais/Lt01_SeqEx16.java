//Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
//Calcule o salário que serão as horas trabalhadas x o valor por hora. 
//Calcule o salário líquido (= Salário Bruto – desconto). 
//A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

package ExsSequenciais;
import javax.swing.JOptionPane;
public class Lt01_SeqEx16 {
    public static void main(String[] args) {
        double quanthoras, valorhoras, percdesc, líquido, bruto, salário;
        int dependentes;
        
        quanthoras = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a quantidade de horas trabalhadas"));
        valorhoras = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor por horas trabalhadas"));
        percdesc = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a porcentagem de desconto"));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de dependentes"));
        
        bruto = (quanthoras*valorhoras);
        percdesc = percdesc/100;
        líquido = (bruto-(bruto*percdesc));
        salário = líquido + (dependentes*100);
        JOptionPane.showMessageDialog(null,"O salário líquido é: R$ " + salário);
    }    
}