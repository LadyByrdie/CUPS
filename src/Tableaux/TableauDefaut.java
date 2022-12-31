package Tableaux;

import ClassesAdmin.TicketsDemande;
import java.util.Objects;

public class TableauDefaut extends Tableau {

	private int NBELEMENTS=37;
	private static int NBDEFAUTSMAX=6;
	private String[] tabDefautReference= new String[NBELEMENTS];
	private Tableau tableauDefaut= new Tableau(NBDEFAUTSMAX);
	public TableauDefaut(int nbelementsmax) {
		super(NBDEFAUTSMAX);
	}
	

	
	public Tableau getTableauDefaut() {
		return tableauDefaut;
	}



	public void setTableauDefaut(Tableau tableauDefaut) {
		this.tableauDefaut = tableauDefaut;
	}



	private boolean verifierDefaut(String nouvellequalite) {
		if ((this.verifierSiPresent(nouvellequalite)<0)&&verifierSidansRef(nouvellequalite)) {
			return true;
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				return false;
				}
				
			}
	
	private boolean verifierSidansRef(String nouvellequalite) {
		int i=0;
		while(i<NBELEMENTS&&(!Objects.equals(nouvellequalite, tabDefautReference[i]))){
			i++;
		}
		if(i<NBELEMENTS) {
			return true;
		}
		TicketsDemande ticketsDemande = new TicketsDemande();
		ticketsDemande.faireDemande(nouvellequalite);
		return false;
	}



	public int getNBELEMENTS() {
		return NBELEMENTS;
	}

	public int getNBDEFAUTSMAX() {
		return NBDEFAUTSMAX;
	}

	

	public TableauDefaut creationTabDefaut(String[] nouveauxDefauts, int nombreDefauts) {
		int i=0;
		while(i<=nombreDefauts) {
			String defaut= nouveauxDefauts[i];
			if (verifierDefaut(defaut)) {
				this.ajouterElement(defaut);
			}
		}
		return this;
	}
		
}