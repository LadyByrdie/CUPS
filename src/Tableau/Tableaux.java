package Tableau;

public class Tableaux {
public String[] tableau;
public int nbelements=0;
int nbelementsmax=6;
String element;

public Tableaux(String element) {
	this.tableau = new String[nbelementsmax];
	this.nbelements = 0;
	this.tableau[nbelements]=element;
	this.nbelements++;
	this.element= element;
}



public String getelement() {
	return element;
}



public void ajouterElement(String element) {
	if(verifierSiPresent(element)==1){
		this.tableau[nbelements]=element;
		nbelements++;
		rangerTableau();
		}else {
			System.out.println("Cette qualité est déja présent dans le tableau");
		}
	}

protected int verifierSiPresent(String element){
	int i=0;
	while (this.tableau[i]!=element&&i<nbelements) {
		i++;
	}
	
	if (i+1>=nbelements){
		return 1;
	} else {
		return 0;
	}
}

private void rangerTableau() {
	String element;
	for (int i=0; i<nbelements; i++) {
		for( int j=i+1; j<nbelements; j++) {
			if( this.tableau[i].compareTo(this.tableau[j])>0) {
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
		montab= new Tableaux("Calme");
		montab.ajouterElement("Sympatique");
		montab.ajouterElement("Calme");
		}

	}

