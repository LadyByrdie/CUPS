package tests;
import Tableaux.TableauQualite;
import Tableaux.testTableau;
import Utilisateur.*;
import Tableaux.TestTableauQualite;
public class tests {
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
		
		//Test pour les tableau Qualite
		
		TestTableauQualite tab2;
		tab2= new TestTableauQualite();
		
//		tab2.testverifierSidansRef();
		tab2.testCreationTabQualite();
		}
}