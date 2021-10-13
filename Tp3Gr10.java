
/**
 * I N F 11 2 0
 *
 * ----------------------------------------------------------------------
 * Ce programme utilise la classe Album , et fonctionne a base des menus |
 *  ---------------------------------------------------------------------
 *          auteur1 : SOK OUSMANE  
 *          code permanent : SOKO31128307
 *          adresse de courriel : sockousmane2@gmail.com 
 *          --------------------------------------------
 *          auteur2 : Hanani SIDI 
 *          code permanent : SIDH31128505
 *          adresse de courriel : hanani.sidi@gmail.com 
 *          -------------------------------------------
 */

import java.io.*; 
public class Tp3Gr10 {
    
   // Presentation de logicielle 
    public static void presentationLog(){
        
    System.out.println("-----------------------------------------------");
    System.out.println("Logiciel de gestion de collections des disques");
    System.out.println("-----------------------------------------------\n");
  
  }
    // Cette methode retoune le sous-menus
  public static String  sousMenu(){   
   String sousMenus ="Sous-MenuL:"+"\n "+ "1: affiche le contenu de la collection d'albums"+"\n"+"   "+
                                          "2: Afficher toutes les informations sur les albums de la catégorie entrée "+
                                             "par l’utilisateur." +"\n"+"   "+
                                          "3: Afficher toutes les informations sur les albums qui sont"+
                                               "dans leur pochette d'origine "+"\n" +"   "+
                                          "4: Afficher, pour chaque catégorie d'albums, le nom de la"+
                                            " catégorie en en-tête et les titres des albums qui en font partie"+"\n"+"   "+
                                          "5: Affiche le titre et la durée de tous les albums dont la "+
                                               "durée ne dépasse pas la durée spécifiée. " +"\n"+"   "+
                                          "6: Affiche toutes les informations sur les albums dont l’année de sortie est "+
                                               "celle qui est spécifiée"+ "\n"+"   "+
                                          "7: Afficher toutes les informations sur les albums ayant chaîne comme sous-chaîne "+
                                              "dans leurs titres" + "\n"+"   "+
                                          "8: Afficher toutes les informations sur le(s) album(s) ayant comme maison de disque"+
                                              "celle qui est fournie par l'utilisateur"+"\n"+"   "+
                                          "9: Retourner au menu principal ";                         
         return sousMenus;
       }
    
      // Afficher sous menus
  public static void afficherSousMenu() {
    System.out.println(sousMenu());
  }// afficherSousMenu()
  
  // saisit et valider choix sous menu
   public static int saisirEtValiderChoixSousMenu (){
    int choix = saisirEntier("saisir un sous-menus ");
 
    while(choix <1 || choix >9){
     System.out.println("choix non valide !!!");
     choix = saisirEntier("saisir un sous-menus  ");
    }
   return choix;
  }// saisirEtValiderChoixSousMenu ()
 
  
   // Saisir et valide un entier 
   public static int saisirEntier(String msg){
    boolean ok = false ;
    int entier = 0;
      do {
        System.out.println(msg);
        
        try{
            entier = Clavier.lireInt();
            ok = true;
        }catch(NumberFormatException e ){
            System.out.println("Erreur entrer un entier ");
        }
        
      }while(!ok);
         return entier ;
    }// saisirEntier(String msg)

    // Affiche le menu pricipale 
  public static void afficherMenuPrincipal() {
    System.out.println("MENU :"); 
    String souMenuL = sousMenu();
    System.out.println("N : Ajouter un nouvel album "+"\n"+
                       "I : Afficher  informations de l'album possédant le numéro spécifié"+ "\n" +
                      souMenuL+ "\n"+
                       "T : Afficher uniquement le titre et la catégorie de l'album possédant le numéro spécifié"+"\n"+
                       "E : Supprime l'album dont le numéro est spécifié"+"\n"+
                       "G : Changer la catégorie de l'album ayant le numéro spécifié, par la nouvelle catégorie fournie"+"\n"+
                       "R : Changer le titre de l'album ayant le numéro spécifié,par le nouveau titre fourni "+"\n"+
                       "S : Modifier l’année de sortie de l'album dont le numéro est spécifié "+"\n"+
                       "D : Modifier le nom de l'artiste (ou du groupe) de l'albumayant le "+
                         "numéro spécifié, par la nouvelle informationfournie."+"\n"+
                       "Q : Quitter ");
   }//afficherMenuPrincipal()

