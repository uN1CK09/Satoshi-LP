import javax.swing.JOptionPane;
public class Metodos {
    public Celular FuncReg (Celular cel){
        
        cel.Marca = JOptionPane.showInputDialog(null, "Insira a marca do celular");
        cel.Processador = JOptionPane.showInputDialog(null, "Insira o processador do celular");
        cel.Serial = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de serial"));
        
        return cel;
    }

    public void ConsultaReg(Celular cel){
        System.out.println("Cadastros:");
        System.out.println("Marca: " + cel.Marca + "\nProcessador: " + cel.Processador + "\nSerial: " + cel.Serial); 
    }
}