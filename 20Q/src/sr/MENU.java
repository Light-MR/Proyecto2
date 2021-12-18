package sr;
import java.util.Scanner;

/**
 * Pestaña gráfica que representa el menu con las
 * opciones que el usuario podra escoger
 * 
 * @author Reyes Ramos Luz María 318211073
 * @author Vargas Gutiérrez Julieta 318341945
 * @version 2.0 Diciembre 11, 2021
 * @since EDD-2022-1
 */
public class MENU extends javax.swing.JFrame {
    
     private Scanner consola = new Scanner(System.in);
     private TwentyQuestions game = new TwentyQuestions();

    /**
     * Creates new form MENU
     */
    public MENU() {
        initComponents();
      // this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        QFOrden = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        QOrdenA = new javax.swing.JButton();
        AOrdenA = new javax.swing.JButton();
        AFOrden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QFOrden.setBackground(new java.awt.Color(102, 153, 255));
        QFOrden.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        QFOrden.setText("PREGUNTAS EN ORDEN QUE FUERON AGREGADAS");
        QFOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QFOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(QFOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 500, 50));

        jugar.setBackground(new java.awt.Color(102, 153, 255));
        jugar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 500, 50));

        QOrdenA.setBackground(new java.awt.Color(102, 153, 255));
        QOrdenA.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        QOrdenA.setText("PREGUNTAS EN ORDEN ALFABÉTICO");
        QOrdenA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QOrdenAActionPerformed(evt);
            }
        });
        getContentPane().add(QOrdenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 500, 50));

        AOrdenA.setBackground(new java.awt.Color(102, 153, 255));
        AOrdenA.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        AOrdenA.setText("RESPUESTAS ORDEN EN ORDEN ALFABÉTICO");
        AOrdenA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AOrdenAActionPerformed(evt);
            }
        });
        getContentPane().add(AOrdenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 500, 50));

        AFOrden.setBackground(new java.awt.Color(102, 153, 255));
        AFOrden.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        AFOrden.setText("RESPUESTAS  EN ORDEN QUE FUERON AGREGADAS");
        AFOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(AFOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 500, 50));

        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jButton2.setText("TERMINAR JUEGO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bmenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QFOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QFOrdenActionPerformed
        game.getGameTree().getQuestionsList().sortArrayListDate(game.getGameTree().getQuestionsList());
    }//GEN-LAST:event_QFOrdenActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
     
       int option;
        while (true) {
            try {
                System.out.println(
                        "\t[1] Jugar.\n" +
                                "\t[2] Salir. \n" +
                                "\t\t Ingrese su opción:");
                option = Integer.parseInt(consola.nextLine());
                switch (option) {
                    case 1:
                        game.playGame();
                        break;
                    case 2:

                        System.out.println("\n\t ESCOGE UNA NUEVA OPCIÓN.");
                        try {

                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        return;
         
                    default:
                        System.out.println("\n\tUps! esa opcion aun no esta disponible crack ;)");
                        break;
                }

            } catch (Exception e) {
                System.out.println("\n\tTypee una una entrada valida, solo las opciones disponibles en este menu :(.");
            }
        }
    }//GEN-LAST:event_jugarActionPerformed

    private void QOrdenAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QOrdenAActionPerformed
       game.getGameTree().getQuestionsList().sortAlpha(game.getGameTree().getQuestionsList());
    }//GEN-LAST:event_QOrdenAActionPerformed

    private void AOrdenAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AOrdenAActionPerformed
        game.getGameTree().getFruiList().sortAlpha(game.getGameTree().getFruiList());
    }//GEN-LAST:event_AOrdenAActionPerformed

    private void AFOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFOrdenActionPerformed
        game.getGameTree().getFruiList().sortArrayListDate(game.getGameTree().getFruiList());
    }//GEN-LAST:event_AFOrdenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        MainJFrame back = new MainJFrame();  
        back.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AFOrden;
    private javax.swing.JButton AOrdenA;
    private javax.swing.JButton QFOrden;
    private javax.swing.JButton QOrdenA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jugar;
    // End of variables declaration//GEN-END:variables
}
