package QuanLyNhanSu.Model;

import QuanLyNhanSu.QuanLyNhanSu;

import java.util.Comparator;
import java.util.Scanner;

public class NhanVien implements Comparable<NhanVien>{
    private String hoTen;
    private int maSo;
    private String soDienThoai;
    protected int soNgayLam;
    private long luong;
    public NhanVien() {

    }

    public void nhapThongtin(Scanner scanner) {
        System.out.print("Nhap ma so nhan vien:");
        this.maSo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten nhan vien:");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap so dien thoai nhan vien:");
        this.soDienThoai = scanner.next();
        System.out.print("Nhap so ngay lam cua nhan vien:");
        this.soNgayLam = scanner.nextInt();
    }
    public String xuatThongtin() {
        return "Mã nhân viên: "+ this.maSo + ", họ tên: " + this.hoTen + ", số điện thoại: " + this.soDienThoai +
                ", số ngày làm: " + this.soNgayLam + ", lương: " +this.luong;
    }
    public long tinhLuongNV() {
        return 0;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public int compareTo(NhanVien o) {
        if (luong == o.luong)
            return 0;
        else if (luong < o.luong)
            return 1;
        else
            return -1;
    }
    public static Comparator<NhanVien> xsTenNhanVien = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien s1, NhanVien s2) {
            return s1.getHoTen().compareTo(s2.getHoTen());
        }
    };


}
