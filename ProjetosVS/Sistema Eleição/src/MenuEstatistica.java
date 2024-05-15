import javax.swing.JOptionPane;
public class MenuEstatistica {
    public void menuEstatistica(Votacao[] apuracao){
        MetodosEstatisticas statMet = new MetodosEstatisticas();

        String stats = """
                1 - Vencedor
                2 - Segundo colocado
                3 - Quantidade de votos em branco
                4 - Quantidade de votos nulos
                5 - Mostra eleitores
                6 - Mostra apuração
                9 - Retornar
                """;

        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(stats));

            switch (opc) {
                case 1: //Vencedor
                    statMet.vencedor(apuracao);
                    break;
                case 2: //Segundo colocado
                    break;
                case 3: //Quantidade de votos em branco
                    break;
                case 4: //Quantidade de votos nulos
                    break;
                case 5: //Mostra Eleitores
                    break;
                case 6: //Mostra Apuração
                    break;
                case 9:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
        
    }
}