  // Saisir et valider le choix d'un menu
    public static char saisirEtValiderChoixMenu (){
    System.out.println("saisir un menu");
    char choix = Clavier.lireCharLn();
 
   
     while(!(choix =='N' ||choix =='n'||choix =='I'||choix =='i'||choix =='l'
        ||choix =='L'||choix =='T'||choix =='t'||choix =='e'||choix =='E'||choix =='G'||choix =='g'||choix =='r'
        ||choix =='R'||choix =='s'||choix =='S'||choix =='d'||choix =='D'||choix =='q'||choix =='Q')){
 
       System.out.println("Erreur !!! choix doit être parmi : N,n,I,i,l,L,T,t,e, E,G,g,r,R,s,S,d,D,q,Q");
       choix = Clavier.lireCharLn();
          
       }
       
    return choix;
  }// saisirEtValiderChoixMenu

       // Saisir et valider le titre de l'album
     public static String saisirEtvaliderTitre ( ){
       System.out.println("Saisir le titre de l'album");
       String titre = Clavier.lireString();
        int longTitre = titre.length();
        while( longTitre==0){
         System.out.println("Erreur !!! Veuillez saisir un titre valide");   
         titre = Clavier.lireString();
         longTitre = titre.length();
        }
         return titre;
      }// saisirEtvaliderTitre ( )
      
       // saisir et valider l'artiste de l'album
     public static String saisirEtvaliderArtiste ( ){
       System.out.println("Saisir l'Artiste de l'album");
        String Artiste = Clavier.lireString();
        int longArtiste = Artiste.length();
        while( longArtiste==0){
         System.out.println("Erreur !!! Veuillez saisir un artiste valide");   
         Artiste = Clavier.lireString();
         longArtiste = Artiste.length();
        } // while( longArtiste==0)  
        return  Artiste ;   
       }//saisirEtvaliderArtist ( )
       
       // Saisir et valider la maison de disque
     public static String saisirEtvaliderMaisonDisque ( ){
       System.out.println("Saisir la MaisonDisque de l'album");
       String MaisonDisque  = Clavier.lireString();
        int longMaisonDisque  = MaisonDisque .length();
        
         while( longMaisonDisque ==0){
          System.out.println("Erreur !!! Veuillez saisir MaisonDisque valide");   
          MaisonDisque  = Clavier.lireString();
          longMaisonDisque = MaisonDisque.length();
         } // while( longMaisonDisque ==0)  
        return  MaisonDisque  ;   
      }// saisirEtvaliderMaisonDisque ( )
      
     // Saisir et valider l'annee de sortie 
     public static int saisirEtvaliderAnneeSortie ( ){
        int anneeSortie = saisirEntier("Saisir l'Annee de l'album");
        
         while(!(anneeSortie>= Album.ANNEE_MIN && anneeSortie <=Album.ANNEE_MAX )){
             
           anneeSortie   = saisirEntier ("Erreur!!! Annee de sortie doit etre entre"+ Album.ANNEE_MIN +" et "+ Album.ANNEE_MAX);  
         }
         
        return anneeSortie  ;   
       }// saisirEtvaliderAnnee ( )
       
     // Saisir et valider la categorie de l'album
     public static int  saisirEtvaliderCategorie ( ){
         
        int Categorie = saisirEntier("Veuillez saisr  une categorie !");
        String[] CATEGORIES = { "Inconnue", "Disco", "Jazz", "Classique",
        "Country", "Blues", "Rock", "Punk", "Pop", "Blue Grass", "Musique de film"};
        
          while(Categorie<Album.MIN_CATEGORIES  ||Categorie > Album.MAX_CATEGORIES  ){
             
              System.out.println("Erreur !!! Catégorie doit être entre 0 et 10:");
               for(int i = Album.MIN_CATEGORIES ;i<=Album.MAX_CATEGORIES;i++){
                System.out.println(i + " = " +CATEGORIES[i] );
              }
              Categorie = saisirEntier("Veuillez saisr de nouveau une categorie !"); 
             
           
         }// while(Categorie<Album.MIN_CATEGORIES  ||Categorie > Album.MAX_CATEGORIES  )
         return Categorie  ; 
       }// saisirEtvaliderCategorie( )
       
       // Saisir et valider la duree de l'album 
     public static int saisirEtvaliderDuree ( ){
         int duree = saisirEntier("Saisir la duree de l'album");
        
         while(!(duree>= Album.DUREE_MIN && duree <=Album.DUREE_MAX)){
            duree = saisirEntier("Erreur!!! Veuillez saisir Duree  entre "+ Album.DUREE_MIN + " Minute  et " + Album.DUREE_MAX+ " Minutes");  
         } 
        return duree   ;   
      }// saisirEtvaliderDuree ( )
      
