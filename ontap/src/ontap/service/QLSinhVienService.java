/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ontap.service;

import java.util.ArrayList;
import ontap.model.SVien;

/**
 *
 * @author nguyenvv
 */
public interface QLSinhVienService {

    ArrayList<SVien> getAll();

    String them(SVien sVien);

    String update(int index, SVien sVien);

}
