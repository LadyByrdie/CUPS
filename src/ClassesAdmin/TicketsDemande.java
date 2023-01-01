package ClassesAdmin; 
import Tableaux.*;

public class TicketsDemande {
	private String[] boiteQualite = new String[30];
	private String[] boiteDefaut = new String[30];
	private int nbelementQ=0;
	private int nbelementD=0; 
		
	public void faireDemandeDefaut(String element) {
		boiteDefaut[nbelementD]=element;
		nbelementD++;
		System.out.println("Le defaut: " + element + " n'a pas été trouvé dans la base "+
				"Veuillez s'il vous plait inserer un autre defaut en attendant que votre demande "
				+ " soit traité.");
		}
	
	public void faireDemandeQualite(String element) {
		boiteQualite[nbelementQ]=element;
		nbelementQ++;
		System.out.println("La qualite: " + element + " n'a pas été trouvé dans la base "+
				"Veuillez s'il vous plait inserer une autre qualite en attendant que votre demande "
				+ " soit traité.");
		}
	
	protected void correctionTableauQualite(TableauQualite tab, String element) {
		Tableau tab2= new Tableau(tab.getNbelements());
		tab2= tab.getTableauQualite();
		tab2.ajouterElement(element);
		tab.setTableauQualite(tab2);
	}
	
	protected void correctionTableauDefaut(TableauDefaut tab, String element) {
		Tableau tab2= new Tableau(tab.getNbelements());
		tab2= tab.getTableauDefaut();
		tab2.ajouterElement(element);
		tab.setTableauDefaut(tab2);
	}
}

