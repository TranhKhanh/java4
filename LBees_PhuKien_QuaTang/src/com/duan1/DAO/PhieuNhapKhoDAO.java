/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duan1.DAO;

import com.duan1.Entity.PhieuNhapKho;
import com.duan1.Helper.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asus
 */
public class PhieuNhapKhoDAO extends QLPK<PhieuNhapKho, String> {

    String insert_SQL = "INSERT INTO dbo.PhieuNhapKho(MaPNK,NgayNhap)VALUES(?,?)";
    String update_SQL = "UPDATE dbo.PhieuNhapKho SET NgayNhap=?  WHERE MaPNK =?";
    String delete_SQL = "DELETE dbo.PhieuNhapKho WHERE MaPNK =?";
    String select_All_SQL = "SELECT * FROM dbo.PhieuNhapKho";
    String select_ByID_SQL = "SELECT * FROM dbo.PhieuNhapKho WHERE MaPNK=?";
//    String select_Max_ID = "SELECT MAX(SUBSTRING(MaPNK,LEN(MaPNK) - 4 ,LEN(MaPNK)))FROM dbo.PhieuNhapKho";
    String select_Max_ID = "SELECT MAX(MaPNK) FROM dbo.PhieuNhapKho";

    @Override
    public void insert(PhieuNhapKho entity) {
        XJdbc.executeUpdate(insert_SQL, entity.getMaPNK(), entity.getNgayNhap());
    }

    @Override
    public void update(PhieuNhapKho entity) {
        XJdbc.executeUpdate(update_SQL, entity.getNgayNhap(), entity.getMaPNK());
    }

    @Override
    public void delete(String key) {
        XJdbc.executeUpdate(delete_SQL, key);
    }

    @Override
    public List<PhieuNhapKho> selectAll() {
        return selectBySql(select_All_SQL);
    }

    @Override
    public PhieuNhapKho selectByid(String key) {
        List<PhieuNhapKho> list = this.selectBySql(select_ByID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PhieuNhapKho> selectBySql(String sql, Object... args) {
        List<PhieuNhapKho> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                PhieuNhapKho entity = new PhieuNhapKho();
                entity.setMaPNK(rs.getString("MaPNK"));
                entity.setNgayNhap(rs.getDate("NgayNhap"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String getLastID() throws SQLException {
            ResultSet rs = XJdbc.executeQuery(select_Max_ID);
            String id = null;
            if (rs.next()) {
                id = rs.getString(1);
            }
            rs.getStatement().getConnection().close();
            return id;
    }
    public String initID () throws SQLException {
        String id = getLastID();
        id = id.replaceAll("\\D+","");
        int idNumber = Integer.parseInt(id);
        String newID = String.format("%05d", idNumber+=1);
        return newID;
    }
}
