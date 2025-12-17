package co.edu.sena.Semana4;

public class PolizadeSeguro {
    protected int numerodepoliza;
    protected String tipo;
    protected String titular;
    protected boolean vigencia;
    protected double primaMensual;

    public PolizadeSeguro(int numeródepoliza, String tipo, String titular, boolean vigencia, double primaMensual) {
        this.numerodepoliza = numeródepoliza;
        this.tipo = tipo;
        this.titular = titular;
        this.vigencia = vigencia;
        this.primaMensual = primaMensual;
    }

    public void mostrarDatos() { // metodo void
        System.out.println("\n ---POLIZAS---");
        System.out.println("numero de poliza: " + numerodepoliza);
        System.out.println("tipo de poliza: " + tipo);
        System.out.println("titular: " + titular);
        System.out.println("vigencia: " + (vigencia ? "vigente" : "no vigente"));
        System.out.println("prima : " + primaMensual);
    }

    public double calcularRiesgo() {
        System.out.println("Calcular riesgo");
        return 1.0;
    }
}