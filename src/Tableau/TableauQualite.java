package Tableau;
import ClassesAdmin.TicketsDemande;

public class TableauQualite extends Tableaux{
public String[] TableuQualite= new String[] {"Aimable","Ambitieux.se","Amical",
"Appliqué","Alturiste","Analytique","Assertif.ve","Asstucieux.se","Attachant.e",
"Attentif.ve","Attentionné.e","Audicieux.se","Autonome","Avenant.e","Aventureux.se",
"Bienveillant.e","Calme","Chaleureux.se","Charimatique","Combatif.ve","Communicatif.ve",
"Concentré.e","Pacifiste","Confiant.e","Conformiste","Convaincant.e","cooperatif.ve",
"Cultivé","Curieux.se","Décidé.e","Dévoué.e","Confiable","Direct","Discipliné",
"Discret.e","Drôle","Dynamique","efficace"}; 
	public TableauQualite(String qualite) {
		super(qualite);
		// TODO Auto-generated constructor stub
	}

	protected int verifierMot(String nouvellequalité) {
		return 1;
	}
	protected void verifierQualite(String nouvellequalite) {
		if (this.verifierSiPresent(nouvellequalite)==0) {
			if (verifierMot(nouvellequalite)==0) {
				//Ajouter dans le bon tableau(Utilisateur)
			}else{
				faireDemande(nouvellequalite);
				
			}
			
		}
	}
}