        // Saisir et valider le support de l'album
     public static int  saisirEtvaliderSupport ( ){
         String[] SUPPORTS = {"Cassette 8 pistes", "Vinyle"};   
         int support = saisirEntier("Saisir le support de l'album");
         
          while(!(support==0 || support ==1)){
            support = saisirEntier("Erreur !!! Support doit etre :\n 1 pour Cassette 8 pistes   ou \n 0 pour Vinyle ");
           }
        
        return support ;
      }// saisirEtvaliderSupport( )
      
      // Valider la reponse par OUI ou NON 
     public static  String  validerReponse(){
         String reponse = Clavier.lireString();
        while(!( reponse.equals("OUI")||reponse.equals("oui")||reponse.equals("NON")||reponse.equals("non") )){
          System.out.println("Erreur !!! reponse doit etre par OUI ou NON");
          reponse   = Clavier.lireString();
          }
         return reponse ;
      }
       
      // Saisit et validation du numero specifique 
     public static boolean saisirEtvaliderpochoriginal ( ){
        boolean tempo = false;
        System.out.println("la l'alblum a-t-il dans ça pochette originale OUI ou NON");
        String reponse = validerReponse();// apple de la methode valider reponse par oui ou non 
           
        if(reponse.equals("OUI")||reponse.equals("oui")){
          tempo   = true ;
         }
       return tempo;
     }// saisirEtvaliderpochoriginal ( )
     
        // Saisir et valider le numero de l'album
     public static int saisirValiderNumero(){
       int numero = saisirEntier("Entrer le numero de l'album souhaiter ");

         while(numero <1){
            numero = saisirEntier("Erreur vueillez saisir en numeo >1");  
          }// while(numero <1)
       return numero ;    
        }//saisirValiderNumero()
        
    /***************************************************************************************
    *  Cette Methode ajoute un album saisit par l'utilisateur, à la collection -album- s'il y a 
    *  place si non il copie collection album dans -tabTravail- aprés il ajoute 
    *  l'album dans tabTravail.
    /*****************************************************************************************/
  public static Album [] effectuerMenuN ( Album [] listeAlbums ){
      
    
       int longList = listeAlbums.length;
        int k =0;
        int LongTabTravail  = longList+5;
       Album []tempo = listeAlbums  ;// sert comme variable intermediaire 
       Album album = new Album(saisirEtvaliderTitre ( ),saisirEtvaliderCategorie( ),saisirEtvaliderAnneeSortie ( ),
        saisirEtvaliderDuree( ),saisirEtvaliderSupport ( ),saisirEtvaliderMaisonDisque( ),saisirEtvaliderArtiste ( ),
       saisirEtvaliderpochoriginal ( )) ;
       Album []tabTravail = new Album[LongTabTravail];
     
       for(int i = 0; i< longList ; i++){
        
        if(listeAlbums[i]== null){// on verifie si la cas est vide avant d ajouter l album 
          k = k+1;                // ce compteur compte le nobre de case vide 
          listeAlbums[i] = album ;
          i = longList ;       // On sort de la boucle des que l album est ajoutee
        }//if(listeAlbums[i]== null)
        
        }//for(int i = 0; i< longList ; i++)
     
        if(k==0){ // c-a-d s'il y a pas de case vide dans Album 
            
         for(int j=0; j< longList ;j++){
           tabTravail[j]=listeAlbums[j];  // On copie la listeAlbum dans la TabTravail
           }
               
           for(int l=0; l<LongTabTravail;l++){
               
              if(tabTravail[l]== null){
               tabTravail[l]= album ;  // On ajoute l'album saisie par l'utilisateur
               l = LongTabTravail;     //  On sort de la boucle des que l album est ajoutee
               }//if(TabTravail[l]== null)
                
              }//for(int l=0; l<LongTabTravail;l++)
                  
             tempo = tabTravail;
                      
         }// if(k==0)
      return tempo ;
   
   
     
   }//effectuerMenuN ( Album [] listeAlbums )
   
      // Afficher toutes les informations de l'album possédant
     // le numéro spécifié.
       
  public static void  aficherAlbumNumero (Album [] listeAlbums){
      
    
      int longAlbums = listeAlbums.length;
      int numero = saisirValiderNumero();
      int k  = 0;
         
        for(int i=0;i< longAlbums ;i++){
       
          if(listeAlbums[i]!= null && listeAlbums[i].getNumeroIdentification()== numero){
           System.out.println("------------"+ "Album  numero "+numero+"------------");
           System.out.println(listeAlbums[i].toString()+"\n");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
         }// if(listeAlbums[i]!= null && listeAlbums[i].getNumeroIdentification()== numero)
         
        }//for(int i=0;i< longAlbums ;i++)
       
        if(k==0){
         afficherMenuPrincipal();
         }// if(k==0)
      
      
    } //aficherAlbumNumero ()
   
   
    
