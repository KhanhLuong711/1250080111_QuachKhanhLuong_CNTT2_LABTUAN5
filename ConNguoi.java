package labtuan5;
import java.util.Scanner;

public class ConNguoi{
    protected String hoTen;
    protected int namSinh;

    public ConNguoi(){
        this.hoTen = "";
        this.namSinh = 0;
    }
    public ConNguoi(String hoTen, int namSinh){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public int getNamSinh(){
        return namSinh;
    }

    public void setNamSinh(int namSinh){
        this.namSinh = namSinh;
    }

    public void nhap(Scanner scanner){
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = scanner.nextInt();
        scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
    }
}
