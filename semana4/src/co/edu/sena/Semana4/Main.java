package co.edu.sena.Semana4;

public class Main {
    public static void main(String[] args) {
        PolizadeSeguro[] polizas = new PolizadeSeguro[2];
             polizas[0] =  new SegurodeVida(6, "seguro de vida", "Ricardo Montañez", true, 1000000.0, 50, "Masculino");
             polizas[1] =  new SegurodeCoche(7, "seguro de coche", "Naibeth Morales", false, 800000.5, "camaro ss", 2025);


        for (PolizadeSeguro pol : polizas) {
            System.out.println("----------------");
            pol.mostrarDatos();
        }
    }
}
