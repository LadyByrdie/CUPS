package Tableaux;
import Utilisateur.*;
import Tableaux.*;
public class TestTabUtilisateur {
	Utilisateur milley= new Utilisateur("Milley","attentionné","Bruyant", 12345678,21);
	Utilisateur anthoine= new Utilisateur("Antoine","aimable","Bête",12345667, 20);
//	Utilisateur elena= new Utilisateur("Elena","alturiste","Bruyant",132334431,21);
	
	public void testAjouterElement() {
		anthoine.tabUtilisateur.ajouterElement(milley);
		anthoine.tabUtilisateur.afficherTableau();
	}
	
	public void testAfficherInformationUtilisateur() {
		anthoine.tabUtilisateur.ajouterElement(milley);
		anthoine.tabUtilisateur.afficherInformationUtilisateur("Milley12345678");
	}
}