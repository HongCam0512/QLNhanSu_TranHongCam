package QuanLyNhanSu.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import QuanLyNhanSu.Model.*;

public class TruyVanNhanVien {
    Scanner scanner = new Scanner(System.in);
    NhanVienThuong nhanVien = new NhanVienThuong();
    List<NhanVienThuong> listNhanVien = new ArrayList<>();
    List<TruongPhong> listTruongPhong = new ArrayList<>();
    List<GiamDoc> listGiamDoc = new ArrayList<>();

    List<NhanVien> list = new ArrayList<>();

    public void themNhanVien() {
        while (true) {
            System.out.println("1- Thêm giám đôc");
            System.out.println("2- Thêm trưởng phòng");
            System.out.println("3- Thêm nhân viên");
            System.out.println("4- Thoát");
            int chon;
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    GiamDoc giamDoc = new GiamDoc();
                    giamDoc.nhapThongtin(scanner);
                    giamDoc.tinhLuongNV();
                    listGiamDoc.add(giamDoc);
                    list.add(giamDoc);
                    break;
                case 2:
                    TruongPhong truongPhong = new TruongPhong();
                    truongPhong.nhapThongtin(scanner);
                    truongPhong.tinhLuongNV();
                    listTruongPhong.add(truongPhong);
                    list.add(truongPhong);
                    break;
                case 3:
                    NhanVienThuong nhanVienThuong = new NhanVienThuong();
                    nhanVienThuong.nhapThongtin(scanner);
                    nhanVienThuong.tinhLuongNV();
                    listNhanVien.add(nhanVienThuong);
                    list.add(nhanVienThuong);
                    break;
                case 4: return;
                default:
                    System.out.println("Nhập lại lựa chọn");
                    continue;
            }
        }
    }
    public void xoaNhanVien() {
        int maNV;
        int remove = 0;
        System.out.print("Nhập mã nhân viên cần xóa");
        maNV = scanner.nextInt();
        for (int i=0; i< list.size(); i++) {
            if (maNV == list.get(i).getMaSo()) {
                list.remove(i);
                remove=1;
                for (int j=0; j<listTruongPhong.size(); j++) {
                    if (maNV == listTruongPhong.get(i).getMaSo()) {
                        for (int k=0; k<listNhanVien.size(); k++) {
                            if (maNV == listNhanVien.get(k).getMaTruongPhong()) {
                                listNhanVien.get(k).setMaTruongPhong(0);
                            }
                        }
                        listTruongPhong.remove(i);
                        return;
                    }
                }
                for (int j=0; j<listNhanVien.size(); j++) {
                    if (maNV == listNhanVien.get(j).getMaSo()) {
                        listNhanVien.remove(j);
                        return;
                    }
                }
                for (int j=0; j<listTruongPhong.size(); j++) {
                    if (maNV == listTruongPhong.get(j).getMaSo()) {
                        listNhanVien.remove(j);
                        return;
                    }
                }

            }
        }
        if (remove==0) {
            System.out.print("Không tìm thấy mã nhân viên");
        }
    }

    public void xuatTatCaNhanVien() {
        System.out.print("--------------Thông tin tất cả nhân viên--------------------\n");
        for (NhanVien i:list) {
            System.out.println(i.xuatThongtin());
        }
    }

    public long tongLuongCongTy() {
        long sum =0;
        for(NhanVien i: list) {
            sum +=i.tinhLuongNV();
        }
        return sum;

    }
    public void nhanVienLuongCaoNhat() {
        int viTri = 0;
        var max = list.get(0).getLuong();
        for(int i=0; i<list.size(); i++) {
            if (max<list.get(i).getLuong()) {
                max = list.get(i).getLuong();
                viTri = i;
            }
        }
        System.out.print("Nhân viên có lương cao nhất là: \n");
        System.out.print(list.get(viTri).xuatThongtin());
    }
    public void nhanVienNhieuNhat() {
        int viTri =0;
        var max = listTruongPhong.get(0).getSoNhanVien();
        for(int i=0; i<listTruongPhong.size(); i++) {
            if (max<listTruongPhong.get(i).getSoNhanVien()) {
                max = listTruongPhong.get(i).getSoNhanVien();
                viTri = i;
            }
        }
        System.out.print("Trưởng phòng có số nhân viên nhiều nhất là: \n");
        System.out.print(listTruongPhong.get(viTri).xuatThongtin());
    }
    public void soCoPhan() {
        int viTri =0;
        var max = listGiamDoc.get(0).getSoCoPhan();
        for(int i=0; i<listGiamDoc.size(); i++) {
            if (max<listGiamDoc.get(i).getSoCoPhan()) {
                max = listGiamDoc.get(i).getSoCoPhan();
                viTri = i;
            }
        }
        System.out.print("Giám đốc có số cổ phần nhiều nhất là: \n");
        System.out.print(listGiamDoc.get(viTri).xuatThongtin());
    }
    public void thuNhapGiamDoc(double doanhThuThang) {
        float loiNhuan = (float) (doanhThuThang - tongLuongCongTy());
        for (int i=0; i<listGiamDoc.size(); i++) {
            float thuNhap = listGiamDoc.get(i).getLuong()+ (listGiamDoc.get(i).getSoCoPhan()/100)*loiNhuan;
            System.out.print("Mã giám đốc: "+ listGiamDoc.get(i).getMaSo() +"\t\t\t\t\t");
            System.out.print("Tổng thu nhâp: "+ thuNhap);
        }
    }
    public void xsNhanVienTheoLuong() {
        Collections.sort(list);
        for (NhanVien i: list) {
            System.out.print("Mã nhân viên " + i.getMaSo() +"\t\t Lương " + i.getLuong() +"\n");

        }
    }
    public void xsNhanVienTheoTen(){
        Collections.sort(list,NhanVien.xsTenNhanVien);
        for (NhanVien i: list) {
            System.out.print("Mã nhân viên " + i.getMaSo() +"\t\t họ tên " + i.getHoTen() +"\n");
        }
    }
    public void nhanVienToTruongPhong() {
        int maNV;
        System.out.print("Nhập mã nhân viên muốn phân bổ vào trường phòng ");
        maNV = scanner.nextInt();

        for (int i=0; i<listNhanVien.size(); i++) {
            if (maNV ==  listNhanVien.get(i).getMaSo()) {
                var truongPhong = new TruongPhong();
                truongPhong.setMaSo(listNhanVien.get(i).getMaSo());
                truongPhong.setHoTen(listNhanVien.get(i).getHoTen());
                truongPhong.setSoDienThoai(listNhanVien.get(i).getSoDienThoai());
                truongPhong.setSoNgayLam(listNhanVien.get(i).getSoNgayLam());
                truongPhong.setSoNhanVien(0);
                truongPhong.setLuong(listNhanVien.get(i).getLuong());
                listTruongPhong.add(truongPhong);
                System.out.println("Phân bổ Nhân viên vào Trưởng phòng: " + truongPhong.xuatThongtin());
            }
        }
    }
}
