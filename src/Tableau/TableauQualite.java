package Tableau;
import ClassesAdmin.TicketsDemande;
import Utilisateur.*;

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

	
	//protected int verifierMot(String nouvellequalite) {
//		char[] motDeBase= nouvellequalite.toCharArray();
//		int longueur= motDeBase.length;
//		for( int i=0; i<NBELEMENTS;i++) {
//			char[] motComare= tableauDefaut.transformationChar(tableauDefaut.obtenirElement(i));
//			
//		}
//		return 0;
	//}


	
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


	private int verifierQualite(String nouvellequalite) {
		if (tableauQualite.verifierSiPresent(nouvellequalite)>=0) {
			return 1;
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				return 0;
				}
				
			}
	

	public void creationTabQualite(String[] nouvellesQualites, int nombreQualites) {
		int i=0;
		while(i<=nombreQualites) {
			String  qualite= nouvellesQualites[i];
			if (verifierQualite(qualite)==1) {
				this.tableauQualite.ajouterElement(qualite);
			}
		}
	}
		
}
	