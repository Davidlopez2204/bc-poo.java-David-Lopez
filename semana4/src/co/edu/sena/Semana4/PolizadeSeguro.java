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

    public double primamensual() { // calculo de prima mensual
        return primaMensual * 12;
    }

    public int getNumerodepoliza() {
        return numerodepoliza;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public double getPrimaMensual() {
        return primaMensual;
    }

    public void setvigencia(boolean vigencia) { // asignacion setter
        this.vigencia = vigencia;
    }

    public void setNumerodepoliza(int numerodepoliza) {
        this.numerodepoliza = numerodepoliza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setPrimaMensual(double primaMensual) {
        this.primaMensual = primaMensual;
    }

    public double calcularRiesgo() {
        System.out.println("Calcular riesgo");
        return 1.0;
    }
}