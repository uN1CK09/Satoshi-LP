//Main - Registro Lógico - Entendimento

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Metodos m = new Metodos();

        Celular[] cel = new Celular[3];
        for(int i = 0; i < 3; i++){
            cel[i] = new Celular();
        }
        
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Registrar \n2 - Consultar \n9 - Fim"));
            switch(opc){
                case 1:
                    cel = m.FuncReg(cel);
                    break;
                case 2:
                    m.ConsultaReg(cel);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }

        }

    }

}