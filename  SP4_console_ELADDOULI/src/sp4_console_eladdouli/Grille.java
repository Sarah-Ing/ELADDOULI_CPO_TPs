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

    public Grille() {
        CellulesJeu = new Cellule[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton j, int col) {
        if (CellulesJeu[0][col].jetonCourant != null) {
            return false;
        } else {
            for (int i = 5; i >= 0; i--) {
                if (CellulesJeu[i][col].jetonCourant == null) {
                    CellulesJeu[i][col].affecterJeton(j);
        return true;
                }
                
            }
            //return true;
        }
return true;
    }

    public boolean etreRemplie() {
        for (int j = 0; j <= 6; j++) {
            if (CellulesJeu[0][j].jetonCourant == null) {
                return false;
            }
        }
        return true;
    }

    public void viderGrille() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                CellulesJeu[i][j].jetonCourant = null;
            }
        }
    }

    public void afficherGrilleSurConsole() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(" " + CellulesJeu[i][j].lireCouleurDuJeton() + " ");
            }
            System.out.println("\n");
        }

    }

    public boolean celluleOccupee(int a, int b) {
        if (CellulesJeu[a][b].jetonCourant == null) {
            return false;
        }

        return true;
    }

    public String lireCouleurDuJeton(int c, int d) {
        return CellulesJeu[c][d].lireCouleurDuJeton();
    }

    public boolean etreGagnantePourJoueur(Joueur joueur) {
        for (int l = 0; l <= 5; l++) // l = ligne
        {
            for (int col = 0; col <= 3; col++) //col = colonne 
            {
                // 4 pions de sa couleur sont align??s en ligne

                if (CellulesJeu[l][col].lireCouleurDuJeton() == joueur.Couleur 
                        && CellulesJeu[l][col + 1].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l][col + 2].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l][col + 3].lireCouleurDuJeton() == joueur.Couleur) 
                {
                    return true;
                }
            }
        }

        for (int col = 0; col <= 6; col++) //col = colonne 
        {
            for (int l = 0; l <= 2; l++) // l = ligne //j'ai chang?? l<6 pour l<5
            {
                // 4 pions de sa couleur sont align??s en colonne 
                if (CellulesJeu[l][col].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 1][col].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 2][col].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 3][col].lireCouleurDuJeton() == joueur.Couleur) {
                    return true;
                }
            }
        }

        // 4 pions de sa couleur sont align??s en DIAGONALE
        // MONTANTE          
        for (int col = 0; col <= 3; col++) //col = colonne 
        {
            for (int l = 0; l <= 2; l++) // l = ligne
            {
                // 4 pions de sa couleur sont align??s en colonne 
                if (CellulesJeu[l][col].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 1][col + 1].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 2][col + 2].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l + 3][col + 3].lireCouleurDuJeton() == joueur.Couleur) {
                    return true;
                }
            }
        }

        // DESCENDENTE
        for (int col = 0; col <= 3; col++) //col = colonne 
        {
            for (int l = 3; l <= 5; l++) // l = ligne
            {
                // 4 pions de sa couleur sont align??s en colonne 
                if (CellulesJeu[l][col].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l - 1][col + 1].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l - 2][col + 2].lireCouleurDuJeton() == joueur.Couleur
                        && CellulesJeu[l - 3][col + 3].lireCouleurDuJeton() == joueur.Couleur) {
                    return true;
                }
            }
        }
        {
            return false;
        }

    }

    //public void tasserGrille(int){}
    public boolean colonneRemplie(int j) {
        if (CellulesJeu[0][j] != null) {
            return true;
        }
        return false;
    }

    public boolean placerTrouNoir(int ligne, int col)
    
    {
        if (CellulesJeu[ligne][col].trouNoir == true) { // trou noir d??ja pr??sent 
            return false; // on ne peut pas mettre de trouNoir
        }

        return true;// si la cellule est vide on peut mettre un trou noir
    }
    
    
    
    //public boolean placerDesintegrateur(int, int){}
    // public boolean supprimerJeton(int, int){}
    //public boolean recupererJeton(int, int){}
}
