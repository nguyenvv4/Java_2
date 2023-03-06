/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap.model;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {

    private int id;

    private String ten;

    private String diaChi;

    private int trangThai;

    public String hienThiTrangThai(int trangThai) {
        if (trangThai == 1) {
            return "Passed";
        }
        return "Failed";
    }

    public SinhVien() {
    }

    public SinhVien(int id, String ten, String diaChi, int trangThai) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
