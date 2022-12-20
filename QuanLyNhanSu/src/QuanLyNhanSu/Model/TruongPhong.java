package QuanLyNhanSu.Model;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private int soNhanVien;
    public static int luongCoBan = 200;
    public TruongPhong() {

    }

    @Override
    public void nhapThongtin(Scanner scanner) {
        super.nhapThongtin(scanner);
        System.out.print("Nhập số nhân viên được quản lý ");
        soNhanVien = scanner.nextInt();
    }
    public String xuatThongtin() {
        return super.xuatThongtin()+ "\n, lương cơ bản: " + luongCoBan + ", số nhân viê quản lý: " + this.soNhanVien;

    }
    @Override
    public long tinhLuongNV() {
        this.setLuong(soNgayLam*200 + 100*soNhanVien);
        return soNgayLam*200 + 100*soNhanVien;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
}
