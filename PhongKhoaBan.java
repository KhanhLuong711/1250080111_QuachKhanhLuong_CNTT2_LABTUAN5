package labtuan5;
import java.util.Scanner;
public class PhongKhoaBan {
    private String maPhongKhoaBan;
    private String tenPhongKhoaBan;

    public PhongKhoaBan() {
        this.maPhongKhoaBan = "";
        this.tenPhongKhoaBan = "";
    }
    public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public String getMaPhongKhoaBan() {
        return maPhongKhoaBan;
    }
    public void setMaPhongKhoaBan(String maPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
    }
    public String getTenPhongKhoaBan() {
        return tenPhongKhoaBan;
    }
    public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public void nhap(Scanner scanner) {
        System.out.print("Nhap ma phong/khoa/ban: ");
        this.maPhongKhoaBan = scanner.nextLine();
        System.out.print("Nhap ten phong/khoa/ban: ");
        this.tenPhongKhoaBan = scanner.nextLine();
    }
    public void xuat() {
        System.out.println("Ma phong/khoa/ban: " + maPhongKhoaBan);
        System.out.println("Ten phong/khoa/ban: " + tenPhongKhoaBan);
    }
}