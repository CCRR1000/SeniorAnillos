package src.Personajes.Heroes;

import src.Personajes.Personaje;

public class Heroe extends Personaje {

    protected final int MAXIMO_ATAQUE = 100, CANTIDAD_DADOS = 2;
    protected static int cantidadInstancias = 0;


    public Heroe(String nombre, int vida) {
        super(nombre, vida);
    }



    public Heroe() {
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
        Heroe.cantidadInstancias = cantidadInstancias;
    }   
    
    

}
