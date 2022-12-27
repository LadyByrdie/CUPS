package Tableau;

import Utilisateur.Utilisateur;
import java.util.Objects;

public class TableauUtilisateur extends Tableaux{
	private static int NBUTILISATEURMAX=5;
	private Utilisateur[] tableauUtilisateur=new Utilisateur[NBUTILISATEURMAX];
	private int elementsTabU=0;
	private Tableaux dejaVu= new Tableaux(300);
	
	public TableauUtilisateur(int nbelementsmax) {
		super(NBUTILISATEURMAX);
	}
	
	
	@SuppressWarnings("unused")
	
	public void AjouterElement(Utilisateur autreUtilisateur){
		String codeUtilisateur=autreUtilisateur.getIdentitUtilisateur();
		int nbUtilisateurs= this.nbelements;
		if(this.verifierSiPresent(codeUtilisateur)+dejaVu.verifierSiPresent(codeUtilisateur)<0){
			tableauUtilisateur[nbUtilisateurs]= autreUtilisateur;
			this.nbelements++;
			this.ajouterElement(codeUtilisateur);
			dejaVu.ajouterElement(codeUtilisateur);
			
		}
	}
	
	private int recherchedansleTabU(String element) {
		int i=0;
		while((!Objects.equals(element, tableauUtilisateur[i].getIdentitUtilisateur()))&&i<elementsTabU) {
			i++;
			}
		return i;
	}
	
	public void EliminerUtilisateur(String numIdent){
		int i=0;
		int presentEn= this.verifierSiPresent(numIdent);
		if (presentEn>=0){
			this.EliminerElement(presentEn);
				tableauUtilisateur[recherchedansleTabU(numIdent)]=null;
				for(int i2=i; i2<elementsTabU-1;i2++) {
					tableauUtilisateur[i2]=tableauUtilisateur[i2+1];
				}
				elementsTabU--;
		}else {
			System.out.println("L'utilisateur que vous essayer d'eliminer "
					+ "n'existe pas ou vous l'avez déjà éliminé");
			
		}
	}
	
	public void afficherInformationUtilisateur(String numIdent) {
		int indiceUtilisateur= verifierSiPresent(numIdent);
		if (indiceUtilisateur>=0){
			int i=0;
			while((!Objects.equals(numIdent, tableauUtilisateur[i].getIdentitUtilisateur()))&&i<elementsTabU) {
				i++;
				}
			//A factoriser (utilisé plusieurs fois)
			System.out.println(tableauUtilisateur[i]);
		}
	}

//	public static void main(String[] args) {
//		Utilisateur betatesteur= new Utilisateur("Betty", "intelligent", "arrogant",
//				Tableaux(), Tableaux tabDefaut, int numeroEtudiant);
//	}
}



