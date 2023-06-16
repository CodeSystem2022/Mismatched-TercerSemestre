import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menú
        var salir = false;

        while(!salir){
            mostrarMenu();
            System.out.println();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch(Exception e){
                System.out.println("Ocurrió un error: "+ e.getMessage());
            }
        } // fin WHILE
    } // fin MAIN

    private static void  mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                *******Listado de Personas*******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Ingrese una Opción: ");
    } // fin método mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Revisamos la opcion digitada a través de un SWITCH
        switch (opcion){
            case 1 ->{//Agregamos una persona a la lista
                System.out.print("Ingrese el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Ingrese el teléfono: ");
                var telefono = entrada.nextLine();
                System.out.print("Ingrese el correo: ");
                var email = entrada.next();
                // creamos el objeto persona
                var persona = new Persona(nombre, telefono, email);
                // Agregamos la persona a la Lista
                personas.add(persona);
                System.out.println("La lista tiene: "+ personas.size()+" elementos.");
            } // fin CASO 1
            case 2 ->{// Listar a la personas
                System.out.println("Listado de Personas: ");
                // Mejoras con Lambda y el método de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            } // fin CASO 2
            case 3 ->{// salir del CICLO
                System.out.println("Hasta pronto...");
                salir = true;
            } // fin CASE 3
            default -> System.out.println("Opción incorrecta: "+ opcion);
        } // fin del SWITCH
        return salir;
    }// fin ejecutarOperacion
} // fin Clase ListarPersonaApp
