/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softwaremotor;

import SerialCommunication.ConnectionSerial;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;

/**
 *
 * @author junio
 */
public class Home extends javax.swing.JFrame {
    ConnectionSerial con = new ConnectionSerial();
    String message = "";
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        con.Connect("COM3", 115200, listener);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(849, 517));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SOFTWARE MOTOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PULSAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PULSAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PULSAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REGISTROS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Girar hacia la izquierda:");

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Girar hacia la derecha:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("LED:");

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        con.Disconnect();
        System.exit(0);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Registros().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer accionE = 1;
        Integer accionA = 3;
        String dispositivo = "Motor";
        try {
            Connection conn = DatabaseConnection.connect();
            if (conn != null) {
                String queryV = "SELECT * FROM record WHERE dispositivo = ? ORDER BY id DESC LIMIT 1";
                String query = "INSERT INTO record(accion, dispositivo) VALUES(?,?)";
                try (PreparedStatement stmtV = conn.prepareStatement(queryV)) {
                    stmtV.setString(1, dispositivo);
                    try (ResultSet rs = stmtV.executeQuery()) {
                        if (rs.next()) {
                            int accion = rs.getInt("accion");
                            if (accion == 1) {
                                con.Send("MOTOR_OFF");
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionA);
                                    stmt.setString(2, dispositivo);
                                    int rsA = stmt.executeUpdate();
                                    if (rsA > 0) {
                                        System.out.println("Motor apagado.");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            } else {
                                con.Send("MOTOR_IZQUIERDA");
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionE);
                                    stmt.setString(2, dispositivo);
                                    int rsE = stmt.executeUpdate();
                                    if (rsE > 0) {
                                        System.out.println("Motor encendido hacia la izquierda");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            }
                        } else {
                            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                stmt.setInt(1, accionE);
                                stmt.setString(2, dispositivo);
                                int rsE = stmt.executeUpdate();
                                if (rsE > 0) {
                                    System.out.println("Motor encendido hacia la izquierda");
                                } else {
                                    System.out.println("No se inserto ningún dato.");
                                }

                            }
                            conn.close();
                        }
                    }

                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Integer accionE = 2;
        Integer accionA = 3;
        String dispositivo = "Motor";
        try {
            Connection conn = DatabaseConnection.connect();
            if (conn != null) {
                String queryV = "SELECT * FROM record WHERE dispositivo = ? ORDER BY id DESC LIMIT 1";
                String query = "INSERT INTO record(accion, dispositivo) VALUES(?,?)";
                try (PreparedStatement stmtV = conn.prepareStatement(queryV)) {
                    stmtV.setString(1, dispositivo);
                    try (ResultSet rs = stmtV.executeQuery()) {
                        if (rs.next()) {
                            int accion = rs.getInt("accion");
                            if (accion == 2) {
                                con.Send("MOTOR_OFF");
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionA);
                                    stmt.setString(2, dispositivo);
                                    int rsA = stmt.executeUpdate();
                                    if (rsA > 0) {
                                        System.out.println("Motor apagado.");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            } else {
                                con.Send("MOTOR_DERECHA");
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionE);
                                    stmt.setString(2, dispositivo);
                                    int rsE = stmt.executeUpdate();
                                    if (rsE > 0) {
                                        System.out.println("Motor encendido hacia la derecha");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            }
                        } else {
                            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                stmt.setInt(1, accionE);
                                stmt.setString(2, dispositivo);
                                int rsE = stmt.executeUpdate();
                                if (rsE > 0) {
                                    System.out.println("Motor encendido hacia la derecha");
                                } else {
                                    System.out.println("No se inserto ningún dato.");
                                }

                            }
                            conn.close();
                        }
                    }

                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Integer accionE = 4;
        Integer accionA = 3;
        String dispositivo = "Led";
        con.Send("TOGGLE_LED");
        try {
            Connection conn = DatabaseConnection.connect();
            if (conn != null) {
                String queryV = "SELECT * FROM record WHERE dispositivo = ? ORDER BY id DESC LIMIT 1";
                String query = "INSERT INTO record(accion,dispositivo) VALUES(?,?)";
                try (PreparedStatement stmtV = conn.prepareStatement(queryV)) {
                    stmtV.setString(1, dispositivo);
                    try (ResultSet rs = stmtV.executeQuery()) {
                        if (rs.next()) {
                            int accion = rs.getInt("accion");
                            if (accion == 4) {
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionA);
                                    stmt.setString(2, dispositivo);
                                    int rsA = stmt.executeUpdate();
                                    if (rsA > 0) {
                                        System.out.println("Led apagado.");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            } else {
                                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                    stmt.setInt(1, accionE);
                                    stmt.setString(2, dispositivo);
                                    int rsE = stmt.executeUpdate();
                                    if (rsE > 0) {
                                        System.out.println("Led encendido");
                                    } else {
                                        System.out.println("No se inserto ningún dato.");
                                    }

                                }
                                conn.close();
                            }
                        } else {
                            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                                stmt.setInt(1, accionE);
                                stmt.setString(2, dispositivo);
                                int rsE = stmt.executeUpdate();
                                if (rsE > 0) {
                                    System.out.println("Led encendido");
                                } else {
                                    System.out.println("No se inserto ningún dato.");
                                }

                            }
                            conn.close();
                        }
                    }

                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        System.out.println("Ejecutando Home...");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home = new Home();
                home.setVisible(true);
                System.out.println("Ventana mostrada");
            }
        });
    }
    
    public static void ExecuteQuery(Integer accion, String dispositivo){
        try (Connection conn = DatabaseConnection.connect()) {
            if (conn != null) {
                String query = "INSERT INTO record(accion, dispositivo) VALUES(?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setInt(1, accion);
                    stmt.setString(2, dispositivo);
                    int resultado = stmt.executeUpdate();
                    if (resultado > 0) {
                        if("Led".equals(dispositivo)){
                           switch(accion){
                               case 4:
                                   System.out.println("Led encendido");
                                   break;
                               case 3:
                                   System.out.println("Led apagado");
                                   break;
                           }
                        }else{
                            switch(accion){
                                case 2:
                                    System.out.println("Motor encendido hacia la derecha");
                                    break;
                                case 3:
                                    System.out.println("Motor apagado");
                                    break;
                                case 1:
                                     System.out.println("Motor encendido hacia la izquierda");
                                     break;
                            }   
                        }
                        System.out.println("Registro guardado en la base de datos: ");
                    } else {
                        System.out.println("No se insertó ningun dato.");
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al registrar en la base de datos: " + e.getMessage());
        }
    }
    
    public final SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
               message= con.Read().trim().toUpperCase();
               System.out.println(message);
               if(message.equals("IZQUIERDA")){
               ExecuteQuery(1, "Motor");
               }
               if(message.equals("DERECHA")){
               ExecuteQuery(2, "Motor");
               }
               if(message.equals("MOTOR APAGADO")){
               ExecuteQuery(3, "Motor");
               }
               if(message.equals("LEDS ENCENDIDOS")){
               ExecuteQuery(4, "Led");
               }
               if(message.equals("LEDS APAGADOS")){
               ExecuteQuery(3, "Led");
               }
        }
    };
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
