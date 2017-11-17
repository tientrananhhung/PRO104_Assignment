/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Account;
import Controller.AccountDAO;
import com.placeholder.PlaceHolder;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tien Tran
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    PlaceHolder holder;
    Connection conn;
    AccountDAO aDAO;
    File file;

    public Login() {
        initComponents();
        aDAO = new AccountDAO();
        holder = new PlaceHolder(jTextField_User, "Xin vui lòng nhập tên đăng nhập");
        holder.setSize(18);
        holder = new PlaceHolder(jPasswordField_Pass, "Xin vui lòng nhập mật khẩu");
        holder.setSize(18);
        holder.setCursiva(true);
        file = new File("save.bin");
        update();
    }

    public void save() {

        try {
            if (!file.exists()) {
                file.createNewFile();  //if the file !exist create a new one

                BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
                bw.write(jTextField_User.getText()); //write the name
                bw.newLine(); //leave a new Line
                bw.write(jPasswordField_Pass.getPassword()); //write the password
                bw.close(); //close the BufferdWriter
            } else {
                file.delete();
                file.createNewFile();  //if the file !exist create a new one

                BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
                bw.write(jTextField_User.getText()); //write the name
                bw.newLine(); //leave a new Line
                bw.write(jPasswordField_Pass.getPassword()); //write the password
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            if (file.exists()) {    //if this file exists

                Scanner scan = new Scanner(file);   //Use Scanner to read the File

                jTextField_User.setText(scan.nextLine());  //append the text to name field
                jPasswordField_Pass.setText(scan.nextLine()); //append the text to password field
                jCheckBox_Remember.setSelected(true);
                scan.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        if (jCheckBox_Remember.isSelected()) {
            save(); //Save This UserName and his PassWord     
        } else {
            file.delete();
        }
        Account acc = aDAO.checkLogin(jTextField_User.getText(), jPasswordField_Pass.getText());
        if (acc != null) {
            if (acc.getChucVu().equals("Administrator")) {
                Admin admin = new Admin(acc);
                admin.setVisible(true);
                this.dispose();
            } else if (acc.getChucVu().equals("Nhân Viên")) {
                ThanhToan thanhToan = new ThanhToan(acc);
                thanhToan.setVisible(true);
                this.dispose();
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Minimize = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        Username = new javax.swing.JPanel();
        IconUser = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        Pass = new javax.swing.JPanel();
        IconPass = new javax.swing.JLabel();
        jPasswordField_Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jCheckBox_Remember = new javax.swing.JCheckBox();
        jLabel_BanQuyen = new javax.swing.JLabel();
        jLabel_ND1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setState(JFrame.MAXIMIZED_BOTH);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(55, 126, 232));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đăng nhập");
        jPanel2.add(jLabel4);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(55, 126, 232));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_Minus_32px_1.png"))); // NOI18N
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        jPanel3.add(Minimize);

        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_Delete_32px_1.png"))); // NOI18N
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        jPanel3.add(X);

        jPanel1.add(jPanel3);

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/1132072-4995.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Login.add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.GridBagLayout());

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        Username.setLayout(new java.awt.GridBagLayout());

        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_User_32px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Username.add(IconUser, gridBagConstraints);

        jTextField_User.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_User.setBorder(null);
        jTextField_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_UserKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Username.add(jTextField_User, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 20;
        body.add(Username, gridBagConstraints);

        Pass.setBackground(new java.awt.Color(255, 255, 255));
        Pass.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        Pass.setLayout(new java.awt.GridBagLayout());

        IconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_Key_2_32px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Pass.add(IconPass, gridBagConstraints);

        jPasswordField_Pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField_Pass.setBorder(null);
        jPasswordField_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_PassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 497;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Pass.add(jPasswordField_Pass, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 20;
        body.add(Pass, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        body.add(jButton1, gridBagConstraints);

        jCheckBox_Remember.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_Remember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Remember.setText("Nhớ tài khoản");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        body.add(jCheckBox_Remember, gridBagConstraints);

        jLabel_BanQuyen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_BanQuyen.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_BanQuyen.setText("Sản phẩm được viết bởi THT Team ©");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(80, 0, 0, 0);
        body.add(jLabel_BanQuyen, gridBagConstraints);

        jLabel_ND1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel_ND1.setText("Phần mềm đang trong quá trình hoàn thiện,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        body.add(jLabel_ND1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setText("Mọi ý kiến đóng góp xin gửi về tientahpd01815@fpt.edu.vn ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        body.add(jLabel3, gridBagConstraints);

        Login.add(body, java.awt.BorderLayout.CENTER);

        footer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/Screenshot (10).png"))); // NOI18N

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
            .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(footerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(footerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Login.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BGLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 747, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jTextField_UserKeyPressed

    private void jPasswordField_PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPasswordField_PassKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel IconPass;
    private javax.swing.JLabel IconUser;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Minimize;
    private javax.swing.JPanel Pass;
    private javax.swing.JPanel Username;
    private javax.swing.JLabel X;
    private javax.swing.JPanel body;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox_Remember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_BanQuyen;
    private javax.swing.JLabel jLabel_ND1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}
