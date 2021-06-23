package src.Personajes.Heroes;

import src.Juego.Rand;

public class VectorHeroes {
    
    private Heroe[] heroes = {new Elfo(""), new Elfo(""), new Elfo(""), new Elfo(""),
                            new Elfo(""), new Hobbit(""), new Hobbit(""), new Hobbit(""),
                            new Hobbit(""), new Hobbit(""), new Humano(""), new Humano(""),
                            new Humano(""), new Humano(""), new Humano("")};

    public VectorHeroes() {
    }

    public Heroe[] crearEjercitoHeroes(int cantHeroes) {

        Heroe[] ejercito = new Heroe[cantHeroes];
        for (int i = 0; i < cantHeroes; i++) {
            ejercito[i] = heroes[Rand.indicePersonaje(heroes.length)];
        }
        return ejercito;
    }

    public Heroe[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroe[] heroes) {
        this.heroes = heroes;
    }

    
}
