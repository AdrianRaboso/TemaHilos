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

    public ImagenMov() {
        this.setIcon(img);
        setSize(img.getIconWidth(), img.getIconHeight());
    }

    public ImagenMov(JFrame ventana) {
        this.ventana = ventana;
        ImageIcon img = new ImageIcon("giphy.gif");
        this.setIcon(img);
        setSize(img.getIconWidth(), img.getIconHeight());
    }

    @Override
    public void run() {
        int ancho = 0, alto = 0;
        int anchoVentana;
        int altoVentana;
        
        while (true) {
            anchoVentana = ventana.getWidth();
            altoVentana = ventana.getHeight();
            ancho += 10;
            alto += 10;
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
            setLocation(ancho, alto);
            if (ancho >= (anchoVentana - this.getWidth())) {
                ancho = 0;
            }
            if (alto >= (altoVentana - this.getHeight())) {
                alto = 0;
            }
        }

    }

}
