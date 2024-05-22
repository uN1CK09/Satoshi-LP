import javax.swing.JOptionPane;
import java.io.*;
public class Metodos {
    public Conta[] cadastraContasCorrentes(Conta[] regContas) throws IOException{
        String fileContas = "ContasCorrentes.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(fileContas));

        String tiposContas = """
            1 - física
            2 - conjunta
            3 - jurídica
            4 - especial
                """;

        for(int i = 0; i < regContas.length; i++){
            regContas[i].codContaC = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta"));
            regContas[i].nomeClienteC = JOptionPane.showInputDialog("Inisira o nome do proprietário");
            regContas[i].saldoContaC = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da conta"));
        
            //Validação do tipo de conta
            boolean coletaTipo = false;
            while(!coletaTipo){
                regContas[i].tipoContaC = Integer.parseInt(JOptionPane.showInputDialog(tiposContas));

                switch (regContas[i].tipoContaC) {
                    case 1:
                        regContas[i].limiteContaC = 0;
                        coletaTipo = true;
                        break;
                    case 2:
                        regContas[i].limiteContaC = regContas[i].saldoContaC;
                        coletaTipo = true;
                        break;
                    case 3:
                        regContas[i].limiteContaC = (regContas[i].saldoContaC * 0.5) + regContas[i].saldoContaC;
                        coletaTipo = true;
                        break;
                    case 4:
                        regContas[i].limiteContaC = (regContas[i].saldoContaC + regContas[i].saldoContaC);
                        coletaTipo = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tipo inválido");
                        break;
                }
            }

        }
        //Ordena registro
        regContas = bubbleSortContas(regContas);

        //Escreve arquivo
        for(int i = 0; i < regContas.length; i++){
            escrita.write(Integer.toString(regContas[i].codContaC));
            escrita.newLine();

            escrita.write(regContas[i].nomeClienteC);
            escrita.newLine();

            escrita.write(Double.toString(regContas[i].saldoContaC));
            escrita.newLine();

            escrita.write(Double.toString(regContas[i].limiteContaC));
            escrita.newLine();

            escrita.write(Integer.toString(regContas[i].tipoContaC));
            escrita.newLine();

        }
        escrita.close();
        return regContas;
    }
    
    private Conta[] bubbleSortContas(Conta[] regContas){
        Conta aux = new Conta();

        for(int i = 0; i < regContas.length; i++){
            for(int j = 0; j < regContas.length-1; j++){
                if(regContas[j].codContaC < regContas[j+1].codContaC){
                    aux = regContas[j];
                    regContas[j] = regContas[j+1];
                    regContas[j+1] = aux;
                }
            }
        }
        return regContas;
    }

    public Movimento[] cadastraMovimentos (Movimento[] regMovimentos) throws IOException{
        String fileMov = "Movimentos.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(fileMov));
        
        String tipoMov = """
                1 - Crédito
                2 - Débito
                """;

        for(int i = 0; i < regMovimentos.length; i++){
            regMovimentos[i].codContaM = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta"));
            regMovimentos[i].valorMovimentoM = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do movimento"));
            
            //Coleta e valida movimento
            boolean coletaMov = false;
            while(!coletaMov){
                regMovimentos[i].tipoMovimentoM = Integer.parseInt(JOptionPane.showInputDialog(tipoMov));

                switch (regMovimentos[i].tipoMovimentoM) {
                    case 1://Crédito
                        coletaMov = true;
                        break;
                    case 2:
                        coletaMov = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tipo de movimento inválido");
                        break;
                }
            }

            //Coleta e valida Status
            boolean coletaStatus = false;
            while(!coletaStatus){
                regMovimentos[i].statusM = Integer.parseInt(JOptionPane.showInputDialog("Status de movimento (1 ou 2)"));

                switch (regMovimentos[i].statusM) {
                    case 1:
                        coletaStatus = true;
                        break;
                    case 2:
                        coletaStatus = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Status inválido");
                        break;
                }
            }
        }
        //Ordena Registro
        regMovimentos = bubbleSortMovimentos(regMovimentos);

        //Escreve arquivo
        for(int i = 0; i < regMovimentos.length; i++){
            escrita.write(Integer.toString(regMovimentos[i].codContaM));
            escrita.newLine();

            escrita.write(Double.toString(regMovimentos[i].valorMovimentoM));
            escrita.newLine();

            escrita.write(Integer.toString(regMovimentos[i].tipoMovimentoM));
            escrita.newLine();

            escrita.write(Integer.toString(regMovimentos[i].statusM));
            escrita.newLine();
        }
        
        escrita.close();
        return regMovimentos;
    }

    private Movimento[] bubbleSortMovimentos(Movimento[] regMovimentos){
        Movimento aux = new Movimento();

        for(int i = 0; i < regMovimentos.length; i++){
            for(int j = 0; j < regMovimentos.length-1; j++){
                if(regMovimentos[j].codContaM < regMovimentos[j+1].codContaM){
                    aux = regMovimentos[j];
                    regMovimentos[j] = regMovimentos[j+1];
                    regMovimentos[j+1] = aux;
                }
            }
        }
        return regMovimentos;
    }

