package src.Personajes.Bestias;

public class Trasgo extends Bestia {

    public Trasgo(String nombre) {
        super(nombre, 325);
    }

    public Trasgo() {
    }

    @Override
    public String toString() {
        return "TRASGO "+ super.toString();
    }
    
}
