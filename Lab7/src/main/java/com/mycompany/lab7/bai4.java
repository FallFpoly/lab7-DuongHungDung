/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai4 {
    static ArrayList<SinhVienPoly> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1 -> nhap();
                case 2 -> xuat();
                case 3 -> svGioi();
                case 4 -> sapXep();
                case 5 -> System.out.println("Ket thuc chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }

    public static void menu() {
        System.out.println("\n====== MENU SINH VIEN ======");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat thong tin danh sach sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Ket thuc");
        System.out.println("====================================");
    }

    public static void nhap() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Sinh vien thu " + (i + 1) + " ---");
            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Nganh (IT/Biz): ");
            String nganh = sc.nextLine();

            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Diem Java: ");
                double java = Double.parseDouble(sc.nextLine());
                System.out.print("Diem HTML: ");
                double html = Double.parseDouble(sc.nextLine());
                System.out.print("Diem CSS: ");
                double css = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienIT(hoTen, java, html, css));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Diem Marketing: ");
                double mkt = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Sales: ");
                double sales = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienBiz(hoTen, mkt, sales));
            } else {
                System.out.println("Nganh khong hop le, bo qua!");
            }
        }
    }

    public static void xuat() {
        System.out.println("\n=DANH SACH SINH VIEN =");
        for (SinhVienPoly sv : list) {
            sv.xuat();
        }
    }

    public static void svGioi() {
        System.out.println("\n= DANH SACH SINH VIEN GIOI =");
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi") || sv.getHocLuc().equalsIgnoreCase("Xuat sac")) {
                sv.xuat();
            }
        }
    }

    public static void sapXep() {
        Collections.sort(list, Comparator.comparingDouble(SinhVienPoly::getDiem).reversed());
        System.out.println("\n===== DANH SACH SAU KHI SAP XEP GIAM DAN THEO DIEM =====");
        xuat();
    }
}