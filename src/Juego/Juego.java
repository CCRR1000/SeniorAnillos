package src.Juego;

import src.Personajes.Personaje;
import src.Personajes.Bestias.*;
import src.Personajes.Heroes.*;

public class Juego {

    private int persEjercito = 5;
    private VectorBestias vb = new VectorBestias();
    private VectorHeroes vh = new VectorHeroes();
    private Personaje pers = new Personaje();

    public Juego() {
    }

    public void inicializarJuego() {

        Heroe[] ejercitoHeroes = vh.crearEjercitoHeroes(persEjercito);
        Bestia[] ejercitoBestias = vb.crearEjercitoBestias(persEjercito);

        pers.setValorArmaduras(ejercitoHeroes);
        pers.setValorArmaduras(ejercitoBestias);

        desarrollarBatalla(ejercitoHeroes, ejercitoBestias);

    }

    public void desarrollarBatalla(Heroe[] ejercitoHeroes, Bestia[] ejercitoBestias) {

        do {

            for (int i = 0; i < ejercitoBestias.length; i++) {

                if (ejercitoHeroes[i].getVida() > 0 && ejercitoBestias[i].getVida() > 0 ) {
                    evaluarCondiciones(ejercitoHeroes[i], ejercitoBestias[i]);
                    duelo(ejercitoHeroes[i], ejercitoBestias[i]);
                }

            }

            ajustarCasillas(ejercitoHeroes, ejercitoBestias);

        } while (ejercitoHeroes[0].getVida() > 0 && ejercitoBestias[0].getVida() > 0);

        System.out.println("\nLOS GANADORES SON: ");
        if (ejercitoHeroes[0].getVida() > 0) {
            System.out.println("\n     HEROES\n");
        } else {
            System.out.println("\n     BESTIAS\n");
        }

    }

    public void duelo(Heroe heroe, Bestia bestia) {

        heroe.setAtaque(Rand.asignarAtaque(heroe.getMAXIMO_ATAQUE()));
        bestia.setAtaque(Rand.asignarAtaque(bestia.getMAXIMO_ATAQUE()));

        System.out.println("\n" + heroe.getNombre() + " vs " + bestia.getNombre());
        System.out.println("Inicio pelea: Vida = " + heroe.getVida() + " <---> Vida = " + bestia.getVida());

        if (heroe.getAtaque() > bestia.getArmadura()) {
            int danio = heroe.getAtaque() - bestia.getArmadura();
            bestia.setVida(bestia.getVida() - danio);
/* 
            if (bestia.getVida() <= 0) {
                bestia = null;
            } */
        }

        if (bestia.getAtaque() > heroe.getArmadura()) {
            int danio = bestia.getAtaque() - heroe.getArmadura();
            heroe.setVida(heroe.getVida() - danio);

 /*            if (heroe.getVida() <= 0) {
                heroe = null;
            } */
        }

        System.out.println("Fin de pelea: Vida = " + heroe.getVida() + " <---> Vida = " + bestia.getVida());

    }

    public void ajustarCasillas(Heroe[] ejercitoHeroes, Bestia[] ejercitoBestias) {

        for (int i = 0; i < ejercitoBestias.length; i++) {
            for (int j = 0; j < ejercitoBestias.length - 1; j++) {

                if (ejercitoHeroes[j].getVida() <= 0) {
                    Heroe h = ejercitoHeroes[j];
                    ejercitoHeroes[j] = ejercitoHeroes[j + 1];
                    ejercitoHeroes[j + 1] = h;
                }

                if (ejercitoBestias[j].getVida() <= 0) {
                    Bestia b = ejercitoBestias[j];
                    ejercitoBestias[j] = ejercitoBestias[j + 1];
                    ejercitoBestias[j + 1] = b;
                }
            }
        }
    }

    public boolean estaVivo() {

        if (pers.getVida() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void evaluarCondiciones(Heroe heroe, Bestia bestia) {

        if ((heroe instanceof Elfo) && (bestia instanceof Orco)) {
            heroe.setAtaque(heroe.getAtaque() * 10);
        }

        if ((heroe instanceof Hobbit) && (bestia instanceof Trasgo)) {
            heroe.setAtaque(heroe.getAtaque() - 5);
        }

        if ((bestia instanceof Orco)) {
            heroe.setArmadura((int) (heroe.getArmadura() * 0.9));
        }

    }
}
