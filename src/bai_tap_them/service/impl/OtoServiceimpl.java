package bai_tap_them.service.impl;

import bai_tap_them.model.Oto;

import bai_tap_them.service.OtoService;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class OtoServiceimpl implements OtoService {
    static List<Oto> otoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public  void deleteOto() {

    }

    @Override
    public  void addNewOto() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số oto ");
        String BienSoXe = scanner.nextLine();
        System.out.println("nhập hãng sản xuất oto ");
        String namehang = scanner.nextLine();
        System.out.println("nhập năm sản xuất oto ");
        int YearOfmanuFacture = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ xe");
        String ChuXe = scanner.nextLine();
        System.out.println("nhập số chỗ ngồi");
        int SoChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập loại xe ");
        String LoaiXe = scanner.nextLine();
        Oto oto = new Oto(BienSoXe, namehang, YearOfmanuFacture, ChuXe, SoChoNgoi, LoaiXe);
        otoList.add(oto);

    }

    @Override
    public  void displayOto() {
        for (Oto oto : otoList) {
            System.out.println(oto);

        }

    }
}