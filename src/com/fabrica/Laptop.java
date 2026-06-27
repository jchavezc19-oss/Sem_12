package com.fabrica;

public abstract class Laptop {
    private String marcaModelo;
    private int anioFabricacion;
    private String procesador;
    private double tamanoPantalla;

    public Laptop(String marcaModelo, int anioFabricacion, String procesador, double tamanoPantalla) {
        this.marcaModelo = marcaModelo;
        this.anioFabricacion = anioFabricacion;
        this.procesador = procesador;
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getProcesador() {
        return procesador;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public abstract String getTipo();

    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una " + getTipo() + " " + getTipo() +
                " Marca y Modelo: " + getMarcaModelo() +
                " Año de Fabricacion: " + getAnioFabricacion() +
                " Procesador: " + getProcesador() +
                " Tamaño de la Pantalla: " + getTamanoPantalla());
    }
}