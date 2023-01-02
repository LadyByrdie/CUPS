package MenuSelection;
import java.util.*;
import Utilisateur.Utilisateur;
import Tableaux.TableauQualite;
import Tableaux.TableauDefaut;
import ClassesAdmin.TicketsDemande;
public class Menu {
	
	public void sEnregistrer() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Bonjour quelle est votre nom?");
		String nom= obj.nextLine();
		System.out.println("Bonjour " + nom + "Quelle qualite vous cherchez dans votre Romeo/Juliette?");
		String qualiteCherche=obj.nextLine();
		//Il faudrait corriger l'erreur a fin d'avoir acces au tableau de reference et verifier si 
		//la qualite ou le defaut existe (fonction a faire)
//		while(!(TableauQualite.verifierSidansRef(qualiteCherche))) {
//			System.out.println("La qualite que vous venez d'inserer n'est pas encore dans nos donnes"
//					+ " on essayer de le restituer dans les plus courts delais"
//					+ "en attendents vous pouvez reesayez avec une autre qualite.");
//			qualiteCherche=obj.nextLine();
//		}
		System.out.println("Et quelle est le defaut qui pourrait gacher ce être parfait?");
		String defautEvite= obj.nextLine();
//		while(!TableauDefaut.verifierSidansRef(defautEvite)) {
//			System.out.println("Le Defaut que vous cherchez n'est pas encore dans nos donnees"
//					+ " on essayer de le restituer dans les plus courts delais"
//					+ "en attendents vous pouvez reesayez avec un autre defaut.");
//		}
		System.out.println("Nous y sommes presque! Il manque plus que votre numero étudiant, et votre age..."
				+ "quelle est votre numero étudiant?");
		int numeroEt= obj.nextInt();
		//Ici normalement on devrait comparer la donne inseré a la basse de donnees a fin de s'assurer que 
		//c'est un numero étudiant valable.
		
		System.out.println("Vous avez quelle âge?");
		int age=obj.nextInt();
		Utilisateur nouveauUtilisateur= new Utilisateur(nom,qualiteCherche,defautEvite,numeroEt,age);
		nouveauUtilisateur.creationTabDefaut();
		nouveauUtilisateur.creationTabQualite();
		nouveauUtilisateur.creerIdentit();
		nouveauUtilisateur.DefinirOrientation();
		nouveauUtilisateur.DefinirSexe();
	}
	
	public void menuSexe() {
		System.out.println("Veuillez s'il vous plait choisir"+
	"un numero celon votre genre: ");
		System.out.println("1.Femme");
		System.out.println("2.Homme");
		System.out.println("3.Non Binaire ");
	}
	
	public void menuOrientation() {
		System.out.println("Veuillez s'il vous plait choisir"+ 
				"votre orientation numero celon votre orientation sexuelle: ");
				System.out.println("1. Heterosexuelle");
				System.out.println("2. Homosexuelle");
				System.out.println("3. Bisexuelle");
				System.out.println("4. Pansexuelle");
	}

}
