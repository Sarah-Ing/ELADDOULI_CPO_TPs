/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Partie {
    
// Attributs :
    Joueur ListeJoueurs[] = new Joueur[2]; // tableau des 2 adversaires 
    Joueur joueurCourant = null;
    Grille grillejeu = new Grille();
    
    
// Méthodes:   
    public Partie (Joueur joueur1, Joueur joueur2)
    {
    ListeJoueurs[0] = joueur1 ;
    ListeJoueurs[1] = joueur2 ;
    }
            
    public void attribuerCouleursAuxJoueurs() // Prochaine étape : rendre les couleurs random 
    {
    ListeJoueurs[0].affecterCouleur("jaune") ; 
    ListeJoueurs[1].affecterCouleur("rouge") ;
    }
    
    
    public void initialiserPartie()
    {
    grillejeu = new Grille(); // initialisation de la grille
    
    //joueur 
    Scanner sc = new Scanner(System.in);
    System.out.println("Choix du nom de J1 : ");
    Joueur joueur1 = new Joueur(sc.nextLine());
    
    System.out.println("Choix du nom de J2 : ");
    Joueur joueur2 = new Joueur(sc.nextLine());
    
    ListeJoueurs[0] = joueur1 ;
    ListeJoueurs[1] = joueur2 ;
    
    attribuerCouleursAuxJoueurs();

System.out.println(joueur1.nom + " est de couleur  " + joueur1.Couleur );
System.out.println(joueur2.nom + " est de couleur  " + joueur2.Couleur );
    
    
        
        Random r = new Random();
        
        for (int i = 0 ; i < 5; i++)

	{
		int ligneTrouNoir = r.nextInt(6);
		int colTrouNoir = r.nextInt(7); 
                
                if (!grillejeu.placerTrouNoir(ligneTrouNoir, colTrouNoir))
			{i --;}
	} 

        grillejeu.afficherGrilleSurConsole();


    
    for (int i = 0; i < 21; i++)
        {
        Jeton j = new Jeton ("jaune") ;
        ListeJoueurs[0].ajouterJeton(j); 
        }
    
     for (int e = 0; e <21; e++)
        {
        Jeton g = new Jeton ("rouge") ;
        ListeJoueurs[1].ajouterJeton(g); 
        }
    
    
    }
    
    public void debuterPartie()
    
    {
    grillejeu.afficherGrilleSurConsole(); 
   
   attribuerCouleursAuxJoueurs();
        
    joueurCourant = ListeJoueurs[0]; 
    
    while (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) == false 
            && grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]) == false 
            && grillejeu.etreRemplie() == false)
    
    {
        
   grillejeu.afficherGrilleSurConsole();     
        
    boolean coupValide = false; 
    int col=-1;    
    while (coupValide == false)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Saisissez la colonne : ");
    col = sc.nextInt();
    col = col -1;
    
    if (col <= 6 && col >= 0 )
        {
                if (grillejeu.colonneRemplie(col))
                {coupValide = true; }
        }
    else 
        { 
                System.out.println ("erreur, choisissez un nombre entre 1 et 7");
                coupValide = false; 
        }
    
    }
    
    
    //joueurCourant
            
    Jeton j = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1];
    
    grillejeu.ajouterJetonDansColonne(j, col); 
    
    joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null ;
    joueurCourant.nombreJetonsRestants--;
    
    
    // Changement de joueur dans la boucle while
         if (joueurCourant == ListeJoueurs[0])
            {joueurCourant = ListeJoueurs[1];}
    
         else 
            {joueurCourant = ListeJoueurs[0];}
    
    }
    
    System.out.println("Partie terminée !");
  }
    
    
   
    
}
    

