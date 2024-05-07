import java.io.IOException;
import javax.swing.JOptionPane;
public class menuIndicadores {
        public void segundoMenu(votacao[] eleitores) throws IOException{
            ClasseMetodos met = new ClasseMetodos();
            
            int opc = 0;
            while(opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Mostrar indicadores \n Estatísticas de Votação em 2024 \n1 - Quantidade Eleitores por Seção \n2 - Seção com Maior e Menor número de Eleitores \n3 - Quantidade de votos por candidato \n4 - 10 primeiros colocados \n9 - Finalizar consulta"));
                switch (opc) {
                    case 1: // Eleitores por seção
                        met.eleitoresPorSecao(eleitores);
                        break;
                    case 2: // Maior e menor número de eleitores
                        met.maiorMenor(eleitores);
                        break;
                    case 3: // Quantidade de votos por candidato
                        met.votosCandidatos(eleitores);
                        break;
                    case 4: // 10 primeiros colocados
                        met.candidatosMaisVotados(eleitores);
                        break;
                    case 9: // Finalizar
                        JOptionPane.showMessageDialog(null, "Finalizando consulta");
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                        break;
                }
            }
        }
    }
