/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_eladdouli;

/**
 *
 * @author sarah
 */
public class SP4_console_ELADDOULI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
      //Joueur joueur1 = new Joueur() ;// ça c'est pas encore bon
     
       
      Joueur joueur1= new Joueur("sarah");
      Joueur joueur2 = new Joueur("sarah bis");
     
      Partie p = new Partie (joueur1,joueur2);
      
      p.initialiserPartie();
      
      p.debuterPartie();
    }
    
}
