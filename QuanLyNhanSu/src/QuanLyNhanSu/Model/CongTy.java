package QuanLyNhanSu.Model;

import java.util.Scanner;

public class CongTy {
        private String tenCongTy;
        private String maSoThue;
        private float doanhThu;

        public CongTy() {

        }
        public void nhapThongTin(Scanner scanner) {
            System.out.print("Nhap ten cong ty ");
            tenCongTy = scanner.nextLine();
            System.out.print("Nhap ma so thue cong ty ");
            maSoThue = scanner.nextLine();
        }

        public void xuatThongTinCongTY() {
            System.out.println("Ten cong ty: "+ this.tenCongTy);
            System.out.println("Ma so thue cong ty: " +this.maSoThue);
            System.out.println("Doanh thu cong ty: " +this.doanhThu);
        }

        public String getTenCongTy() {
            return tenCongTy;
        }

        public String getMaSoThue() {
            return maSoThue;
        }

        public float getDoanhThu() {
            return doanhThu;
        }

        public void setTenCongTy(String tenCongTy) {
            this.tenCongTy = tenCongTy;
        }

        public void setMaSoThue(String maSoThue) {
            this.maSoThue = maSoThue;
        }

        public void setDoanhThu(float doanhThu) {
            this.doanhThu = doanhThu;
        }
    }

