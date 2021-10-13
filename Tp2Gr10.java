
/**
 * I N F 1 1 2 0
 *--------------
 * Tp2Gr10.java
 * -------------
 * Ce prgramme comprend plusieurs methodes pour but
 * d'analyser et transformer des caracteres et des 
 * chaine de caractere et enfin affiche les statistique 
 * d'utilisations.
 * -------------------------------------------------
 * Auteur : Hanani SIDI 
 * Date : 26/03/2015
 *
 * Code permenant :SIDH31128505
 * hanani.sidi@gmail.com
 */
 
public class Tp2Gr10 {
    /*--------------------PRESENTATION DU LOGOCIELLE ---------------------------------------*/
    public static void presentationLogiciel( ){
         System.out.println("------------------------------------------------------------------------------");
         System.out.println("Un Programme qui fait analyser et transformer caractere et chaine de caractere  ");
         System.out.println("-------------------------------------------------------------------------------");
}//presentationLogiciel
   /*------------------MENU DES OPERATIONS---------------------------------------------------*/
public static void menuDesOperation( ){
  System.out.println("MENU DES OPERATIONS\n 1 – Transformer \n 2 – Analyser \n 3 – Terminer le programme"); 
    }// menuDesOperation
   /*----------------VALIDATION DES OPERATIONS--------------------------*/
public static int saisirEtValiderChoix(int min, int max){
int choix ;
System.out.println ( "Veuillez choisir une operation : " );
choix = Clavier.lireInt();
     while(choix < min || choix > max){
     System.out.println("Erreur ! choix  doit etre entre 1 et 3 inclusivement");
     choix = Clavier.lireInt();
   }
return choix ;
} // saisirEtValiderChoix(int min, int max)
   /*---------------------MENU DE TRANSFORMATIONS---------------------------------------------*/
 public static void menuDesTransformations( ) {
       
       System.out.println(" MENU DES TRANSFORMATIONS\n   ");
       System.out.println("1 – Remplacer les lettres minuscules par leur position dans l'alphabet entre 2 *");
       System.out.println("2 – Remplacer les lettres MAJUSCULES par leur position dans l'alphabet entre 2 @");
       System.out.println("3 – Combinaison des options 1 et 2");
      
    } //  menuDesTransformations
    /*------------------SAISIE ET VALIDATION DE CHAINE ----------------------------------*/
 public static String SaisirEtValiderChaine(String msg, int min, int max){
        String chaine ;
        System.out.println(msg);// msg :message d'invite 
        chaine = Clavier.lireString();
        int  lo = chaine.length() ; // lo : contient le longeur de chaine
       
        while(lo < min || lo > max){
         System.out.println("Erreur !chaîne doit etre de  longueur  entre 3 et 32 inclusivement");
         chaine= Clavier.lireString();
         lo = chaine.length() ; 
       }
    
 return chaine;
} // SaisirEtValiderChaine
//----------CARACTER EST MAJUSCULE --------------
public static boolean estMinuscule(char c){
   return  c>='a'&& c<='z'  ; // estMinuscule retourne true si le c est minuscule
} // estMinuscule
//-----------------CARACTER MAJAUSCULE 
public static boolean estMajuscule(char c){
    return  c>='A'&& c<='Z' ; //estMajuscule retourne true si  le caractere est majuscule
}//estMajuscule
//----------------MENUS DE TRANSFORMATIONS
public static void menuDesDanalyse( ){
    System.out.println("MENU DES ANALYSES    \n1– Analyse complete d'un caractere\n2– Analyse complete d'une chaine");   
    }//menuDesTransformations
 // -------------estVoyelle retourn true si caractere est voyelle
  public static boolean estVoyelle (char c){
    return c=='a'||c=='A'||c=='E'||c=='e'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'||c=='y'||c=='Y';
}//estVoyelle 
//--------------estConsonne retourn true si caractere est consonne
public static boolean estConsonne (char c){
  return Character.isLetter(c)&&!(estVoyelle (c));  
}//estConsonne
//--- changerMajuscules remplace les lettres MAJUSCULES par leur position dans l'alphabet entre 2 @
public static String changerMajuscules(String s){
    int lo = s.length();// longeur de lachaine s
    String concat = " " ;// unitailisation de concat par chaine vide 
    int position ; // le numero de l'alphabet dans l'ordre alphabetique
    char lettre ;// l'alphabet 
    
    for(int i = 0;i<lo; i=i+1){
        position = 1;// initialisation de position par 1 qui est la numero de A
        lettre   = 'A';// initialisation de lettre par A pour que chaque lettre soit comparer depuis l'alphabet A
        if(estMajuscule( s.charAt(i))){
        while(s.charAt(i)!= lettre){
        position = position+1;
        lettre = (char)(lettre+1);
       
       }
              concat = concat + "@"+position+"@";
       } else{ 
             concat = concat + s.charAt(i) ;}
}
return  concat ;
    
}//String changerMajuscules(String s)
//----changerMinuscules remplace les lettres minuscules par leur position dans l'alphabet entre 2 *
public static String changerMinuscules(String s){
    int lo = s.length();
    String concat = " " ;
    int position ; 
    char lettre ;
    
    for(int i = 0;i<lo; i=i+1){
        position =1;
        lettre = 'a';
        if(estMinuscule( s.charAt(i))){
        while(s.charAt(i)!= lettre){
        position= position+1;
        lettre = (char)(lettre+1);
       }
          concat = concat + "*"+position+"*";
       } else{ 
           concat = concat + s.charAt(i) ;}
    }
 return  concat ;
   
}//changerMinuscules(String s)

//------- saisirEtValiderCaractere saisir et retourne un caractere valise 
 public static char saisirEtValiderCaractere (){
     System.out.println(" entrer un caracter ");
     String cara = Clavier.lireString();
     int lo = cara.length();
     char b ;

     while (lo==0 || lo >1){
     System.out.println("ERREUR! Vous devez entrer UN caractere !");
     System.out.println("veuillez entrer entrer UN caractere! ");
     cara = Clavier.lireString();
     lo = cara.length();
     }
    return cara.charAt(0);
}//saisirEtValiderCaractere 
//---analyseComplete affiche l'analyse d'un caracter 
 public static void analyseComplete (char c){
          System.out.println("---- RESULTATS D'ANALYSE -------");
          System.out.println("Lettre   :"+ Character.isLetter(c));
          System.out.println("Voyelle  :"+ estVoyelle ( c));
          System.out.println("Consonne :"+ estConsonne (c));
          System.out.println("Chiffre  :"+  Character.isDigit(c));
          System.out.println("Caractere non alpha-numerique :"+ !(Character.isLetterOrDigit(c)));
}//analyseComplete (char c)
//--analyseComplete affiche l'analyse d'une chaine de caractere 
 public static void analyseComplete (String s){
     int nombreDeMinusculeV =0;//nombre des minuscules voyelles
     int nombreDeMajusculeV =0;//nombre des majusdcule voyelles
     int nombreDeMinusculeC =0;//nombre des minuscles consonnes
     int nombreDeMajusculeC =0;//nombre des majuscules consonnes
     int totaleMinuscule ;
     int totaleMajuscule;
     int totaleConsonne;
     int totaleVoyelle;
     int totaleChiffre = 0;
     int totaleNonAlphanumeriques =0;
     int totaleLettre;
     int lo = s.length();//longeur de la chaince s
    for( int i = 0;i<lo; i = i+1){
        if( estConsonne (s.charAt(i))&& estMinuscule ( s.charAt(i)) ){
            nombreDeMinusculeC = nombreDeMinusculeC+1;
            }else if (estConsonne (s.charAt(i))&& estMajuscule ( s.charAt(i))){
                      nombreDeMajusculeC = nombreDeMajusculeC +1;
            
                       }else if((estVoyelle ( s.charAt(i))||estConsonne (s.charAt(i)))&&estMajuscule ( s.charAt(i))){
                                nombreDeMajusculeV = nombreDeMajusculeV +1;
                               }else if( estVoyelle ( s.charAt(i)) && estMinuscule ( s.charAt(i)) ){
                                       nombreDeMinusculeV  = nombreDeMinusculeV  +1;
                
                                    }else if(!(Character.isLetterOrDigit(s.charAt(i)))){
                                              totaleNonAlphanumeriques = totaleNonAlphanumeriques +1;
                                             }else if( Character.isDigit(s.charAt(i)) ){
                                                      totaleChiffre = totaleChiffre + 1;
                                         
                                                }

        
    }
    totaleMinuscule = nombreDeMinusculeV+nombreDeMinusculeC;
    totaleMajuscule = nombreDeMajusculeV +nombreDeMajusculeC;
    totaleVoyelle   = nombreDeMinusculeV+nombreDeMajusculeV;
    totaleConsonne  = nombreDeMinusculeC +nombreDeMajusculeC ;
    totaleLettre    = totaleMinuscule +totaleMajuscule;
    System.out.println("----------- RESULTATS D'ANALYSE ---------------" );
    System.out.println("Nombre de lettres(au total   :" + totaleLettre   +", minuscules :"+ totaleMinuscule   +", majuscules :" +totaleMajuscule + ")");
    System.out.println("Nombre de voyelles(au total  :" + totaleVoyelle  +", minuscules :"+ nombreDeMinusculeV +", majuscules :" +nombreDeMajusculeV + ")");
    System.out.println("Nombre de consonnes(au total :" + totaleConsonne +", minuscules :"+ nombreDeMinusculeC +", majuscules :" +nombreDeMajusculeC + ")");
    System.out.println("Nombre total de chiffres     :" + totaleChiffre);
    System.out.println("Nombre total de caracteres non alpha-numeriques :" + totaleNonAlphanumeriques);
    
}//analyseComplete (String s)}
//--statistiqueUtilisation affiches les resultats de la statistique d'utilisation 
public static void statistiqueUtilisation (String chaine1,String chaine2,int n1,int n2){
System.out.println("----------STATISTIQUES D'UTILISATION-----------------");
System.out.println(chaine1 + n1);
System.out.println(chaine2 + n2);
System.out.println("              ---------------");
System.out.println("         FIN NORMALE DU PROGRAMME");
}
public static void main (String[] params) {
   presentationLogiciel( );// Appel de la fonction presentation de logiciel 
   String s ;
   int g ;
   char ch ;
   String msg ="Veuillez entre une chaine ";
   String St;
   String msg1 ="Le totale des transformations est :";
   String msg2 = "Le totale des ANALYSE est :";
   int nombreAnalyseSt=0;
   int nombreAnalyseCh=0;
   int nombreTransformationSt=0;
   int nombreTransformationCh=0;
   int TotaleTransformation;
   int TotaleAnalyse;
   menuDesOperation( );// affiche menu des operations 
   g = saisirEtValiderChoix(1,3);// choix valide d'une operation entre 1 et 3
   
   while(g!= 3){
     // appel de la fonction menu des operations 
   //saisirEtValiderChoix(1,3); // appem de la fonction saisir et valider un choix 
     
   switch(g){
   case 1 : menuDesTransformations( );
   
            g = saisirEtValiderChoix(1,3);
            s = SaisirEtValiderChaine(msg, 3, 32);
            
            switch(g){
            case 1 : System.out.println("La chaine transformee est : " +changerMinuscules( s));
                     nombreTransformationSt = nombreTransformationSt+1;
                     menuDesOperation( );
                     
                     g = saisirEtValiderChoix(1,3);
            break ;
            case 2 : System.out.println("La chaine transformee est : " +changerMajuscules(s));
                     nombreTransformationSt = nombreTransformationSt+1; 
                     
                     menuDesOperation( );
                     g = saisirEtValiderChoix(1,3);
            break ;  
            case 3 : System.out.println("La chaine transformee est : " +changerMajuscules(changerMinuscules( s)));
                     nombreTransformationSt = nombreTransformationSt+1;
                     
                     menuDesOperation( );
                     g = saisirEtValiderChoix(1,3);
            break ;
            }
   break ;
   case 2 : menuDesDanalyse( );
            g = saisirEtValiderChoix(1,3);
            switch(g){
            case 1 :  ch = saisirEtValiderCaractere ();
                      analyseComplete (ch);
                      nombreAnalyseCh = nombreAnalyseCh+1;
                      
                      menuDesOperation( );
                      g = saisirEtValiderChoix(1,3);
            break ;
            case 2 : St = SaisirEtValiderChaine(msg, 3, 32);
                     analyseComplete (St);
                     nombreAnalyseSt= nombreAnalyseSt +1;
                     
                     menuDesOperation( );
                     g = saisirEtValiderChoix(1,3);
            break ;
   
           }
 }
 }

   TotaleAnalyse = nombreAnalyseSt+nombreAnalyseCh;
   statistiqueUtilisation (msg1,msg2,nombreTransformationSt, TotaleAnalyse);
  
  } // main
} // Tp2Gr10
