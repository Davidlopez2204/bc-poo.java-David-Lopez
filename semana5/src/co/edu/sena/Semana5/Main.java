package co.edu.sena.Semana5;

public class Main {

    public static void main(String[] args) {

        Seguros compania = new Seguros("Protección Total");

        PolizadeSeguro seguroVida = new SegurodeVida(
                8,
                "Seguro de Vida",
                "Ana Perez",
                true,
                120000,
                65,
                "Femenino"
        );

        PolizadeSeguro seguroCoche = new SegurodeCoche(
                9,
                "Seguro de Coche",
                "Alejandro Avila",
                true,
                200000,
                "Toyota",
                2024
        );


        compania.agregarPoliza(seguroVida);
        compania.agregarPoliza(seguroCoche);

        compania.mostrarTodas();
    }
}
