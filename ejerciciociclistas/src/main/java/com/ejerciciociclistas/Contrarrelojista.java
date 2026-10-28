package com.ejerciciociclistas;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre,
                            double velocidadMaxima) {

        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Velocidad máxima: "
                + velocidadMaxima + " km/h");
    }
}