package Tableaux;
import Tableaux.*;

public class TestTableauQualite {
	TableauQualite montab= new TableauQualite();
	public TestTableauQualite() {
		super();
	}

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
		montab=montab.creationTabQualite(bonTab,3);
		montab.afficherElements();
		System.out.println("Check");
		montab= montab.creationTabQualite(pasbonTab,3);
		montab.afficherElements();
		montab=montab.creationTabQualite(bonTab, 2);
		montab.afficherElements();
	}
}
