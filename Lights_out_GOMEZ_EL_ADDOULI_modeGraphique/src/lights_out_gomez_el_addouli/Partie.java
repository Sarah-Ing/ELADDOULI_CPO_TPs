/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out_gomez_el_addouli;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Partie {
    
    Grille GrilleJeu = new Grille();
    
    public void InitialiserPartie(){
        Random nbAleatoire = new Random();
        int CaseDeb = 1+nbAleatoire.nextInt(12);
        for(int i=0; i<=CaseDeb ; i++){
            int ligneAlea = nbAleatoire.nextInt(4);
            int ColAlea = nbAleatoire.nextInt(4);
            GrilleJeu.SwitchEtat(ligneAlea ,ColAlea);
        }
    }
    
    public void DebuterPartie(){
        GrilleJeu.GrilleSurConsole();
        
       while(GrilleJeu.GrilleEteinte()== false){
        
        int ligne =-1;
        int col = -1;
        while (ligne <0 || ligne >4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisissez le numéro de la ligne : (entre 1 et 5)");
            ligne  = sc.nextInt();
            ligne = ligne-1;
           
        }
        while (col <0 || col >4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisissez le numéro de la colonne : (entre 1 et 5)");
            col  = sc.nextInt();
            col = col-1;
           
        }
        GrilleJeu.SwitchEtat(ligne , col);
        if (col == 0 ){
            GrilleJeu.SwitchEtat(ligne , col +1);
            if (ligne == 0){
                GrilleJeu.SwitchEtat(ligne +1, col);
            }
            else if (ligne == 4){
               GrilleJeu.SwitchEtat(ligne -1, col);
            }
            else {
                GrilleJeu.SwitchEtat(ligne-1,col);
                GrilleJeu.SwitchEtat(ligne+1,col);
            }
        }
        else if (col== 4 ){
            GrilleJeu.SwitchEtat(ligne , col -1);
        
            if (ligne == 0){
                GrilleJeu.SwitchEtat(ligne +1, col);
            }
            else if (ligne == 4){
               GrilleJeu.SwitchEtat(ligne -1, col);
            }
            else{
                GrilleJeu.SwitchEtat(ligne-1, col);
                GrilleJeu.SwitchEtat(ligne+1, col);
            }
        }
        else if (ligne == 4){
            GrilleJeu.SwitchEtat(ligne -1, col);
            GrilleJeu.SwitchEtat(ligne,col+1);
            GrilleJeu.SwitchEtat(ligne,col-1);
        }
        else if (ligne== 0){
            GrilleJeu.SwitchEtat(ligne +1, col);
            GrilleJeu.SwitchEtat(ligne,col+1);
            GrilleJeu.SwitchEtat(ligne,col-1);
        }
        else {
            GrilleJeu.SwitchEtat(ligne-1,col);
            GrilleJeu.SwitchEtat(ligne+1,col);
            GrilleJeu.SwitchEtat(ligne,col-1);
            GrilleJeu.SwitchEtat(ligne,col+1);
        }
  
     GrilleJeu.GrilleSurConsole();   
       }
       System.out.println("Bravo vous avez gagné !");
    }
}
