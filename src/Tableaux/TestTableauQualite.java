package Tableaux;
import Tableaux.*;

public class TestTableauQualite {
	TableauQualite montab= new TableauQualite();
	TableauQualite montab1= new TableauQualite();
	TableauQualite montab3= new TableauQualite();

	public void testverifierSidansRef() {
		if (montab.verifierSidansRef("avenant")) {
			System.out.println("Test1: Oui");
		}else {
			System.out.println("Test1: Non");
		}
		if (montab.verifierSidansRef("gentil")) {
			System.out.println("Test2:Oui");
		} else {
			System.out.println("Test2:Non");
		}
	}
	
	public void testCreationTabQualite() {
		String[] bonTab= new String[] {"aimable","ambitieux","amical"};
		String[] pasbonTab= new String[] {"aimable","ambitieux","autreChose"};
		String[] surchargeTab= new String[] {"aimable","attentionné","audicieux","autonome","avenant","aventureux"};
		System.out.println("Premier Tableau:");
		montab=montab.creationTab(bonTab,3);
		montab.afficherElements();
		System.out.println("Deuxième Tableau:");
		montab1= montab1.creationTab(pasbonTab,3);
		montab1.afficherElements();
		System.out.println("Troisième Tableau");
		montab3=montab3.creationTab(surchargeTab, 2);
		montab3.afficherElements();
	}
	
//Les test réalisées sur cette classe sont ainsi valable dans la classe Tableau Defaut
	//vu que c'est un copier coller de la classe TableauQualité, la seule qui change c'est
	// la liste de ref (refDefauts, refQualite)
}