    public Conta[] atualizaContas(Conta[] regContas, Conta[] regContasAtualizadas, Movimento[] regMovimentos) throws IOException{
        String fileAtt = "ContasAtualizadas.txt";
        BufferedWriter escrita = new BufferedWriter(new FileWriter(fileAtt));
        
        for(int i = 0; i < regContasAtualizadas.length; i++){
            for(int j = 0; j < regMovimentos.length; j++){
                if(regContas[i].codContaC == regMovimentos[j].codContaM){
                    if(regMovimentos[j].statusM == 1){
                        regContasAtualizadas[i] = regContas[i]; //Atualiza sem alterações
                        break;
                    }else{
                        if(regMovimentos[j].tipoMovimentoM == 1){ //Crédito - O crédito acrescenta em saldo
                            regContasAtualizadas[i] = regContas[i]; //Atualiza informações

                            //Cálculo de novo saldo e atualização
                            regContasAtualizadas[i].saldoContaC += regMovimentos[j].valorMovimentoM;
                        
                        }else{ //Débito - O débito descresce o saldo
                            //Atualiza informações antes de calcular saldos
                            regContasAtualizadas[i] = regContas[i];
                            
                            //Calculo de saldos atualizados
                            if(regContas[i].saldoContaC < regMovimentos[j].valorMovimentoM){
                                if (regContas[i].tipoContaC == 1) {
                                    regContasAtualizadas[i].saldoContaC -= regMovimentos[j].valorMovimentoM;
                                    break;
                                }else{
                                    if((regContas[i].saldoContaC + regContas[i].limiteContaC) < regMovimentos[j].valorMovimentoM){
                                        JOptionPane.showMessageDialog(null, "Valor de movimentação ultrapassa o limite disponível");
                                        break;
                                    }
                                    
                                    regMovimentos[j].valorMovimentoM -= regContasAtualizadas[i].saldoContaC; //Desconta do movimento o valor em saldo
                                    regContasAtualizadas[i].limiteContaC -= regMovimentos[j].valorMovimentoM; //zera o movimento com o valor em limite
                                    regContasAtualizadas[i].saldoContaC -= regContasAtualizadas[i].saldoContaC; //Zera o saldo
                                    break;
                                }

                            }else{
                                regContasAtualizadas[i].saldoContaC -= regMovimentos[j].valorMovimentoM;
                            }
                        }
                    }
                }
                else if(regContas[i].codContaC < regMovimentos[j].codContaM){
                    regContasAtualizadas[i] = regContas[i]; //Atualiza sem alterações
                    break;
                }
            }
        }

        //Escreve arquivo
        for(int i = 0; i < regContasAtualizadas.length; i++){
            escrita.write(Integer.toString(regContasAtualizadas[i].codContaC));
            escrita.newLine();

            escrita.write(regContasAtualizadas[i].nomeClienteC);
            escrita.newLine();

            escrita.write(Double.toString(regContasAtualizadas[i].saldoContaC));
            escrita.newLine();

            escrita.write(Double.toString(regContasAtualizadas[i].limiteContaC));
            escrita.newLine();

            escrita.write(Integer.toString(regContasAtualizadas[i].tipoContaC));
            escrita.newLine();

        }
        escrita.close();
        return regContasAtualizadas;
    }

    public void consultaContasCorrentes(Conta[] regContas){
        String tipoConta = "";
        System.out.println("\nContas Cadastradas");
        for(int i = 0; i < regContas.length; i++){
            switch (regContas[i].tipoContaC) {
                case 1:
                    tipoConta = "Física";
                    break;
                case 2:
                    tipoConta = "Conjunta";
                    break;
                case 3:
                    tipoConta = "Jurídica";
                    break;
                case 4:
                    tipoConta = "Especial";
                    break;
            }
            System.out.println("\nCódigo da conta: " + regContas[i].codContaC + "\nProprietário: " + regContas[i].nomeClienteC + "\nSaldo da conta: " + regContas[i].saldoContaC + "Limite disponível: " + regContas[i].limiteContaC + "Tipo de conta: " + tipoConta);
        }
    }

    public void consultaMovimentos(Movimento[] regMovimentos){
        String tipoMov = "";
        System.out.println("\nMovimentos");
        for(int i = 0; i < regMovimentos.length; i++){
            switch (regMovimentos[i].tipoMovimentoM) {
                case 1:
                    tipoMov = "Crédito";
                    break;
                case 2:
                    tipoMov = "Débito";
                    break;
            }

            System.out.println("\nCódigo da conta: " + regMovimentos[i].codContaM + "\nValor do movimento: " + regMovimentos[i].valorMovimentoM + "\nTipo do movimento: " + tipoMov + "Status do movimento: " + regMovimentos[i].statusM);
        }
    }

    public void consultaContasAtualizadas(Conta[] regContasAtualizadas){
        String tipoConta = "";
        System.out.println("\nContas Cadastradas");
        for(int i = 0; i < regContasAtualizadas.length; i++){
            switch (regContasAtualizadas[i].tipoContaC) {
                case 1:
                    tipoConta = "Física";
                    break;
                case 2:
                    tipoConta = "Conjunta";
                    break;
                case 3:
                    tipoConta = "Jurídica";
                    break;
                case 4:
                    tipoConta = "Especial";
                    break;
            }
            System.out.println("\nCódigo da conta: " + regContasAtualizadas[i].codContaC + "\nProprietário: " + regContasAtualizadas[i].nomeClienteC + "\nSaldo da conta: " + regContasAtualizadas[i].saldoContaC + "Limite disponível: " + regContasAtualizadas[i].limiteContaC + "Tipo de conta: " + tipoConta);
        }
    }
}
