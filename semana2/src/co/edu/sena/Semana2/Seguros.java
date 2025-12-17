package co.edu.sena.Semana2;

import java.util.ArrayList;

public class Seguros {

    private String nombre;
    private ArrayList<SegurodeVida> segurodeVidas;

    public Seguros(String nombre) {
        this.nombre = nombre;
        this.segurodeVidas = new ArrayList<>();
    }

    public void AgregarSeguro(SegurodeVida segurodeVida) {
        segurodeVidas.add(segurodeVida);
    }

    public void MostrarTodosSeguros() {
        System.out.println("POLIZAS DE VIDA DE LA COMPAÑIA " + this.nombre);
        System.out.println("----------------------------");

        for (SegurodeVida segurodeVida : segurodeVidas) {
            segurodeVida.InformacionSegurosdeVida();
            System.out.println("---------------------------");
        }
    }

    public int ContarSeguros() {
        return segurodeVidas.size();
    }
}


