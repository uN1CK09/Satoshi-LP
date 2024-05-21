import javax.swing.JOptionPane;
import java.io.IOException;
public class Principal {
    public static void main(String[] args)throws IOException {
        //Objetos e segundo menu
        MenuConsulta menu2 = new MenuConsulta();
        Conta[] regContas = new Conta[5];
        Conta[] regContasAtulizadas = new Conta[5];
        Movimento[] regMovimentos = new Movimento[10];

        //Metodos
        Metodos met = new Metodos();

        String menu = """
                    Contas Correntes
                1 - Cadastra contas correntes
                2 - Cadastra movimento
                3 - Gera conta atualizadas
                4 - Consulta cadastros
                9 - Finalizar
                """;
        
        int opc = 0;

        //Inicializando objetos
        for(int i = 0; i < regContas.length; i++){
            regContas[i] = new Conta();
            regContasAtulizadas[i] = new Conta();
        }

        for(int i = 0; i < regMovimentos.length; i++){
            regMovimentos[i] = new Movimento(); 
        }

        while(opc != 9){ //Menu
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opc) {
                case 1: //Cadastra contas
                    regContas = met.cadastraContasCorrentes(regContasAtulizadas);
                    break;
                case 2: //Cadastra movimento
                    break;
                case 3: //Atualiza contas
                    break;
                case 4: //Consulta cadastros
                    menu2.menuConsulta(regContas, regContasAtulizadas, regMovimentos);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
                }
        
        }
    }
}

