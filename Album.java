
/**-----------------------------------------------------------
 * I N F 1 1 2 0   -   g r o u p e   10   -   H15   -   T P 3
 *------------------------------------------------------------
 * Cette classe sert a creer des instances d'Album.
 * 
 * Les informations  au sujet d'un album sont les suivantes�:
 *
 * La categorie, un ENTIER (0 = Inconnu, 1 = Disco, 2 = Jazz, 3 = Classique, 4 = Country, 5 = Blues, 6 = Rock, 
 *                         7 = Punk, 8 = Pop,  9 = Blue Grass, 10 = Musique de film). La valeur par defaut est Inconnu.
 *                         
 * L'annee de sortie, un entier entre 1960 et 1979 inclusivement. Valeur par defaut = 1970.
 * 
 * La duree en minutes, un entier positif de 30 a 90. Valeur par defaut = 60.
 * 
 * Le support, un ENTIER  (0 = Cassette 8 pistes, 1 = Vinyle). Valeur par defaut = 1.
 * 
 * L'artiste ou le groupe (chaine de caracteres). Valeur par defaut = "Inconnu". La valeur null est consideree comme invalide 
 * (voir consignes dans les constructeurs et le setter).
 * 
 * Le titre (chaine de caracteres). Valeur par defaut = "Inconnu". La valeur null est consideree comme invalide 
 * (voir consignes dans les constructeurs et le setter).
 * 
 * La maison de disque (chaine de caracteres). Valeur par defaut = "Inconnu". La valeur null est consideree comme invalide 
 * (voir consignes dans les constructeurs et le setter).
 * 
 * Un booleen pour dire si le disque ou la cassette est dans sa pochette originale. Valeur par defaut = true.
 * 
 * Un numero d'identification distinct (nombre entier positif). Les numeros debutent a 1 et chaque disque/cassette 
 * a un numero DIFFERENT qui lui est propre. Les numeros sont generes automatiquement par les constructeurs.
 * -------------------------------------------------------------------------------------------------------------
 * 
 * auteur1 : SOK OUSMANE  
 * code permanent : SOKO31128307
 * adresse de courriel : sockousmane2@gmail.com 
 * ---------------------------------------------
 * auteur2 : Hanani SIDI 
 * code permanent : SIDH31128505
 * adresse de courriel : hanani.sidi@gmail.com 
 *----------------------------------------------
 */

 
import java.text.*;

public class Album {

    //----------   CONSTANTES   ----------//
    
    // IMPORTANT : Vous DEVEZ utiliser les constantes partout ou c'est pertinent dans le code

    private static final String[] CATEGORIES = { "Inconnue", "Disco", "Jazz", "Classique",
        "Country", "Blues", "Rock", "Punk", "Pop", "Blue Grass", "Musique de film"};
    private static final String[] SUPPORTS = {"Cassette 8 pistes", "Vinyle"};     
    public static final int MAX_CATEGORIES = CATEGORIES.length - 1;
    public static final int MAX_SUPPORTS = SUPPORTS.length - 1;
    public static final int MIN_CATEGORIES = 0;
    public static final int MIN_SUPPORTS = 0;
    public static final int DUREE_MIN = 30;
    public static final int DUREE_MAX = 90;
    public static final int DUREE_DEFAUT = 60;
    public static final int ANNEE_MIN = 1960;
    public static final int ANNEE_MAX = 1979;
    public static final int ANNEE_DEFAUT = 1970;    
    public static final int SUPPORT_DEFAUT = 1;    
    public static final int CATEGORIE_DEFAUT = 0;    
    public static final String ARTISTE_DEFAUT = "Inconnu";
    public static final String TITRE_DEFAUT = "Inconnu";
    public static final String MAISON_DISQUE_DEFAUT = "Inconnue";
    public static final boolean POCHETTE_ORIGINALE_DEFAUT = true;
    public static String carcteristique;
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    //                              Methodes utilitaires de CLASSE                       //
    ///////////////////////////////////////////////////////////////////////////////////////
    
