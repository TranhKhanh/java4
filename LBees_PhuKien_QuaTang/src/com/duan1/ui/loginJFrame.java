package com.duan1.ui;

import java.awt.Color;
import javax.swing.JOptionPane;


public class loginJFrame extends javax.swing.JFrame {

    public loginJFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        panelLogin_left2.initMoving(this);
        MyPassField1.setHint("Mật khẩu");
        MyTextField1.setHint("Tên đăng nhập");
    }

    void exit() {
       int ketQua = JOptionPane.showConfirmDialog(this, "bạn có thực sự muốn thoát không?", "thoát", JOptionPane.YES_NO_OPTION);
       if (ketQua == JOptionPane.YES_NO_OPTION) {
               System.exit(0);
            }
 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelBorder1 = new com.duan1.components.panelLogin_Border();
        panelLogin_left2 = new com.duan1.components.panelLogin_left();
        jLabel1 = new javax.swing.JLabel();
        MyTextField1 = new com.duan1.swing.MyTextField();
        MyPassField1 = new com.duan1.swing.MyPassField();
        button1 = new com.duan1.swing.Button();
        lblthoat = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBorder1.add(panelLogin_left2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 452, 504));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 160, 49));

        MyTextField1.setIconTrc(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/32_User.png"))); // NOI18N
        panelBorder1.add(MyTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 240, 36));

        MyPassField1.setIconTrc(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/32_Pass.png"))); // NOI18N
        panelBorder1.add(MyPassField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 240, 36));

        button1.setText("Đăng nhập");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panelBorder1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 100, 40));

        lblthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/36px__logout.png"))); // NOI18N
        lblthoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblthoatMouseClicked(evt);
            }
        });
        panelBorder1.add(lblthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_button1ActionPerformed

    private void lblthoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblthoatMouseClicked
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_lblthoatMouseClicked
    
  
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
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.duan1.swing.MyPassField MyPassField1;
    private com.duan1.swing.MyTextField MyTextField1;
    private com.duan1.swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblthoat;
    private com.duan1.components.panelLogin_Border panelBorder1;
    private com.duan1.components.panelLogin_left panelLogin_left2;
    // End of variables declaration//GEN-END:variables
}
