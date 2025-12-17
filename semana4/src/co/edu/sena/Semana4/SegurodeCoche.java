package co.edu.sena.Semana4;

public class SegurodeCoche extends PolizadeSeguro {
    private String modelo;
    private int anoFabricacion;

    public SegurodeCoche(int numeródepoliza, String tipo, String titular, boolean vigencia, double primaMensual, String modelo, int anoFabricacion) {
        super(numeródepoliza, tipo, titular, vigencia, primaMensual);
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public double calcularRiesgo() {
        int añoActual = 2025;
        int AntiguedadCoche = añoActual - this.anoFabricacion;
        double FactordeRiesgo = 1.0;

        if (AntiguedadCoche > 5) {
            FactordeRiesgo = 1.5;
        } else if (AntiguedadCoche < 5) {
            FactordeRiesgo = 0.8;
        }

        return FactordeRiesgo * primaMensual;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("modelo: " + this.modelo);
        System.out.println("año de fabricacion " + this.anoFabricacion);
        System.out.println(" Riesgo calculado " + this.calcularRiesgo());
    }
}