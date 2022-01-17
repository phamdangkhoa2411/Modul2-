package bai_tap_them.service.impl;

import bai_tap_them.controller.QuanLyPhuongTienGiaoThong;
import bai_tap_them.model.XeTai;
import bai_tap_them.service.XeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceimpl implements XeTaiService {
    static List<XeTai> xeTaiList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addNewXeTai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số xe tải ");
        String BienSoXe = scanner.nextLine();
        System.out.println("nhập hãng sản xuất xe tải");
        String namehang = scanner.nextLine();
        System.out.println("nhập năm sản xuất xe tải ");
        int YearOfmanuFacture = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ xe");
        String ChuXe = scanner.nextLine();
        System.out.println("nhập trọng tải của xe");
        String TrongTai = scanner.nextLine();
        XeTai xeTai = new XeTai(BienSoXe, namehang, YearOfmanuFacture, ChuXe, TrongTai);
        xeTaiList.add(xeTai);


    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);

        }

    }

    @Override
    public void deleteXeTai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số cần xóa");
        String xoaBienso = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < xeTaiList.size(); i++) {
            System.out.println(xeTaiList.get(i).getBienSoXe());
            if (xeTaiList.get(i).getBienSoXe().equals(xoaBienso)) {
                check = true;
                System.out.println("Are you sure");
                System.out.println("1 yes");
                System.out.println("2 No");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeTaiList.remove(i);
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
