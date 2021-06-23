package src.Juego;

import src.Personajes.Bestias.*;
import src.Personajes.Heroes.*;

public class Juego {

    private int armadura;
    VectorBestias vb;

    public Juego() {

    }

    
    public void condicionInicial(Heroe heroe, Bestia bestia) {

        if ((heroe instanceof Elfo) && (bestia instanceof Orco)) {
            heroe.setAtaque(heroe.getAtaque()*10);
        }

        if ((heroe instanceof Hobbit) && (bestia instanceof Trasgo)) {
            heroe.setAtaque(heroe.getAtaque()-5);
        }

        if ((bestia instanceof Orco)) {
            heroe.setArmadura((int) (heroe.getArmadura() * 0.9));
        }

    }
}
