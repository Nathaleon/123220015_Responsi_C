/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;
import java.util.List;
import model.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface SewaBukuInterface {
    public void insert(sewa_buku m);
    public void update(sewa_buku m);
    public void delete(String nama_penyewa);
    public List<sewa_buku> getALL();
}
