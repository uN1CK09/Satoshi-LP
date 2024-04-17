import javax.swing.JOptionPane;
public class Metodos {
    public Celular FuncReg (Celular cel){
        
        cel.Marca = JOptionPane.showInputDialog(null, "Insira a marca do celular");
        cel.Processador = JOptionPane.showInputDialog(null, "Insira o processador do celular");
        cel.serial = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de serial"));

        return cel;
    }

    public void ConsultaReg(Celular cel){
        System.out.println("Cadastros:");
        for(int i = 0; i < 3; i++){
            System.out.println("Marca: " + cel.Marca);
            System.out.println("Processador: " + cel.Processador);
            System.out.println("Serial: " + cel.serial);
            System.out.println();
        }
    }
}