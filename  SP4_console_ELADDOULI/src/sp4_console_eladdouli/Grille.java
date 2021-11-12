/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

/**
 *
 * @author sarah
 */
public class Grille {
    Cellule CellulesJeu[][] = new Cellule[6][7];
    

    public Grille()
    {CellulesJeu = new Cellule[6][7];}
    
    public boolean ajouterJetonDansColonne(Jeton j, int col)
    {
    if (CellulesJeu[0][col] != null) 
    {return false;}
    else 
    {
        for(int i= 0; i<= 5; i++)
        {
            
            if(CellulesJeu[i][col] != null)
            {CellulesJeu[i-1][col].affecterJeton(j);}
        }  return true;
    }
   
    }
    
    public boolean etreRemplie()
    {
        for (int j = 0; j<= 6; j++)
            {if (CellulesJeu[0][j] == null){return false;}
        } 
        return true;      
    }
    
    public void viderGrille()
    {}
    
    public void afficherGrilleSurConsole()
    {}
    
    public boolean celluleOccupee(int,int)
    {}
    
    public String lireCouleurDuJeton(int, int)
    {}
    
    public boolean etreGagnantePourJoueur(Joueur)
    {}
    
    //public void tasserGrille(int){}
    
    public boolean colonneRemplie()
    {}
    
    //public boolean placerTrouNoir(int, int){}
    
    //public boolean placerDesintegrateur(int, int){}
    
   // public boolean supprimerJeton(int, int){}
    
    //public boolean recupererJeton(int, int){}
    
    
}
