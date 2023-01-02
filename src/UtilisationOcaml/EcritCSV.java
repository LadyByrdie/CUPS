package UtilisationOcaml;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import Tableaux.*;
import Utilisateur.*;


public class EcritCSV {
	protected static String[] tabUtilisateurSec= new String[300];
	protected static String[] tab= new String[300];
	
	public void recevoirInformationsTab(Utilisateur utilisateur1 ) {
		for(int i=0;i<utilisateur1.tabUtilisateur.getNbelements();i++) {
			this.tabUtilisateurSec[i]=utilisateur1.tabUtilisateur.afficherInformationUtilisateur(i);
		}
		
	}
		
	public void transformerlesDonnes(int indice) {
		String donnes= tabUtilisateurSec[indice];
		tab = donnes.split("\\s*,\\s*");
	}
	
//	public void ecrireDanslefichier(String[] donnesduTabUtilisateur,Utilisateur utilisateur1){
//		for(int i=0; i<utilisateur1.tabUtilisateur.getNbelements();i++) {
//			Writer writer = new Writer();
//			writer.write(tab[i]);
//		}
//			
//	}
	public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("CUPS/src/TableauUtilisateur");
        for(int i=0; i<tabUtilisateurSec.length;i++) {
        	writer.append(tabUtilisateurSec[i]);
        }
}
}

 
