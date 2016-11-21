package Hilos_nov03;

/**
 *
 * @author DIURNO_2
 */
public class Vis20Men extends Thread {

    String mensaje;
    String color;
    Vis20Men otroHilo;
    boolean visPrimerMensaje = false;

    public Vis20Men(String c, String m) {
        mensaje = m;
        color = c;
    }

    public void Visualizar20Men() {
        for (int pos = 0; pos < 20; pos++) {
            System.out.println(color + mensaje);
            otroHilo.resume();
            this.suspend();
        }
    }

    public void setOtroHilo(Vis20Men otroHilo) {
        this.otroHilo = otroHilo;
    }

    @Override
    public void run() {
        //Visualizar20Men();
        for (int pos = 0; pos < 20; pos++) {
            if (this.getName().equals("SegundoHilo") && !otroHilo.visPrimerMensaje) {
                this.suspend();
            }
            System.out.println(color + mensaje);
            this.visPrimerMensaje = true;
            otroHilo.resume();
            if (otroHilo.isAlive()) {
                otroHilo.resume();
                this.suspend();
            }

            try {
                sleep(1);
            } catch (InterruptedException e) {

            }
            otroHilo.resume();
        }
    }
}
