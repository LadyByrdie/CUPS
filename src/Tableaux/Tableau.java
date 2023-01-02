package Tableaux;
import java.util.Arrays;
import java.util.Objects;

public class Tableau {
	public String[] tableau;
	protected int nbelements=0;
	int nbelementsmax;
	
	public Tableau(int nbelementsmax) {
		this.nbelementsmax=nbelementsmax;
		this.tableau = new String[nbelementsmax];
		this.nbelements = 0;
	}
	
	public int getNbelements() {
		return nbelements;
	}
	
	protected char[] transformationChar(String mot) {
		return mot.toCharArray();
	}
	
	protected Tableau transformerTableau(String[] nouveauTableau){
		int longueur= nouveauTableau.length;
		Tableau nouveauTab= new Tableau(nbelementsmax);
		for(int i=0; i<longueur;i++) {
			nouveauTab.ajouterElement(nouveauTableau[i]);
		}
		
		return nouveauTab;
	}
	
	public void ajouterElement(String element) {
		if((nbelementsmax>nbelements)&&(this.verifierSiPresent(element)<0)){
			this.tableau[nbelements]=element;
			nbelements++;
			rangerTableau();
			}else if(nbelements<=nbelementsmax){
				System.out.println("Cette qualité est déja présent dans le tableau");
			}else {
				System.out.println("Votre tableau est complet");
			}
		}
	
	public void EliminerElement(int indice) {
		if(0<=indice&&indice<this.nbelements) {
				this.tableau[indice]=null;
				rangerTableau();
				this.nbelements--;
		}else{ 
			System.out.println("L'element que vous souhaitez eliminer n'existe pas");
		}
	}
	
	public void EliminerElement(String element) {
		int indice= this.verifierSiPresent(element);
		this.EliminerElement(indice);
	}
	
	
	public int verifierSiPresent(String element){
		int i=0;
		if(this.nbelements>0) {
			while ((i<nbelements)&&!(element.equals(tableau[i]))) {
				i++;
			}
		if (element.equals(tableau[i])) {
			return i;
			}else {
				return -1;
				}
			}else{
				return -2;
	}
}
	
	public String obtenirElement(int indice) { 
		if((indice>0)&&(indice<nbelements)) {
			return this.tableau[indice];
		}else{
			throw new IllegalArgumentException("veuillez inserer un bon argument");
		}
		
	}
	
	public void rangerTableau() {
		for (int i=0; i<this.nbelements; i++) {
			for(int j=i+1; j<this.nbelements-1; j++) {
				if(this.tableau[i].compareTo(this.tableau[j])>0) {
					String element;
					element=tableau[i];
					this.tableau[i]=this.tableau[j];
					this.tableau[j]=element;
				}
			}
			
		}
	}
	
		public void afficherElements() {
			for (int i=0; i<this.nbelements;i++){
				System.out.println(this.tableau[i]);
			}
		}
		
		public void afficherTableau() {
			System.out.println(Arrays.toString(tableau));
		}
		
}