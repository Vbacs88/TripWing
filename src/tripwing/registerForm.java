package tripwing;

import config.FontManager;
import config.PasswordHasher;
import config.dbConnector;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class registerForm extends javax.swing.JFrame {

    public registerForm() {
        initComponents();
        startUp();
    }
    
    public static String email, usname;
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_usn = '" + usn.getText() + "' OR u_email = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                System.out.println(""+email);
                if(email.equals(em.getText())){
                    e4.setText("Email already used");
                }
                usname = resultSet.getString("u_usn");
                System.out.println(""+usname);
                if(usname.equals(usn.getText())){
                    e3.setText("Username already exists");
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
    
    public void startUp(){
        header.setFont(FontManager.getFont("Poppins-ExtraBold").deriveFont(Font.PLAIN, 48));
        header2.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 18));
        fn_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        usn_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        ln_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        em_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        ps_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        cps_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        auth_label.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        reg.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        can.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        jLabel6.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        fn.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        ln.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        usn.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        em.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        ps.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        cps.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        auth_label.setBorder(new EmptyBorder(0, 10, 0, 0));
        fn.setBorder(new EmptyBorder(0, 10, 0, 0));
        ln.setBorder(new EmptyBorder(0, 10, 0, 0));
        usn.setBorder(new EmptyBorder(0, 10, 0, 0));
        em.setBorder(new EmptyBorder(0, 10, 0, 0));
        ps.setBorder(new EmptyBorder(0, 10, 0, 0));
        cps.setBorder(new EmptyBorder(0, 10, 0, 0));
        e1.setText("");
        e1.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        e2.setText("");
        e2.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        e3.setText("");
        e3.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        e4.setText("");
        e4.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        e5.setText("");
        e5.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
        e6.setText("");
        e6.setFont(FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        auth_label = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        fn_label = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln_label = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        usn_label = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        em_label = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ps_label = new javax.swing.JLabel();
        ps = new javax.swing.JPasswordField();
        cps_label = new javax.swing.JLabel();
        cps = new javax.swing.JPasswordField();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        header2 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        can = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 35, 77));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Authorization:");

        auth_label.setBackground(new java.awt.Color(249, 249, 249));
        auth_label.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        fn_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        fn_label.setForeground(new java.awt.Color(0, 0, 0));
        fn_label.setText("First Name:");

        fn.setBackground(new java.awt.Color(252, 252, 252));
        fn.setBorder(null);

        ln_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ln_label.setForeground(new java.awt.Color(0, 0, 0));
        ln_label.setText("Last Name:");

        ln.setBackground(new java.awt.Color(252, 252, 252));
        ln.setBorder(null);

        e1.setForeground(new java.awt.Color(255, 0, 0));
        e1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e1.setText("*");

        e2.setForeground(new java.awt.Color(255, 0, 0));
        e2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e2.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fn_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ln_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn_label)
                    .addComponent(ln_label)
                    .addComponent(e1)
                    .addComponent(e2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        usn_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        usn_label.setForeground(new java.awt.Color(0, 0, 0));
        usn_label.setText("Username:");

        usn.setBackground(new java.awt.Color(252, 252, 252));
        usn.setBorder(null);
        usn.setMinimumSize(new java.awt.Dimension(0, 22));

        em_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        em_label.setForeground(new java.awt.Color(0, 0, 0));
        em_label.setText("Email:");

        em.setBackground(new java.awt.Color(252, 252, 252));
        em.setBorder(null);

        e3.setForeground(new java.awt.Color(255, 0, 0));
        e3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e3.setText("*");

        e4.setForeground(new java.awt.Color(255, 0, 0));
        e4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e4.setText("*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(usn_label)
                        .addGap(18, 18, 18)
                        .addComponent(e3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(em_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usn_label)
                    .addComponent(em_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3)
                    .addComponent(e4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        ps_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ps_label.setForeground(new java.awt.Color(0, 0, 0));
        ps_label.setText("Password:");

        ps.setBackground(new java.awt.Color(252, 252, 252));
        ps.setBorder(null);

        cps_label.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        cps_label.setForeground(new java.awt.Color(0, 0, 0));
        cps_label.setText("Confirm Password:");

        cps.setBackground(new java.awt.Color(252, 252, 252));
        cps.setBorder(null);

        e5.setForeground(new java.awt.Color(255, 0, 0));
        e5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e5.setText("*");

        e6.setForeground(new java.awt.Color(255, 0, 0));
        e6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        e6.setText("*");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ps_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cps, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cps_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ps_label)
                    .addComponent(cps_label)
                    .addComponent(e5)
                    .addComponent(e6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cps, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        header.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("TRIPWING");
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header2.setText("ACCOUNT REGISTRATION");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(138, 138, 138))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header2)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        reg.setBackground(new java.awt.Color(255, 255, 255));
        reg.setText("REGISTER");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(23, 35, 77));

        jPanel9.setBackground(new java.awt.Color(23, 35, 77));
        jPanel9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcesIcons/exit-05.png"))); // NOI18N
        jPanel9.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        can.setBackground(new java.awt.Color(255, 255, 255));
        can.setText("CANCEL");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(auth_label, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auth_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg)
                    .addComponent(can))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || usn.getText().isEmpty() || ps.getText().isEmpty() || cps.getText().isEmpty()){
            if(fn.getText().isEmpty()){
                e1.setText("Field Required");
            }
            if(ln.getText().isEmpty()){
                e2.setText("Field Required");
            }
            if(em.getText().isEmpty()){
                e4.setText("Field Required");
            }
            if(usn.getText().isEmpty()){
                e3.setText("Field Required");
            }
            if(ps.getText().isEmpty()){
                e5.setText("Field Required");
            }
            else if(ps.getText().length()<8){
                e5.setText("Password is too short!");
            }
            else if(!(ps.getText().equals(cps.getText()))){
            e5.setText("Password does not match!");
            }
            if(cps.getText().isEmpty()){
                e6.setText("Field Required");
            }
        }else if(ps.getText().length()<8){
            e5.setText("Password is too short!");
        }else if(!(ps.getText().equals(cps.getText()))){
            e5.setText("Password does not match!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            
            dbConnector dbc = new dbConnector();
            PasswordHasher ph = new PasswordHasher();
            
            String password = ph.hashPassword(ps.getText());
            
            if(dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_usn, u_pass, u_type, u_status)"
                    + " VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+em.getText()+"', '"+usn.getText()+"', '"
                    +password+
                    "', '"+auth_label.getSelectedItem()+"', 'Pending')"))
                {
                    JOptionPane.showMessageDialog(null, "Registered Successfully!");
                    logInPanel lnp = new logInPanel();
                    lnp.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                }
            
        }
    }//GEN-LAST:event_regActionPerformed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(new java.awt.Color(38,58,129));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new java.awt.Color(23,35,77));
    }//GEN-LAST:event_jPanel9MouseExited

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        logInPanel lk = new logInPanel();
        lk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_canActionPerformed

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> auth_label;
    private javax.swing.JButton can;
    private javax.swing.JPasswordField cps;
    private javax.swing.JLabel cps_label;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JTextField em;
    private javax.swing.JLabel em_label;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel ln_label;
    private javax.swing.JPasswordField ps;
    private javax.swing.JLabel ps_label;
    private javax.swing.JButton reg;
    private javax.swing.JTextField usn;
    private javax.swing.JLabel usn_label;
    // End of variables declaration//GEN-END:variables
}
