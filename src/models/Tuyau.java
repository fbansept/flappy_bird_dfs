package models;

import java.awt.*;

public class Tuyau extends Sprite{

    public void deplacement(){
        x -=4;

        int nombreAleatoire = aleatoire(150, 550);

        System.out.println(nombreAleatoire);
    }

    public void dessiner(Graphics2D dessin){
        dessin.setColor(Color.green);
        dessin.fillRect(x,y, 100, 800);
    }

    public int aleatoire(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

}
