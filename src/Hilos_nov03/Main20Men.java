package Hilos_nov03;

import java.util.Scanner;

/**
 *
 * @author DIURNO_2
 */
public class Main20Men {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        Vis20Men[] objeto = new Vis20Men[5];
        String[] colores = new String[]{Colores.Colores.MORADO, Colores.Colores.ROJO, Colores.Colores.VERDE, Colores.Colores.CIAN, Colores.Colores.AMARILLO};

        System.out.print("Inserte el mensaje: ");
        String mensaje = pedir.nextLine();
        objeto[0] = new Vis20Men(colores[0], mensaje);
        objeto[1] = new Vis20Men(colores[1], mensaje);

        objeto[0].setName("PrimeroHilo");
        objeto[1].setName("SegundoHilo");

        objeto[0].setOtroHilo(objeto[1]);
        objeto[1].setOtroHilo(objeto[0]);

        objeto[0].start();
        objeto[1].start();
    }
}
