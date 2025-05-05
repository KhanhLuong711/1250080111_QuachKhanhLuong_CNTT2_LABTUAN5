package labtuan5;
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Hinh[] ds = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh:");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    break;
                default:
                    System.out.println("Chon khong hop le, tao hinh vuong mac dinh");
                    ds[i] = new HinhVuong();
            }
            ds[i].nhap();
        }

        System.out.println("\nDanh sach cac hinh:");
        for (Hinh hinh : ds) {
            hinh.xuat();
        }

        Hinh hinhMax = ds[0];
        for (Hinh hinh : ds) {
            if (hinh.dienTich() > hinhMax.dienTich()) {
                hinhMax = hinh;
            }
        }
        System.out.println("\nHinh co dien tich lon nhat:");
        hinhMax.xuat();
    }
}
