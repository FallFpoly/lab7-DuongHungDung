/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

// ======== LỚP CHA: CHUNHAT ========
class ChuNhat {
    protected double dai;
    protected double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.printf("Hinh chu nhat - Dai: %.2f, Rong: %.2f, Dien tich: %.2f, Chu vi: %.2f\n",
                dai, rong, getDienTich(), getChuVi());
    }
}

// ======== LỚP CON: VUONG ========
class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh); // gọi constructor lớp cha
    }

    @Override
    public void xuat() {
        System.out.printf("Hinh vuong - Canh: %.2f, Dien tich: %.2f, Chu vi: %.2f\n",
                dai, getDienTich(), getChuVi());
    }
}

// ======== LỚP CHÍNH CHỨA MAIN ========
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 hình chữ nhật
        System.out.println("=== NHAP 2 HINH CHU NHAT ===");
        System.out.print("Nhap chieu dai hcn 1: ");
        double dai1 = sc.nextDouble();
        System.out.print("Nhap chieu rong hcn 1: ");
        double rong1 = sc.nextDouble();

        System.out.print("Nhap chieu dai hcn 2: ");
        double dai2 = sc.nextDouble();
        System.out.print("Nhap chieu rong hcn 2: ");
        double rong2 = sc.nextDouble();

        // Nhập hình vuông
        System.out.println("\n=== NHAP HINH VUONG ===");
        System.out.print("Nhap canh hinh vuong: ");
        double canh = sc.nextDouble();

        // Tạo đối tượng
        ChuNhat cn1 = new ChuNhat(dai1, rong1);
        ChuNhat cn2 = new ChuNhat(dai2, rong2);
        ChuNhat vu = new Vuong(canh);

        // Xuất thông tin
        System.out.println("\n=== THONG TIN CAC HINH ===");
        cn1.xuat();
        cn2.xuat();
        vu.xuat();
    }
}
