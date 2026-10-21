package Frames;

import Classes.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection con = new DbConnection().dbConn();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        tfPassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbHeading = new javax.swing.JLabel();
        lbUName = new javax.swing.JLabel();
        tfUName = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        lbUName1 = new javax.swing.JLabel();
        cmType = new javax.swing.JComboBox<>();
        elb = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        lbHeading.setBackground(new java.awt.Color(51, 51, 255));
        lbHeading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbHeading.setForeground(new java.awt.Color(204, 204, 255));
        lbHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeading.setText("TVET Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        lbUName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUName.setForeground(new java.awt.Color(0, 0, 0));
        lbUName.setText("     User Name:");

        tfUName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUNameFocusLost(evt);
            }
        });
        tfUName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUNameMouseClicked(evt);
            }
        });
        tfUName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUNameKeyReleased(evt);
            }
        });

        lbPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("     Password:");

        bLogin.setBackground(new java.awt.Color(51, 51, 255));
        bLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bLogin.setForeground(new java.awt.Color(204, 204, 255));
        bLogin.setText("Login");
        bLogin.addActionListener(this::bLoginActionPerformed);

        lbUName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUName1.setForeground(new java.awt.Color(0, 0, 0));
        lbUName1.setText("     Institution:");

        cmType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "VTA", "DIET", "NAITA", "NYCS" }));
        cmType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmTypeMouseClicked(evt);
            }
        });

        elb.setForeground(new java.awt.Color(255, 0, 0));

        tfPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbUName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbUName1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tfPassword)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfUName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfPassword, tfUName});

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
       if( isValidate()){
        loginCheck();}
    }//GEN-LAST:event_bLoginActionPerformed

    private void cmTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmTypeMouseClicked
        isValidate();
    }//GEN-LAST:event_cmTypeMouseClicked

    private void tfUNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUNameFocusLost
        isValidate();
    }//GEN-LAST:event_tfUNameFocusLost

    private void tfUNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUNameMouseClicked
        isValidate();
    }//GEN-LAST:event_tfUNameMouseClicked

    private void tfUNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUNameKeyReleased
        isValidate();
    }//GEN-LAST:event_tfUNameKeyReleased

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    private void loginCheck() {
        String userName = tfUName.getText();
        String pass = tfPassword.getText();
        String typeInsitute = cmType.getSelectedItem().toString();
        String query = "SELECT password FROM admin WHERE user_name = ?";

        if (typeInsitute == "VTA") {
            try (PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, userName);

                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        String passCheck = rs.getString("password");

                        // 3. Use .equals() for string comparison instead of ==
                        if (passCheck != null && passCheck.equals(pass)) {
                            TVET st = new TVET();
                            st.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid Password!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Username not found!");
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            }

        } else {

            JOptionPane.showMessageDialog(this, "This insitute Management System Not avaible yet");

        }
    }

    private boolean isValidate() {
        boolean valid = true;
        if (cmType.getSelectedItem().toString().equals("-Select-")) {
            elb.setText("   Select a insitute before login");
            bLogin.setEnabled(false);
            valid = false;
        } else {
            elb.setText("");
            bLogin.setEnabled(true);
        }

        if (tfUName.getText().trim().isEmpty()) {

            bLogin.setEnabled(false);
            valid = false;
        } else {

            bLogin.setEnabled(true);
        }

        if (tfPassword.getText().trim().isEmpty()) {

            bLogin.setEnabled(false);
            valid = false;
        } else {

            bLogin.setEnabled(true);
        }
        return valid;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JComboBox<String> cmType;
    private javax.swing.JLabel elb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHeading;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUName;
    private javax.swing.JLabel lbUName1;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUName;
    // End of variables declaration//GEN-END:variables
}
