/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QuanLyNCC;
import Model.NhaCungCap;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

/**
 *
 * @author Tien Tran
 */
public class ThemNCC extends javax.swing.JDialog {

    /**
     * Creates new form ThemNCC
     */
    QuanLyNCC qlNCC;

    public ThemNCC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        qlNCC = new QuanLyNCC();
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

        bg = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(244, 244, 244));
        bg.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setToolTipText("");
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(55, 126, 232));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 12);
        flowLayout1.setAlignOnBaseline(true);
        jPanel6.setLayout(flowLayout1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thêm nhà cung cấp");
        jPanel6.add(jLabel1);

        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(55, 126, 232));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_Delete_32px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel3);

        jPanel5.add(jPanel7);

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Mã nhà cung cấp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Tên nhà cung cấp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Địa chỉ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Số điện thoại:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(jTextField1, gridBagConstraints);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jTextField2, gridBagConstraints);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jTextField3, gridBagConstraints);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jTextField4, gridBagConstraints);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jTextField5, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(65, 127, 194));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/icons8_Plus_Math_18px.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 410, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NhaCungCap ncc = new NhaCungCap(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText());
        if (qlNCC.addNCC(ncc) == 1) {
            JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thành công.");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Xin vui lòng kiểm tra lại thông tin nhập.");
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemNCC dialog = new ThemNCC(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
