import java.io.IOException;
import javax.swing.JOptionPane;
public class Principal {
    public static int vetorSecoes[] = {1, 3, 4, 5, 9, 10};
    public static void main(String[] args) throws IOException {
        //Instâncias e objetos
        MetodosPrincipais metodo = new MetodosPrincipais();
        MenuEstatistica menu = new MenuEstatistica();

        Eleitor[] cadastro = new Eleitor[10];
        Votacao[] votacao1 = new Votacao[5];
        Votacao[] votacao2 = new Votacao[5];
        Votacao[] apuracao = new Votacao[10];
        
        //Menus em string
        String menu1 = """
            1 - Cadastro de Eleitor
            2 - Cadastra Votação 1 e 2
            3 - Agrupa Apuração
            4 - Menu Estatística
            9 - Fim
            
            """;
            
        String menu2 = """
            1 - Cadastro Votação 1
            2 - Cadastro Votação 2
            9 - Retornar
            
            """;
        
        //Iniciliazação dos objetos
        for(int i = 0; i < votacao1.length; i++){
            votacao1[i] = new Votacao();
            votacao2[i] = new Votacao();
        }
        
        for(int i = 0; i < cadastro.length; i++){
            cadastro[i] = new Eleitor();
            apuracao[i] = new Votacao();
        }
        
        //Laço do menu
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu1));
            switch (opc) {
                case 1: //Cadastra ELeitor
                    cadastro = metodo.cadastraEleitor(cadastro);
                    break;
                case 2: //Cadastra Votação
                    int opc2 = 0;
                    while (opc2 != 9) {
                        opc2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                        switch(opc2){
                            case 1://Votação 1 - Cadastrada, ordenada e gravada
                                votacao1 = metodo.cadastraVotos(votacao1, cadastro, opc2);
                                break;
                            case 2://Votação 2 - Cadastrada, ordenada e gravada
                                votacao2 = metodo.cadastraVotos(votacao2, cadastro, opc2);
                                break;
                            case 9:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                break;
                        }
                    }
                    break;
                case 3: //Agrupa Apuração
                    apuracao = metodo.agruparApuracao(apuracao, votacao1, votacao2);
                    break;
                case 4: //Menu Estatísticas
                    menu.menuEstatistica(apuracao, cadastro);
                    break;
                case 9: //Fim
                    JOptionPane.showMessageDialog(null, "Finalizando");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}
