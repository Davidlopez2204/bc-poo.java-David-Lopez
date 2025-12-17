package co.edu.sena.Semana5;

public class SegurodeVida extends PolizadeSeguro {

    protected int edad;
    protected String genero;

    public SegurodeVida(int numerodepoliza, String tipo, String titular,
                        boolean vigencia, double primaMensual,
                        int edad, String genero) {

        super(numerodepoliza, tipo, titular, vigencia, primaMensual);
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public double calcularRiesgo() {
        if (edad > 60) {
            return 2.0;
        }
        return 1.2;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Riesgo calculado: " + calcularRiesgo());
    }
}
