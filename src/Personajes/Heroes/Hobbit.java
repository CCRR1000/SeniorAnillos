package src.Personajes.Heroes;

public class Hobbit extends Heroe {

    public Hobbit(String nombre) {
        super(nombre, 200);
    }

    public Hobbit() {
    }
 
    @Override
    public String toString() {
        return "HOBBIT "+ super.toString();
    }
    
}
