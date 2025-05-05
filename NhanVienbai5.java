package labtuan5;

import java.util.Scanner; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVienbai5 extends ConNguoi {
    private double luong;
    private Date ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVienbai5() {
        super();
        this.luong = 0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = new PhongKhoaBan();
    }

    public NhanVienbai5(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(Date ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongKhoaBan getPhongKhoaBan() {
        return phongKhoaBan;
    }

    public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
        this.phongKhoaBan = phongKhoaBan;
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhap luong: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nhap ngay nhan viec (dd/MM/yyyy): ");
        String dateStr = scanner.nextLine();
        try {
            this.ngayNhanViec = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay. Dat ngay hien tai.");
            this.ngayNhanViec = new Date();
        }

        this.phongKhoaBan = new PhongKhoaBan();
        this.phongKhoaBan.nhap(scanner);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + luong);
        if (ngayNhanViec != null) {
            System.out.println("Ngay nhan viec: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayNhanViec));
        } else {
            System.out.println("Ngay nhan viec: Chua xac dinh");
        }
        phongKhoaBan.xuat();
    }
}
