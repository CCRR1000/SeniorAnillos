package src.Personajes.Bestias;

import src.Personajes.Personaje;

public class Bestia extends Personaje {
    
    protected final int MAXIMO_ATAQUE = 90, CANTIDAD_DADOS = 1;
    protected static int cantidadInstancias = 0;

    public Bestia(String nombre, int vida) {
        super(nombre, vida);
    }




    public Bestia() {
    }




    public int getMAXIMO_ATAQUE() {
        return MAXIMO_ATAQUE;
    }

    public int getCANTIDAD_DADOS() {
        return CANTIDAD_DADOS;
    }

    public static int getCantidadInstancias() {
        return cantidadInstancias;
    }

    public static void setCantidadInstancias(int cantidadInstancias) {
        Bestia.cantidadInstancias = cantidadInstancias;
    }

    

}
