



 
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe Tp1Gr10 ici.
 *
 * @author (Hanani SIDI)
 * @version (une date)
 *
 * (SIDH31128505)
 * (hanani.sidi@gmail.com)
 * (INF1120 groupe 10)
 * ( professeur:Céline Descheneaux)
 
 */
 
public class Tp1Gr10 {
 
    public static void main (String[] params) {
    char fintraiter;// traiter une commande ou finir le programme//
    char finouNON;  // finir ou choisir traiter une commande //
    int typeDeNouri ; // le type de nouriture choisie par l'utilisateur //
    int prixUnit; //  prix unitaite de la nouriture //
    int prixUnitMc; // prix unitaite de la moulee  pour cochons //
    int quantMc ; // Quantité de la moulée pour pour cochons //
    int quantTotalMC = 0; // quantité totale de moulée pour cochons //
    int prixUnitLP ;// prix unitaire de la moulée pour lapins //
    int quantLP;    // quantité de la moulé pour lapins //
    int prixTotalLP;// prix tatale de la quantité de la loulée pour lapins //
    int quantTotalLP = 0; // quantité totale de la moulée pour lapains //
    int prixUnitP; // pris unitaire de la quantité de la moulée pour poule//
    int quantP ; // quantité de la moulée poour poules //
    int prixTotalP; // prix totale de la quantité pour poules //
    int quantTotalP =0;// quantité totale de la moulé pour poules  //
    int prixTotalV; // prix totale de la quantité de la moulé pour vaches //
    int quantV;      // quantité de moulée pour vaches //
    int prixUnitV;   // prix unitaire de la moulée pour vache //
    int quantTotalV =0; // quantité totale de la moulée pour vache //
    int prixUnitCH ; // prix unitaire de la moulée pour chevaux //
    int prixTotaleCh ; // prix totale de la  quantite de moulée pour chevax // 
    int quantTotalCH =0; // quantité totale de la quantité de la moulé pour chevaux //
    int quantCH;          // quantité de la moulée pour chevaux //
    int montTotal = 0; // rectete tottale //
    int mintPoint  = 0; // mininum des point échangé //
    int maxPoint = 0   ;// maximun des points échangé //
    int tempoprix = 0  ; // variable servira dans le calcul de la min et max //
    int compteur = 0;
    int V=0 ;  // varibale servira dans le calcul de min et max //
 
    
 
    System.out.println(" Voulez-vous mettre Fin au programme('f'ou 'F' )ou voulez-vous TRAIETER une commande ('t'ou'T' )?");
    fintraiter = Clavier.lireCharLn() ;
    //**************** Validation de la réponse finTraiter *********************************************//
      while(! (fintraiter == 't' || fintraiter == 'T' || fintraiter == 'f' || fintraiter =='F' ) ){
       System.out.println(" Erreur");
       System.out.println(" Veuillez saisir l'un de ses LETTRE :  f ou F , t  ou T ");
       fintraiter = Clavier.lireCharLn();
    }
   //**************************************************************************************************//
 if(fintraiter == 'f'|| fintraiter == 'F'){
    System.out.print( "FIN NORMALE DU PROGRAMME");
} else if (fintraiter =='t' ||fintraiter =='T') {
 
 do{
     
 
      do {
         System.out.println("  TYPES DE NOURITURE :\n 1 - Moulee pour les cochons \n 2 – Moulee pour les lapins\n 3 – Moulee pour les poules\n 4 – Moulee pour les vaches\n 5 – Moulee pour les chevaux ");
         System.out.println( " Veuillez Choisir un type de nouriture entre 1 et 5 inclusivement ");
 
         typeDeNouri = Clavier.lireInt();
         //*********************************** Validation de type de nouriture ********************************************************//
          while(! (typeDeNouri == 1 || typeDeNouri == 2 || typeDeNouri == 3 || typeDeNouri == 4 || typeDeNouri == 5 )){
             System.out.println(" Erreur");
             System.out.println(" Type de nouriture doit etre entre 1 et 5 inclusivement ");
             typeDeNouri = Clavier.lireInt();
        }
        //*************************************************************************************************************************//

switch (typeDeNouri){

case 1 :   System.out.println("vous avez choisit :\n Moulee pour les cochons ");
     
           System.out.println("Entrer son prix unitaire ");
           prixUnitMc = Clavier.lireInt();
 //********************** Validation de prix unitaire de la moulée pour cochons *************************************************//
            while(prixUnitMc < 9 ||  prixUnitMc > 21){
                System.out.println("Le prix unitaire du moulee pour les couchons doit etre ente 9 et 21 incluse ");
                prixUnitMc = Clavier.lireInt();
           }
           System.out.println("Entre une quantite de la moulee pour cochons ");
           quantMc = Clavier.lireInt();
           //****************************************************************************************************************************//      
          //**************** Validation de la quantité de la moulée pour cochons *****************************//
           while(quantMc <0){
                System.out.println("Quantité refusé !! \n  Veuillez entrer une quantité positive ");
                quantMc = Clavier.lireInt();
           }
        
            prixTotaleCh = prixUnitMc*quantMc ;//**** Calcul du prix Totale de laquantité moulée pour cochons **********//
            System.out.println(quantMc + "  quantite du moulee pour cochon coûte :" + prixTotaleCh + " point");
            quantTotalMC = quantTotalMC +quantMc ;// mise à jour de la quantité TOTALE moulée pour cochons *************//
            montTotal = montTotal + prixTotaleCh;// mis à jour de la recette Total *****//
            tempoprix = prixTotaleCh; //*********** on recupre le prix totale de la quantité de moulée pour cochons dans cette variable **//
 
break;
case 2 :  System.out.println("vous avez choisit :\n Moulee pour les lapins ");
          System.out.println("Entrer son prix unitaire ");
          prixUnitLP = Clavier.lireInt();
 //*********************** Validaton du prix unitaire pour lapins ********************************************//
           while( prixUnitLP < 7 ||  prixUnitLP > 15){
                System.out.println("Le prix unitaire du moulee pour les lapin doit etre ente 7 et 15 incluse ");
                prixUnitLP = Clavier.lireInt();
          }
          System.out.println("Entre une quantite de la moulee pour Lapin ");
          quantLP = Clavier.lireInt();
 //****************************Validation de la quatité ***************************************************// 
           while(quantLP <0){
                System.out.println("Quantité refusé !! \n  Veuillez entrer une quantité positive ");
                quantLP = Clavier.lireInt();
          }
         prixTotalLP = prixUnitLP*quantLP;//**** Calcul du prix total de la moulée pour lapins ****************************//
         System.out.println(quantLP+ "  quantite du moulee pour lapin coûte :" + prixTotalLP + " point");
         montTotal = montTotal + prixTotalLP;//******** mis à jour rectte totale *******************//
         quantTotalLP = quantTotalLP +quantLP;// mis à jour de la quantité totale de la moulé pour lapins ***************//
         tempoprix = prixTotalLP;
                
break;
case 3 :   System.out.println("vous avez choisit :\n Moulee pour les poules ");
           System.out.println("Entrer son prix unitaire ");
           prixUnitP = Clavier.lireInt();
 //************************ Validation de prix unitaire pour Poules *******************//
           while(prixUnitP < 4 ||  prixUnitP > 12){
                System.out.println("Le prix unitaire du moulee pour les poules doit etre ente 4 et 12 incluse ");
                prixUnitP = Clavier.lireInt();
          }
          System.out.println("Entre une quantite de la moulee pour cochons ");
          quantP = Clavier.lireInt();
 //*************************** Validation de la quantité **********************************************//
            while(quantP <0){
                System.out.println("Quantité refusé !! \n  Veuillez entrer une quantité positive ");
                quantP = Clavier.lireInt();
         }
          prixTotalP = prixUnitP*quantP;// calcul prix totale du quantité de la moulée pour poules ******//
          System.out.println(quantP + "  quantite du moulee pour poules coûte :" + prixTotalP + " point");
          quantTotalP = quantTotalP + quantP ;//****Mis à jour de la quantité totale de la moulée pour poules ***//
          montTotal = montTotal + prixTotalP;// ****mis à jour du recette totale *********************//
          tempoprix = prixTotalP ;
         
break;
case 4 :  System.out.println("vous avez choisit :\n Moulee pour les vaches ");
          System.out.println("Entrer son prix unitaire ");
          prixUnitV = Clavier.lireInt();
 //*********************Validation du prix unitaire pour vaches **********************************//
           while(prixUnitV < 15 ||  prixUnitV> 36){
                System.out.println("Le prix unitaire du moulee pour les vaches doit etre ente 15 et 36 incluse ");
                prixUnitV= Clavier.lireInt();
          }
          System.out.println("Entre une quantite de la moulee pour vaches ");
          quantV = Clavier.lireInt();
 
 //**********************************Validation de la quantité ***********************************//
          while(quantV<0){
                System.out.println("Quantité refusé !! \n  Veuillez entrer une quantité positive ");
                quantV = Clavier.lireInt();
         }
         prixTotalV = prixUnitV*quantV;//*****Calcul du prix totale de la quantité pour vaches ************//
         System.out.println(quantV + "  quantite du moulee pour vaches coûte :" + prixTotalV + " point");
         quantTotalV = quantTotalV +quantV ;// mis à jour de la quantité totale de la moulée pour vache *******//
         montTotal = montTotal + prixTotalV;//***************mis à jour de la recette totale ****************//
          tempoprix = prixTotalV;
        
       
break;
case 5 :  System.out.println("vous avez choisit :\n Moulee pour les chevaux ");
          System.out.println("Entrer son prix unitaire ");
          prixUnitCH = Clavier.lireInt();
 //**************************Validation du prix unitaire  pour moumé pour chevaux ********************//
           while(prixUnitCH< 17 ||  prixUnitCH> 38){
                System.out.println("Le prix unitaire du moulee pour les chevaux doit etre ente 17 et 38 incluse ");
                prixUnitCH= Clavier.lireInt();
          }
         System.out.println("Entre une quantite de la moulee pour chevaux");
         quantCH = Clavier.lireInt();
 //**************************vallidation de la quantité pour moulé pourr vaches ******************//
          while(quantCH<0){
                System.out.println("Quantité refusé !! \n  Veuillez entrer une quantité positive ");
                quantCH= Clavier.lireInt();
         }

         prixTotaleCh = prixUnitCH*quantCH;// calcule de prix totale pour moulée pour vaches   //
         System.out.println(quantCH + "  quantite du moulee pour vaches coûte :" + prixTotaleCh + " point");
         quantTotalCH = quantTotalCH +quantCH ;// mis à jour de la quantité totale de la moumlé pour cochons //
         montTotal = montTotal +prixTotaleCh ;// mis à jour de la recette totale //
         tempoprix = prixTotaleCh ;
                        
break;
default:
break  ;
    }
    
//***************** Le proramme demande l'utilusateur s'il voulez continuer traiter une commande ou de finr le programme **************************************//    
     System.out.println(" voulez-vous ajouter un autre type  OUI('o' ou 'O') ou NON ('n' ou 'N')?");
     prixTotaleCh = Clavier.lireCharLn();
//*********************************************** Validation de la reponse prixTotaleCh en OUI ou NON ***********************************************************************//
      while (!(prixTotaleCh == 'o' || prixTotaleCh== 'O' || prixTotaleCh == 'n' ||  prixTotaleCh == 'N' )){
       System.out.println(" Erreur");
       System.out.println(" Veuillez saisir l'un de ses prixTotaleChs :  o ou O , n  ou N ");
       prixTotaleCh = Clavier.lireCharLn();
    }
 //*********************************************************************************************************************************************************************//
  compteur = compteur +1 ; // comteur sur les boucles //
//***************Calcul de la Min et Max ***************//
if( tempoprix > maxPoint  ){
  maxPoint  =  tempoprix;
  if(compteur == 1) {
       V = maxPoint ;
       mintPoint = V ;
    }
    
} else if( tempoprix < mintPoint ) { 
          mintPoint = tempoprix;
        }
    
 
}while( prixTotaleCh == 'o' || prixTotaleCh =='O' );
 
  //********************** Comme la repone etait deja valider certainement la sortie de while sera si la reponse est NON******************************************************// 
   System.out.println("  Montant Totale de la commande est : " + montTotal  + " point ");
 //********************** ici le programme demande l utilisteur s'il voulait continuer commender ou de terminer le programme *******************************************************//
  System.out.println(" voulez-vous traiter une commande ('t' ou 'T') ou finir le programme ('f' ou 'F')?");
  finouNON = Clavier.lireCharLn();
    
//*********************************************** Validation de prixTotaleCh en Traiter  ou Finir le programme ***********************************************************************//
      
    while (!(finouNON == 't' || finouNON== 'T' || finouNON == 'f' ||  finouNON == 'F' )){
       System.out.println(" Erreur");
       System.out.println(" Veuillez saisir l'un de ses prixTotaleChs :  t ou T , f  ou F ");
       finouNON = Clavier.lireCharLn();
    }
 //**********************************************************************************************************************************************************************************//
  
  } while (finouNON == 't' || finouNON == 'T');
    
 //*************** Comme aussi la reponse etait valider soit traiter ou finir donc on sort de while juste si la reponse est finir *************************************************//
 
 System.out.println(" La QUANTITE TOTALE de moulée pour cochons :"   + quantTotalMC );
 System.out.println(" La QUANTITE TOTALE de moulée pour Lapins :"   + quantTotalLP );
 System.out.println(" La QUANTITE TOTALE de moulée pour Poules :"   + quantTotalP );
 System.out.println(" La QUANTITE TOTALE de moulée pour Vaches :"   + quantTotalV );
 System.out.println(" La QUANTITE TOTALE de moulée pour Chevaux :"   + quantTotalCH );
 System.out.println(" Le plus GRAND nombre total de points utilisé est : "   + maxPoint);
 System.out.println(" Le plus PETIT nombre total de points utilisé est : "  + mintPoint );
 System.out.println(" La RECETTE TOTTALE est :" + montTotal + " point ");

 
} // if
} // main
 
} // Tp1Gr10
 
