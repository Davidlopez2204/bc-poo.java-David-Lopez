package co.edu.sena.Semana3;

public class Main {
    public static void main(String[] args) {

        Cliente cliente5 = new Cliente("Sofia Prieto", 1236576890L, "autopista #5-45", 32145678765L, "Sofia@hotmail.com");
        SegurodeVida polizadevida3 = new SegurodeVida(cliente5, 20, "femenino", 90, (double) 1000000.0F);

        System.out.println("\n---Validaciones---");
        System.out.println();
        cliente5.mostrarinformacion();
        System.out.println();
        System.out.println("Duracion: " + polizadevida3.getDuracion());
        System.out.println("\n-------------------------");
        System.out.println("(invalida )asignación de edad | edad asignada: 100 años ");
        polizadevida3.setEdad(100);
        System.out.println("\n-------------------------");
        System.out.println("(valida) asignación de edad | edad asignada: 80 años.");
        polizadevida3.setEdad(80);
        System.out.println("\n-------------------------");
        System.out.println("(invalida) asignación de precio | precio asignado: -500000");
        polizadevida3.setPrecio((double) -500000.0F);
        System.out.println("\n-------------------------");
        System.out.println("(valida) asignación de precio | precio asignado: 500000.0.");
        polizadevida3.setPrecio((double) 500000.0F);
        System.out.println("\n-------------------------");
        System.out.println("(invalido) asignación de Correo electrónico | correo electrónico asignado: Sofia.com");
        cliente5.setCorreoelectronico("Sofia.com");
        System.out.println("\n-------------------------");
        System.out.println("(valida) asignación de Correo electrónico | correo electronico asignado: SofiaP@.com");
        cliente5.setCorreoelectronico("SofiaP@.com");
        System.out.println("\n-------------------------");
        System.out.println("(invalida) asignación de nombre | nombre asignado: vació");
        cliente5.setNombre("");
        System.out.println("\n-------------------------");
        System.out.println("(valida) asignación de nombre | nombre asignado: Helen Prado.");
        cliente5.setNombre("Helen Prado");
        System.out.println("\n-------------------------");
        System.out.println("Estado final");
        System.out.println();
        System.out.println("edad final: " + polizadevida3.getEdad());
        System.out.println("duración final estimada: " + polizadevida3.DuracionEstimada() + " años. ");
        System.out.println("precio de poliza final: " + polizadevida3.getPrecio());
        System.out.println("correo electrónico asignado: " + cliente5.getCorreoelectronico());
        System.out.println("nombre asignado: " + cliente5.getNombre());
    }
}
