package com.fabrica;

/**
 * Clase concreta que representa una laptop para uso profesional.
 * @author LEONARDO (código propio)
 */
public class LaptopProfesional extends Laptop {

    /**
     * Constructor que inicializa los atributos con valores específicos para una laptop profesional.
     */
    public LaptopProfesional() {
        super("Macbook Pro", 2022, "Apple Silicon M2", 16);
    }

    /**
     * Devuelve el tipo de laptop para identificar su categoría.
     * @return "Laptop para Profesional"
     */
    @Override
    public String getTipo() {
        return "Laptop para Profesional";
    }
}