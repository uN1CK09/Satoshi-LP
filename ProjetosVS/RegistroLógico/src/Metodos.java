import javax.swing.JOptionPane;
public class Metodos {
    public Celular[] FuncReg (Celular[] cel){
        for(int i = 0; i < 3; i++){
            cel[i].Marca = JOptionPane.showInputDialog(null, "Insira a marca do celular");
            cel[i].Processador = JOptionPane.showInputDialog(null, "Insira o processador do celular");
            cel[i].serial = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de serial"));
        }
        
        return cel;
    }

    public void ConsultaReg(Celular[] cel){
        System.out.println("Cadastros:");
        for(int i = 0; i < 3; i++){
            System.out.println("Marca: " + cel[i].Marca);
            System.out.println("Processador: " + cel[i].Processador);
            System.out.println("Serial: " + cel[i].serial);
            System.out.println();
        }
    }
}
