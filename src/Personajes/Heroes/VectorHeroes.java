package src.Personajes.Heroes;

import src.Juego.Rand;

public class VectorHeroes {
    
    private Heroe[] heroes = {new Elfo("Legolas"), new Elfo("Elrung"), new Elfo("heroe1"), new Elfo("heroe2"),
                            new Elfo("heroe3"), new Hobbit("heroe4"), new Hobbit("Froddo"), new Hobbit("Sam"),
                            new Hobbit("heroe5"), new Hobbit("heroe6"), new Humano("Aragorn"), new Humano("heroe7"),
                            new Humano("heroe8"), new Humano("heroe9"), new Humano("heroe10")};

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
