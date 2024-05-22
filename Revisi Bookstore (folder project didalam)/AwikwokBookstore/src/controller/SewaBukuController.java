/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOSewaBuku.SewaBukuDAO;
import DAOInterface.SewaBukuInterface;
import javax.swing.JOptionPane;
import model.*;
import view.MainView;
/**
 *
 * @author PC PRAKTIKUM
 */
public class SewaBukuController {
    MainView frame;
    SewaBukuInterface Implsewa_buku;
    List<sewa_buku>dp;
    
    public SewaBukuController(MainView frame){
        this.frame = frame;
        Implsewa_buku = new SewaBukuDAO();
        dp = Implsewa_buku.getALL();
    }
    
    public void isiTabel(){
        dp = Implsewa_buku.getALL();
        ModelSewaBuku mp = new ModelSewaBuku(dp);
        frame.getTabelSewaBuku().setModel(mp);
    }
    
    public void insert(){
        sewa_buku dp = new sewa_buku();
        dp.setNama_penyewa(frame.getNama_penyewa().getText());
        dp.setJudul_buku(frame.getJudul_buku().getText());
        dp.setJenis_buku(frame.getJenis_buku().getText());
        dp.setNomor_telepon(frame.getNomor_telepon().getText());
        dp.setDurasi_sewa(Integer.parseInt(frame.getDurasi_sewa().getText()));
        dp.setTotal_biaya(dp.getTotal_biaya());
        Implsewa_buku.insert(dp);
    }
    
    public void update(){
        sewa_buku dp = new sewa_buku();
        dp.setNama_penyewa(frame.getNama_penyewa().getText());
        dp.setJudul_buku(frame.getJudul_buku().getText());
        dp.setJenis_buku(frame.getJenis_buku().getText());
        dp.setNomor_telepon(frame.getNomor_telepon().getText());
        dp.setDurasi_sewa(Integer.parseInt(frame.getDurasi_sewa().getText()));
        dp.setTotal_biaya(dp.getTotal_biaya());
        dp.setId(Integer.parseInt(frame.getId().getText()));
        Implsewa_buku.update(dp);
    }
    
    public void delete(){
        String nama_penyewa = frame.getNama_penyewa().getText();
        Implsewa_buku.delete(nama_penyewa);
    }
}

