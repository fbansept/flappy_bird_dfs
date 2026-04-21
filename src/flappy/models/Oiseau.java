package flappy.models;

import java.awt.*;

public class Oiseau extends Sprite{

    protected float gravite = 1.0f;

    public void deplacement(){
        this.y += gravite;
        this.gravite += 0.2;
    }

    public void dessiner(Graphics2D dessin){
        dessin.setColor(Color.red);
        dessin.fillOval(x,y, 50, 50);
    }

    public void saut(){
       this.gravite = -5;
    }

    public float getGravite() {
        return gravite;
    }

    public void setGravite(float gravite) {
        this.gravite = gravite;
    }
}
