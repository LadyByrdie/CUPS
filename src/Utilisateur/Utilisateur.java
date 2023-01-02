package Utilisateur;
import ClassesAdmin.TicketsDemande;
import MenuSelection.Menu;
import Tableaux.*;
import Utilisateur.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.math.*;
public class Utilisateur {
	public String nomUtilisateur;
	protected String preferenceUtilisateurQualite;
	protected String preferenceUtilisateurDefaut;
	protected String orientation;
	private TableauQualite tabQualite= new TableauQualite();
	private TableauDefaut tabDefaut=new TableauDefaut();
	public TableauUtilisateur tabUtilisateur= new TableauUtilisateur();
	protected int age;
	private int nbUtilisateur=0;
	public String sexe;
	public String Orientation;
	int numeroEtudiant;
	private static int NBDELEMENTSATTENDUS=3;
	private String identitUtilisateur;
	
	public Utilisateur(String nomUtilisateur, String preferenceUtilisateurQualite, String preferenceUtilisateurDefaut, int numeroEtudiant, int age) {
		this.nomUtilisateur = nomUtilisateur;
		this.preferenceUtilisateurQualite = preferenceUtilisateurQualite;
		this.preferenceUtilisateurDefaut = preferenceUtilisateurDefaut;
		this.numeroEtudiant = numeroEtudiant;
		this.age= age;
	}
	
	
	public void creerIdentit() {
		String numeroEtudiantString= String.valueOf(numeroEtudiant);
		this.identitUtilisateur=nomUtilisateur+numeroEtudiantString;
	}
	
	public void creationTabDefaut(){
		Scanner obj = new Scanner(System.in);
		String defaut;
		int i=0;
		System.out.println("Veuillez inserer "+ NBDELEMENTSATTENDUS + " des vos defauts");
		while(i<NBDELEMENTSATTENDUS) {
			defaut=obj.nextLine();
			defaut= defaut.replaceAll("\\p{Punct}", "");
			if(defaut!="") {
				if(tabDefaut.verifierSidansRef(defaut)&&tabDefaut.verifierSiPresent(defaut)<0){
					tabDefaut.ajouterElement(defaut);
					}else {
						//normalement il devrait avoir un while mais il manque la condition
						//adequate
						if(tabDefaut.verifierSiPresent(defaut)>=0) {
							System.out.println("veuillez inserer un autre:");
							tabDefaut.ajouterElement(tabDefaut.correction());
						}
						
					}
					System.out.println(i+1+"." + defaut + " à été bien ajuté dans votre tableau.");
				}else {
				System.out.println("Veuillez inserer un Defaut valable"
						+ "s'il vous plait");
				tabDefaut.ajouterElement(tabDefaut.correction());
				}
				i++;
			}
		}
		
	
	public void creationTabQualite(){
		Scanner obj = new Scanner(System.in);
		String qualite;
		int i=0;
		System.out.println("Veuillez inserer "+ NBDELEMENTSATTENDUS + " des vos qualites");
		while(i<NBDELEMENTSATTENDUS) {
			qualite=obj.nextLine();
			qualite= qualite.replaceAll("\\p{Punct}", "");
			if(qualite!="") {
				if(tabQualite.verifierSidansRef(qualite)&&tabQualite.verifierSiPresent(qualite)<0){
					tabQualite.ajouterElement(qualite);
					}else {
						//normalement il devrait avoir un while mais il manque la condition
						//adequate
						if(tabQualite.verifierSiPresent(qualite)>=0) {
							System.out.println("veuillez inserer un autre:");
							tabQualite.ajouterElement(tabQualite.correction());
						}
						
					}
					System.out.println(i+1+"." + qualite + " à été bien ajuté dans votre tableau.");
				}else {
				System.out.println("Veuillez inserer un Qualite valable"
						+ "s'il vous plait");
				tabDefaut.ajouterElement(tabQualite.correction());
				}
				i++;
			}
	}
	
	
	public void DefinirOrientation() {
		Scanner obj = new Scanner(System.in);
		int option=0;
		Menu menu = new Menu();
		menu.menuOrientation();
		while(option!=1&&option!=2&&option!=3&&option!=4) {
			System.out.println("Saisisez un bon numero s'il vous plait");
			option=Integer.parseInt(obj.nextLine());
		}
		if (option==1) {
			this.orientation="heterosexuelle";
		}else if(option==2) {
			this.orientation="homosexuelle";
		}else if(option==3){
			this.orientation="bisexuelle";
		}else{
			this.orientation="pansexuelle";
		}
	}
	
	public void DefinirSexe() {
		Scanner obj = new Scanner(System.in);
		int option=0;
		Menu menu = new Menu();
		menu.menuSexe();
		while(option!=1&&option!=2&&option!=3) {
			System.out.println("Saisisez un bon numero s'il vous plait");
			option=Integer.parseInt(obj.nextLine());;
		}
		if (option==1) {
			this.sexe="Femme";
		}else if(option==2) {
			this.sexe="Homme";
		}else{
			this.sexe="Non Binaire";
		}
	}
	
	public String getIdentitUtilisateur() {
		return identitUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public int getNbUtilisateur() {
		return nbUtilisateur;
	}

	public Tableau getTabQualite() {
		return tabQualite;
	}

	public Tableau getTabDefaut() {
		return tabDefaut;
	}

	public String getPreferenceUtilisateurQualite() {
		return preferenceUtilisateurQualite;
	}


	public String getPreferenceUtilisateurDefaut() {
		return preferenceUtilisateurDefaut;
	}


	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}


	
	public String afficherInfoUtilisateurOcaml() {
		return this.nomUtilisateur+ ", "+this.preferenceUtilisateurQualite+", "
+this.preferenceUtilisateurDefaut+ ", "+this.numeroEtudiant+", "+this.age+", "+this.sexe+ ", " 
+this.orientation+", " +this.identitUtilisateur+", " +tabQualite.toString()+", " +this.tabDefaut.toString();
	}
	
	public void afficherInfoUtilisateur() {
		System.out.println("Nom: " + this.nomUtilisateur);
		System.out.println("Qualite Recherché:  "+ this.preferenceUtilisateurQualite);
		System.out.println("Defaut évité: " +this.preferenceUtilisateurDefaut);
		System.out.println("Age: "+this.age);
		System.out.println("Genre: " + this.sexe);
		System.out.println("Orientation: "+ this.orientation );
		System.out.println("Mes Qualites: ");
		tabQualite.afficherTableau();
		System.out.println("Mes Defauts: ");
		tabDefaut.afficherTableau();
	}
	
}
