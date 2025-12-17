package co.edu.sena.Semana5;

public class PolizadeSeguro {

    protected int numerodepoliza;
    protected String tipo;
    protected String titular;
    protected boolean vigencia;
    protected double primaMensual;

    public PolizadeSeguro(int numerodepoliza, String tipo, String titular,
                          boolean vigencia, double primaMensual) {

        this.numerodepoliza = numerodepoliza;
        this.tipo = tipo;
        this.titular = titular;
        this.vigencia = vigencia;
        this.primaMensual = primaMensual;
    }

    public void mostrarDatos() {
        System.out.println("\n--- POLIZA ---");
        System.out.println("Número de póliza: " + numerodepoliza);
        System.out.println("Tipo de póliza: " + tipo);
        System.out.println("Titular: " + titular);
        System.out.println("Vigencia: " + (vigencia ? "Vigente" : "No vigente"));
        System.out.println("Prima mensual: " + primaMensual);
    }


    public double calcularRiesgo() {
        return 1.0;
    }
}
