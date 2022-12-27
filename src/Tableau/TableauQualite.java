package Tableau;
import ClassesAdmin.TicketsDemande;
import Utilisateur.*;

public class TableauQualite extends Tableaux{
	private static int NBELEMENTSMAX=37;
	private static int NBELEMENTS=4;
	private String[] tableauRef= new String[] {"aimable","ambitieux","amical",
			  "appliqué","alturiste","analytique","assertif","asstucieux","attachant",
			  "attentif","attentionné","audicieux","autonome","avenant","aventureux",
			  "bienveillant","calme","chaleureux","charimatique","combatif","communicatif",
			  "concentré.e","pacifiste","confiant","conformiste","convaincant","cooperatif",
			  "cultivé","curieux.se","décidé","dévoué","confiable","direct","discipliné",
			  "discret","drôle","dynamique","efficace"};
	
	
	public static int getNBELEMENTSMAX() {
		return NBELEMENTSMAX;
	}
	
	
	public TableauQualite(int NBELEMENTSMAXmax) {
			super(NBELEMENTSMAX);
		}
	
	
	public void setTableauQualite(Tableaux tableauQualite) {
		this.tableauQualite = tableauQualite;
	}
	
	
	public Tableaux getTableauQualite() {
		return tableauQualite;
	}
	
	
	private Tableaux tableauQualite= new Tableaux(NBELEMENTS);;
	tableauQualite= TableauQualite.transformerTableau(tableauRef);
	
	
	//protected int verifierMot(String nouvellequalite) {
	//	char[] motDeBase= nouvellequalite.toCharArray();
	//	int longueur= motDeBase.length;
	//	for( int i=0; i<NBELEMENTSMAX;i++) {
	//		char[] motComare= tableauQualite.transformationChar(tableauQualite.obtenirElement(i));
	//		
	//	}
	//	return 0;
	//}
	
	
	public void verifierQualite(String nouvellequalite) {
		if (tableauQualite.verifierSiPresent(nouvellequalite)>=0) {
			}else{
				TicketsDemande ticketsDemande = new TicketsDemande();
				ticketsDemande.faireDemande(nouvellequalite);
				
			}
		
		}
	
	protected void Filtrer(String element) {
		switch(Orientation)
	}
	
}