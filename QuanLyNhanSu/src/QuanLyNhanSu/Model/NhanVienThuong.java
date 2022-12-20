package QuanLyNhanSu.Model;

import java.util.Scanner;

public class NhanVienThuong extends NhanVien{
    private int maTruongPhong;

    public static int luongCoBan = 100;
    public NhanVienThuong() {

    }

    @Override
    public void nhapThongtin(Scanner scanner) {
        super.nhapThongtin(scanner);
        System.out.print("Nhập mã số trưởng phòng quản lý ");
        maTruongPhong = scanner.nextInt();
    }
    public String xuatThongtin() {
        return super.xuatThongtin()+ "\n, lương cơ bản: " + luongCoBan + ", mã trưởng phòng: " + this.maTruongPhong;

    }

    @Override
    public long tinhLuongNV() {
        this.setLuong(soNgayLam*100);
        return soNgayLam*100;
    }

    public int getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(int maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}
