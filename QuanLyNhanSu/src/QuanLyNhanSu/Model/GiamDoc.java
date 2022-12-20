package QuanLyNhanSu.Model;

import java.util.Scanner;

public class GiamDoc extends NhanVien{
    private float soCoPhan;
    public static int luongCoBan = 300;
    public GiamDoc() {

    }

    @Override
    public void nhapThongtin(Scanner scanner) {
        super.nhapThongtin(scanner);
        System.out.print("Nhập số cổ phần ");
        soCoPhan = scanner.nextFloat();
        if (soCoPhan<0 || soCoPhan>100) {
            System.out.println("Nhập lai số cổ phần ");
            soCoPhan = scanner.nextFloat();
        }
    }
    public String xuatThongtin() {
        return super.xuatThongtin()+ "\n, lương cơ bản: " + luongCoBan + ", số cổ phần: " + this.soCoPhan;
    }

    @Override
    public long tinhLuongNV() {
        this.setLuong(soNgayLam*300);
        return soNgayLam*300;
    }

    public void setSoCoPhan(float soCoPhan) {
        this.soCoPhan = soCoPhan;
    }

    public float getSoCoPhan() {
        return soCoPhan;
    }
}
