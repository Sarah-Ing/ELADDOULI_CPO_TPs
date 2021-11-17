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
    {
       for(int i= 0; i<= 5; i++)
       {
           for (int j = 0; j<= 6; j++)
            {CellulesJeu[i][j].jetonCourant = null;}
       }}
    
    public void afficherGrilleSurConsole()
    {
        for(int i= 0; i<= 5; i++)
       {
           for (int j = 0; j<= 6; j++)
        System.out.print(CellulesJeu[i][j]);
       }   
    }
    
    public boolean celluleOccupee(int a,int b)
    {
                if (CellulesJeu[a][b].jetonCourant==null)
                {return false;}
            
    return true;
    }
    
    public String lireCouleurDuJeton(int c, int d)
    {
     return CellulesJeu[c][d].lireCouleurDuJeton();
    }
    
    public boolean etreGagnantePourJoueur(Joueur S)
    {
    if () { 
           // 4 pions de sa couleur sont alignés en ligne
          }
    {return true;}
    
    if () { 
           // 4 pions de sa couleur sont alignés en colonne
          }
    {return true;}
    
    
    if () { 
           // 4 pions de sa couleur sont alignés en diagonale
          }
    {return true;}
    }
    
    //public void tasserGrille(int){}
    
    public boolean colonneRemplie(int j)
    {
    if (CellulesJeu[0][j]!= null)
        {
            return true;
        }
    return false;
    }
    
    //public boolean placerTrouNoir(int, int){}
    
    //public boolean placerDesintegrateur(int, int){}
    
   // public boolean supprimerJeton(int, int){}
    
    //public boolean recupererJeton(int, int){}
    
    
}
