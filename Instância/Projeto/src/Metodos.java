import javax.swing.JOptionPane;
public class Metodos {
    public int[ ] CarregaVetor(int vt[ ])
	{
	    int cta;
        for ( cta = 0 ; cta < 4 ; cta++ ){
	        vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
      return vt;
}

    public int[ ] ClassificaVetor(int vt[ ])  {
	  int i,j, aux;
        for ( i = 0 ; i < 3 ; i++ ){
            for ( j = i+1 ; j < 4 ; j++ ){
	            if ((vt[i] > vt[j])) {
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux; 
                }
        }   
    }
    return vt;   
}

  public void MostraVetor(int vt[ ]){
	    int cta;
        for ( cta = 0 ; cta < 4 ; cta++ ){
	        System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	    }
        System.out.println ("******************************");
    }   
} 