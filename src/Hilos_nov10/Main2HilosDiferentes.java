package Hilos_nov10;


/**
 *
 * @author DIURNO_2
 */
public class Main2HilosDiferentes {

    public static void main(String[] args) {
        Vis20Men hilo1 = new Vis20Men("\tHola 1", Colores.Colores.VERDE, 10);
        Vis20Men hilo2 = new Vis20Men("Hola 2", Colores.Colores.AZUL, 100);
        
        hilo1.setName("PrimeroHilo");
        hilo2.setName("SegundoHilo");

        hilo1.setOtroHilo(hilo2);
        hilo2.setOtroHilo(hilo1);

        hilo1.start();
        hilo2.start();
    }
}
