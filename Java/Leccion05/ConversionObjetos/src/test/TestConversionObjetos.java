package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); // Si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura(); // No se puede hacer
        //Downcasting
        //((Escritor)empleado).getTipoEscritura(); // Tenemos 2 opciones: Primera opcion (1/2)
        Escritor escritor = (Escritor)empleado; // Segunda opcion (2/2)
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
