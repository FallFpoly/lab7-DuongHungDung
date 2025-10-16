package com.mycompany.lab7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SinhVienBiz extends SinhVienPoly {
    private final double diemMarketing;
    private final double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
