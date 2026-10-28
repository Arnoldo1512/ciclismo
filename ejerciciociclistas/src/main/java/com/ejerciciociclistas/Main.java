package com.ejerciciociclistas;

public class Main {

    public static void main(String[] args) {

        // Crear el equipo
        Equipo equipo = new Equipo("Los Campeones", "Colombia");

        // Crear los ciclistas
        Velocista velocista = new Velocista(
                1, "Daniel", 450.5, 65.2);

        Escalador escalador = new Escalador(
                2, "Kevin", 4.5f, 35.0f);

        Contrarrelojista contrarrelojista = new Contrarrelojista(
                3, "Juan", 70.5);

        // Agregar los ciclistas al equipo
        equipo.agregarCiclista(velocista);
        equipo.agregarCiclista(escalador);
        equipo.agregarCiclista(contrarrelojista);

        // Registrar los tiempos de carrera en minutos
        equipo.registrarTiempo(velocista, 45);
        equipo.registrarTiempo(escalador, 50);
        equipo.registrarTiempo(contrarrelojista, 40);

        // Mostrar la información
        equipo.mostrarEquipo();
    }
}
