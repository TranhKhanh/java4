/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duan1.DAO;

import com.duan1.Entity.SanPham;
import com.duan1.Helper.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class SanPhamDAO extends QLPK<SanPham, String> {

    String insert_SQL = "INSERT INTO dbo.SanPhamBan(MaSP,TenSP,SoLuong,DonViTinh,DonGia,TrangThai,MaVach,HinhAnh,MaNV,MaDM)VALUES(?,?,?,?,?,?,?,?,?,?)";
    String update_SQL = "UPDATE dbo.SanPhamBan SET TenSP=?,SoLuong=?,DonViTinh=?,DonGia=?,TrangThai=?,MaVach=?,HinhAnh=?,MaNV=?,MaDM=?  WHERE MaSP =?";
    String delete_SQL = "DELETE dbo.SanPhamBan WHERE MaSP =?";
    String select_All_SQL = "SELECT * FROM dbo.SanPhamBan";
    String select_ByID_SQL = "SELECT * FROM dbo.SanPhamBan WHERE MaSP=?";

    @Override
    public void insert(SanPham entity) {
        XJdbc.executeUpdate(insert_SQL, entity.getMaSP(), entity.getTenSP(), entity.getSoLuong(), entity.getDonViTinh(), entity.getDonGia(), entity.isTrangThai(), entity.getMaVach(), entity.getHinhAnh(), entity.getMaNV(), entity.getMaDM());
    }

    @Override
    public void update(SanPham entity) {
        XJdbc.executeUpdate(update_SQL, entity.getTenSP(), entity.getSoLuong(), entity.getDonViTinh(), entity.getDonGia(), entity.isTrangThai(), entity.getMaVach(), entity.getHinhAnh(), entity.getMaNV(), entity.getMaDM(), entity.getMaSP());
    }

    @Override
    public void delete(String key) {
        XJdbc.executeUpdate(delete_SQL, key);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySql(select_All_SQL);
    }

    @Override
    public SanPham selectByid(String key) {
        List<SanPham> list = this.selectBySql(select_ByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setDonViTinh(rs.getString("DonViTinh"));
                entity.setDonGia(rs.getFloat("DonGia"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setMaVach(rs.getString("MaVach"));
                entity.setHinhAnh(rs.getString("HinhAnh"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaDM(rs.getString("MaDM"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<SanPham> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM dbo.SanPhamBan WHERE MaSP LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
