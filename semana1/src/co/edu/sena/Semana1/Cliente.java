package co.edu.sena.Semana1;

// creacion de objeto

public class Cliente {

    // asignación de atributos

    private String nombre;
    private long identificacion;
    private String direccion;
    private long telefono;
    private String correoelectronico;

    // constructor

    public Cliente(String nombre, long identificacion, String direccion, long telefono, String correoelectronico) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
    }

    public Cliente() {
    }

    // asignación de metodos

    public void mostrarinformacion() { // metodo void
        System.out.println("\n---cliente---");
        System.out.println("nombre: " + nombre);
        System.out.println("identificacion " + identificacion);
        System.out.println("direccion: " + direccion);
        System.out.println("telefono: " + telefono);
        System.out.print("correo electronico " + correoelectronico);
    }

    public String getnombre() { // asignacion de getter

        return nombre;
    }

    public void setnombre(String nombre) { // asignacion de setter

        this.nombre = nombre;
    }
}