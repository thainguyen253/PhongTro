package Test;

import java.util.Scanner;

import Class.KhachSan;

public class Testing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql = new KhachSan();

        ql.nhapDanhSach(sc);

      ql.hienThiDanhSach();

        sc.close();
    }

}
