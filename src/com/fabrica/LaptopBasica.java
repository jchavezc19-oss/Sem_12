// Autor: Leonardo
// Clase concreta para laptops de uso básico. Hereda de Laptop.
package com.fabrica;

public class LaptopBasica extends Laptop {
    // Constructor que llama al constructor de la superclase con valores fijos para una laptop básica
    public LaptopBasica() {
        // Se pasan los valores específicos: marca/modelo, año, procesador, pantalla
        super("Dell Latitude", 2020, "intel core i7", 14);
    }

    // Implementación del método abstracto getTipo() para devolver el tipo de laptop
    @Override
    public String getTipo() {
        return "Laptop Basica"; // Tipo específico para uso básico
    }
}
