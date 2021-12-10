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
             
             if (Case[i][j].Etat == true){ // on allume la cellule
                 System.out.print(" light ");
             }
            if (Case[i][j].Etat == false){
                System.out.print(" dark ");
            }
         }
         System.out.println("\n");
     }
}
 
 public void SwitchEtat(int Ligne , int Col){
     if (Case[Ligne][Col].Etat == true){
         Case[Ligne][Col].Etat = false;
     }
     if (Case[Ligne][Col].Etat == false){
         Case[Ligne][Col].Etat = true;
     }
 }
 
 
}
