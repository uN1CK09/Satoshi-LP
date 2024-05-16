import javax.swing.JOptionPane;
public class MenuEstatistica {
    public void menuEstatistica(Votacao[] apuracao, Eleitor[] eleitores){
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
                    statMet.classificacao(apuracao, opc);
                    break;
                case 2: //Segundo colocado
                    statMet.classificacao(apuracao, opc);
                    break;
                case 3: //Quantidade de votos em branco
                    statMet.votosBrancos(apuracao);
                    break;
                case 4: //Quantidade de votos nulos
                    statMet.votosNulos(apuracao);
                    break;
                case 5: //Mostra Eleitores
                    statMet.mostraEleitores(apuracao, eleitores);
                    break;
                case 6: //Mostra Apuração
                    statMet.votosApurados(apuracao);
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
