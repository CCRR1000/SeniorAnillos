package src.Personajes;

import src.Juego.Rand;

public class Personaje {

    protected String nombre;
    protected int vida, armadura, ataque;

    public Personaje() {        
    }

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void setValorArmaduras(Personaje[] personajes) {

        for (int i = 0; i < personajes.length; i++) {
            personajes[i].setArmadura(Rand.asignarArmadura(50, 70));
        }

    }

    @Override
    public String toString() {
        return "<Nombre: "+nombre+", Vida: "+vida+", Armadura: "+armadura +", Ataque: "+ataque+">";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


}
