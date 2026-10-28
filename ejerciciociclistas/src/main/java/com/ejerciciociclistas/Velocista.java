package com.ejerciciociclistas;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int identificador, String nombre,
                     double potenciaPromedio,
                     double velocidadPromedioSprint) {

        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Velocista";
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint: "
                + velocidadPromedioSprint + " km/h");
    }
}