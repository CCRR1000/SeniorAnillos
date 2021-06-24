package src.Personajes.Heroes;

public class Humano extends Heroe {

    public Humano(String nombre) {
        super(nombre, 180);
    }

    public Humano() {
    }
    
    @Override
    public String toString() {
        return "HUMANO "+ super.toString();
    }
}