    /*************************************************************************************
    * Retourne la chaine de caracteres correspondant a un numero de categorie recu en
    * parametre. Si le numero ne correspond pas a une categorie existante, la methode 
    * retourne la chaine vide ("").
    **************************************************************************************/
     public static String categorie (int no) {
         
         String chaine = "" ;
         
         if(no>= MIN_CATEGORIES && no<=MAX_CATEGORIES ){
             chaine = CATEGORIES[no];  
            
            }
            
        return chaine; 
      }
         
    /*************************************************************************************
    * Retourne la chaine de caracteres correspondant a un numero de support recu en
    * parametre. Si le numero ne correspond pas a un support existant, la methode 
    * retourne la chaine vide ("").
    **************************************************************************************/
     public static String support (int no) {
         
          String chaine = " " ;
          if(no>= MIN_SUPPORTS && no<= MAX_SUPPORTS ){
             
             chaine =  SUPPORTS[no];  
            }
          
         return chaine; 
      }
      
      // Constructeurs

    /**
     * Cree un nouvel album avec les donnees passees en parametre.
     * 
     * Lorsqu'une valeur passee en parametre ne fait pas partie des valeurs permises, la valeur
     * par defaut est attribuee automatiquement a l'attribut correspondant.
     * 
     * Les attributs pour lesquels on ne recoit pas de valeur en parametre sont mis aux
     * valeurs par defaut.
     *   
     * Le numero est attribue automatiquement par le constructeur.
     */
    
       public Album ( String titre, int categorie, int anneeSortie, int support) {
        
        if(categorie >=MIN_CATEGORIES && categorie <=MAX_CATEGORIES ){
                this.categorie = categorie  ;    
                }
        
        if(anneeSortie >= ANNEE_MIN && anneeSortie <=ANNEE_MAX ){
               this.anneeSortie = anneeSortie ;    
        }
       
        if(support >= MIN_SUPPORTS && support <=MAX_SUPPORTS ){
                this.support = support ;    
        }
       
        if(titre != null){
                this.titre = titre ;
        }
         compteur = compteur+1;
         numeroIdentification = compteur; 
          }

   /**
     * Cree un nouvel album avec les donnees passees en parametre.
     * 
     * Lorsqu'une valeur passee en parametre ne fait pas partie des valeurs permises, la valeur
     * par defaut est attribuee automatiquement a l'attribut correspondant.
     *   
     * Le numero est attribue automatiquement lors de la creation de l'album.
     * 
     * IMPORTANT : Ce constructeur DOIT appeler l'autre constructeur pour effectuer une partie
     *             du travail.
     */
    public Album (String titre, int categorie, int anneeSortie, int duree, int support, String maisonDisque, 
                  String artiste, boolean pochetteOriginale){
                      
     this(titre,  categorie,  anneeSortie,  support);// appel du premier constructeur 
     
     if( duree >=DUREE_MIN && duree <= DUREE_MAX){
      this.duree = duree;   
      }
     
     if(maisonDisque!= null){
       this.maisonDisque = maisonDisque;
      }
    
     if(artiste != null){
       this.artiste  = artiste ;
      }
     this.pochetteOriginale = pochetteOriginale;
     
     //this.numeroIdentification  =numeroIdentification ;
    }

// Observateurs (getters) d'instance

     //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    ///// Vous devez ajouter les 9 observateurs (getters) d'instance  ////
    ////  IMPORTANT : les observateurs pour la categorie et le support////
    ////              doivent retourner des STRINGs.                  ////
    //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    
    public String getCategorie (  ) {
          
      return categorie(categorie) ;
        }
        
    public String getSupport (  ) {
          
      return support(support) ;
    }
    
    public int getAnneeSortie (  ) {
         
      return anneeSortie ;
        }
    
    public int getDuree  (  ) {
         
          return duree  ;
        }
        
    public String getMaisonDisque (  ) {
         
          return maisonDisque  ;
        }
        
    public String getTitre (  ) {
         
          return titre ;
        }

    public String getArtiste (  ) {
         
          return artiste ;
        }
        
    public boolean getPochetteOriginale (  ) {
         
          return pochetteOriginale ;
         }
        
    public  int getNumeroIdentification (){
       
          return numeroIdentification ;
        }
    // Modificateurs (setters) d'instance

