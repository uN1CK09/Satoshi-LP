package Random;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Taxa {
    public static void main(String[] args) {
        double valor, taxa, vfinal, bonus;
            
            DecimalFormat df = new DecimalFormat("#,###,###,###,###");
            df.setMaximumFractionDigits(0);
            
            //Captação
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da venda"));
            bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o bonus de mercado"));
            
            //Operações
            taxa = valor * 0.35;
            valor = (valor - taxa);
            bonus = valor * (bonus/100);
            vfinal = valor + bonus;
            
            //Saída
            System.out.println("Valor da taxa de mercado: " + df.format(taxa) + "\n" + "Valor do Bônus: " + df.format(bonus) + "\n" + "Valor final da venda: " + df.format(vfinal));
    }
}