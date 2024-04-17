// CLASSE PRINCIPAL COM INSTÂNCIA DA CLASSE METODOS
import javax.swing.*;
public class ClasseMenu {   //  CLASSE PRINCIPAL
public static void main ( String[] args ){
    // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
    Aluno[] sala = new Aluno[3]; 

    // INSTÂNCIA DA CLASSE MÉTODOS
    ClasseMetodos m = new ClasseMetodos();
    
    int i;
    // EXECUÇÃO DO MÉTODO CONSTRUTOR
    for (i = 0 ; i < 3 ; i++){
      sala[i] = new Aluno(); 
    }
    int opc = 0;
    while (opc!=9){
      opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Alunos \n2 - Consulta Registros \n9 - Finaliza"));
      switch (opc){
        case 1:  sala = m.FCadastra(sala); // CHAMADA FUNÇÃO
          break;
        case 2: m.FConsulta(sala); // CHAMADA PROCEDIMENTO
          break;
        case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
          break;
        default: JOptionPane.showMessageDialog(null,"Opção Inválida");
      }// FECHA SWITCH
    }// FECHA WHILE
  }// FECHA METODO PRINCIPAL
}// FECHA CLASSE PRINCIPAL