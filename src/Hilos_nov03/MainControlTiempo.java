package Hilos_nov03;

import java.util.Scanner;

/**
 *
 * @author DIURNO_2
 */
public class MainControlTiempo {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        
        System.out.print("Indique el tiempo que va a dejar al usuario: ");
        long tiempo = pedir.nextLong();
        pedir.nextLine();
        
        ControlDelTiempo tiempoLogin = new ControlDelTiempo(tiempo);
        tiempoLogin.start();
        System.out.print("Indique su nombre: ");
        String clave = pedir.nextLine();
        System.out.println("Bien, le ha dado tiempo. Nombre: " + clave);
        tiempoLogin.interrupt();
        //tiempoLogin.setCerrar(true);
        //Arrancar 5 hilos y cada tarea tiene que visualizar 20 mensajes cada uno de un color
    }

}
