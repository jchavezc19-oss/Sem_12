package com.fabrica;

/**
 * Fábrica simple que crea instancias de laptops según el tipo solicitado.
 * @author LEONARDO (código propio)
 */
public class LaptopFactory {

    /**
     * Método estático que devuelve una laptop del tipo indicado.
     * @param tipo Cadena que indica el tipo de laptop ("basica", "gamer", "profesional")
     * @return Una instancia de la subclase correspondiente, o null si el tipo no es válido.
     */
    public static Laptop crearLaptop(String tipo) {
        // Comparación insensible a mayúsculas/minúsculas
        switch (tipo.toLowerCase()) {
            case "basica":
                return new LaptopBasica();
            case "gamer":
                return new LaptopGamer();
            case "profesional":
                return new LaptopProfesional();
            default:
                // Si el tipo no coincide, se retorna null (podría lanzarse excepción)
                return null;
        }
    }
}