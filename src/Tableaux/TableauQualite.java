package Tableaux;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import ClassesAdmin.TicketsDemande;


public class TableauQualite extends Tableau{
	private static int NBELEMENTSMAX=37;
	private static int NBQUALITEMAX=6;
	private Tableau tableauQualite= new Tableau(NBQUALITEMAX);
public static String[] tableauRefQualite= new String[] {"aimable","ambitieux","amical",
			  "appliqué","alturiste","analytique","assertif","astucieux","attachant",
			  "attentif","attentionné","audicieux","autonome","avenant","aventureux",
			  "bienveillant","calme","chaleureux","charimatique","combatif","communicatif",
			  "concentré.e","pacifiste","confiant","conformiste","convaincant","cooperatif",
			  "cultivé","curieux.se","décidé","dévoué","confiable","direct","discipliné",
			  "discret","drôle","dynamique","efficace"};
	public TableauQualite() {
		super(NBQUALITEMAX);
	}

	
	public Tableau getTableauQualite() {
		return tableauQualite;
	}

	
	public void setTableauQualite(Tableau tableauQualite) {
		this.tableauQualite = tableauQualite;
	}


	public int getNBELEMENTSMAX() {
		return NBELEMENTSMAX;
	}


	public static int getNBQUALITEMAX() {
		return NBQUALITEMAX;
	}


	public void setTableauRefQualite(String[] NtableauRefQualite) {
		tableauRefQualite = NtableauRefQualite;
	}
	
	public static boolean verifierSidansRef(String nouvellequalite) {
		int i=0;
		while(i<NBELEMENTSMAX&&(!nouvellequalite.equals(tableauRefQualite[i]))){
			i++;
		}
		if(i<NBELEMENTSMAX) {
			return true;
		}
		TicketsDemande ticketsDemande = new TicketsDemande();
		ticketsDemande.faireDemandeQualite(nouvellequalite);
		return false;
	}

	public String correction() {
		Scanner obj = new Scanner(System.in);
		String qualite=obj.nextLine();
		while((!verifierSidansRef(qualite))&&(this.verifierSiPresent(qualite)>=0)) {
			qualite=obj.nextLine();
			qualite= qualite.replaceAll("\\p{Punct}", "");
			}
				System.out.println("Votre modification à bien été enregistré");
				return qualite;
		}
		
		
	public TableauQualite creationTab(String[] nouvellesQualites, int nombreQualites) {
		int i=0;
		while(i<nombreQualites){
			String  qualite= nouvellesQualites[i];
			if (verifierSidansRef(qualite)) {
				if (this.verifierSiPresent(qualite)<0) {
					this.ajouterElement(qualite);
			}else {
				correction();
				
				}
			}
				i++;
		}
		return this;
	}
		
}
	