/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out_gomez_el_addouli;

import javax.swing.JButton;

/**
 *
 * @author Natha
 */
public class CelluleGraphique extends JButton {
    
    
   Cellules CelluleAssociee;
    
  
   public CelluleGraphique(Cellules uneCellule) {
            CelluleAssociee = uneCellule;
    }
    
}
