import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) { // ciclo infinito
            System.out.println("******* Aplicación Calculadora *******");
            mostrarMenu();
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                } // fin IF
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break; // rompe el ciclo y sale
                } else {
                    System.out.println("Opción erronea" + operacion);
                }
                // imprimimos un salto de línea antes de repetir el menú
                System.out.println();
                }catch (Exception e){ // fin TRY, comienzo del catch
                    System.out.println("Ocurrió un error: "+ e.getMessage());
                    System.out.println();
                } // fin CATCH
        } // fin WHILE
    } // fin MAIN
    private static void mostrarMenu(){
        // Mostramos el menú
        System.out.println("""
                       1. Suma               
                       2. Resta
                       3. Multiplicación
                       4. División
                       5. Salir
                    """);

        System.out.print("Operacion a realizar: ");
    } // fin método mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Ingrese el valor para el operando 1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese el valor para el operando 2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la división es: " + resultado);
            }
            default -> System.out.println("Opción incorrecta" + operacion);
        } // fin del SWITCH
    } // fin metodo ejecutarOperacion

} // fin CLASE
