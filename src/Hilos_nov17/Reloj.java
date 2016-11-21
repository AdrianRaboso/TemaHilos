package Hilos_nov17;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author DIURNO_2
 */
public class Reloj implements Runnable {

    int hora, minutos, segundos;
    String horaCompleta;
    Calendar calendario;
    JLabel reloj;
    
    public Reloj(JLabel label){
        reloj = label;
    }
    
    @Override
    public void run() {
        while (true) {
            calendario = Calendar.getInstance();
            hora = calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);
            horaCompleta = hora + ":" + minutos + ":" + segundos;

            reloj.setText(horaCompleta);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
