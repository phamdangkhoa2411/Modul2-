package bai_tap_them.service.impl;

import bai_tap_them.model.XeTai;
import bai_tap_them.service.XeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceimpl implements XeTaiService {
    static List<XeTai>xeTaiList=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void deleteXeTai() {

    }

    @Override
    public void addNewXeTai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số xe máy ");
        String BienSoXe = scanner.nextLine();
        System.out.println("nhập hãng sản xuất xe máy ");
        String namehang = scanner.nextLine();
        System.out.println("nhập năm sản xuất xe máy ");
        int YearOfmanuFacture = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ xe");
        String ChuXe = scanner.nextLine();
        System.out.println("nhập trọng tải của xe");
        String TrongTai = scanner.nextLine();

    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai: xeTaiList ) {
            System.out.println(xeTai);

        }

    }
}
