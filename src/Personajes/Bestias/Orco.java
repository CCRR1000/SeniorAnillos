package src.Personajes.Bestias;

public class Orco extends Bestia {

    public Orco(String nombre) {
        super(nombre, 300);
    }

    public Orco() {
    }

    @Override
    public String toString() {
        return "ORCO "+ super.toString();
    }
    
    
}
