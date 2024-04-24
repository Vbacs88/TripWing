package admin;

import config.FontManager;
import config.PasswordHasher;
import config.SessionClass;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tripwing.logInPanel;
import static tripwing.registerForm.email;
import static tripwing.registerForm.usname;

/**
 *
 * @author KANYE YEAST
 */
public class addUsers extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public addUsers() {
        initComponents();
        label_sess.setFont(FontManager.getFont("Poppins-ExtraBold").deriveFont(Font.PLAIN, 12));
    }
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE (u_usn = '" + usn.getText() + "' OR u_email = '" + el.getText() + "') AND u_id != '"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                System.out.println(""+email);
                if(email.equals(el.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                }
                usname = resultSet.getString("u_usn");
                System.out.println(""+usname);
                if(usname.equals(usn.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
    Color navcolor = new Color(255,255,255);
    Color hovercolor = new Color(242,242,242);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        label_sess = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        el = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        us = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        u_id = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 35, 77));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/admin_label-02.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 20, 130, 48);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(893, 626, 0, 0);

        jPanel6.setBackground(new java.awt.Color(23, 35, 77));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/back_icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(840, 20, 41, 40);

        label_sess.setBackground(new java.awt.Color(255, 255, 255));
        label_sess.setForeground(new java.awt.Color(255, 255, 255));
        label_sess.setText("/ ADD USER");
        jPanel1.add(label_sess);
        label_sess.setBounds(340, 20, 120, 48);

        jPanel5.setBackground(new java.awt.Color(16, 27, 66));
        jPanel5.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(16, 27, 66));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Authorization:");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Status:");

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));

        id.setEditable(false);
        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        u_id.setForeground(new java.awt.Color(255, 255, 255));
        u_id.setText("ID number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(ps)
                                .addComponent(jLabel7)
                                .addComponent(el)
                                .addComponent(jLabel6)
                                .addComponent(usn)
                                .addComponent(jLabel5)
                                .addComponent(ln)
                                .addComponent(jLabel2)
                                .addComponent(fn)
                                .addComponent(type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(us, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(u_id)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(u_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(el, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2);
        jPanel2.setBounds(20, 20, 360, 500);

        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel5.add(update);
        update.setBounds(540, 50, 80, 26);

        jButton4.setText("Delete");
        jPanel5.add(jButton4);
        jButton4.setBounds(450, 90, 80, 26);

        jButton5.setText("Clear");
        jPanel5.add(jButton5);
        jButton5.setBounds(540, 90, 80, 26);

        jButton7.setText("Refresh");
        jPanel5.add(jButton7);
        jButton7.setBounds(540, 130, 79, 26);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel5.add(add);
        add.setBounds(450, 50, 80, 26);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(164, 78, 750, 550);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);
        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, -2, 160, 630);

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 910, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        SessionClass sess = SessionClass.getInstance();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        adminDashboard admd = new adminDashboard();
        admd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || el.getText().isEmpty() || usn.getText().isEmpty() || ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(ps.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password too short!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            
            dbConnector dbc = new dbConnector();
            PasswordHasher ph = new PasswordHasher();
            
            String password = ph.hashPassword(ps.getText());
            
            if(dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_usn, u_pass, u_type, u_status)"
                    + " VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+el.getText()+"', '"+usn.getText()+"', '"
                    +password+
                    "', '"+type.getSelectedItem()+"', '"+us.getSelectedItem()+"')"))
                {
                    JOptionPane.showMessageDialog(null, "Registered Successfully!");
                    logInPanel lnp = new logInPanel();
                    lnp.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                }
            
        }
    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || el.getText().isEmpty() || usn.getText().isEmpty() || ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(ps.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password too short!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{ 
        dbConnector dbc = new dbConnector();
        PasswordHasher ph = new PasswordHasher();
        String password = ph.hashPassword(ps.getText());
        dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"', "
                + "u_lname = '"+ln.getText()+"', u_email = '"+el.getText()+"', "
                + "u_usn = '"+usn.getText()+"', u_pass = '"+password+"', u_type = '"+type.getSelectedItem()+"', "
                + "u_status = '"+us.getSelectedItem()+"' WHERE u_id = '"+id.getText()+"'");
         }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    javax.swing.JTextField el;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel label_sess;
    javax.swing.JTextField ln;
    private javax.swing.JTextField ps;
    public javax.swing.JComboBox<String> type;
    private javax.swing.JLabel u_id;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
