package bai_tap_them.service.impl;

import bai_tap_them.model.XeMay;
import bai_tap_them.service.XeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceimpl implements XeMayService {

    static List<XeMay>xeMayList= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void deleteXeMay() {

    }

    @Override
    public  void addNewXeMay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số xe máy ");
        String BienSoXe = scanner.nextLine();
        System.out.println("nhập hãng sản xuất xe máy ");
        String namehang = scanner.nextLine();
        System.out.println("nhập năm sản xuất xe máy ");
        int YearOfmanuFacture = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ xe");
        String ChuXe = scanner.nextLine();
        System.out.println("nhập số công xuất");
        String CongXuat = scanner.nextLine();
        XeMay xeMay = new XeMay(BienSoXe,namehang,YearOfmanuFacture,ChuXe,CongXuat);
        xeMayList.add(xeMay);

    }

    @Override
    public  void displayXeMay() {
        for (XeMay xeMay:xeMayList) {
            System.out.println(xeMay);

        }
    }
}
