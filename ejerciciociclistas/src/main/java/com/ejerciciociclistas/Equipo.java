package com.ejerciciociclistas;

import java.util.ArrayList;

public class Equipo {
      private String nombre;
    private String pais;
    private ArrayList<Ciclista> ciclistas;

    private static double sumaTiempos = 0;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void registrarTiempo(Ciclista ciclista, double minutos) {
        ciclista.acumularTiempo(minutos);
        sumaTiempos += minutos;
    }

    public void mostrarEquipo() {
        System.out.println("\n===== DATOS DEL EQUIPO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("País: " + pais);

        for (Ciclista ciclista : ciclistas) {
            System.out.println("\n--------------------------");
            ciclista.mostrarDatos();
        }

        System.out.println("\nSuma de tiempos de carrera: "
                + sumaTiempos + " minutos");
    }
}

