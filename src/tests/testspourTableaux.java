package tests;
import Tableaux.TableauQualite;
import Tableaux.testTableau;
import Utilisateur.*;
import Tableaux.TestTableauQualite;
public class testspourTableaux {
	public static void main(String[] args) {
		testTableau tab1= new testTableau();
//		tab1.testAjouterelementsRepete();
//		tab1.testAtteindreQuantiteMax();
//		tab1.testAjouterelementsRepete();
//		tab1.testEliminerElementSString();
//		tab1.testEliminerElementStringAbsence();
//		tab1.testRangementTableaux(); a retester
//		tab1.testerTranformerTableau();
//		tab1.testerTranformerTableauSurcharge();
		
		//Tests pour les tableau Qualite(et defaut)
		
//		TestTableauQualite tab2;
		TestTableauQualite tab2= new TestTableauQualite();
//		
//		tab2.testverifierSidansRef();
		tab2.testCreationTabQualite();
		
		//Tests pour les tableu d'Utilisateur
		
		}
}