     /**
     * Modifie l'annee de sortie de l'album.
     * Si l'annee de sortie n'est pas parmi les valeurs permises, 
     * aucune modification n'est effectuee et aucun message d'erreur 
     * ne sera affiche.
     */
    public void setAnneeSortie ( int anneeSortie ) {
        
        if(anneeSortie>=ANNEE_MIN && anneeSortie<= ANNEE_MAX){
             this.anneeSortie = anneeSortie   ;
        }
        
        }

     /**
     * Modifie la duree de l'album.
     * Si la duree n'est pas parmi les valeurs permises, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setDuree ( int duree ) {
        
       if( duree >=DUREE_MIN && duree <= DUREE_MAX){
            this.duree = duree;   
       }
        
       }

     /**
     * Modifie la categorie d'un album.
     * Si la categorie n'est pas parmi les choix possibles, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setCategorie (int categorie){
        
        if(categorie >=MIN_CATEGORIES && categorie <=MAX_CATEGORIES ){
            this.categorie = categorie  ;    
        }
        
      }

     /**
     * Modifie le format de l'album.
     * Si le format n'est pas parmi les valeurs permises, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setSupport(int support){
        
        if(support >= MIN_SUPPORTS && support <=MAX_SUPPORTS ){
            
            this.support = support ; 
       }

    }

     /**
     * Modifie le titre de l'album.
     * Si le titre est null, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setTitre (String titre){
         
       if(titre != null){
            this.titre = titre ;
         }
        
        }

    /**
     * Modifie l'artiste (ou le groupe) de l'album.
     * Si le parametre est null, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setArtiste (String artiste){
   
        if(artiste != null){
          this.artiste  = artiste ;
      }

    }
    
     /**
     * Modifie la maison de disque de l'album.
     * Si le parametre est null, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
     public void setMaisonDisque (String maisonDisque){
         
        if(maisonDisque!= null){
          this.maisonDisque = maisonDisque;
      }
        
    }
    
     /**
     * Modifie l'attribut qui indique si l'album est dans sa pochette
     * originale ou non.
     */
    public void setPochetteOriginale (boolean pochetteOriginale){
        
      this.pochetteOriginale  =  pochetteOriginale ;
     }

    
    ///////////////////////////////////////////////////////////////////////////////////////
    //                             Methode utilitaire d'instance                         //
    ///////////////////////////////////////////////////////////////////////////////////////
    
    
    
     /******************************************************************************
     * Retourne une chaine de caracteres qui correspond aux caracteristiques d'un 
     * album. Chaque attribut est precede d'une courte description.
     * Pour la categorie et le support, on doit inclure la valeur numerique ET
     * la chaine de caracteres correspondante. Chaque attribut doit être
     * sur une ligne differente.
     ******************************************************************************/
    public String toString(){
        
        carcteristique =  "titre de l'album est :  " + titre +"\n"  + 
       "La categorie de l'album est : "+ categorie + " qui est aussi  : " + categorie(categorie)+"\n" + 
       "L'annee de sortie est :  "  +  anneeSortie +"\n"  +
       "La duree est  : " +  duree +"\n"+
       "Le support est  :  "  + support + " qui est aussi  :" + support(support)+"\n"  +
       "La maison disque est :  " +  maisonDisque + "\n"   + 
       "L'artiste est :   "+ artiste+"\n"  +
       "La pochette est originale :   " + pochetteOriginale + "\n"  +
       "Le numero de l'album est  :  " + numeroIdentification ;
        
        return carcteristique;
        
    }// toString()
    
    

    //----------   P a r t i e   p r i v e e   ----------//

    // variable de classe (pour usage interne : donner un numero a chaque album cree)
    // Vous DEVEZ utiliser cette variable pour GENERER le numero d'album.
    
        
        private  static int compteur = 0;
      
    

    // variables d'instance
        private  int numeroIdentification ;
        private int categorie = CATEGORIE_DEFAUT   ;
        private String  titre = TITRE_DEFAUT ; 
        private int anneeSortie = ANNEE_DEFAUT   ;
        private int support  = SUPPORT_DEFAUT ;
        private int duree  = DUREE_DEFAUT  ;
        private String artiste = ARTISTE_DEFAUT ;
        private String  maisonDisque = MAISON_DISQUE_DEFAUT  ;
        private boolean pochetteOriginale = POCHETTE_ORIGINALE_DEFAUT ;
        
        
   }

