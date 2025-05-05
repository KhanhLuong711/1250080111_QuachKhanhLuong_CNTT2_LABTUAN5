
package labtuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy();
        System.out.println("Nhap thong tin Quan Ly:");
        quanLy.nhap();
        danhSachNhanVien.add(quanLy);

        NghienCuu nghienCuu = new NghienCuu();
        System.out.println("Nhap thong tin Nghien Cuu:");
        nghienCuu.nhap();
        danhSachNhanVien.add(nghienCuu);

        PhucVu phucVu = new PhucVu();
        System.out.println("Nhap thong tin Phuc Vu:");
        phucVu.nhap();
        danhSachNhanVien.add(phucVu);

        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }

        scanner.close();
    }
}
