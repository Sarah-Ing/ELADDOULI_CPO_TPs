/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out_gomez_el_addouli;

/**
 *
 * @author sarah
 */
public class Grille 
{
 // Attributs :

Cellules Case[][];
boolean test; // Si le boolean est true , la case est allumé, sinon elle est éteinte 

// Méthodes :

public Grille()
    {
        Case = new Cellules[5][5];
        for (int i=0; i<5 ; i++){
            for (int j=0; j<5 ; j++){
                Case[i][j] = new Cellules() ;
            }
        }
        
    }

 void GrilleSurConsole(){
     for (int i=0 ; i<5 ; i++){
         for (int j=0 ; j<5 ; j++){
             System.out.print(Case[i][j]);
         }
         System.out.println("\n");
     }
    
}
}
