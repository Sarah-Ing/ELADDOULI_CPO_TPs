/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_eladdouli;

/**
 *
 * @author sarah
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    
    Joueur ListeJoueurs[] = new Joueur[2]; // tableau des 2 adversaires 
    Joueur joueurCourant = null;
    Grille grillejeu = new Grille();

    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
        panneau_Info_Joueurs.setVisible(false);
        panneau_Info_partie.setVisible(false);
        
        for (int i=5; i>=0; i--)
        {
          for (int j=0; j<7; j++) 
            {CelluleGraphique cellGraph = new CelluleGraphique(grillejeu.CellulesJeu[i][j]); // 42 cellules graphiques sont crées
            panneau_grille.add(cellGraph); // on les ajoute au panneau
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_Info_partie = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_Jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_Info_Joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_J1_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_J1_nom = new javax.swing.JLabel();
        lbl_J1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_J2_couleur = new javax.swing.JLabel();
        lbl_J2_desint = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_J2_nom1 = new javax.swing.JLabel();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 672, 576));

        panneau_Info_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_Info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Infos jeu");
        panneau_Info_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setText("Joueur courant :");
        panneau_Info_partie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbl_Jcourant.setText("nomJoueur");
        panneau_Info_partie.add(lbl_Jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        message.setViewportView(jTextArea1);

        panneau_Info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        getContentPane().add(panneau_Info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 290, 170));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 36, 120, 30));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 6, 120, 30));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 290, 110));

        panneau_Info_Joueurs.setBackground(new java.awt.Color(204, 204, 255));
        panneau_Info_Joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Infos joueurs");
        panneau_Info_Joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_J1_desint.setText("nbdesintJoueur1");
        panneau_Info_Joueurs.add(lbl_J1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneau_Info_Joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel6.setText("Couleur :");
        panneau_Info_Joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel7.setText("Désintégrateurs :");
        panneau_Info_Joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lbl_J1_nom.setText("nomJoueur1");
        panneau_Info_Joueurs.add(lbl_J1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        lbl_J1_couleur.setText("couleurJoueur1");
        panneau_Info_Joueurs.add(lbl_J1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));
        panneau_Info_Joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        panneau_Info_Joueurs.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        panneau_Info_Joueurs.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 10));

        jLabel9.setText("Couleur :");
        panneau_Info_Joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel10.setText("Désintégrateurs :");
        panneau_Info_Joueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbl_J2_couleur.setText("couleurJoueur2");
        panneau_Info_Joueurs.add(lbl_J2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lbl_J2_desint.setText("nbdesintJoueur2");
        panneau_Info_Joueurs.add(lbl_J2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel11.setText("Joueur 2 :");
        panneau_Info_Joueurs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbl_J2_nom1.setText("nomJoueur2");
        panneau_Info_Joueurs.add(lbl_J2_nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        getContentPane().add(panneau_Info_Joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 290, 230));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btn_col_4.setText("5");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        btn_col_5.setText("6");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        setBounds(0, 0, 1030, 693);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_Info_Joueurs.setVisible(true);
        panneau_Info_partie.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_J1_couleur;
    private javax.swing.JLabel lbl_J1_desint;
    private javax.swing.JLabel lbl_J1_nom;
    private javax.swing.JLabel lbl_J2_couleur;
    private javax.swing.JLabel lbl_J2_desint;
    private javax.swing.JLabel lbl_J2_nom1;
    private javax.swing.JLabel lbl_Jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_Info_Joueurs;
    private javax.swing.JPanel panneau_Info_partie;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    // End of variables declaration//GEN-END:variables
}