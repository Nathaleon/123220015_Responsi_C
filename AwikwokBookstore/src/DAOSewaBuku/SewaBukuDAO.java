/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOSewaBuku;

import java.sql.*;;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOInterface.SewaBukuInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author PC PRAKTIKUM
 */
public class SewaBukuDAO implements SewaBukuInterface {
    Connection connection;
    
    final String select = "SELECT * FROM sewa_buku";
    final String insert = "INSERT INTO sewa_buku (id,nama_penyewa,judul_buku,jenis_buku,nomor_telepon,durasi_sewa,total_biaya)"
            + "VALUES (?,?,?,?,?,?,?)";
    final String update = "UPDATE sewa_buku set judul_buku=?,jenis_buku=?,nomor_telepon=?,durasi_sewa=?,total_biaya=? WHERE nama_penyewa=?;";
    final String delete = "delete from sewa_buku WHERE nama_penyewa=?";

public SewaBukuDAO(){
    connection = connector.connection();
}

@Override
public void insert(sewa_buku p){
    PreparedStatement statement = null;
    try{
        if(p.getDurasi_sewa()<=0){
            throw new SQLException("Durasi sewa tidak boleh kosong");
        }
        statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1,p.getId());
        statement.setString(2,p.getNama_penyewa());
        statement.setString(3,p.getJudul_buku());
        statement.setString(4,p.getJenis_buku());
        statement.setString(5,p.getNomor_telepon());
        statement.setInt(6,p.getDurasi_sewa());
        statement.setInt(7,p.getTotal_biaya());
        statement.executeUpdate();
        ResultSet rs = statement.getGeneratedKeys();
        throw new SQLException("Data Sewa berhasil ditambahkan");
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        return;
    } finally{
        try{
            statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}


@Override
public void update(sewa_buku p){
    PreparedStatement statement = null;
    try{
        if(p.getDurasi_sewa()<=0){
            throw new SQLException("Durasi sewa tidak boleh kosong");
        }
        statement = connection.prepareStatement(update);
        statement.setInt(1,p.getId());
        statement.setString(2,p.getNama_penyewa());
        statement.setString(3,p.getJudul_buku());
        statement.setString(4,p.getJenis_buku());
        statement.setString(5,p.getNomor_telepon());
        statement.setInt(6,p.getDurasi_sewa());
        statement.setInt(7,p.getTotal_biaya());
        statement.executeUpdate();
        throw new SQLException("Data Sewa berhasil diupdate");
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        return;
    } finally{
        try{
            statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

@Override
public void delete(String nama_penyewa){
    PreparedStatement statement = null;
    try{
        statement = connection.prepareStatement(delete);
        statement.setString(1,nama_penyewa);
        statement.executeUpdate();
        throw new SQLException("Data Sewa berhasil dihapus");
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        return;
    } finally{
        try{
            statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

@Override
public List<sewa_buku>getALL(){
    List<sewa_buku>dp=null;
    try{
        dp = new ArrayList<sewa_buku>();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(select);
        while (rs.next()){
            sewa_buku sewa = new sewa_buku();
            sewa.setId(rs.getInt("Id"));
            sewa.setNama_penyewa(rs.getString("Nama penyewa"));
            sewa.setJudul_buku(rs.getString("Judul Buku"));
            sewa.setJenis_buku(rs.getString("Jenis Buku"));
            sewa.setNomor_telepon(rs.getString("Nomor Telepon"));
            sewa.setDurasi_sewa(rs.getInt("Durasi Sewa"));
            sewa.setTotal_biaya(rs.getInt("Total Biaya"));
            dp.add(sewa);
        }
    } catch (SQLException ex){
        Logger.getLogger(SewaBukuDAO.class.getName()).log(Level.SEVERE, null, ex);
    } return dp;

        }
    }
