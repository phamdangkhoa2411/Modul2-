package bai_tap_them.service.impl;

import bai_tap_them.controller.QuanLyPhuongTienGiaoThong;
import bai_tap_them.model.Oto;

import bai_tap_them.service.OtoService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class OtoServiceimpl implements OtoService {
    static List<Oto> otoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static {
        otoList = readerOto();
    }
    public  void write() {
        try {
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\bai_tap_them\\data\\oto.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto : otoList) {

                bufferedWriter.write(oto.getBienSoXe() + "," + oto.getNamehang() + "," + oto.getYearOfmanuFacture() + "," + oto.getChuXe() + "," + oto.getSoChoNgoi() + "," + oto.getLoaiXe());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
        public static List<Oto> readerOto() {
            try {
                FileReader fileReader = new FileReader("E:\\Codegym\\Modul2\\src\\bai_tap_them\\data\\oto.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] temp;
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    Oto oto = new Oto(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], Integer.parseInt(temp[4]), temp[5]);
                    otoList.add(oto);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            return otoList;
        }


        @Override
        public void addNewOto() {

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
             write();


        }

        @Override
        public void displayOto () {
            for (Oto oto : otoList) {
                System.out.println(oto);

            }

        }
        @Override
        public void deleteOto () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập biển số cần xóa");
            String xoaBienso = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < otoList.size(); i++) {
                System.out.println(otoList.get(i).getBienSoXe());
                if (otoList.get(i).getBienSoXe().equals(xoaBienso)) {
                    check = true;
                    System.out.println("Are you sure");
                    System.out.println("1 yes");
                    System.out.println("2 No");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            otoList.remove(i);
                            System.out.println("Đã xóa thành công");
                            break;
                        case 2:
                            QuanLyPhuongTienGiaoThong.displayMenu();
                            break;

                    }
                }
            }
            write();

        }
    }

