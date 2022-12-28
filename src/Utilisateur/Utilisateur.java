package Utilisateur;
import Tableau.*;
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
	public Utilisateur[] baseUtilisatur;//a enlever
	protected String preferenceUtilisateurQualite;
	protected String preferenceUtilisateurDefaut;
	protected Orientation orientation;
	private TableauQualite tabQualite;
	private TableauDefaut tabDefaut;
	private TableauUtilisateur tableauUtilisateur;
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
	}
	
	private void creerIdentit() {
		String numeroEtudiantString= String.valueOf(numeroEtudiant);
		this.identitUtilisateur=nomUtilisateur+numeroEtudiantString;
	}
	
	public String boxDialogue(String element) {
		return element;
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


	public Orientation getOrientation() {
		return orientation;
	}


	public Sexe getSexe() {
		return sexe;
	}


	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}


	protected int FiltrageSexe(Utilisateur autreUtilisateur){
		Sexe sexeUtilisateur= autreUtilisateur.getSexe();
		switch (orientation) {
		case HETEROSEXUEL: 
			//eliminer: personnes du même sexe et les trans
			return 1;
			break;
		case HOMOSEXUEL:
			//eliminer les personnes du sexe opposé
			return 2;
			break;
		case BISEXUEL:
			//elimiser les trans
			return 3;
			break;
		case PANSEXUEL:
			return 4;
			break;
			
		}
	}
	
	
	protected void FiltrageDefaut(Utilisateur autreUtilisateur) {
		String defautEviter=this.getPreferenceUtilisateurDefaut();
		Tableaux tabDefautsUtilisateur= autreUtilisateur.getTabDefaut();
		this.FiltrageSexe(autreUtilisateur);
		//utiliser le tableauUtilisateur.
	}
//notemental: je pense que tout se qui est filtrage c'est a faire en OCaml.


}