	(*on repond a la question: sont-ils compatibles?*)

let unUtilisateur = ("Elena","alturiste","Bruyant",13242134,21,"Femme",
                     "homosexuel","Elena13242134",("dynamique","calme","cultive"),("avare","brute","egoiste"))
let utilisateur1= unUtilisateur
    
let utilisateur2= ("Antoine","aimable","Bête",12345667, 20, "Homme","heterosexuel",
                   "Antoine12345667", ("aimable","observateur","fetard"),("capricieux","bête","autoritaire"))
  
let detecterOrientation unUtilisateur=
  match unUtilisateur with 
  |nomUtilisateur,preferenceUtilisateurQualite,
   preferenceUtilisateurDefaut,numeroEtudiant,age,sexe, 
   orientation, numeroidentification, tabQualite, tabDefaut-> orientation 
                                                                 

let detecterSexe unUtilisateur= 
  match unUtilisateur with 
  |(nomUtilisateur,preferenceUtilisateurQualite, preferenceUtilisateurDefaut,numeroEtudiant,age,sexe, orientation, numeroidentification, tabQualite, tabDefaut) -> sexe 
  |_ -> failwith "erreur aucun element a été introduit"
          
let filtreOrientation  utilisateur1 utilisateur2=
  let orientation1= detecterOrientation utilisateur1 in
  let orientation2= detecterOrientation utilisateur2 in
  let sexe1 = detecterSexe utilisateur1 in 
  let sexe2 = detecterSexe utilisateur2 in
  match orientation1 with 
  |"pansexuel"-> true
  |"heterosexuel"-> ((sexe1 <> sexe2)&&(sexe2<>"non binaire"))&&(orientation1=orientation2)		
  |"homosexuel"-> (sexe1=sexe2)&&(orientation1=orientation2)
  |"bisexuel"-> ((orientation2="heterosexuel")&&(sexe1<>sexe2))||
                ((orientation2="homosexuel")&&(sexe1=sexe2))
                
        
let detecterDefautpref unUtilisateur=
  match unUtilisateur with 
  |(nomUtilisateur,preferenceQualite,
    preferenceDefaut,numeroEtudiant,age,sexe, 
    orientation, numeroidentification, tabQualite, tabDefaut)-> preferenceDefaut
    
            
let detecterQualitePref unUtilisateur=
  match unUtilisateur with 
  |(nomUtilisateur,preferenceQualite,
    preferenceDefaut,numeroEtudiant,age,sexe, 
    orientation, numeroidentification, tabQualite, tabDefaut)-> preferenceQualite
    

let extraireTabDefaut unUtilisateur= 
  match unUtilisateur with 
  |(nomUtilisateur,preferenceQualite,
    preferenceDefaut,numeroEtudiant,age,sexe, 
    orientation, numeroidentification, tabQualite, tabDefaut)-> tabDefaut
    
    
let extraireTabQualite unUtilisateur= 
  match unUtilisateur with 
  |(nomUtilisateur,preferenceQualite,
    preferenceDefaut,numeroEtudiant,age,sexe, 
    orientation, numeroidentification, tabQualite, tabDefaut)-> tabQualite 
    
let transformerTupleenTab tuple=
  match tuple with
  |(a,b,c)->a::b::c
            
let filtreQualite utilisateur1 utilisateur2 =
  let qualite1 = detecterQualitePref utilisateur1 in 
  let qualite2 = detecterQualitePref utilisateur2 in
  let tabQualite2 = transformerTupleenTab (extraireTabQualite utilisateur2) in
  let tabQualite1 = transformerTupleenTab (extraireTabQualite utilisateur1) in
  let rec filtreQualiterec qualite tabQualite =
    match tabQualite with
    | [] -> false
    | nqualite::autresQualite -> if nqualite = qualite then true
        else filtreQualiterec nqualite autresQualite 
  in (filtreQualiterec qualite1 tabQualite2)&&(filtreQualiterec qualite2 tabQualite1)
                                           
let filtreDefaut utilisateur1 utilisateur2 =
  let defaut1 = detecterDefautpref utilisateur1 in 
  let defaut2 = detecterDefautpref utilisateur2 in
  let tabDefaut2 = transformerTupleenTab (extraireTabDefaut utilisateur2) in
  let tabDefaut1 = transformerTupleenTab (extraireTabDefaut utilisateur1) in
  let rec filtreDefautrec defaut tabDefaut =
    match tabDefaut with
    | [] -> true
    | ndefaut::autresDefauts -> if ndefaut = defaut then false 
        else filtreDefautrec ndefaut autresDefauts
  in (filtreDefautrec defaut1 tabDefaut2)&&(filtreDefautrec defaut2 tabDefaut1)
