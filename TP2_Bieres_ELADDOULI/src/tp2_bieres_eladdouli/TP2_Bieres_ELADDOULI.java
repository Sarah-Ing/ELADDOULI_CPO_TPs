/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_eladdouli;

/**
 *
 * @author sarah
 */
public class TP2_Bieres_ELADDOULI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      /* BouteilleBiere uneBiere = new BouteilleBiere() ;
       
        uneBiere.nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;*/
        
         BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; // correction Q11
         uneBiere.lireEtiquette();
         
    System.out.println("\n");   // juste pour un affichage plus propre
    
        /* Création de la seconde bière
        BouteilleBiere secondeBiere = new BouteilleBiere() ;
    
        secondeBiere.nom = "Leffe"; 
        secondeBiere.degreAlcool = 6.6 ;
        secondeBiere.brasserie = "Abbaye de Leffe";
        secondeBiere.ouverte = false;*/
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; // correction Q11
        secondeBiere.lireEtiquette();
        
        // creation du constructeur
         System.out.println("\n");
         BouteilleBiere Coca = new BouteilleBiere("Coca-cola", 0.0, "The Coca-Cola Company") ;
         Coca.lireEtiquette();
         
         System.out.println("\n");
         BouteilleBiere HuileO = new BouteilleBiere("Huile d'olive", 0.0, "Pedre Rodone") ;
         HuileO.lireEtiquette();
         
         System.out.println("\n");
         BouteilleBiere autreBiere = new BouteilleBiere("Skoll", 6.0, "Viking") ;
         autreBiere.lireEtiquette();
         
         
         { 
    
}
         System.out.println("\n");
         uneBiere.Décapsuler();
         System.out.println(uneBiere.ouverte);// cette ligne est la juste pour verifier
         
         System.out.println("\n");
         //uneBiere.toString();  > La méthode toString() est une méthode qui n’a pas besoin d’être appelée
         System.out.println(uneBiere) ; // elle s’appelle automatiquement quand l’objet est cité dans System.out.println()
         
         System.out.println("\n");
         System.out.println(HuileO) ;
         
         System.out.println("\n");
         autreBiere.Décapsuler();
         System.out.println(autreBiere) ;
         
    }
    // Exercice fini!
}
