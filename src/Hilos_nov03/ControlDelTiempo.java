package Hilos_nov03;

/**
 *
 * @author DIURNO_2
 */
public class ControlDelTiempo extends Thread {

    long tiempo;
    boolean cerrar = false;

    public ControlDelTiempo(long t) {
        tiempo = t;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(tiempo);
            System.out.println("Se te ha acabado el tiempo.");
            System.exit(0);
        } catch (InterruptedException ex) {
            System.out.println("Se cierra el hilo.");
        }
    }
}
