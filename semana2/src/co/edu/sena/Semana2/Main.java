package co.edu.sena.Semana2;

import co.edu.sena.Semana1.Cliente;

public class Main {
    public static void main(String[] args) {


        Cliente cliente3 = new Cliente("Maria Patiño", 108798654444L, "carrera 145", 32245678790L, "Maria@.com");
        Cliente cliente4 = new Cliente("Jesus Cardonado",1234567890L,"calle 40", 32145678970L,"Jesus@hotmail.com");

        SegurodeCoche polizadecoche1 = new SegurodeCoche("chevrolet", "camaro ss", 2018, 19500000, "amarillo");

        SegurodeVida polizadevida1 = new SegurodeVida(cliente3, 60, "femenino", 90, 1000000.0);
        SegurodeVida polizadevida2 = new SegurodeVida(cliente4,40,"Masculino",90,1000000.0);

        Seguros compania = new Seguros("Seguros total");

        compania.AgregarSeguro(polizadevida1);
        compania.AgregarSeguro(polizadevida2);


        System.out.println("------------------");
        compania.MostrarTodosSeguros();
        System.out.println("total de polizas registradas: " + compania.ContarSeguros());
        System.out.println();
        System.out.println("------------------");
        polizadecoche1.InformacionCoche();
        System.out.println("------------------");
        System.out.println("duracion estimada de Maria Patiño: " +  polizadevida1.DuracionEstimada() + "años");
        System.out.println();
        System.out.println("duracion estimada de Jesus Cardonado: " + polizadevida2.DuracionEstimada() + "años");


    }


}

