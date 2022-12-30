package Tableau;
import java.util.Objects;

public class Tableaux {
	public String[] tableau;
	protected int nbelements=0;
	int nbelementsmax;
	String element;
	
	public Tableaux(int nbelementsmax) {
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
	
	protected Tableaux transformerTableau(String[] nouveauTableau) {
		int longueur= nouveauTableau.length;
		Tableaux nouveauTab= new Tableaux(nbelementsmax);
		for(int i=0; i<longueur;i++) {
			nouveauTab.ajouterElement(nouveauTableau[i]);
		}
		
		return nouveauTab;
	}
	
	public void ajouterElement(String element) {
		if(verifierSiPresent(element)<0){
			this.tableau[nbelements]=element;
			nbelements++;
			rangerTableau();
			}else {
				System.out.println("Cette qualité est déja présent dans le tableau");
			}
		}
	
	public void EliminerElement(int indice) {
		if(0<=indice&&indice<nbelements) {
				this.tableau[indice]=null;
				rangerTableau();
				nbelements--;
		}else{ 
			System.out.println("L'element que vous souhaitez eliminer n'existe pas");
		}
	}
	
	public void EliminerElement(String element) {
		int indice= verifierSiPresent(element);
		EliminerElement(indice);
	}
	
	protected int verifierSiPresent(String element){
		int i=0;
		while (!Objects.equals(this.tableau[i], element)&&i<nbelements) {
			i++;
		}
		
		if (i+1>=nbelements){
			return -1;
		} else {
			return i;
		}
	}
	
	public String obtenirElement(int indice) {
		return this.tableau[indice];
	}
	
	public void rangerTableau() {
		for (int i=0; i<nbelements; i++) {
			for( int j=i+1; j<nbelements; j++) {
				if( this.tableau[i].compareTo(this.tableau[j])>0) {
					String element;
					element=tableau[i];
					this.tableau[i]=this.tableau[j];
					this.tableau[j]=element;
				}
			}
			
		}
		}
	
		public void afficherElements() {
			for (int i=0; i<nbelements;i++){
				System.out.println(this.tableau[i]);
			}
		}
	
		public static void main(String[] args) {
			Tableaux montab;
			montab= new Tableaux(3);
			montab.ajouterElement("Sympatique");
			montab.ajouterElement("Calme");
			}
}