package com.fabrica;

/**
 * Clase concreta que representa una laptop para gamers.
 * @author LEONARDO (código propio)
 */
public class LaptopGamer extends Laptop {

    /**
     * Constructor que inicializa los atributos con valores específicos para una laptop gamer.
     */
    public LaptopGamer() {
        super("Macbook air", 2017, "Silicon M1", 13);
    }

    /**
     * Devuelve el tipo de laptop para identificar su categoría.
     * @return "Laptop para Gamer"
     */
    @Override
    public String getTipo() {
        return "Laptop para Gamer";
    }
}