package co.edu.sena.Semana5;

public class SegurodeCoche extends PolizadeSeguro {

    private String marca;
    private int modelo;

    public SegurodeCoche(int numerodepoliza, String tipo, String titular,
                         boolean vigencia, double primaMensual,
                         String marca, int modelo) {

        super(numerodepoliza, tipo, titular, vigencia, primaMensual);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public double calcularRiesgo() {
        if (modelo >= 2023) {
            return 0.8;
        }
        return 1.5;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Riesgo calculado: " + calcularRiesgo());
    }
}
