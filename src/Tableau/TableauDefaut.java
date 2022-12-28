package Tableau;

import ClassesAdmin.TicketsDemande;

public class TableauDefaut {

	public TableauDefaut() {
		// TODO Auto-generated constructor stub
	}

	private int NBELEMENTS=37;
	private int NBDEFAUTSMAX=6;
	private String[] tabDefautReference= new String[NBELEMENTS];
	private Tableaux tableauDefaut= new Tableaux(NBDEFAUTSMAX);
	

	//protected int verifierMot(String nouvellequalite) {
//		char[] motDeBase= nouvellequalite.toCharArray();
//		int longueur= motDeBase.length;
//		for( int i=0; i<NBELEMENTS;i++) {
//			char[] motComare= tableauDefaut.transformationChar(tableauDefaut.obtenirElement(i));
//			
//		}
//		return 0;
	//}


	
	private int verifierDefaut(String nouvellequalite) {
		if (tableauDefaut.verifierSiPresent(nouvellequalite)>=0) {
			return 1;
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				return 0;
				}
				
			}
	
	public int getNBELEMENTS() {
		return NBELEMENTS;
	}

	public int getNBDEFAUTSMAX() {
		return NBDEFAUTSMAX;
	}

	public Tableaux getTableauDefaut() {
		return tableauDefaut;
	}

	public void creationTabDefaut(String[] nouveauxDefauts, int nombreDefauts) {
		int i=0;
		while(i<=nombreDefauts) {
			String defaut= nouveauxDefauts[i];
			if (verifierDefaut(defaut)==1) {
				this.tableauDefaut.ajouterElement(defaut);
			}
		}
	}
		
}