package src.Personajes;

public class Personaje {

    protected String nombre;
    protected int vida, armadura, ataque;

    public Personaje() {        
    }

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
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
