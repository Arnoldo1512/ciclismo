package com.ejerciciociclistas;

public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre,
                     float aceleracionPromedio,
                     float gradoRampaSoportada) {

        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Aceleración promedio: "
                + aceleracionPromedio + " m/s2");
        System.out.println("Grado de rampa soportada: "
                + gradoRampaSoportada + " grados");
    }
}
