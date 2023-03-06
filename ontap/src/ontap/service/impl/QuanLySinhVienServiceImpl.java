/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap.service.impl;

import java.util.ArrayList;
import ontap.model.SinhVien;
import ontap.service.QuanLySinhVienService;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVienServiceImpl implements QuanLySinhVienService {

    private ArrayList<SinhVien> listSinhViens = new ArrayList<>();

    public QuanLySinhVienServiceImpl() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "Ha Noi", 1);
        SinhVien sinhVien1 = new SinhVien(2, "Nguyen Van B", "Hai Phong", 0);

        listSinhViens.add(sinhVien1);
        listSinhViens.add(sinhVien);
    }

    @Override
    public ArrayList<SinhVien> getAll() {
        // getList
        return listSinhViens;
    }

    @Override
    public String them(SinhVien sinhvien) {
        if (sinhvien.getId() < 0) {
            return "Them that bai";
        } else {
            listSinhViens.add(sinhvien);
            return "Them thanh cong";
        }
    }

}
