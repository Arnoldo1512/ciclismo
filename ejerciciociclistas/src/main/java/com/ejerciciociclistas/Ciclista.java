package com.ejerciciociclistas;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private double tiempoAcumulado;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void acumularTiempo(double minutos) {
        this.tiempoAcumulado += minutos;
    }

    public void mostrarDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }
}