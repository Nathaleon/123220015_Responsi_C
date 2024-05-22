/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelSewaBuku extends AbstractTableModel {
    List<sewa_buku>dp;
    public ModelSewaBuku(List<sewa_buku>dp){
        this.dp = dp;
    }
    
    @Override
    public int getRowCount(){
        return dp.size();
    }
    
    @Override
    public int getColumnCount(){
        return 7;
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "id";
            case 1:
                return "nama_penyewa";
            case 2:
                return "judul_buku";
            case 3:
                return "jenis_buku";
            case 4:
                return "nomor telepon";
            case 5:
                return "durasi_sewa";
            case 6:
                return "total_biaya";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row,int column){
        switch(column){
            case 0:
                return dp.get(row).getId();
            case 1:
                return dp.get(row).getNama_penyewa();
            case 2:
                return dp.get(row).getJudul_buku();
            case 3:
                return dp.get(row).getJenis_buku();
            case 4:
                return dp.get(row).getNomor_telepon();
            case 5:
                return dp.get(row).getDurasi_sewa();
            case 6:
                return dp.get(row).getTotal_biaya();
            default:
                return null;
        }
    }
}
    
