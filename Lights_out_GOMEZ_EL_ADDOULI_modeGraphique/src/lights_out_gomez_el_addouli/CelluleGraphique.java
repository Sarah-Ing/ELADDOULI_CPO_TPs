/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out_gomez_el_addouli;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Natha
 */
public class CelluleGraphique extends JButton {
   Cellules CelluleAssociee;
   
   ImageIcon img_On = new javax.swing.ImageIcon(getClass().getResource("/images/On.png"));
    
  
   public CelluleGraphique(Cellules uneCellule) {
            CelluleAssociee = uneCellule;
    }
    
   @Override
   public void paintComponent (Graphics G) {
   
       super.paintComponent(G);
       setIcon(img_On);
   }
   
}
