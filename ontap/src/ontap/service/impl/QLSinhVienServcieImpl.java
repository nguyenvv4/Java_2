/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap.service.impl;

import java.util.ArrayList;
import ontap.model.SVien;
import ontap.service.QLSinhVienService;

/**
 *
 * @author nguyenvv
 */
public class QLSinhVienServcieImpl implements QLSinhVienService {

    private ArrayList<SVien> listSinhVien = new ArrayList<>();

    public QLSinhVienServcieImpl() {
        listSinhVien.add(new SVien("Nguyen van A", 2000, 1, "Thai Binh"));
        listSinhVien.add(new SVien("Nguyen Thi B", 2002, 0, "Ha Noi"));
        listSinhVien.add(new SVien("Nguyen van C", 2001, 1, "Thai Nguyen"));
    }

    @Override
    public ArrayList<SVien> getAll() {
        return listSinhVien;
    }

    @Override
    public String them(SVien sVien) {
        if (sVien.getHoTen().length() < 10) {
            return "Ten phai dai hon 10 ki tu";
        } else {
            listSinhVien.add(sVien);
            return "Them thanh cong";
        }
    }

    @Override
    public String update(int index, SVien sVien) {
        listSinhVien.set(index, sVien);
        return "Update thanh cong";
    }

}
