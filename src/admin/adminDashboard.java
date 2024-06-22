package admin;

import com.formdev.flatlaf.FlatLightLaf;
import config.FontManager;
import config.SessionClass;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import tripwing.logInPanel;

/**
 *
 * @author KANYE YEAST
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
        initComponents();
        displayData();
        acc_name.setFont(FontManager.getFont("Poppins-ExtraBold").deriveFont(Font.PLAIN, 13));
        user_dis.setFont(FontManager.getFont("Poppins-ExtraBold").deriveFont(Font.PLAIN, 13));
        user_dis1.setFont(FontManager.getFont("Poppins-ExtraBold").deriveFont(Font.PLAIN, 13));
        
    }
    
     public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_email FROM tbl_user");
            content.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    
    }
    
    Color navcolor = new Color(255,255,255);
    Color hovercolor = new Color(242,242,242);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        editPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        user_dis = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        user_dis1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();

        jPopupMenu1.setMinimumSize(new java.awt.Dimension(120, 50));
        jPopupMenu1.setName(""); // NOI18N

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
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        jPanel2.setBackground(new java.awt.Color(23, 35, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editPanel.setBackground(new java.awt.Color(255, 255, 255));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPanelMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/user_iconl-03.png"))); // NOI18N

        user_dis.setForeground(new java.awt.Color(0, 0, 0));
        user_dis.setText("EDIT");
        user_dis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_disMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(user_dis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 60));

        addPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/user_iconl-03.png"))); // NOI18N

        user_dis1.setForeground(new java.awt.Color(0, 0, 0));
        user_dis1.setText("ADD");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_dis1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(user_dis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 240, 60));

        jPanel5.setBackground(new java.awt.Color(249, 249, 249));

        content.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(content);
        content.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 11));
        JTableHeader header = content.getTableHeader();
        header.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 11));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Active", "Pending" }));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextField1.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 10));
        jComboBox1.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 10));

        jPanel6.setBackground(new java.awt.Color(249, 249, 249));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/admin_icon-01.png"))); // NOI18N

        acc_name.setForeground(new java.awt.Color(0, 0, 0));
        acc_name.setText("Name");

        acc_name1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(acc_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(acc_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(acc_name))))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)
                        .addContainerGap(609, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        int rowIndex = content.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = content.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                
                if(rs.next()){
                    addUsers crf = new addUsers();
                    crf.id.setText(""+rs.getString("u_id"));
                    crf.fn.setText(""+rs.getString("u_fname"));
                    crf.ln.setText(""+rs.getString("u_lname"));
                    crf.usn.setText(""+rs.getString("u_usn"));
                    crf.el.setText(""+rs.getString("u_email"));
                    crf.type.setSelectedItem(""+rs.getString("u_type"));
                    crf.us.setSelectedItem(""+rs.getString("u_status"));
                    crf.setVisible(true);
                    crf.add.setEnabled(false);
                    crf.update.setEnabled(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
        
    }//GEN-LAST:event_editPanelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        SessionClass sess = SessionClass.getInstance();
        int user_id = sess.getUid();
        
        if(user_id == 0){
            JOptionPane.showMessageDialog(null, "No account, Log in first!");
            logInPanel lgg = new logInPanel();
            lgg.setVisible(true);
            this.dispose();
        }else{
            acc_name.setText(""+sess.getFname());
        }

    }//GEN-LAST:event_formWindowActivated

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(hovercolor);
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editPanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        addUsers usf = new addUsers();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addPanelMouseClicked

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        addPanel.setBackground(hovercolor);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
        addPanel.setBackground(navcolor);
    }//GEN-LAST:event_addPanelMouseExited

    private void user_disMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_disMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_disMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JPanel addPanel;
    public javax.swing.JTable content;
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel user_dis;
    private javax.swing.JLabel user_dis1;
    // End of variables declaration//GEN-END:variables
}
