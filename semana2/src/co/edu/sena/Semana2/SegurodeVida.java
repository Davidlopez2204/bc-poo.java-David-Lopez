package co.edu.sena.Semana2;

// creamos la clase SegurodeVida
import co.edu.sena.Semana1.Cliente;

// atributos asignados
public class SegurodeVida {

    private Cliente cliente;
    private int edad;
    private String genero;
    private int duracion;
    private double precio;

    // asignamos constructor
    public SegurodeVida(Cliente cliente, int edad, String genero, int duracion, double precio) {
        this.cliente = cliente;
        this.edad = edad;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
    }

    // asignamos metodos
    public void InformacionSegurosdeVida() {
        System.out.println("nombre: " + cliente.getnombre());
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);
        System.out.println("duracion: " + duracion);
        System.out.println("precio: " + precio);
    }

    // metodo de negocio
    public int DuracionEstimada() {

        int DuracionBase = 30;
        int DuracionMaxima = 90;

        // determinamos la duracion
        // ajuste por Genero
        // este comando realiza que si es femenino se le agrega 5 años de duracion a la DuracionBase.
        if (this.genero != null && this.genero.equalsIgnoreCase("femenino")) {
            // equalsIgnoreCase no distingue comparacion entre mayusculas y minisculas
            DuracionBase = DuracionBase + 5;
            // el && es para determinar que ambas condiciones deben cumplirce llamado operador logico AND
        }

        // != null verifica que el this.genero no sea nullo para evitar errores

        // limitar la duracion de edad maxima
        int DuracionMaximaPosible = DuracionMaxima - this.edad;

        // valor final
        int DuracionFinal = Math.min(DuracionBase, DuracionMaximaPosible);
        // Math.min es el metodo que devuelve el menor valor entre dos argumentos.

        return Math.max(0, DuracionFinal);
        // devuelve el mayor valor que recibe siendo este caso DuracionFinal
    }
}
