package Utilisateur;
import Utilisateur.*;

public class TestUtilisateur {
//	Utilisateur milley= new Utilisateur("Milley","attentionné","Bruyant", 12345678,21);
//	Utilisateur anthoine= new Utilisateur("Antoine","aimable","Bête",12345667, 20);
	Utilisateur elena= new Utilisateur("Elena","alturiste","Bruyant",13242134,21);
//	
	public void testCreationId() {
		elena.creerIdentit();
		String id=elena.getIdentitUtilisateur();
		System.out.println(id);
	}
	
	public void testafficherInfoUtilisateur() {
		elena.afficherInfoUtilisateur();
	}
}
