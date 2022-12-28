package Tableau;

import java.util.Objects;

import ClassesAdmin.TicketsDemande;


public class TableauQualite extends Tableaux{
	private int NBELEMENTSMAX=37;
	private static int NBQUALITEMAX=6;
	private Tableaux tableauQualite= new Tableaux(NBQUALITEMAX);
	private String[] tableauRefQualite= new String[] {"aimable","ambitieux","amical",
			  "appliqué","alturiste","analytique","assertif","asstucieux","attachant",
			  "attentif","attentionné","audicieux","autonome","avenant","aventureux",
			  "bienveillant","calme","chaleureux","charimatique","combatif","communicatif",
			  "concentré.e","pacifiste","confiant","conformiste","convaincant","cooperatif",
			  "cultivé","curieux.se","décidé","dévoué","confiable","direct","discipliné",
			  "discret","drôle","dynamique","efficace"};
	public TableauQualite(int nbelementsmax) {
		super(NBQUALITEMAX);
	}

	
	public Tableaux getTableauQualite() {
		return tableauQualite;
	}


	public void setTableauQualite(Tableaux tableauQualite) {
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


	private boolean verifierQualite(String nouvellequalite) {
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
				this.tableauQualite.ajouterElement(qualite);
			}
		}
		return this;
	}
		
}
	