/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

/**
 *
 * @author sarah
 */
public class Cellule {
    
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule() {
        jetonCourant = null;
        trouNoir = false;
        desintegrateur = false;
    }
    
    public boolean affecterJeton(Jeton j) {
    if (jetonCourant == null) 
        { jetonCourant = j;
        return true;
        }
    else
        {return false;}
    }
    
    public String lireCouleurDuJeton() 
    {
    if(jetonCourant != null)
        {
            return jetonCourant.couleur;
        }
    else {return "vide";}
    }

    
    //public Jeton recupererJeton() {} 
    
   /* public boolean supprimerJeton() 
    {  if (jetonCourant != null) 
        { jetonCourant = null;
        return true; 
        }
    else
        {return false;}
    }
    
    */
    
    public boolean placerTrouNoir() 
    {
    if (trouNoir == false) 
       {trouNoir = true ;
       return true;}
   
    return false ;
    }
    
    //public boolean placerDesintegrateur() {}
    
    public boolean presenceTrouNoir() 
    {
    if (trouNoir == true) 
       {return true;}
   
    return false ;}
    
    //public boolean presenceDesintegrateur() {}
    
    
    //public boolean recupererDesintegrateur() {}
    
    public boolean activerTrouNoir() 
    {
    if (trouNoir == false) 
       {return false;}
   
    if (trouNoir == true)
    { 
        if (jetonCourant != null)
            
        {
            jetonCourant = null;
            trouNoir = false;
            return true;
        }
    } 
    
    
    }
            
           
            
    
    
}
