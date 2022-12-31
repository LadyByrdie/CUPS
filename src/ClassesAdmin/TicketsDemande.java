package ClassesAdmin; 
import Tableaux.*;

public class TicketsDemande {
	public String[] boite;
	int nbelement=0;
		
	public void faireDemande(String element) {
		boite[nbelement]=element;
		nbelement++;
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

