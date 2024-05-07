import java.io.IOException;
import javax.swing.JOptionPane;
public class Controller {
    public static void main(String[] args) throws IOException {
        votacao[] eleitores = new votacao[200];
        ClasseMetodos met = new ClasseMetodos();
        menuIndicadores menu = new menuIndicadores();

        for(int i = 0; i < 200; i++){
            eleitores[i] = new votacao();
        }
        
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO \n1 - Carregar Seção/Número Eleitor \n2 - Classificar por Seção \n3 - Gravar Registros \n4 - Mostrar indicadores \n9 - Finalizar"));
            
            switch (opc) {
                case 1: // Cadastro
                    eleitores = met.funcCadastraVotacao(eleitores) ;
                    break;
                case 2: // Classficar por seção
                    eleitores = met.funcClassificaSecao(eleitores);
                    break;
                case 3: // Gravar registros
                    eleitores = met.funcGravaVotacao(eleitores);
                    break;
                case 4: // Indicadores
                    menu.segundoMenu(eleitores);
                    break;
                case 9: // Fim
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
