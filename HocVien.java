package labtuan5;
import java.util.Scanner;
public class HocVien extends ConNguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
        super();
        this.diem1 = this.diem2 = this.diem3 = 0;
    }
    public HocVien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public float getDiem1() {
        return diem1;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhap diem 1: ");
        this.diem1 = scanner.nextFloat();
        System.out.print("Nhap diem 2: ");
        this.diem2 = scanner.nextFloat();
        System.out.print("Nhap diem 3: ");
        this.diem3 = scanner.nextFloat();
        scanner.nextLine();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem 1: " + diem1);
        System.out.println("Diem 2: " + diem2);
        System.out.println("Diem 3: " + diem3);
    }
}
