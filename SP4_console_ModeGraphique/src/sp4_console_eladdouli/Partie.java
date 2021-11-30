/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

import java.util.Scanner;
import java.util.Random;
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
            
    public void attribuerCouleursAuxJoueurs() 
    {
    Random r = new Random();
    boolean couleur;
    couleur = r.nextBoolean();

    if (couleur) 
    {
	ListeJoueurs[0].Couleur = "Rouge";
	ListeJoueurs[1].Couleur = "Jaune";
    }
    else
    {
	ListeJoueurs[0].Couleur = "Jaune";
	ListeJoueurs[1].Couleur = "Rouge";
    }  
        
        
   /* ListeJoueurs[0].affecterCouleur("jaune") ;
    ListeJoueurs[1].affecterCouleur("rouge") ;*/
    }
    
    
    public void initialiserPartie()
    {
    grillejeu = new Grille(); // initialisation de la grille
    
    // Création des 2 joueurs
    // RAJOUTER POUR POUVOIR AVANCER LE MODE GRAPHIQUE
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Choix du nom de J1 : ");
    Joueur J1 = new Joueur(sc.nextLine());
    System.out.println("Choix du nom de J2 : ");
    Joueur J2 = new Joueur(sc.nextLine());
    ListeJoueurs[0] = J1 ;
    ListeJoueurs[1] = J2 ;
    
    
    attribuerCouleursAuxJoueurs();

    System.out.println(J1.nom + "est de couleur " + J1.Couleur );
    System.out.println(J2.nom + "est de couleur " + J2.Couleur );

    // On attribue 21 jetons à chaque joueur
    for (int i = 0 ; i < 21; i++)
	{
		J1.ajouterJeton(new Jeton(J1.Couleur));
		J2.ajouterJeton(new Jeton(J2.Couleur));
	}

// Joueur qui fait l’action en premier
        Random r = new Random();
        boolean le_premier = r.nextBoolean();

        if (le_premier)
	{
		joueurCourant = ListeJoueurs[0];
	}
       else {joueurCourant = ListeJoueurs[1];}
        
        
        
        
        grillejeu.afficherGrilleSurConsole();
        
    
    //________________________________________//
    /*  for (int i = 0; i < 21; i++)
        {
        Jeton j = new Jeton ("jaune") ;
        ListeJoueurs[0].ajouterJeton(j); 
        }
    
     for (int e = 0; e <21; e++)
        {
        Jeton g = new Jeton ("rouge") ;
        ListeJoueurs[1].ajouterJeton(g); 
        }
    */
    //joueur 
    /*Scanner sc = new Scanner(System.in);
    Joueur joueur1 = new Joueur(sc.nextLine());
    Joueur joueur2 = new Joueur(sc.nextLine());
    // les mettre dans le tableau
    Jeton jetonj1 = new Jeton() ; // ??
    
    }*/
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
       //Jeton x;
            //x = ListeJoueurs[0].ListeJetons[0];
            //grillejeu.ajouterJetonDansColonne(x,col);
        
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
    
    grillejeu.ajouterJetonDansColonne(joueurCourant, col); // Modifications ICI 
    
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
    

