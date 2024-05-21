/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class sewa_buku {
    private int id,durasi_sewa,total_biaya,tambah_hari;
    private String nama_penyewa,judul_buku,jenis_buku,nomor_telepon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDurasi_sewa() {
        return durasi_sewa;
    }

    public void setDurasi_sewa(int durasi_sewa) {
        this.durasi_sewa = durasi_sewa;
    }

    public int getTotal_biaya() {
        if(durasi_sewa <= 2){
            total_biaya = durasi_sewa * 10000;
        } else {
            tambah_hari = (durasi_sewa - 2)* 5000;
            total_biaya = tambah_hari + 20000;
        }
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getJenis_buku() {
        return jenis_buku;
    }

    public void setJenis_buku(String jenis_buku) {
        this.jenis_buku = jenis_buku;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }
    
    
}

