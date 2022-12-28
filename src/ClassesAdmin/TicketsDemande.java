package ClassesAdmin; 
import Tableau.Tableaux;

public class TicketsDemande {
	public String[] boite;
	int nbelement=0;
		
	public void faireDemande(String element) {
		boite[nbelement]=element;
		nbelement++;
		}
	
	protected void correctionTableauQualite(Tableaux tab, String element) {
		tab.setTableauQualite();
	}
}

