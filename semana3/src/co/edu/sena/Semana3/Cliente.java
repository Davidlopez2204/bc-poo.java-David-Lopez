package co.edu.sena.Semana3;

public class Cliente {
    private String nombre;
    private long identificacion;
    private String direccion;
    private long telefono;
    private String correoelectronico;

    public Cliente(String nombre, long identificacion, String direccion, long telefono, String correoelectronico) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
    }

    public Cliente(String nombre, long identificacion, String direccion) {
        this(nombre, identificacion, direccion, 0L, "null");
    }

    public void mostrarinformacion() {
        System.out.println("\n---cliente---");
        System.out.println("nombre: " + this.getNombre());
        System.out.println("identificación " + this.getIdentificacion());
        System.out.println("dirección: " + this.getDireccion());
        System.out.println("teléfono: " + this.getTelefono());
        System.out.print("correo electrónico " + this.getCorreoelectronico());
    }

    public String getNombre() {
        return this.nombre;
    }

    public long getIdentificacion() {
        return this.identificacion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public String getCorreoelectronico() {
        return this.correoelectronico;
    }

    public void setCorreoelectronico(String nuevoCorreoelectronico) {
        if (nuevoCorreoelectronico != null && nuevoCorreoelectronico.contains("@")) {
            this.correoelectronico = nuevoCorreoelectronico;
        } else {
            System.out.println("Error de validación: el correo electrónico es invalido.");
        }
    }

    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            this.nombre = nuevoNombre;
        } else {
            System.out.println("Error de validación: el nombre del cliente no puede estar vació.");
        }

    }
}
