package bai_tap_them.service.impl;

import bai_tap_them.controller.QuanLyPhuongTienGiaoThong;
import bai_tap_them.model.XeMay;
import bai_tap_them.service.XeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceimpl implements XeMayService {

    static List<XeMay>xeMayList= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


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
    @Override
    public void deleteXeMay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số cần xóa");
        String xoaBienso = scanner.nextLine();
        boolean check = false;
        for (int i = 0 ; i < xeMayList.size();i++) {
            System.out.println(xeMayList.get(i).getBienSoXe());
            if (xeMayList.get(i).getBienSoXe().equals(xoaBienso)) {
                check = true;
                System.out.println("Are you sure");
                System.out.println("1 yes");
                System.out.println("2 No");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeMayList.remove(i);
                        System.out.println("Đã xóa thành công");
                        break;
                    case 2:
                        QuanLyPhuongTienGiaoThong.displayMenu();
                        break;

                }

            }
        }
    }
}