    //Affiche toutes les informations sur tous les albums
   public static void  afficherContenue (Album[] albums){
      
 
       int longAlbums =albums.length;
     
     
        for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!= null){
           System.out.println("----------------"+"Album["+i+"]------------------------");
           System.out.println(albums[i].toString()+"\n");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
           
          }// if(albums[i]!= null)
         
        }// for(int i=0;i< longAlbums ;i++)
      
     
       System.out.println(sousMenu());
   
    } //afficherContenu
   
    // Afficher toutes les informations sur les albums de la catégorie entrée par l’utilisateur
   public static void  aficherAlbumsCategorie (Album[] albums){
       
      
      int longAlbums = albums.length;
      int categorie = saisirEtvaliderCategorie ( );
      int k  = 0;
         
       for(int i=0;i< longAlbums ;i++){
       
           if(albums[i]!=null && albums[i].getCategorie()== Album.categorie(categorie)){
           k= k+1 ;
           System.out.println("Les albums de categorie  "+ albums[i].getCategorie(  )+ " sont : ");
           System.out.println("------------"+ "Album["+i+"]-------------------------------------");
           System.out.println(albums[i].toString()+"\n");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
         }//  if(albums[i]!=null && albums[i].getCategorie()== Album.categorie(categorie))
       
        }// for(int i=0;i< longAlbums ;i++)
        
       if(k==0){
         System.out.println("Aucun album comprend cette categorie"+"\n    ");
         
         }//if(k==0){
          
      System.out.println(sousMenu());
  
    } //aficherAlbumNumero ()
    
    // Afficher, pour chaque catégorie d'albums, le nom de la 
    // catégorie en en-tête et les titres des albums qui en fontpartie.
    
    public static void  aficherCategorieEtTitres (Album[] albums){
        
 
     int longAlbums = albums.length;
     int k  = 0;
     String[] CATEGORIES = { "Inconnue", "Disco", "Jazz", "Classique",
        "Country", "Blues", "Rock", "Punk", "Pop", "Blue Grass", "Musique de film"}; 
      String titre = " ";
   
     for(int j = Album.MIN_CATEGORIES ;j<= Album.MAX_CATEGORIES ;j++){  
         k = 0 ;
         titre = "";
       for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!= null && albums[i].getCategorie()==CATEGORIES[j]) {
           k = k+1 ;
           
           titre =  titre +"\n" +"Titre :   "+ albums[i].getTitre();
         }// if(albums[i]!=null && albums[i].getCat+egorie()==CATEGORIES[j])
         
        }// for(int i=0;i< longAlbums ;i++)
        
        if(k==0){
         
         titre = "Il n'y a pas d'album dans cette catégorie";
         
         }// if(k==0)
         System.out.println( "Categorie :  " + CATEGORIES[j]);
         System.out.println(titre);
         System.out.println("-----------------");
         
     }//for(int j = Album.MIN_CATEGORIES ;j<= Album.MAX_CATEGORIES ;j++)
      System.out.println("Appuer sur Entrer !!!");
      Clavier.lireFinLigne();
      System.out.println(sousMenu());
   
  
  }  // aficherCategorieEtTitres (Album[] albums)
 
     // Affiche le titre et la durée de tous les albums dont la
     // durée ne dépasse pas la durée spécifiée.
   public static void  afficherDureeAlbum(Album[] albums){
       
  
     int longAlbums = albums.length;
     int Duree = saisirEtvaliderDuree ( );
     int k= 0;
     
       for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!=null && albums[i].getDuree()<= Duree){
           k=k+1 ;
             System.out.println("------------"+ "Album["+i+"]-------------------------------------");
           System.out.println("  Duree  : " +albums[i].getDuree()+"\n");
           System.out.println (" Titre : " + albums[i].getTitre()+"\n");
           
         }//if(albums[i]!=null && albums[i].getDuree()<= Duree)
         
       }// for(int i=0;i< longAlbums ;i++)
       
       if(k==0){
           System.out.println(" Aucun album dont la duree est <= " + Duree);
        }// if(k==0)
         System.out.println("Appuer sur Entrer !!!");
          Clavier.lireFinLigne();
          System.out.println(sousMenu());
     
 
    } //afficherDureeAlbum(Album[] albums)
   
   // Affiche toutes les informations sur les albums dont
   // l’année de sortie est celle qui est spécifiée.
  
  public static void  afficherAnneeAlbum(Album[] albums){
       
   
     int longAlbums = albums.length;
     int annee = saisirEtvaliderAnneeSortie ( );
     int k = 0;
       for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!=null && albums[i].getAnneeSortie()== annee){
           k=k+1 ;
           System.out.println("-------------+"+ "Album["+i+"]"+" est sortie en:"+ annee +"---------------------");
           System.out.println(albums[i].toString()+"\n");
           System.out.println("--------------------------------------------------------------------------------\n");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
         
         }// if(albums[i]!=null && albums[i].getAnneeSortie()== annee)
         
       }// for(int i=0;i< longAlbums ;i++)
       
       if(k==0){
           System.out.println(" Aucun album avait "+ annee + " comme annee de  sortie" );
        }// if(k==0)
        
         
          System.out.println(sousMenu());
   
    }// afficherAnneeAlbum(Album[] albums)
    
    // Afficher toutes les informations sur le(s) album(s)
    //ayant comme maison de disque celle qui est fournie
    //par l'utilisateur.
   public static void  afficherMaisonAlbum(Album[] albums){
       
   
     int longAlbums = albums.length;
     String maison = saisirEtvaliderMaisonDisque ( );
     int k = 0;
       for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!= null && albums[i].getMaisonDisque().equals(maison)){
           k=k+1 ;
           System.out.println(albums[i].toString()+"\n");
           System.out.println("---------------------------------------");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
         }// if(albums[i]!=null && albums[i].getMaisonDisque().equals(maison))
         
       }// for(int i=0;i< longAlbums ;i++)
       
       if(k==0){
         System.out.println(" Aucun album avait " +  maison  + " cette maison de disque" );
        }// if(k==0)
        
       System.out.println(sousMenu());
  
    }//afficherMaisonAlbum(Album[] albums)
 
    
  //Afficher toutes les informations sur les albums qui sont dans leur pochette d'origine
  public static void  aficherAlbumsPchetOriginal (Album[] albums){
       
     int longAlbums = albums.length;
     int k  = 0;
         
       for(int i=0;i< longAlbums ;i++){
          
          if(albums[i]!=null&& albums[i].getPochetteOriginale()== true){
           k= k+1;
            System.out.println("Les albums qui sont dans leurs pochettes originalles sont :");
            System.out.println("-------------------"+ "Album["+i+"]------------------------------");
            System.out.println(albums[i].toString()+"\n");
            System.out.println("Appuer sur Entrer !!!");
            Clavier.lireFinLigne();
         }//  if(albums[i]!=null&& albums[i].getPochetteOriginale()== true)
         
       }// for(int i=0;i< longAlbums ;i++)
       
       if(k==0){
         System.out.println("Aucun album dans ca pochette originalle ");

         }// if(k==0)
      
        System.out.println(sousMenu());
   
      } // aficherAlbumsPchetOriginal (Album[] albums)
    
    // Afficher toutes les informations sur les albums ayant
    // chaîne comme sous-chaîne dans leurs titres.
  public static void  afficherChaineAlbum(Album[] albums){
        
    
     int longAlbums = albums.length;
     System.out.println("Veuillez saisir une sous chiane ");
     String chaine  = Clavier.lireString();
     int k = 0;
       for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!=null&& albums[i].getTitre().indexOf(chaine)!=-1){
           k=k+1 ;
           System.out.println(albums[i].toString()+"\n");
           System.out.println("---------------------------------------");
           System.out.println("Appuer sur Entrer !!!");
           Clavier.lireFinLigne();
         }// if(albums[i]!=null&& albums[i].getTitre().indexOf(chaine)== -1)
         
       }// for(int i=0;i< longAlbums ;i++)
       
       if(k==0){
           System.out.println(" Aucun album avait  " +  chaine  + "dans son titre"  );
        }// if(k==0)
        
        
       System.out.println(sousMenu());
  
   }//afficherChaineAlbum(Album[] albums)
    
    
   //  T: Afficher uniquement le titre et la catégorie de l'album
   //  possédant le numéro spécifié.
  public static void  aficherTitrEtCategorie (Album[] albums){
      
   
    int longAlbums = albums.length;
    int numero = saisirEntier("Entrer le numero de l'album souhaiter ");
    int k =0;

     while(numero <1){
      numero = saisirEntier("Erreur vueillez saisir en numeo >1");   
     }// while(numero <1)
         
      for(int i=0;i< longAlbums ;i++){
       
          if(albums[i]!=null && albums[i].getNumeroIdentification()== numero){
           k = k+1;
           System.out.println("---------------- "+"Album numero" +numero+"--------------------------------------");
           System.out.println("Titrre : "+albums[i].getTitre()+"\n"+"Categorie :  " +  albums[i].getCategorie()  +"\n");
           System.out.println("                ----------------                                           ");
         }// if(albums[i]!=null && albums[i].getNumeroIdentification()== numero)
         
      }// for(int i=0;i< longAlbums ;i++)
       
      if(k==0){
           System.out.println(" Aucun album d'ont le " + numero + " est existee !!!!");
         }// if(k==0)
       System.out.println("Appuer sur Entrer !!!");
       Clavier.lireFinLigne();  
      afficherMenuPrincipal();
   
         
     } //aficherTitrEtCategorie (Album[] albums)
    
     // E: Supprime l'album dont le numéro est spécifié.  
  public static Album[]  supprimerAlbum(Album[] lesAlbums){
      
   
      int longLesAlbums = lesAlbums.length;
      int numero = saisirEntier("Entrer le numero de l'album souhaiter ");
      int k = 0;

         while(numero <1){
            numero = saisirEntier("Erreur vueillez saisir en numeo >1");  
          }
    
        for(int i = 0;i<longLesAlbums-1; i++){
            
           if(lesAlbums[i]!=null && lesAlbums[i].getNumeroIdentification ()== numero){
           k = k+1;
           System.out.println("-------------------"+ "Album["+i+"]------------------------------");
           System.out.println(lesAlbums[i].toString());
           System.out.println("Voullez-vous supprimer l'album numero "+  numero  + " OUI ou NON ");
           String reponse = validerReponse();
             if(reponse.equals("OUI")||reponse.equals("oui")){
               
                 for(int j=i;j<longLesAlbums-1; j++){
                    lesAlbums[j] = lesAlbums[j+1]  ;
                 }
               lesAlbums[longLesAlbums-1] = null ;
               System.out.println("Suppression réussit ");
             }else {
               System.out.println("Suppression annulée !! ");
               afficherMenuPrincipal();
            }
            
         }// if(lesAlbums[i]!=null && lesAlbums[i].getNumeroIdentification ()== numero)
         
       }// for(int i = 0;i<longLesAlbums-1; i++)
            
        if(lesAlbums[longLesAlbums-1]!=null&& lesAlbums[longLesAlbums-1].getNumeroIdentification ()== numero){
          k = k+1 ;
          System.out.println(lesAlbums[longLesAlbums-1].toString());
          System.out.println("Voullez-vous supprimer l'album numero "+ numero + " OUI ou NON ");
          String reponse = validerReponse();
           if(reponse.equals("OUI")||reponse.equals("oui")){
           
             for(int j=longLesAlbums-1;j>0; j--){
              lesAlbums[j] = lesAlbums[j-1]  ;   
             }
            lesAlbums[0] = null ;
            System.out.println("Suppression réussit ");
           }else {
             System.out.println("Suppression annulée !! ");
            
            }
            
        }// if(lesAlbums[longLesAlbums-1]!=null&& lesAlbums[longLesAlbums-1].getNumeroIdentification ()== numero)
        
        if(k==0){
          System.out.println("L'album cherhcer n'existe pas ");
         
        }// if(k==0)
         
        
         System.out.println("Appuer sur Entrer !!!");
         Clavier.lireFinLigne();  
         afficherMenuPrincipal();
        return lesAlbums ;
    
        
    }// SupprimerAlbum(Album[] lesAlbums)
        
       // Modoifier la categorie de l 'album  
  public static void modifierCategorie(Album[] liste) {
   
     int longListe = liste.length;
     int numero = saisirValiderNumero();
     int k = 0;
     int categorie;
         
       for(int i=0;i< longListe ;i++){
       
          if(liste[i]!= null && liste[i].getNumeroIdentification()== numero){
            k = k+1;
            categorie =  saisirEtvaliderCategorie ( );
            liste[i].setCategorie (categorie);
            System.out.println("Changement reussit ");
           
         }// if(liste[i]!=null && liste[i].getNumeroIdentification()== numero)
         
       }// for(int i=0;i< longListe ;i++)
       
       if(k==0){
         System.out.println("Acun album a cette nemuro existee !!!!");
       
        }// if(k==0)
        
        System.out.println("Appuer sur Entrer !!!");
        Clavier.lireFinLigne();  
        afficherMenuPrincipal();
    
    
   }// modifierCategorie(Album[] liste)
  
  // Modifier titre d'album a le numero specifique 
     public static void modifierTitre(Album[] liste) {
         
         
        int longListe = liste.length;
        int numero = saisirValiderNumero();
        int k = 0;
       String titre;
         
       for(int i=0;i< longListe ;i++){
       
          if(liste[i]!= null && liste[i].getNumeroIdentification()== numero){
              k= k+1;
             titre =  saisirEtvaliderTitre ( );
            liste[i].setTitre (titre);
            System.out.println("Changement reussit ");
            
         }// if(liste[i]!=null && liste[i].getNumeroIdentification()== numero)
         
       }// for(int i=0;i< longListe ;i++)
       
        if(k==0){
         System.out.println("Acun album a cette nemuro existee !!!!");
       
        }//if(k==0)
        
         System.out.println("Appuer sur Entrer !!!");
         Clavier.lireFinLigne();  
         afficherMenuPrincipal();
      
        
   }// modifierTitre(Album[] liste) 
  
  // Modifier l'annee de sortie de l'album a le numero specifique 
     public static void modifierAnneeSorti(Album[] liste) {
     
         int longListe = liste.length;
         int numero = saisirValiderNumero();
         int k = 0;
         int  annee;
         
          for(int i=0;i< longListe ;i++){
       
           if(liste[i]!=null && liste[i].getNumeroIdentification()== numero){
              k= k+1;
            annee =  saisirEtvaliderAnneeSortie ( );
            liste[i].setAnneeSortie(annee);
            System.out.println("Changement reussit ");
           
          }// if(liste[i]!=null && liste[i].getNumeroIdentification()== numero)
         
        }// if(liste[i]!=null && liste[i].getNumeroIdentification()== numero)
       
         if(k==0){
          System.out.println("Acun album a cette nemuro existee !!!!");
     
         }// if(k==0)
         System.out.println("Appuer sur Entrer !!!");
         Clavier.lireFinLigne();  
         afficherMenuPrincipal();
         
       
   }// modifierAnneeSorti(Album[] liste) 
  
     public static void modifierArtiste(Album[] liste) {
     
       int longListe = liste.length;
       int numero = saisirValiderNumero();
       int k = 0;
       String artiste;
         
        for(int i=0;i< longListe ;i++){
       
           if(liste[i]!=null && liste[i].getNumeroIdentification()== numero){
            k= k+1;
            artiste =  saisirEtvaliderArtiste( );
            liste[i].setArtiste(artiste);
            System.out.println("Changement reussit ");
           
          }// if(liste[i]!=null && liste[i].getNumeroIdentification()== numero)
         
        }// for(int i=0;i< longListe ;i++)
       
        if(k==0){
         System.out.println("Album chercher n'existe pas");
        
         }// if(k==0)
       
         System.out.println("Appuer sur Entrer !!!");
         Clavier.lireFinLigne();  
         afficherMenuPrincipal();  
       
   }// modifierArtiste(Album[] liste)
  
      // Cette retourne true s' il ya une case vide dans  la liste d'album  si non false 
    public static boolean verifierSiListePlein(Album[] listeAlbums){
        
     int longListe = listeAlbums.length ;
     boolean reponse = false;
     
     for(int i =0; i<longListe ; i++){
        
      if(listeAlbums[i]== null){
        reponse = true ;
        i = longListe ;
      }// if(listeAlbums[i]== null)
        
     }// for(int i =0; i<longListe ; i++)
      return reponse ;
   }// verifierSiListeVide(Album[] listeAlbums)
    
    // Cette methode prend en paramettre string categorie ou support et retourne
    //  l'entier correspondant 
       
    public static int CategorieOuSupport(String string){
        
       String[] CATEGORIES = { "Inconnue", "Disco", "Jazz", "Classique",
       "Country", "Blues", "Rock", "Punk", "Pop", "Blue Grass", "Musique de film"};
         int k = 0;
   
         for(int i = Album.MIN_CATEGORIES ;i<=Album.MAX_CATEGORIES;i++){
             
          if(CATEGORIES[i].equals(string) ){
           k = i;
              } else if("Cassette 8 pistes".equals(string)){
                     k = 0;
                          }else if("Vinyle".equals(string)){
                              k=1;
                         }

         }// (int i = Album.MIN_CATEGORIES ;i<=Album.MAX_CATEGORIES;i++)
         return k;
      }// retournerInt(String string)
      
   
    
   public static void stockerDansFichier (Album [] listeAlbums ){
     int longList = listeAlbums.length ;
      FileWriter ficListeAlbum;
      PrintWriter ecrivainListeAlbum;
      
      try{
         ficListeAlbum = new FileWriter("Albums.txt");
         ecrivainListeAlbum = new PrintWriter(ficListeAlbum);

                  
       for(int i = 0; i< longList ; i++ ){
            if(listeAlbums[i]!=null){
         ecrivainListeAlbum.println( "Titre      : "+ listeAlbums[i].getTitre());
         ecrivainListeAlbum.println( "Categorie  :" + listeAlbums[i].getCategorie()+   " = " + CategorieOuSupport(listeAlbums[i].getCategorie()));
         ecrivainListeAlbum.println( "Annee de sortie  :"+ listeAlbums[i].getAnneeSortie());
         ecrivainListeAlbum.println( "Duree      :"+ listeAlbums[i].getDuree());
         ecrivainListeAlbum.println( "Support     :"+ listeAlbums[i].getSupport()+  "  = "+CategorieOuSupport(listeAlbums[i].getSupport()));
         ecrivainListeAlbum.println( "Maison de disque : "+ listeAlbums[i].getMaisonDisque());
         ecrivainListeAlbum.println( "Artiste    : "+ listeAlbums[i].getArtiste());
         ecrivainListeAlbum.println( "Pochette originale  : "+ listeAlbums[i].getPochetteOriginale ());
         ecrivainListeAlbum.println( "Numero de l'album   : "+ listeAlbums[i].getNumeroIdentification ()); 
          ecrivainListeAlbum.println("----------------------------------------------------------------------");
        }//if(listeAlbums[i]!=0)
        
       }//for(int i = 0 && i< longList)
      
       ecrivainListeAlbum.close();
       }catch (FileNotFoundException e){
                System.out.print("Erreur! Fichier de lecture inexisitant!");
            }catch (IOException e){
                System.out.print("Erreur d'entr�e/sortie");
            }//fin try...catch
            
     }// stockerDansFichier (Album [] listeAlbums )

    public static void main (String[] params) {
     int sousMenu ; 
     presentationLog();
     int nombreMaxAlbum = saisirEntier("Veuillez donner le nombre Maximum d'albums");
     Album []liste = new Album[nombreMaxAlbum];
     Album []sortie =  null ;
     afficherMenuPrincipal();
     char choix = saisirEtValiderChoixMenu ();
     while(!(choix=='q'||choix == 'Q' )){
         
       if (choix=='n'||choix== 'N')  {
           
          // for(int i=0; i<nombreMaxAlbum ; i++){
            sortie = effectuerMenuN ( liste );
            choix = saisirEtValiderChoixMenu ();
          //}//for(int i=0; i<nombreMaxAlbum ; i++)
          
           }else if (choix=='i'||choix== 'I'){
                    aficherAlbumNumero (sortie); 
                    
                    
               }else if (choix=='l'||choix== 'L'){
                   //System.out.println(sousMenu()); 
                   sousMenu = saisirEtValiderChoixSousMenu ();
                switch(sousMenu){
                case 1 :  afficherContenue (sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu ();
                break;
                case 2 :  aficherAlbumsCategorie (sortie);
                         // sousMenu = saisirEtValiderChoixSousMenu ();
                break ; 
                case 3 :  aficherAlbumsPchetOriginal(sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu ();
                break ;
                case 4 :  aficherCategorieEtTitres(sortie);
                         //sousMenu = saisirEtValiderChoixSousMenu ();
                break;
                case 5 :  afficherDureeAlbum(sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu (); 
                break ;
                case 6 :  afficherAnneeAlbum(sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu ();
                break ;
                case 7 :  afficherChaineAlbum(sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu ();
                break;    
                case 8 :  afficherMaisonAlbum(sortie);
                          //sousMenu = saisirEtValiderChoixSousMenu ();
                break ; 
                case 9 :  afficherMenuPrincipal();
                          choix = saisirEtValiderChoixMenu ();
                break ; 
            }
            
               } else if( choix=='t'||choix== 'T'){
                      aficherTitrEtCategorie (sortie);
                      choix = saisirEtValiderChoixMenu ();
                      
                  } else if ( choix=='e'||choix== 'E'){
                         supprimerAlbum(sortie);
                         choix = saisirEtValiderChoixMenu ();
                         }else if ( choix=='g'||choix== 'G'){
                              modifierCategorie(sortie);
                              choix = saisirEtValiderChoixMenu ();
                             }else if ( choix=='r'||choix== 'R'){
                                   modifierTitre(sortie); 
                                   choix = saisirEtValiderChoixMenu ();
                                   }else if ( choix=='s'||choix== 'S'){
                                         modifierAnneeSorti(sortie);
                                         choix = saisirEtValiderChoixMenu ();
                                          }else if ( choix=='d'||choix== 'D'){
                                            modifierArtiste(sortie) ; 
                                            choix = saisirEtValiderChoixMenu ();
                                            }
         //afficherMenuPrincipal();
         //choix = saisirEtValiderChoixMenu ();                                   
    }//while(!(choix.equals(q)||choix.equals(Q) ))
     
      stockerDansFichier (sortie );
      
  } // main
    
} // Tp3Gr10
