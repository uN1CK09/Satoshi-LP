import java.io.IOException;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) throws IOException {
        Estatisticas[] Cidades = new Estatisticas[10];
        ClasseMetodos metodos = new ClasseMetodos();

        for(int i = 0; i < Cidades.length; i++){
            Cidades[i] = new Estatisticas();
        }
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("            Acidentes 2020 \n1 - Registro Estatísticas \n2 - Consulta por acidentes \n3 - Maior/Menor número de acidentes \n4 - Acidentes acima da média \n5 - Ler arquivo de registro \n9 - Finalizar"));
            switch (opc) {
                case 1: //Registro
                    metodos.FuncReg(Cidades);
                    break;
                case 2: //Consulta por quantidade
                    metodos.ConsultaQtd(Cidades);
                    break;
                case 3: //Maior e menor
                    metodos.Maior_Menor(Cidades);
                    break;
                case 4: //Acidentes acima da média
                    metodos.AcimaMedia(Cidades);
                    break;
                case 5://Ler arquivo de registro
                    metodos.LerArquivo(Cidades);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
