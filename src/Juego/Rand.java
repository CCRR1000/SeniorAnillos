package src.Juego;

import java.util.Random;

import src.Personajes.Bestias.Bestia;
import src.Personajes.Heroes.Heroe;

public class Rand {
    
    static Random random = new Random();

    public static int asignarArmadura(int limInferior, int limSuperior) {

        return random.nextInt(limSuperior - limInferior + 1) + limInferior;
    }

    public static int asignarAtaque(int limSuperior) {

        return random.nextInt(limSuperior + 1);
    }

    public static int indicePersonaje(int longEjercito) {
        return random.nextInt(longEjercito);
    }

}
