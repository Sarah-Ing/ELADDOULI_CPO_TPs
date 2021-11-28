/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_eladdouli;

/**
 *
 * @author sarah
 */
public class Joueur 
{
    String nom;
    String Couleur;
    Jeton [] ListeJetons = new Jeton[21]; // int ????
    int nombreJetonsRestants=0; 
// nombreJetonsRestants: nombre de jetons restant en possession du joueur, correspondant à la taille effective de ListeJetons
    
    
    public Joueur (String unNom)
        { nom = unNom;
        }
    
    public void affecterCouleur(String UneCouleur)
        { Couleur = UneCouleur;}
    
    public boolean ajouterJeton(Jeton j)
        { 
         if (nombreJetonsRestants > ListeJetons.length)
         { return false ;}
         else 
         {  
         
         ListeJetons[nombreJetonsRestants]=j;
         nombreJetonsRestants ++ ;
                 
             return true ;}    
        }
    
    /*obtenirDesintegrateur()
        {;}
    
    utiliserDesintegrateur()
        {;}
    */
}
