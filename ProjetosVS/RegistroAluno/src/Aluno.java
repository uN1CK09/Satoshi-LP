// ****  CLASSE ABSTRATA *****************

// Classe Abstrata
class Aluno 	
{	
  String pnome;	
  String unome;	
  int pontos;	
	
  // Método Construtor	
  Aluno()
  {	
    this("" ,"" , 0);	
  }	

  // Método Procedimento
  Aluno ( String pnomealuno,	String unomealuno,	int pontosaluno){	
    pnome  = pnomealuno;	
    unome  = unomealuno;	
    pontos = pontosaluno;	
  }	
}