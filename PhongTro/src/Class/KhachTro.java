package Class;

import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
    // thuoc tinh
    private Date ngayBatDauTro;
    private Date ngayHetHanHopDong;
    private int soPhong;
    private double giaPhong;

    // phuong thuc
    // ham khoi tao khong doi so
    public KhachTro() {

    }

    // ham khoi tao co doi so
    public KhachTro(String hoTen, int CMND,Date ngayBatDauTro,Date ngayHetHanHopDong,int soPhong, String loaiPhong, double giaPhong) {
        this.hoTen = hoTen;
        this.CMND = CMND;
        this.ngayBatDauTro=ngayBatDauTro;
        this.ngayHetHanHopDong=ngayHetHanHopDong;
        this.soPhong=soPhong;
        this.giaPhong = giaPhong;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap ngay bat dau thue: ");
        String strDate = sc.nextLine();
        ngayBatDauTro = strToDate(strDate);
        System.out.print("\tNhap ngay het han hop dong: ");
        ngayHetHanHopDong = strToDate(strDate);
        sc.nextLine();
        System.out.print("\tNhap so phong: ");
        soPhong = sc.nextInt();sc.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong = sc.nextDouble();
        sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tNgay bat dau hop dong: " + ngayBatDauTro);
        System.out.println("\tNgay het han hop dong: " + ngayHetHanHopDong);
        System.out.println("\tLoai phong: " + soPhong);
        System.out.println("\tGia phong: " + giaPhong);
    }


    // ham lay thong tin gia phong
    public double getGiaPhong() {
        return giaPhong;
    }
}
