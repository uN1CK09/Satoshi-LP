import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Estatisticas[] Stats = new Estatisticas[10];
        ClasseMetodos metodos = new ClasseMetodos();

        for(int i = 0; i < 10; i++){
            Stats[i] = new Estatisticas();
        }
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("            Acidentes 2020 \n1 - Registro Estatísticas \n2 - Consulta por acidentes \n3 - Maior/Menor número de acidentes \n4 - Acidentes acima da média \n9 - Finalizar"));
            switch (opc) {
                case 1: //Registro
                    metodos.FuncReg(Stats);
                    break;
                case 2: //Consulta por quantidade
                    
                    break;
                case 3: //Maior e menor
                    
                    break;
                case 4: //Acidentes acima da média
                    
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "");
                    break;
            }
        }
    }
}
