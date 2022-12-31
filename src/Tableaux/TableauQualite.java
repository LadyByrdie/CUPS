package Tableaux;

import java.util.Objects;

import ClassesAdmin.TicketsDemande;


public class TableauQualite extends Tableau{
	private int NBELEMENTSMAX=37;
	private static int NBQUALITEMAX=6;
	private Tableau tableauQualite= new Tableau(NBQUALITEMAX);
	private String[] tableauRefQualite= new String[] {"aimable","ambitieux","amical",
			  "appliqué","alturiste","analytique","assertif","astucieux","attachant",
			  "attentif","attentionné","audicieux","autonome","avenant","aventureux",
			  "bienveillant","calme","chaleureux","charimatique","combatif","communicatif",
			  "concentré.e","pacifiste","confiant","conformiste","convaincant","cooperatif",
			  "cultivé","curieux.se","décidé","dévoué","confiable","direct","discipliné",
			  "discret","drôle","dynamique","efficace"};
	public TableauQualite() {
		super(NBQUALITEMAX);
	}

	
	public Tableau getTableauQualite() {
		return tableauQualite;
	}


	public void setTableauQualite(Tableau tableauQualite) {
		this.tableauQualite = tableauQualite;
	}


	public int getNBELEMENTSMAX() {
		return NBELEMENTSMAX;
	}


	public static int getNBQUALITEMAX() {
		return NBQUALITEMAX;
	}


	public void setTableauRefQualite(String[] tableauRefQualite) {
		this.tableauRefQualite = tableauRefQualite;
	}


	protected boolean verifierQualite(String nouvellequalite) {
		if ((this.verifierSiPresent(nouvellequalite)<0)&&verifierSidansRef(nouvellequalite)) {
			return true;
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				return false;
				}
				
			}
	
	protected boolean verifierSidansRef(String nouvellequalite) {
		int i=0;
		while(i<NBELEMENTSMAX&&(!Objects.equals(nouvellequalite, tableauRefQualite[i]))){
			i++;
		}
		if(i<NBELEMENTSMAX) {
			return true;
		}
		TicketsDemande ticketsDemande = new TicketsDemande();
		ticketsDemande.faireDemande(nouvellequalite);
		return false;
	}

	public TableauQualite creationTabQualite(String[] nouvellesQualites, int nombreQualites) {
		int i=0;
		while(i<=nombreQualites) {
			String  qualite= nouvellesQualites[i];
			if (verifierQualite(qualite)) {
				this.ajouterElement(qualite);
			}
		}
		return this;
	}
		
}
	