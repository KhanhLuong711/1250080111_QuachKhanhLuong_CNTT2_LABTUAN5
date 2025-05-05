package labtuan5;
import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hoc vien:");
        HocVien hocVien = new HocVien();  
        hocVien.nhap(scanner);

        System.out.println("Nhap thong tin nhan vien:");
        NhanVienbai5 nhanVien = new NhanVienbai5(); 
        nhanVien.nhap(scanner);

        System.out.println("Thong tin hoc vien:");
        hocVien.xuat();

        System.out.println("Thong tin nhan vien:");
        nhanVien.xuat();

        scanner.close();
    }
}
