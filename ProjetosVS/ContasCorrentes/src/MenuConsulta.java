import javax.swing.JOptionPane;
public class MenuConsulta {
    public void menuConsulta(Conta[] regContas, Conta[] regContasAtualizadas, Movimento[] regMovimentos){
        //Metodos
        Metodos met = new Metodos();
        
        String menu2 = """
                                Consultar
                1 - Contas correntes
                2 - Movimento
                3 - Contas atualizadas
                9 - Retornar
                """;
        
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu2));

            switch (opc) {
                case 1: //Consulta contas correntes
                    met.consultaContasCorrentes(regContasAtualizadas);
                    break;
                case 2: //Movimento
                    met.consultaMovimentos(regMovimentos);
                    break;
                case 3: //Contas Atualizadas
                    met.consultaContasAtualizadas(regContasAtualizadas);
                    break;
                case 9: //Retorna
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}
