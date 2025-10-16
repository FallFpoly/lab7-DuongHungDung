/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
public class bai3 {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienIT("Nguyen Van A", 8.0, 7.0, 9.0);
        SinhVienPoly sv2 = new SinhVienBiz("Tran Thi B", 7.5, 8.5);
        SinhVienPoly sv3 = new SinhVienIT("Le Van C", 5.0, 6.0, 4.0);

        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
    }
}