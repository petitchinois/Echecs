package damier;

import java.awt.*;
import java.util.Objects;

public abstract class Case {
    private static final int COTECASE = 75;
    private Color couleur;
    private boolean occupe;
    private int x, y;

    public Case(Color couleur, int x , int y) {
        this.couleur = couleur;
        this.x = x;
        this.y = y;
        this.occupe = false;
    }

    public void paintComponent(Graphics g ) {
        g.setColor(couleur);
        g.fillRect(50+(x)*COTECASE, 50+(y)*COTECASE, COTECASE, COTECASE);
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public void changeCouleur () {
        if (this.couleur != Color.green) {
            this.couleur = Color.green;
        }
        else {
            if (this instanceof CaseBlanche){
                this.couleur = Color.white;
            }
            else {
                this.couleur = Color.black;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}