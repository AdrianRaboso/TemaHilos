package Hilos_nov17;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DIURNO_2
 */
public class ImagenMov extends JButton implements Runnable {

    JFrame ventana;
    ImageIcon img = new ImageIcon("giphy.gif");
    int ancho, alto;

    public ImagenMov() {
        this.setIcon(img);
        setSize(img.getIconWidth(), img.getIconHeight());
    }

    public ImagenMov(JFrame ventana) {
        this.ventana = ventana;
        ImageIcon img = new ImageIcon("giphy.gif");
        this.setIcon(img);
        setSize(img.getIconWidth(), img.getIconHeight());
        ancho = (int) (Math.random() * 400);
        alto = (int) (Math.random() * 400);
        setLocation(ancho, alto);
    }

    @Override
    public void run() {
        int anchoVentana;
        int altoVentana;

        while (true) {
            ancho += 1;
            alto += 1;
            anchoVentana = ventana.getWidth();
            altoVentana = ventana.getHeight();
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
            setLocation(ancho, alto);
            if (ancho >= (anchoVentana - this.getWidth())) {
                ancho = 0;
            }
            if (alto >= (altoVentana - this.getHeight())) {
                alto = 0;
            }
            System.out.println("sigo");
        }

    }

}
