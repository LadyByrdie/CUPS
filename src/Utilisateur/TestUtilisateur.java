package Utilisateur;
import Utilisateur.*;

public class TestUtilisateur {
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