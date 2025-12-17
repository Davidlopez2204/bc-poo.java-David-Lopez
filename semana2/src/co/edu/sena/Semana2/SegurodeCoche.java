package co.edu.sena.Semana2;

public class SegurodeCoche {

    private String marca;
    private String modelo;
    private int año;
    private int precio;
    private String color;

    public SegurodeCoche(String marca, String modelo, int año, int precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.color = color;
    }

    // asignamos metodos
    public void InformacionCoche() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("año de fabricación: " + año);
        System.out.println("precio: " + precio);
        System.out.println("color: " + color);
    }

    // asignamos metodo de negocio
    // el return devuelve el valor del descuento
    public double ObtenerDescuento() {

        double porcentajedescuento = 0.0;

        // determinamos el porcentaje a aplicar
        if (this.año >= 2024) {
            // si el año es mayor o igual a 2024
            porcentajedescuento = 15.0;
            // se le aplica este porcentaje
        } else if (this.año >= 2010) {
            // si el año es mayor o igual a 2020
            porcentajedescuento = 5.0;
            // se aplica este porcentaje
        }

        // se hace la operacion para asignar descuento
        double ValorDescuento = this.precio * (porcentajedescuento / 100);

        return ValorDescuento;
    }
}


