package co.edu.sena.Semana3;

public class SegurodeVida {
    private Cliente cliente;
    private int edad;
    private String genero;
    private int duracion;
    private double precio;

    public SegurodeVida(Cliente cliente, int edad, String genero, int duracion, double precio) {
        this.cliente = cliente;
        this.edad = edad;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
    }

    public SegurodeVida(Cliente cliente, int edad, String genero) {
        this(cliente, edad, genero, 0, 0.0);
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0 && nuevaEdad <= 90) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Error de validacion: la edad debe ser entre 1 y 90 años");
        }

    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= (double)0.0F) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("Error de validacion: El precio de la poliza debe ser positivo ");
        }

    }

    public int DuracionEstimada() {
        int DuracionBase = 30;
        int DuracionMaxima = 90;
        if (this.getGenero() != null && this.getGenero().equalsIgnoreCase("femenino")) {
            DuracionBase += 5;
        }

        int DuracionMaximaPosible = DuracionMaxima - this.getEdad();
        int DuracionFinal = Math.min(DuracionBase, DuracionMaximaPosible);
        return Math.max(0, DuracionFinal);
    }
}
