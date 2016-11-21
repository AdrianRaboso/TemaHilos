package Hilos_nov10;

/**
 *
 * @author DIURNO_2
 */
public class Vis20Men extends Thread {

    String mensaje;
    String color;
    Vis20Men otroHilo;
    int contador;
    boolean visPrimerMensaje = false;
    boolean fin = false;

    public Vis20Men(String c, String m) {
        mensaje = m;
        color = c;
    }

    public Vis20Men(String c, String m, int veces) {
        this(c, m);
        contador = veces;
    }

    public void Visualizar20Men() {
        for (int pos = 0; pos < 20; pos++) {
            System.out.println(color + mensaje);
            otroHilo.resume();
            this.suspend();
        }
    }

    public void VisualizarMen() {
        for (int pos = 0; pos < contador; pos++) {
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
        for (int pos = 0; pos < contador && fin == false; pos++) {
            if (this.getName().equals("SegundoHilo") && !otroHilo.visPrimerMensaje) {
                this.suspend();
            }

            System.out.println(color + mensaje + " " + (pos + 1));

            visPrimerMensaje = true;
            otroHilo.resume();
            
            if (otroHilo.isAlive()) {
                otroHilo.resume();
                this.suspend();
            }

            try {
                sleep(1);
            } catch (InterruptedException e) {

            }
        }
        otroHilo.resume();
        otroHilo.fin = true;
    }
}
