package co.edu.sena.Semana4;

public class SegurodeVida extends PolizadeSeguro {
    private int edad;
    private String genero;

    public SegurodeVida(int numeródepoliza, String tipo, String titular, boolean vigencia, double primaMensual, int edad, String genero) {
        super(numeródepoliza, tipo, titular, vigencia, primaMensual);
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public double calcularRiesgo() {
        int duracionMaxima = 90;
        int FactordeEdad = duracionMaxima - this.edad;
        double riesgoBase = 0.5;

        if (this.genero.equalsIgnoreCase("Femenino")) {
            riesgoBase = 0.4;
        }

        return FactordeEdad * riesgoBase;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Edad: " + this.edad);
        System.out.println("Riesgo calculado: " + this.calcularRiesgo());
    }
}

