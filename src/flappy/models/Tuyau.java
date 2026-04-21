package flappy.models;

import flappy.Principal;

import java.awt.*;

public class Tuyau extends Sprite{

    protected int ecartement = 200;
    protected int largeur = 100;
    protected int marge = 50;
    protected int vitesse = 4;
    protected Color couleur = Color.GREEN;

    public void deplacement(){
        x -= vitesse;

        if(x < -largeur) {
            x = Principal.LARGEUR;
            y = aleatoire(marge + ecartement, Principal.HAUTEUR - marge);
        }
    }

    public void dessiner(Graphics2D dessin){
        dessin.setColor(couleur);
        dessin.fillRect(x,y, largeur, Principal.HAUTEUR);
        dessin.fillRect(x,y-ecartement-Principal.HAUTEUR, largeur, Principal.HAUTEUR);
    }

    public int aleatoire(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

}
