//Caixa eletrônico
package ExsVetorMatriz;
import javax.swing.JOptionPane;
public class lt04_CaixaEletrônico {
    static int somatotalnotas = 0, retiradas = 0, banco;
    static float matrizbancos[][] = new float [4][5];
    public static void main(String[] args) {
        int opc = 0;
        int vetornotas[] = new int[6];

        //Menu Principal
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Notas no caixa \n2 - Retirar Notas \n3 - Estatísica \n9 - Finalizar"));

            switch (opc) {
                case 1:
                    vetornotas = CarregarNotas(vetornotas);
                    break;
                case 2:
                    vetornotas = RetirarNotas(vetornotas);
                    somatotalnotas = FuncSomaNotas(vetornotas);
                    if(somatotalnotas <= 0){
                        JOptionPane.showMessageDialog(null, "CAIXA ESGOTADO");
                        Finalização();
                    }
                    
                    retiradas++;
                    if(retiradas > 100){
                        JOptionPane.showMessageDialog(null, "LIMITE DE SAQUES ATINGIDO");
                        Finalização();
                    }
                    break;
                case 3:
                    Estatisticas();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
    
    static int[] CarregarNotas(int vt[]){
        for(int i = 0; i < 6; i++){
            //Carregando valores
            switch(i){
                case 0:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 100 reais"));
                    break;
                case 1:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 50 reais"));
                    break;
                case 2:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 20 reais"));
                    break;
                case 3:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 10 reais"));
                    break;
                case 4:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 5 reais"));
                    break;
                case 5:
                    vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de notas de 2 reais"));
                    break;
            }
        }
        //Total no caixa
        somatotalnotas = FuncSomaNotas(vt);
        
        return vt;
    }

    static int[] RetirarNotas(int vt[]){
        banco = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do seu banco \n1 - Banco do Brasil \n2 - Santander \n3 - Itaú \n4 - Caixa"));
        int saque = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor desejado para saque?"));
        
        /*
        if((saque - 3) % 10 == 0 || (saque - 1) % 10 == 0){
            JOptionPane.showMessageDialog(null, "Valor inválido para saque. Repita o processo");
            return vt;
        }
        */

        if(saque > somatotalnotas){ //Verificação para o limite do caixa
            JOptionPane.showMessageDialog(null, "VALOR EXCEDEU O LIMITE DO CAIXA");
            return vt;
        }
        if (matrizbancos[(banco-1)][1] == 0){ //Inicialização da verificação de menor saque
            matrizbancos[(banco-1)][1] = saque;
        }

        int notas[] = new int[6];
        int reduc, notacoletada;

        switch(banco){ //Estatísticas por bancos
            case 1: //Banco do brasil | x == 0
                if(saque < matrizbancos[0][1]){ //Menor
                    matrizbancos[0][1] = saque;
                }

                if(saque > matrizbancos[0][0]){ //Maior
                    matrizbancos[0][0] = saque;
                }

                matrizbancos[0][2]++; //Contador pra média
                matrizbancos[0][3] += saque; //Total de saques
                matrizbancos[0][4] = somatotalnotas; //Sobras
                break;

            case 2: //Santander | x == 1
                if(saque < matrizbancos[1][1]){ //Menor 
                    matrizbancos[1][1] = saque;
                }
                
                if(saque > matrizbancos[1][0]){ //Maior
                    matrizbancos[1][0] = saque;
                }
                
                matrizbancos[1][2]++; //Contador pra média
                matrizbancos[1][3] += saque; //Total de saques
                matrizbancos[1][4] = somatotalnotas; //Sobras
                break;

            case 3: //Itaú | x == 2
                if(saque < matrizbancos[2][1]){ //Menor
                    matrizbancos[2][1] = saque;
                }
                
                if(saque > matrizbancos[2][0]){ //Maior
                    matrizbancos[2][0] = saque;
                }
                
                matrizbancos[2][2]++; //Contador pra média
                matrizbancos[2][3] += saque; //Total de saques
                matrizbancos[2][4] = somatotalnotas; //Sobras
                break;

            case 4: //Caixa | x == 3
                if(saque < matrizbancos[3][1]){ //Menor
                    matrizbancos[3][1] = saque;
                }
                
                if(saque > matrizbancos[3][0]){ //Maior
                    matrizbancos[3][0] = saque;
                }
                
                matrizbancos[3][2]++; //Contador pra média
                matrizbancos[3][3] += saque; //Total de saques
                matrizbancos[3][4] = somatotalnotas; //Sobras
                break;
        } 
        
        //Execução do Saque
        while(saque > 0){
            for(int i = 0; i < 6; i++){
                if (saque <= 0){
                    break;
                }
                switch (i) {
                    case 0:
                        if(saque < 100){ //Notas possíveis
                            break;
                        }

                        if(vt[i] <= 0){ //Notas de 100 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 100 indisponíveis");
                        break;
                        }
                    
                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 100 reais"));
                        reduc = notacoletada * 100;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc; 
                        break;

                    case 1:
                        if(saque < 50){ //Notas possíveis
                            break;
                        }
                        
                        if(vt[i] <= 0){ //Notas de 50 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 50 indisponíveis");
                        break;
                        }
                        
                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 50 reais"));
                        reduc = notacoletada * 50;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc;
                        break;

                    case 2:
                        if(saque < 20){ //Notas possíveis
                            break;
                        }

                        if(vt[i] <= 0){ //Notas de 20 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 20 indisponíveis");
                        break;
                        }

                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 20 reais"));
                        reduc = notacoletada * 20;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc;
                        break;

                    case 3:
                        if(saque < 10){ //Notas possíveis
                            break;
                        }    

                        if(vt[i] <= 0){ //Notas de 10 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 10 indisponíveis");
                        break;
                        }

                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 10 reais"));
                        reduc = notacoletada * 10;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc;
                        break;

                    case 4:
                        if(saque < 5){ //Notas possíveis
                            break;
                        }    

                        if(vt[i] <= 0){ //Notas de 5 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 5 indisponíveis");
                        break;
                        }

                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 5 reais"));
                        reduc = notacoletada * 5;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc;
                        break;

                    case 5:
                        if(vt[i] <= 0){ //Notas de 2 indisponíveis
                        JOptionPane.showMessageDialog(null,"Notas de 2 indisponíveis");
                        break;
                        }

                        notacoletada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 2 reais"));
                        reduc = notacoletada * 2;
                        
                        if(reduc > saque){
                            JOptionPane.showMessageDialog(null, "Notas excedem o valor do saque");
                            notas[i] = 0;
                            i--;
                            break;
                        }
                        
                        notas[i] += notacoletada;
                        vt[i] -= notacoletada; //Atualiza notas disponíveis no caixa
                        saque -= reduc;
                        break;
                }
            }
        }
        
        System.out.println("\nSAQUE EFETUADO");
        for(int inc = 0; inc < 6; inc++){
            switch(inc){
                case 0:
                    if(notas[inc]>0){
                        System.out.println("Notas de 100 reais: " + notas[inc]);
                    }
                    break;
                case 1:
                    if(notas[inc]>0){
                        System.out.println("Notas de 50 reais: " + notas[inc]);
                    }
                    break;
                case 2:
                    if(notas[inc]>0){
                        System.out.println("Notas de 20 reais: " + notas[inc]);
                    }
                    break;
                case 3:
                    if(notas[inc]>0){
                        System.out.println("Notas de 10 reais: " + notas[inc]);
                    }
                    break;
                case 4:
                    if(notas[inc]>0){
                        System.out.println("Notas de 5 reais: " + notas[inc]);
                    }
                    break;
                case 5:
                    if(notas[inc]>0){
                        System.out.println("Notas de 2 reais: " + notas[inc]);
                    }
                    break;
            }
        }
        return vt;
    }

    static void Estatisticas(){    
        for(int x = 0; x < 4; x++){
                switch(x){
                    case 0:
                        System.out.println("\nBanco do Brasil");
                        System.out.println("Maior saque efetuado: " + matrizbancos[x][0]);
                        System.out.println("Menor saque efetuado: " + matrizbancos[x][1]);
                        System.out.println("Média dos Saques efetuados: " + (matrizbancos[x][3]/matrizbancos[x][2]));
                        System.out.println("Valor total de saques efetuados: " + matrizbancos[x][3]);
                        System.out.println("Sobras do caixa: " + matrizbancos[x][4]);
                        break;

                    case 1:
                        System.out.println("\nSantander");
                        System.out.println("Maior saque efetuado: " + matrizbancos[x][0]);
                        System.out.println("Menor saque efetuado: " + matrizbancos[x][1]);
                        System.out.println("Média dos Saques efetuados: " + (matrizbancos[x][3]/matrizbancos[x][2]));
                        System.out.println("Valor total de saques efetuados: " + matrizbancos[x][3]);
                        System.out.println("Sobras do caixa: " + matrizbancos[x][4]);
                        break;
                
                    case 2:
                        System.out.println("\nItaú");
                        System.out.println("Maior saque efetuado: " + matrizbancos[x][0]);
                        System.out.println("Menor saque efetuado: " + matrizbancos[x][1]);
                        System.out.println("Média dos Saques efetuados: " + (matrizbancos[x][3]/matrizbancos[x][2]));
                        System.out.println("Valor total de saques efetuados: " + matrizbancos[x][3]);
                        System.out.println("Sobras do caixa: " + matrizbancos[x][4]);
                        break;

                    case 3:
                        System.out.println("\nCaixa");
                        System.out.println("Maior saque efetuado: " + matrizbancos[x][0]);
                        System.out.println("Menor saque efetuado: " + matrizbancos[x][1]);
                        System.out.println("Média dos Saques efetuados: " + (matrizbancos[x][3]/matrizbancos[x][2]));
                        System.out.println("Valor total de saques efetuados: " + matrizbancos[x][3]);
                        System.out.println("Sobras do caixa: " + matrizbancos[x][4]);
                        break;
                }
        }
    }
    
    static int FuncSomaNotas(int vt[]){
        int soma = 0, valor = 0;

        for(int inc = 0; inc < vt.length; inc++){
            switch (inc){
                case 0:
                    valor = 100*vt[inc];
                    break;
                case 1:
                    valor = 50*vt[inc];
                    break;
                case 2:
                    valor = 20*vt[inc];
                    break;
                case 3:
                    valor = 10*vt[inc];
                    break;
                case 4:
                    valor = 5*vt[inc];
                    break;
                case 5:
                    valor = 2*vt[inc];
                    break;
            }
            soma += valor;
        }
        for(int x = 0; x < 4; x++){
            matrizbancos[x][4] = soma;
        }
        return soma;
    }

    static void Finalização(){
        Estatisticas();
        JOptionPane.showMessageDialog(null, "Caixa Encerrado");
        System.exit(0);
    }
}