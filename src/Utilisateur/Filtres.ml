let detecterSexe unUtilisateur= 
	match unUtilisateur with
	| _ -> failwith "erreur aucun element a été introduit"
	|(nomUtilisateur,preferenceUtilisateurQualite,
preferenceUtilisateurDefaut,numeroEtudiant,age,sexe, 
orientation, numeroidentification, tabQualite, tabDefaut)::autres-> sexe 

let detecterOrientation unUtilisateur=
	match unUtilisateur with
	|  _ -> failwith "erreur aucun element a été introduit"
	|nomUtilisateur,preferenceUtilisateurQualite,
preferenceUtilisateurDefaut,numeroEtudiant,age,sexe, 
orientation, numeroidentification, tabQualite, tabDefaut::autres-> orientation


(*Si la fonction renvoie fans dans Java il faudrait supprimer l'utilisateur*)
let filtreOrientation utilisateur1 utilisateur2=
	let orientation1= detecterOrientation utilisateur1 in 
	let orientation2= detecterOrietation utilisateur2 in 
	let sexe1 = detecterSexe utilisateur1 in 
	let sexe2 = detecterSexe utilisateur2 in
	match orientation1 with 
	|heterosexuel -> !((sexe1 != sexe2)||(sexe2!="non binaire")) 			
	|homosexuel -> (sexe1==sexe2)
	|bisexuel -> (sexe2!= "trans")
	|pansexuel -> true

let detecterDefautpref unUtilisateur=
	match unUtilistaeur with
	|  _ -> failwith "erreur aucun element a été introduit"
	|(nomUtilisateur,preferenceQualite,
	preferenceDefaut,numeroEtudiant,age,sexe, 
	orientation, numeroidentification, tabQualite, tabDefaut)-> preferenceDefaut 

let extraireTabDefaut unUtilisateur= 
	match unUtilisateur with
	|  _ -> failwith "erreur aucun element a été introduit"
	|(nomUtilisateur,preferenceQualite,
	preferenceDefaut,numeroEtudiant,age,sexe, 
	orientation, numeroidentification, tabQualite, tabDefaut)-> tabDefaut
		
let filtreDefaut  utilisateur1 utilisateur2 =
	let defaut1= deteceterDefautpref utilisateur1 in
	let tabDefaut2= extraireTabDefaut utilisateur2 in
	let rec filtreDefautrec defaut listeDefaut =
		match tabDefaut2 with
		|[]-> true
		|defaut2::autresDefauts-> if defaut1==defaut2 then false 
						else filtreDefautrec defaut1 autresDefauts
