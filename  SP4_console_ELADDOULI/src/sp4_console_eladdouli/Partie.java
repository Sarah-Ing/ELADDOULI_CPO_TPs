/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Partie {
    
    
    Joueur ListeJoueurs[] = new Joueur[2];
    Joueur joueurCourant = null;
    
    
    
    
    public Partie (Joueur joueur1, Joueur joueur2)
    {
    ListeJoueurs[0] = joueur1 ;
    ListeJoueurs[1] = joueur2 ;
    }
            
    public void attribuerCouleursAuxJoueurs() 
    {
    ListeJoueurs[0].affecterCouleur("jaune") ;
    ListeJoueurs[1].affecterCouleur("rouge") ;
    }
    
    public void initialiserPartie()
    {
    Grille grillejeu = new Grille();
    
    for (int i = 0; i <= 21; i++)
    {
    Jeton j = new Jeton ("jaune") ;
    ListeJoueurs[0].ajouterJeton(j); 
    }
    
     for (int e = 0; e <= 21; e++)
    {
    Jeton g = new Jeton ("rouge") ;
    ListeJoueurs[1].ajouterJeton(g); 
    }
    
    //joueur 
    /*Scanner sc = new Scanner(System.in);
    
    
    Joueur joueur1 = new Joueur(sc.nextLine());
    
    Joueur joueur2 = new Joueur(sc.nextLine());
    
    // les mettre dans le tableau
    
    Jeton jetonj1 = new Jeton() ; // ??
    
    
    
    }*/
    
    public void debuterPartie()
    {
    
    }
    
}
