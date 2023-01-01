package Tableaux;


import ClassesAdmin.TicketsDemande;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TableauDefaut extends Tableau {

	private int NBELEMENTS=35;
	private static int NBDEFAUTSMAX=6;
	private String[] tabDefautReference= new String[] {"Anxieux","Arbitraire","Arriviste","Arrogant","Associable",
			"Asocial","Assisté","Autoritaire","Avare","Avide","Bagarreur",
			"Baratineur","Bavard","Bête","Bileux","Blagueur","Blasé",
			"Blessant","Borné","Boudeur","Brouillon","Brute","Bruyant",
			"Cachottier","Calculateur","Capricieux","Caractériel","Carriériste",
			"Cassant","Casse-cou","Castrateur","Chiant","Insensible",
			"Cérémonieux","Chicaneur"};
	
	private Tableau tableauDefaut= new Tableau(NBDEFAUTSMAX);
	public TableauDefaut() {
		super(NBDEFAUTSMAX);
	}
	
	public void afficherTableau() {
		System.out.println(Arrays.toString(tableau));
	}
	

	
	public Tableau getTableauDefaut() {
		return tableauDefaut;
	}



	public void setTableauDefaut(Tableau tableauDefaut) {
		this.tableauDefaut = tableauDefaut;
	}
	
	public String correction() {
		Scanner obj = new Scanner(System.in);
		String defaut=obj.nextLine();
		while(!verifierSidansRef(defaut)) {
			defaut=obj.nextLine();
			defaut= defaut.replaceAll("\\p{Punct}", "");
			}
				System.out.println("Votre modification à bien été enregistré");
				return defaut;
		}
		
	
	public boolean verifierSidansRef(String nouvellequalite) {
		int i=0;
		while(i<NBELEMENTS&&(!Objects.equals(nouvellequalite, tabDefautReference[i]))){
			i++;
		}
		if(i<NBELEMENTS) {
			return true;
		}
		TicketsDemande ticketsDemande = new TicketsDemande();
		ticketsDemande.faireDemandeDefaut(nouvellequalite);
		return false;
	}

	public int getNBELEMENTS() {
		return NBELEMENTS;
	}

	public int getNBDEFAUTSMAX() {
		return NBDEFAUTSMAX;
	}

	public TableauDefaut creationTabDefaut(String[] nouveauxDefauts, int nombreDefauts) {
		int i=0;
		while(i<=nombreDefauts) {
			String defaut= nouveauxDefauts[i];
			if(verifierSidansRef(defaut)) {
				if(this.verifierSiPresent(defaut)<0) {
					this.ajouterElement(defaut);	
			}else{
				correction();
			}
				i++;
			
		}
		
	}
		return this;
		
}
}