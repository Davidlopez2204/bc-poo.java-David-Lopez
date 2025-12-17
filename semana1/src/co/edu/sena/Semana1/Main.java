package co.edu.sena.Semana1;

public class Main { // crear clase Main

    public static void main(String[] args) {
        System.out.println("=== informacion personal===");

        // CREAR CLIENTES

        Cliente cliente1 = new Cliente("juan lopez", 1027546765L, "calle 60", 3017654503L, "juan@lopez");
        Cliente cliente2 = new Cliente("juana camargo", 87654365L, "carrera 45", 31076598970L, "juana@gmail.com");

        // CREAR POLIZA

        PolizadeSeguro polizadeSeguro1 = new PolizadeSeguro(00001, "seguro de vida", "juan lopez", true, 600.0);
        PolizadeSeguro polizadeSeguro2 = new PolizadeSeguro(00002, "seguro de coche", "juana camargo", false, 200.5);

        // FUNCIONALIDAD de los objetos

        System.out.println("\n===CLIENTES===");
        cliente1.mostrarinformacion(); // muestra toda la informacion del cliente
        System.out.println(); // salto de linea
        cliente2.mostrarinformacion();
        System.out.println();
        System.out.println("\nnombre ANTES del cambio: " + cliente2.getnombre()); //obtiene informacion que se encuentra en nombre
        cliente2.setnombre("ana ramirez"); // asigna un nombre nuevo
        System.out.println();
        System.out.println("\n---cambio de nombre---");
        cliente2.mostrarinformacion(); // mostramos otra vez la informacion pero actualizado con el nuevo nombre

        System.out.println();
        polizadeSeguro1.mostrardatos(); // mostrar datos de la poliza del cliente
        System.out.println("\n prima mensual: " + polizadeSeguro1.primamensual()); // llama el calculo de la primamensual y la imprime con el resultado
        System.out.println();
        System.out.println("\n ===Solo el saber el numero de poliza===");
        System.out.println("\n numero de poliza: " + polizadeSeguro1.getNumerodepoliza()); // llama solo el numero de poliza identificado y lo imprime
        polizadeSeguro2.mostrardatos();
        System.out.println("\n prima mensual: " + polizadeSeguro2.primamensual()); // realiza el mismo llamado pero con la segunda primamensual
        polizadeSeguro2.setvigencia(true); // actualiza el dato de vigencia a true (vigente)
        System.out.println("\n ----cambio de vigencia----");
        polizadeSeguro2.mostrardatos(); // vuelve a mostar datos
    }

}
