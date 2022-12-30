package Utilisateur;
import MenuSelection.Menu;
import Tableau.*;
import Utilisateur.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private TableauQualite tabQualite;
	private TableauDefaut tabDefaut;
	protected int age;
	private int nbUtilisateur=0;
	public Sexe sexe;
	int numeroEtudiant;
	
	private String identitUtilisateur;
	
	public Utilisateur(String nomUtilisateur, String preferenceUtilisateurQualite, String preferenceUtilisateurDefaut, int numeroEtudiant, int age) {
		this.nomUtilisateur = nomUtilisateur;
		this.preferenceUtilisateurQualite = preferenceUtilisateurQualite;
		this.preferenceUtilisateurDefaut = preferenceUtilisateurDefaut;
		this.numeroEtudiant = numeroEtudiant;
		this.age= age;
		creationTabDefaut();
		creationTabQualite();
		creerIdentit();
		DefinirOrientation();
	}
	
	private void creerIdentit() {
		String numeroEtudiantString= String.valueOf(numeroEtudiant);
		this.identitUtilisateur=nomUtilisateur+numeroEtudiantString;
	}
	
	private void creationTabDefaut(){
		Scanner obj = new Scanner(System.in);
		String defaut;
		int nbelements=tabDefaut.getNBDEFAUTSMAX();
		String[] tableauTemporaireStrings=new String[nbelements];
		int i=0;
		System.out.println("Veuillez inserer "+ nbelements + "des vos defauts");
		while(i<4) {
			defaut=obj.nextLine();
			if(defaut!="") {
				System.out.println(i+"." + defaut + "A été bien ajuté dans votre tableau.");
				tableauTemporaireStrings[i]=defaut;
				i++;
			}else {
				System.out.println("Veuillez inserer un Defaut valable"
						+ "s'il vous plait");
				defaut=obj.nextLine();
			}
		}
		this.tabDefaut=tabDefaut.creationTabDefaut(tableauTemporaireStrings,i);
	}
	
	private void creationTabQualite(){
		Scanner obj = new Scanner(System.in);
		String qualite;
		int nbelements=tabQualite.getNBELEMENTSMAX();
		String[] tableauTemporaireStrings=new String[nbelements];
		int i=0;
		System.out.println("Veuillez inserer "+ nbelements + " principales des vos qualites");
		while(i<nbelements) {
			qualite=obj.nextLine();
			if(qualite!="") {
				System.out.println(i+"." + qualite + "A été bien ajuté dans votre tableau.");
				tableauTemporaireStrings[i]=qualite;
				i++;
			}else {
				System.out.println("Veuillez s'il inserer un Defaut "
						+ "s'il vous plait");
				qualite=obj.nextLine();
			}
		}
		this.tabQualite=tabQualite.creationTabQualite(tableauTemporaireStrings,i);
	}
	
	
	private void DefinirOrientation() {
		Scanner obj = new Scanner(System.in);
		String option="";
		Menu.menuOrientation();
		while(option!="1"&&option!="2"&&option!="3"&&option!="4") {
			System.out.println("Saisisez un bon numero s'il vous plait");
			option=obj.nextLine();
		}
		if (option=="1") {
			this.orientation="heterosexuelle";
		}else if(option=="2") {
			this.orientation="homosexuelle";
		}else if(option=="3"){
			this.orientation="bisexuelle";
		}else{
			this.orientation="pansexuelle";
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

	public Tableaux getTabQualite() {
		return tabQualite;
	}

	public Tableaux getTabDefaut() {
		return tabDefaut;
	}

	public String getPreferenceUtilisateurQualite() {
		return preferenceUtilisateurQualite;
	}


	public String getPreferenceUtilisateurDefaut() {
		return preferenceUtilisateurDefaut;
	}


	public Sexe getSexe() {
		return sexe;
	}


	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}


	protected void afficherInfoUtilisateur() {
		System.out.println(this.nomUtilisateur+ ", "+this.preferenceUtilisateurQualite+", "
+this.preferenceUtilisateurDefaut+ ", "+this.numeroEtudiant+", "+this.age+", "+this.sexe+ ", " 
+this.orientation+", " +this.identitUtilisateur+", " +this.tabQualite+", " +this.tabDefaut);
	}
	
public static void main(String[] args) {
	Utilisateur random;
	random= new Utilisateur("Machin", "Attentif", "Distraite", 0001, 20);
	
}
}
