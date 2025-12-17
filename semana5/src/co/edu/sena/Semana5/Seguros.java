package co.edu.sena.Semana5;

import java.util.ArrayList;

public class Seguros {

    private String nombre;
    private ArrayList<PolizadeSeguro> polizas;

    public Seguros(String nombre) {
        this.nombre = nombre;
        this.polizas = new ArrayList<>();
    }

    public void agregarPoliza(PolizadeSeguro poliza) {
        polizas.add(poliza);
    }

    public void mostrarTodas() {
        System.out.println("POLIZAS DE LA COMPAÑIA " + nombre);
        System.out.println("----------------------------");

        for (PolizadeSeguro p : polizas) {
            p.mostrarDatos();
            System.out.println("---------------------------");
        }
    }

    public PolizadeSeguro buscarPorNumero(int numeroPoliza) {
        for (PolizadeSeguro p : polizas) {
            if (p.numerodepoliza == numeroPoliza) {
                return p;
            }
        }
        return null;
    }
}
