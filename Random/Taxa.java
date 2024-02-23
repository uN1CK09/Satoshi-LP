import javax.swing.JOptionPane;
public class Taxa {
    public static void main(String[] args) {
        double valor, taxa, vfinal, bonus;
            
            //Captação
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da venda"));
            bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o bonus de mercado"));
            
            //Operações
            taxa = valor * 0.35;
            valor = (valor - taxa);
            bonus = valor * (bonus/100);
            vfinal = valor + bonus;
            
            //Saída
            System.out.println("Valor da taxa de mercado: " + taxa + "\n" + "Valor do bônus: " + bonus + "\n" + "Valor final da venda: " + vfinal); 
    }
}
