package Tableau;

import ClassesAdmin.TicketsDemande;

public class TableauDefaut {

	public TableauDefaut() {
		// TODO Auto-generated constructor stub
	}
	private int NBELEMENTS=37;
	private Tableaux tableauDefaut= new Tableaux("");;
	tableauDefaut= tableauDefaut.transformerTableau(tab);


	//protected int verifierMot(String nouvellequalite) {
//		char[] motDeBase= nouvellequalite.toCharArray();
//		int longueur= motDeBase.length;
//		for( int i=0; i<NBELEMENTS;i++) {
//			char[] motComare= tableauDefaut.transformationChar(tableauDefaut.obtenirElement(i));
//			
//		}
//		return 0;
	//}


	public void verifierDefaut(String nouvellequalite) {
		if (tableauDefaut.verifierSiPresent(nouvellequalite)>=0) {
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				
				}
				
			}
		
	}
}
