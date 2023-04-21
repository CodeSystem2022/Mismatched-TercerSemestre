
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        
        Monitor monitor02 = new Monitor("LG", 16);
        Monitor monitor03 = new Monitor("Sonic", 32);
        Monitor monitor04 = new Monitor("Samsung", 22);
        Monitor monitor05 = new Monitor("Asus", 14);
        Monitor monitor06 = new Monitor("Gigabyte", 24);
        Monitor monitor07 = new Monitor("Asus", 27);
        Monitor monitor08 = new Monitor("Samsung", 21);
        Monitor monitor09 = new Monitor("AOC", 23);
        Monitor monitor10 = new Monitor("Sentey", 15);
        Monitor monitor11 = new Monitor("asdasd", 19);
        
        Teclado teclado02 = new Teclado("USB", "Sentey");
        Teclado teclado03 = new Teclado("USB", "Razer");
        Teclado teclado04 = new Teclado("2.4GHZ", "Logitech");
        Teclado teclado05 = new Teclado("USB", "Sentey");
        Teclado teclado06 = new Teclado("2.4GHZ", "Redragon");
        Teclado teclado07 = new Teclado("BLUETOOTH", "");
        Teclado teclado08 = new Teclado("USB", "Redragon");
        Teclado teclado09 = new Teclado("2.4GHZ", "HP");
        Teclado teclado10 = new Teclado("BLUETOOTH", "Silla");
        Teclado teclado11 = new Teclado("BLUETOOTH", "Logitech");
        
        Raton raton02 = new Raton("USB","Redragon");
        Raton raton03 = new Raton("2.4GHZ","Razer");
        Raton raton04 = new Raton("USB","Razer");
        Raton raton05 = new Raton("BLUETOOTH","Logitech");
        Raton raton06 = new Raton("USB","Logitech");
        Raton raton07 = new Raton("2.4GHZ","Acer");
        Raton raton08 = new Raton("USB","Silla");
        Raton raton09 = new Raton("USB","Acer");
        Raton raton10 = new Raton("2.4GHZ","Silla");
        Raton raton11 = new Raton("BLUETOOTH","Mesa");
        
        Computadora computadora02 = new Computadora("Computadora 02", monitor02, teclado02, raton02);
        Computadora computadora03 = new Computadora("Computadora 03", monitor03, teclado03, raton03);
        Computadora computadora04 = new Computadora("Computadora 04", monitor04, teclado04, raton04);
        Computadora computadora05 = new Computadora("Computadora 05", monitor05, teclado05, raton05);
        Computadora computadora06 = new Computadora("Computadora 06", monitor06, teclado06, raton06);
        Computadora computadora07 = new Computadora("Computadora 07", monitor07, teclado07, raton07);
        Computadora computadora08 = new Computadora("Computadora 08", monitor08, teclado08, raton08);
        Computadora computadora09 = new Computadora("Computadora 09", monitor09, teclado09, raton09);
        Computadora computadora10 = new Computadora("Computadora 10", monitor10, teclado10, raton10);
        Computadora computadora11 = new Computadora("Computadora 11", monitor11, teclado11, raton11);
        
        
        Orden orden01 = new Orden();//Inicializamos el arreglo vacio
        Orden orden02 = new Orden();
        Orden orden03 = new Orden();
        
        orden01.agregarComputadora(computadoraHP);
        orden01.agregarComputadora(computadora02);
        
        orden02.agregarComputadora(computadora03);
        orden02.agregarComputadora(computadora05);
        orden02.agregarComputadora(computadora07);
        orden02.agregarComputadora(computadora09);
        
        orden03.agregarComputadora(computadora02);
        orden03.agregarComputadora(computadora03);
        orden03.agregarComputadora(computadora04);
        orden03.agregarComputadora(computadora06);
        orden03.agregarComputadora(computadora05);
        orden03.agregarComputadora(computadora07);
        orden03.agregarComputadora(computadora08);
        orden03.agregarComputadora(computadora09);
        orden03.agregarComputadora(computadora10);
        orden03.agregarComputadora(computadora11);
        
        orden01.mostrarOrden();
        orden02.mostrarOrden();
        orden03.mostrarOrden();
        
        //superando limite
        orden03.agregarComputadora(computadoraHP);
        
    }
}
