import javax.swing.JOptionPane;
public class Taxa {
    public static void main(String[] args) {
        double valor, taxa, vfinal, bonus;
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da venda"));
            bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o bonus de mercado"));
            taxa = valor * 0.35;
            bonus = bonus/100;
            valor=(valor - taxa);
            bonus = valor * bonus;
            vfinal = valor + bonus;
            System.out.println("Valor da taxa de mercado: " + taxa); 
            System.out.println("Valor final da venda: " + vfinal); 
    }
}
