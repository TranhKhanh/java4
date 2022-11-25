/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.duan1.components;

import com.duan1.swing.EventCallBack;
import com.duan1.swing.EventTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Form_QLNguoiGiaoHang extends javax.swing.JPanel {

    /**
     * Creates new form Form_QLNguoiGiaoHang
     */
    public Form_QLNguoiGiaoHang() {
        initComponents();
        setHint();
        TimKiem();
    }
     public  void TimKiem (){
        textFieldAnimation1.setHintText("Nhập mã, tên giao hàng");
        textFieldAnimation1.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 100; i++) {
                        
                        Thread.sleep(5);
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }
    
    public void setHint(){
        txtMaNGH.setHint("Nhập mã người giao hàng");
        txtTenNGH.setHint("Tên mã người giao hàng");
        txtEmail.setHint("Nhập Email");
        txtCCCD.setHint("Nhập căn cước công dân");
        txtSDT.setHint("Nhập số điện thoại");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldAnimation1 = new com.duan1.swing.TextFieldAnimation();
        tabPane = new com.duan1.swing.MaterialTabbed();
        pnlCapNhat = new javax.swing.JPanel();
        pnlText = new javax.swing.JPanel();
        txtMaNGH = new com.duan1.swing.MyTextField();
        txtTenNGH = new com.duan1.swing.MyTextField();
        txtSDT = new com.duan1.swing.MyTextField();
        txtEmail = new com.duan1.swing.MyTextField();
        txtCCCD = new com.duan1.swing.MyTextField();
        pnlThemSuaXoa = new javax.swing.JPanel();
        button6 = new com.duan1.swing.Button();
        button7 = new com.duan1.swing.Button();
        button8 = new com.duan1.swing.Button();
        button2 = new com.duan1.swing.Button();
        pnlDieuHuong = new javax.swing.JPanel();
        btnThem = new com.duan1.swing.Button();
        btnSua = new com.duan1.swing.Button();
        btnXoa = new com.duan1.swing.Button();
        btnMoi = new com.duan1.swing.Button();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNGH = new com.duan1.swing.Table();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(923, 604));
        setMinimumSize(new java.awt.Dimension(923, 604));
        setPreferredSize(new java.awt.Dimension(923, 604));

        pnlCapNhat.setBackground(new java.awt.Color(255, 255, 255));

        pnlText.setBackground(new java.awt.Color(255, 255, 255));

        pnlThemSuaXoa.setBackground(new java.awt.Color(255, 255, 255));
        pnlThemSuaXoa.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        button6.setText("<");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pnlThemSuaXoa.add(button6);

        button7.setText("|<");
        button7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnlThemSuaXoa.add(button7);

        button8.setText(">|");
        button8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnlThemSuaXoa.add(button8);

        button2.setText(">");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pnlThemSuaXoa.add(button2);

        pnlDieuHuong.setBackground(new java.awt.Color(255, 255, 255));
        pnlDieuHuong.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnThem.setText("Thêm");
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pnlDieuHuong.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pnlDieuHuong.add(btnSua);

        btnXoa.setText("Xóa");
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pnlDieuHuong.add(btnXoa);

        btnMoi.setText("Mới");
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pnlDieuHuong.add(btnMoi);

        javax.swing.GroupLayout pnlTextLayout = new javax.swing.GroupLayout(pnlText);
        pnlText.setLayout(pnlTextLayout);
        pnlTextLayout.setHorizontalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNGH, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNGH, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addComponent(pnlDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlThemSuaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTextLayout.setVerticalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTextLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(pnlDieuHuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTextLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlThemSuaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPane.addTab("Cập Nhật", pnlCapNhat);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 102));
        jScrollPane1.setBorder(null);

        tblNGH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Người Giao Hàng", "Tên Người Giao Hàng", "CCCD", "Số Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNGH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNGHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNGH);
        if (tblNGH.getColumnModel().getColumnCount() > 0) {
            tblNGH.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblNGH.getColumnModel().getColumn(2).setPreferredWidth(25);
            tblNGH.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        tabPane.addTab("Danh Sách", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean  checkText(){
        if(txtMaNGH.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhập mã người giao hàng");
            txtMaNGH.requestFocus();
            return false;
        }
        
        if(txtTenNGH.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhập tên người giao hàng");
            txtTenNGH.requestFocus();
            return false;
        }
        
        String CCCD = "^\\d{12}$";
        boolean cccd =txtCCCD.getText().matches(CCCD);
        if(txtCCCD.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhập căn cước công dân người giao hàng", "Lỗi căn cước công dân", JOptionPane.QUESTION_MESSAGE);
            return false;
        } 
         if (cccd != true) {
            JOptionPane.showMessageDialog(this, "Nhập căn cước công dân người giao hàng không Đúng Dịnh Dạng ", "Lỗi Phone", JOptionPane.QUESTION_MESSAGE);
            return false;
        }
            
        String PHONE = "^0[9384]{1}\\d{8}$";
        boolean phone = txtSDT.getText().matches(PHONE);

        if (txtSDT.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Nhập số điện thoại người giao hàng", "Lỗi số điện thoại", JOptionPane.QUESTION_MESSAGE);
            return false;
        }
        if (phone != true) {
            JOptionPane.showMessageDialog(this, "Nhập số điện thoại người giao hàng không Đúng Dịnh Dạng ", "Lỗi số điện thoại", JOptionPane.QUESTION_MESSAGE);
            return false;
        }
        
        
        String EMAIL = "\\w+@gmail";   
        boolean email = txtEmail.getText().matches(EMAIL);

        if (txtEmail.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Nhập email người giao hàng", "Lỗi email", JOptionPane.QUESTION_MESSAGE);
            return false;
        }
        if (email != true) {
            JOptionPane.showMessageDialog(this, "Nhập email người giao hàng không Đúng Dịnh Dạng '@fpt.edu.vn'", "Lỗi email", JOptionPane.QUESTION_MESSAGE);
            return false;
        }  
        return true;
    }
    
    private void tblNGHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNGHMouseClicked
        // TODO add your handling code here:
        tabPane.setSelectedIndex(0);
    }//GEN-LAST:event_tblNGHMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.duan1.swing.Button btnMoi;
    private com.duan1.swing.Button btnSua;
    private com.duan1.swing.Button btnThem;
    private com.duan1.swing.Button btnXoa;
    private com.duan1.swing.Button button2;
    private com.duan1.swing.Button button6;
    private com.duan1.swing.Button button7;
    private com.duan1.swing.Button button8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlDieuHuong;
    private javax.swing.JPanel pnlText;
    private javax.swing.JPanel pnlThemSuaXoa;
    private com.duan1.swing.MaterialTabbed tabPane;
    private com.duan1.swing.Table tblNGH;
    private com.duan1.swing.TextFieldAnimation textFieldAnimation1;
    private com.duan1.swing.MyTextField txtCCCD;
    private com.duan1.swing.MyTextField txtEmail;
    private com.duan1.swing.MyTextField txtMaNGH;
    private com.duan1.swing.MyTextField txtSDT;
    private com.duan1.swing.MyTextField txtTenNGH;
    // End of variables declaration//GEN-END:variables
}
