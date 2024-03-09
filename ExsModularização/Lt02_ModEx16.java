//Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
//Calcule o salário que serão as horas trabalhadas x o valor por hora. 
//Calcule o salário líquido (= Salário Bruto – desconto). 
//A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

package ExsModularização;
import javax.swing.JOptionPane;
public class Lt02_ModEx16 {
    static double quanthoras, valorhoras, percdesc, liquido;
    static int dependentes;
    public static void main(String[] args) {
        
            quanthoras = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a quantidade de horas trabalhadas"));
            valorhoras = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor por horas trabalhadas"));
            percdesc = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a porcentagem de desconto"));
            dependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de dependentes"));

            ProcSalario();
            JOptionPane.showMessageDialog(null,"Salário Líquido: " + liquido);
        }
    static void ProcSalario(){
        double bruto;

        bruto = (quanthoras*valorhoras);
        percdesc = percdesc/100;
        liquido = (bruto-(bruto*percdesc));
        liquido = liquido + (dependentes*100);
    }
}