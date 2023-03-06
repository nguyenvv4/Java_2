/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ontap.service;

import java.util.ArrayList;
import ontap.model.SinhVien;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySinhVienService {

    public ArrayList<SinhVien> getAll();
    
    public String them(SinhVien sinhvien);

}
