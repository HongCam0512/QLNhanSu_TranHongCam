package QuanLyNhanSu;

import QuanLyNhanSu.Model.CongTy;
import QuanLyNhanSu.Controller.TruyVanNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        CongTy congTy = new CongTy();
        TruyVanNhanVien danhSachNhanVien = new TruyVanNhanVien();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1-Nhập thông tin công ty");
            System.out.println("2- Phân bổ nhân viên vào trưởng phòng");
            System.out.println("3- Thêm một nhân sự");
            System.out.println("4- Xóa một nhân sự");
            System.out.println("5- Xuất toàn bộ nhân viên trong công ty");
            System.out.println("6- Tính và xuất lương cho toàn công ty");
            System.out.println("7- Tìm nhân viên có lương cao nhất");
            System.out.println("8- Tìm trưởng phòng có số nhân viên nhiều nhất");
            System.out.println("9- Sắp xếp toàn nhân viên theo thứ tự abc");
            System.out.println("10- Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
            System.out.println("11- Tìm giám đốc có số cổ phần nhiều nhất");
            System.out.println("12- Tính và xuất tổng thu nhâp của các Giám Đốc");
            System.out.println("13- Thoát");
            int luaChon;
            System.out.println("Nhập lựa chọn của bạn");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1: congTy.nhapThongTin(new Scanner(System.in));
                    break;
                case 2:danhSachNhanVien.nhanVienToTruongPhong();
                    break;
                case 3: danhSachNhanVien.themNhanVien();
                    break;
                case 4:danhSachNhanVien.xoaNhanVien();
                    break;
                case 5:danhSachNhanVien.xuatTatCaNhanVien();
                    break;
                case 6:danhSachNhanVien.tongLuongCongTy();
                    break;
                case 7:danhSachNhanVien.nhanVienLuongCaoNhat();
                    break;
                case 8:danhSachNhanVien.nhanVienNhieuNhat();
                    break;
                case 9:danhSachNhanVien.xsNhanVienTheoTen();
                    break;
                case 10:danhSachNhanVien.xsNhanVienTheoLuong();
                    break;
                case 11:danhSachNhanVien.soCoPhan();
                    break;
                case 12:
                    double doanhThuThang;
                    do {
                        System.out.print("Nhập doanh thu tháng của công ty:");
                        doanhThuThang = scanner.nextDouble();
                    } while(doanhThuThang<0);
                    danhSachNhanVien.thuNhapGiamDoc(doanhThuThang);
                    break;
                case 13:
                    return;
                default:
                    System.out.println("Nhập lại lựa chọn");
                    continue;
            }
        }

    }
 }

