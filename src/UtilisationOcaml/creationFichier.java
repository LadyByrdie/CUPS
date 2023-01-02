package UtilisationOcaml;
import java.io.File;
import java.io.IOException;

public class creationFichier {
	public void creerFichier() throws IOException{
		File file = new File("CUPS/src/TableauUtilisateur");
		if (file.createNewFile()){
		    System.out.println("File created");
		} else {
		    System.out.println("File already exists");
		}
	
	}
}
