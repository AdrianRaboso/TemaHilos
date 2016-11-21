package Hilos_nov17;

/**
 *
 * @author DIURNO_2
 */
public class VentanaJuego extends javax.swing.JFrame {

    Reloj reloj;
    ImagenMov imagenBtn;
    Thread hilo;

    public VentanaJuego() {
        initComponents();
        imagenBtn = new ImagenMov(this);
        reloj = new Reloj(jLabelReloj);
        this.add(imagenBtn);
        this.setLocation(0, 0);
        hilo = new Thread(imagenBtn);
        hilo.start();
        Thread hiloReloj = new Thread(reloj);
        hiloReloj.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        jLabelReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnContinuar.setText("Mover");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jButtonParar.setText("Parar");
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPararActionPerformed(evt);
            }
        });

        jLabelReloj.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(75, 75, 75)
                .addComponent(jLabelReloj)
                .addGap(84, 84, 84)
                .addComponent(jButtonParar)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonParar)
                            .addComponent(jLabelReloj)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnContinuar)))
                .addContainerGap(660, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPararActionPerformed
        hilo.suspend();
    }//GEN-LAST:event_jButtonPararActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        hilo.resume();
    }//GEN-LAST:event_btnContinuarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton jButtonParar;
    public javax.swing.JLabel jLabelReloj;
    // End of variables declaration//GEN-END:variables
}
