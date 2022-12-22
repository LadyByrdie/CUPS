package Tableau;

public class TableauQualite {
String[] tabQualite;
int nbqualite=0;
int nbqualitemax;
String qualite;

private TableauQualite(String qualite) {
	this.tabQualite = new String[nbqualitemax];
	tabQualite[nbqualite]=qualite;
}


}
