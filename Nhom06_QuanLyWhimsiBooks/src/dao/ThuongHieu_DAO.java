/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import java.util.ArrayList;
import entities.DanhMuc;
import entities.ThuongHieu;
import interfaces.IThuongHieu;
import jakarta.persistence.EntityManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ThuongHieu_DAO implements IThuongHieu {

    private EntityManager em;

    @Override
    public List<ThuongHieu> getAllThuongHieu() {
        List<ThuongHieu> list = new ArrayList<ThuongHieu>();
        try {
            list = em.createNamedQuery("ThuongHieu.listThuongHieu").getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            return list;
        }

        return list;
    }

    @Override
    public List<ThuongHieu> getThuongHieuTheoID(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addThuongHieu(ThuongHieu x) {
       
        try {
        	em.getTransaction().begin();
            em.persist(x);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editThuongHieu(ThuongHieu x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ThuongHieu_DAO() {
        em = ConnectDB.getEntityManager();
    }

}
