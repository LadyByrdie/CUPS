package Tableaux;
import Utilisateur.Utilisateur;
import java.util.Objects;

import Tableaux.*;

public class TableauUtilisateur extends Tableau{
	public TableauUtilisateur() {
		super(NBUTILISATEURMAX);
	}

	private static int NBUTILISATEURMAX=5;
	private Utilisateur[] tableauUtilisateur=new Utilisateur[NBUTILISATEURMAX];
	private int elementsTabU=0;
	private Tableau dejaVu= new Tableau(300);
	
	
	
	
	@SuppressWarnings("unused")
	
	public void ajouterElement(Utilisateur autreUtilisateur){
		String codeUtilisateur=autreUtilisateur.getIdentitUtilisateur();
		int nbUtilisateurs= this.nbelements;
		if(this.verifierSiPresent(codeUtilisateur)+dejaVu.verifierSiPresent(codeUtilisateur)<0){
			tableauUtilisateur[nbUtilisateurs]= autreUtilisateur;
			this.ajouterElement(codeUtilisateur);
			this.nbelements++;
			dejaVu.ajouterElement(codeUtilisateur);
			
		}
	}
	
	private int recherchedansleTabU(String element) {
		int i=0;
		while((!element.equals(tableauUtilisateur[i].getIdentitUtilisateur()))&&i<elementsTabU) {
			i++;
			}
		return i;
	}
	
	public void EliminerUtilisateur(String numIdent){
		int i=0;
		int presentEn= super.verifierSiPresent(numIdent);
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
		int indiceUtilisateur= super.verifierSiPresent(numIdent);
		if (indiceUtilisateur>=0){
			int i=0;
			while((i<elementsTabU)&&(!numIdent.equals( tableauUtilisateur[i].getIdentitUtilisateur()))) {
				i++;
				}
			if(numIdent.equals(tableauUtilisateur[i].getIdentitUtilisateur())) {
				afficherInformationUtilisateur(i);
			}
		}else{
			System.out.println("Erreur: Identifiant non retrouvé");
			
		}
	}
	
	public String afficherInformationUtilisateur(int indice) {
		if((indice>0)&&(indice<nbelements)) {
			return tableauUtilisateur[indice].afficherInfoUtilisateurOcaml();
		}else{
			throw new IllegalArgumentException("veuillez inserer un bon argument");
		}
		
	}
	
	public void afficherTableauUtilisateur() {
		for(int i=0; i<this.getNbelements();i++) {
			tableauUtilisateur[i].afficherInfoUtilisateur();
		}
	}
	
}




//	public static void main(String[] args) {
//		Utilisateur betatesteur= new Utilisateur("Betty", "intelligent", "arrogant",
//				Tableaux(), Tableaux tabDefaut, int numeroEtudiant);
//	}





