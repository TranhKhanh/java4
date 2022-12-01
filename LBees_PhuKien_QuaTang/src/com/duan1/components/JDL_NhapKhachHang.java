/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.duan1.components;

import com.duan1.DAO.HoaDonChiTietDAO;
import com.duan1.DAO.HoaDonDAO;
import com.duan1.DAO.KhachHangDAO;
import com.duan1.Entity.HoaDon;
import com.duan1.Entity.HoaDonChiTiet;
import com.duan1.Entity.KhachHang;
import com.duan1.Helper.Msgbox;
import com.duan1.ui.MainJFrame;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author MSI PC
 */
public class JDL_NhapKhachHang extends javax.swing.JDialog {

    List<HoaDonChiTiet> listHDCT = null;
    HoaDonChiTietDAO daoHDCT = new HoaDonChiTietDAO();
    HoaDonDAO daoHD = new HoaDonDAO();
    KhachHangDAO daoKH = new KhachHangDAO();

    /**
     * Creates new form JDL_NhapKhachHang
     */
    public JDL_NhapKhachHang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        setHint();
    }

    public void setHint() {
        txtTenKH.setLabelText("Tên khách hàng");
        txtSDTKH.setLabelText("Số điện thoại");
        txtTienKhachDua.setLabelText("Tiền khách đưa");
        txtTienTraLai.setLabelText("");
        txtTienTraLai.setEditable(false);
    }

    public List<HoaDonChiTiet> getList(List<HoaDonChiTiet> listHDCT) {
        return this.listHDCT = listHDCT;
    }

    public void thanhToan() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat();
        s.applyPattern("yyMM");
        String maKH = s.format(d);
        String maHD = s.format(d);
        boolean check = true;
        try {
            KhachHang kh = new KhachHang("KH" + txtTenKH.getText() + maKH, txtTenKH.getText(), txtSDTKH.getText(), 1);
            daoKH.insert(kh);
            HoaDon hd = new HoaDon("HD" + txtTenKH.getText() + maHD, 0, new Date(), "", "NV01", kh.getMaKH());
            daoHD.insert(hd);

            for (HoaDonChiTiet hdct : listHDCT) {
                try {
                    hdct.setMaHD(hd.getMaHD());
                    HoaDonChiTiet hdct1 = new HoaDonChiTiet(hdct.getSoLuong(), hdct.getThanhTien(), hdct.getMaSP(), hdct.getMaHD());
                    daoHDCT.insert(hdct1);
                } catch (Exception e) {
                    e.printStackTrace();
                    check = false;
                }
            }
            MainJFrame f = new MainJFrame();
            if (check == false) {
                Msgbox.waring(f, "Đã thêm thất bại!");
                return;
            }
            Msgbox.success(f, "Đã thêm thành công!");
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
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

        panelTrang1 = new com.duan1.components.panelTrang();
        jLabel2 = new javax.swing.JLabel();
        txtTenKH = new com.duan1.swing.MyTextField2();
        txtSDTKH = new com.duan1.swing.MyTextField2();
        txtTienKhachDua = new com.duan1.swing.MyTextField2();
        txtTienTraLai = new com.duan1.swing.MyTextField2();
        btnThanhToan = new com.duan1.swing.Button();
        btnHuy = new com.duan1.swing.Button();
        btnGuiQua = new com.duan1.swing.Button();
        btnTongTien = new com.duan1.swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelTrang1.setBackground(new java.awt.Color(153, 51, 0));

        jLabel2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 1, 18)); // NOI18N
        jLabel2.setText("NHẬP THÔNG TIN KHÁCH HÀNG");

        txtTienKhachDua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtTienTraLai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnThanhToan.setBackground(new java.awt.Color(123, 181, 74));
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(204, 0, 51));
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnGuiQua.setBackground(new java.awt.Color(0, 255, 255));
        btnGuiQua.setForeground(new java.awt.Color(255, 255, 255));
        btnGuiQua.setText("Gửi Quà");
        btnGuiQua.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGuiQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiQuaActionPerformed(evt);
            }
        });

        btnTongTien.setForeground(new java.awt.Color(0, 0, 0));
        btnTongTien.setText("Tổng Tiền:");
        btnTongTien.setToolTipText("");
        btnTongTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTongTien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Tiền Thừa:");

        javax.swing.GroupLayout panelTrang1Layout = new javax.swing.GroupLayout(panelTrang1);
        panelTrang1.setLayout(panelTrang1Layout);
        panelTrang1Layout.setHorizontalGroup(
            panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrang1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrang1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDTKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrang1Layout.createSequentialGroup()
                        .addGroup(panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTrang1Layout.createSequentialGroup()
                                .addComponent(btnGuiQua, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrang1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienTraLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelTrang1Layout.createSequentialGroup()
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
        );
        panelTrang1Layout.setVerticalGroup(
            panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrang1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(btnTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTrang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTrang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        thanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnGuiQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuiQuaActionPerformed

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
            java.util.logging.Logger.getLogger(JDL_NhapKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDL_NhapKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDL_NhapKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDL_NhapKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDL_NhapKhachHang dialog = new JDL_NhapKhachHang(new javax.swing.JFrame(), true);
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
    private com.duan1.swing.Button btnGuiQua;
    private com.duan1.swing.Button btnHuy;
    private com.duan1.swing.Button btnThanhToan;
    private com.duan1.swing.Button btnTongTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.duan1.components.panelTrang panelTrang1;
    private com.duan1.swing.MyTextField2 txtSDTKH;
    private com.duan1.swing.MyTextField2 txtTenKH;
    private com.duan1.swing.MyTextField2 txtTienKhachDua;
    private com.duan1.swing.MyTextField2 txtTienTraLai;
    // End of variables declaration//GEN-END:variables
}
