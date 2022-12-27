import Tableau.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.math.*;
public class Utilisateur {
	public String nomUtilisateur;
	public Utilisateur[] baseUtilisatur;
	protected String preferenceUtilisateurQualite;
	protected String preferenceUtilisateurDefaut;
	protected Orientation orientation;
	private TableauQualite tabQualite;
	private TableauDefaut tabDefaut;
	private Tableaux tableauUtilisateur;
	private int nbUtilisateur=0;
//	private int nbDefauts=tabDefaut(nbelements);
	public Sexe sexe;
	int numeroEtudiant;
	private String identitUtilisateur;
	
	
	public Utilisateur(String nomUtilisateur, String preferenceUtilisateurQualite, String preferenceUtilisateurDefaut, int numeroEtudiant) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.preferenceUtilisateurQualite = preferenceUtilisateurQualite;
		this.preferenceUtilisateurDefaut = preferenceUtilisateurDefaut;
		this.tabQualite = tabQualite;
		this.tabDefaut = tabDefaut;
		this.numeroEtudiant = numeroEtudiant;
	}
	
	private void creerIdentit() {
		String numeroEtudiantString= String.valueOf(numeroEtudiant);
		this.identitUtilisateur=nomUtilisateur+numeroEtudiantString;
	}
	
	
	public String getIdentitUtilisateur() {
		return identitUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	

	public Utilisateur[] getTabUtilisateur() {
		return tabUtilisateur;
	}

	public void setTabUtilisateur(Utilisateur[] tabUtilisateur) {
		this.tabUtilisateur = tabUtilisateur;
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
		if(tabDefautsUtilisateur.verifierSiPresent(preferenceUtilisateurDefaut)>=0) {
			//eliminer l'utilisateur de la liste d'attente matching
		}
		//si non ne rien faire
	}
//notemental: je pense que tout se qui est filtrage c'est a faire en OCaml.

	protected void FiltrageQualite(Utilisateur autreUtilisateur) {
		Tableaux tabQualiteUtilisateur= autreUtilisateur.getTabQualite();
		this.FiltrageDefaut(autreUtilisateur);
		if(tabQualiteUtilisateur.verifierSiPresent(preferenceUtilisateurQualite)>=0) {
			tableauUtilisateur.ajouterElement(nomUtilisateur);
		}
	}


private void eliminerUtilisateur(Utilisateur autreUtiliasteur) {
	
}
}
