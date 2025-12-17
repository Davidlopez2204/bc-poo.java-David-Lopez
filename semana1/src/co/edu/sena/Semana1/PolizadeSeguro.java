package co.edu.sena.Semana1;

// creación de objeto

public class PolizadeSeguro {

    // asignación de atributos

    private int numerodepoliza;
    private String tipo;
    private String titular;
    private boolean vigencia;
    private double primamensual;

    // constructor

    public PolizadeSeguro(int numerodepoliza, String tipo, String titular, boolean vigencia, double primamensual) {
        this.numerodepoliza = numerodepoliza;
        this.tipo = tipo;
        this.titular = titular;
        this.vigencia = vigencia;
        this.primamensual = primamensual;
    }

    // asignacion de metodos

    public void mostrardatos() {      // metodo void
        System.out.println("\n ---POLIZAS---");
        System.out.println("numero de poliza: " + numerodepoliza);
        System.out.println("tipo de poliza: " + tipo);
        System.out.println("titular: " + titular);
        System.out.println("vigencia: " + (vigencia ? "vigente" : "no vigente"));
        System.out.println("prima : " + primamensual);
    }

    public double primamensual() { // calculo de prima mensual
        return primamensual * 12;
    }

    public int getNumerodepoliza() { // asignacion getter
        return numerodepoliza;
    }

    public void setvigencia(boolean vigencia) { // asignacion setter
        this.vigencia = vigencia;
    }

}
