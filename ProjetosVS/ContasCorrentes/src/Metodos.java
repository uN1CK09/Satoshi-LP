import javax.swing.JOptionPane;
import java.io.*;
public class Metodos {
    public Conta[] cadastraContasCorrentes(Conta[] regContas) throws IOException{
        String file = "ContasCorrentes.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(file));

        String tiposContas = """
                1 - física
                2 - conjunta
                3 - jurídica
                4 - especial
                """;

        for(int i = 0; i < regContas.length; i++){
            regContas[i].codContaC = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta"));
            escrita.write(Integer.toString(regContas[i].codContaC));
            escrita.newLine();
            
            regContas[i].nomeClienteC = JOptionPane.showInputDialog("Inisira o nome do proprietário");
            escrita.write(regContas[i].nomeClienteC);
            escrita.newLine();

            regContas[i].saldoContaC = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da conta"));
            escrita.write(Double.toString(regContas[i].saldoContaC));
            escrita.newLine();
            
            regContas[i].limiteContaC = Double.parseDouble(JOptionPane.showInputDialog("Insira o limite da conta"));
            escrita.write(Double.toString(regContas[i].limiteContaC));
            escrita.newLine();
            
            //Validação do tipo de conta
            boolean coletaTipo = false;
            while(!coletaTipo){
                regContas[i].tipoContaC = Integer.parseInt(JOptionPane.showInputDialog(tiposContas));

                switch (regContas[i].tipoContaC) {
                    case 1:
                        coletaTipo = true;
                        break;
                    case 2:
                        coletaTipo = true;
                        break;
                    case 3:
                        coletaTipo = true;
                        break;
                    case 4:
                        coletaTipo = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tipo inválido");
                        break;
                }
        
            }
            escrita.write(Integer.toString(regContas[i].tipoContaC));
            escrita.newLine();
        }
        escrita.close();
        return regContas;
    }
    
}
