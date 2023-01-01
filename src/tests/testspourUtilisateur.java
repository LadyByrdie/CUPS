package tests;
import Utilisateur.*;
import Utilisateur.TestUtilisateur;
public class testspourUtilisateur {

	public static void main(String[] args) {
		TestUtilisateur test1= new TestUtilisateur();
		//Pour ce premier test les Defauts a rentrer en Input:
			//Brute
			//Bruyant
			//Faineant (normalement il envoie un message d'erreur)
			//Capricieux.
		//Qualite
		test1.testCreationId();
	}

}
