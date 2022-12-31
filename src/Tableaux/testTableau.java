package Tableaux;
import Tableaux.*;
public class testTableau {
	Tableau montab= new Tableau(3);
	
		public testTableau() {
		super();
	}

		public void testAjouterelements() {
			montab.ajouterElement("Sympatique");
			montab.ajouterElement("Calme");
			montab.afficherElements();
		}
		
		public void testAtteindreQuantiteMax() {
			montab.ajouterElement("Sympathique");
			montab.ajouterElement("Calme");
			montab.ajouterElement("Carismatique");
			montab.ajouterElement("Reflechit");
			montab.afficherElements();
		}
		
		public void testAjouterelementsRepete() {
			montab.ajouterElement("Sympatique");
			montab.ajouterElement("Sympatique");
			montab.afficherElements();
		}
		
		public void testEliminerElementSString() {
			montab.ajouterElement("Sympathique");
			montab.ajouterElement("Calme");
			System.out.println("Premier Tableau :");
			montab.afficherElements();
			montab.EliminerElement("Calme");
			System.out.println("Deuxiéme Tableau:");
			montab.afficherElements();
		}
		
		public void testEliminerElementStringAbsence() {
			Tableau montab= new Tableau(3);
			montab.ajouterElement("Sympathique");
			montab.ajouterElement("Calme");
			System.out.println("Premier Tableau :");
			montab.afficherElements();
			montab.EliminerElement("Original");
			System.out.println("Deuxiéme Tableau:");
			montab.afficherElements();
		}
		
		public void testRangementTableaux() {
			montab.ajouterElement("1");
			montab.ajouterElement("bcd");
			montab.ajouterElement("ade");
			montab.ajouterElement("1");
			montab.afficherElements();
			
		}
		
		public void testerTranformerTableau() {
			String[] tab= new String[] {"un","deux","trois"};
			montab=montab.transformerTableau(tab);
			montab.afficherElements();
		}
		
		public void testerTranformerTableauSurcharge() {
			String[] tab= new String[] {"un","deux","trois", "quatre"};
			montab=montab.transformerTableau(tab);
			montab.afficherElements();
		}
	}
