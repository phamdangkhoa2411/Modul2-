package thi_pass_modul2.service.impl;


import thi_pass_modul2.controller.Menu;
import thi_pass_modul2.model.Benh_an_vip;
import thi_pass_modul2.service.benh_an_vipservice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class benh_an_vipimpl implements benh_an_vipservice {
    static List<Benh_an_vip> benh_an_vipList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static {
        benh_an_vipList=readerBenh_an_vip();
    }

    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\thi_pass_modul2\\data\\benh_an_vip.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Benh_an_vip benh_an_vip :  benh_an_vipList){
                bufferedWriter.write(benh_an_vip.getMabenhan()+","+benh_an_vip.getMabenhnhan()+","+benh_an_vip.getNgaynhapvien()+","+
                        benh_an_vip.getNgayravien()+","+benh_an_vip.getLydonhapvien()+","+
                        benh_an_vip.getLoaivip()+","+benh_an_vip.getThoihanvip());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public static List<Benh_an_vip> readerBenh_an_vip(){
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\thi_pass_modul2\\data\\benh_an_vip.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Benh_an_vip benh_an_vip = new Benh_an_vip(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], temp[5], temp[6]);
                benh_an_vipList.add(benh_an_vip);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return benh_an_vipList;

    }

    @Override
    public void addbenhanvip() {

        Scanner scanner = new Scanner(System.in);

        int mabenhan ;
        do {
            try {
                System.out.println("nhập mã bệnh án ");
                mabenhan= Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập sai");
            }
        }while (true);




        int mabenhnhan ;
        do {
            try {
                System.out.println("nhập mã bệnh nhân ");
                mabenhnhan = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập sai");
            }
        }while (true);


        String ngaynhapvien;
        while (true){
            System.out.println("nhập ngày nhập viện ");
            ngaynhapvien =  scanner.nextLine();
            if (ngaynhapvien.trim().equals("")){
                System.out.println("nhập lại");
            }else {
                break;
            }
        }

        String ngayravien ;
        while (true){
            System.out.println("nhập ngày ra viện");
            ngayravien =  scanner.nextLine();
            if (ngayravien.trim().equals("")){
                System.out.println("nhập lại");
            }else {
                break;
            }
        }


        String lydonhapvien ;
        while (true){
            System.out.println("nhập lý do nhập viện ");
            lydonhapvien =  scanner.nextLine();
            if (lydonhapvien.trim().equals("")){
                System.out.println("nhập lại");
            }else {
                break;
            }
        }


        String loaivip  ;
        while (true){
            System.out.println("nhập loại vip");
            loaivip  =  scanner.nextLine();
            if (loaivip .trim().equals("")){
                System.out.println("nhập lại");
            }else {
                break;
            }
        }


        String thoihanvip ;
        while (true){
            System.out.println("nhập thòi hạn vip");
            thoihanvip  =  scanner.nextLine();
            if (thoihanvip.trim().equals("")){
                System.out.println("nhập lại");
            }else {
                break;
            }
        }

        Benh_an_vip benh_an_vip = new Benh_an_vip( mabenhan,  mabenhnhan,  ngaynhapvien,
                ngayravien,  lydonhapvien,loaivip,thoihanvip);
        benh_an_vipList.add(benh_an_vip);
        System.out.println("thêm mới thành công");
        write();
    }


    @Override
    public void deletebenhanvip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã bệnh án cần xóa" );
        int xoabenhan = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < benh_an_vipList.size(); i++) {
            System.out.println(benh_an_vipList.get(i).getMabenhan());
            if (benh_an_vipList.get(i).getMabenhan()==(xoabenhan)){
                check= true;
                System.out.println("bạn có chắc không");
                System.out.println("1 có");
                System.out.println("2 không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        benh_an_vipList.remove(i);
                        System.out.println("đã xóa thành công");
                        break;
                    case 2 :
                        Menu.displayMenu();
                        break;
                }
            }

        }
        write();

    }

    @Override
    public void displaybenhanvip() {
    for (Benh_an_vip benh_an_vip : benh_an_vipList){
        System.out.println(benh_an_vip);
    }

    }
}
