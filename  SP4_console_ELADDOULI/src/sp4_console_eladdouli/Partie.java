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
    ListeJoueurs[0].Couleur = "rouge" ;
    ListeJoueurs[1].Couleur = "jaune" ;
    }
    
    public void initialiserPartie()
    {
    Grille grillejeu = new Grille();
    
    //joueur 
    Scanner sc = new Scanner(System.in);
    
    
    Joueur joueur1 = new Joueur(sc.nextLine());
    
    Joueur joueur2 = new Joueur(sc.nextLine());
    
    // les mettre dans le tableau
    
    Jeton jetonj1 = new Jeton() ; // ??
    
    
    
    }
    
    public void debuterPartie()
    {
    
    }
    
}
