package on_tap.service.impl;
import on_tap.controler.quanglysanpham;
import on_tap.model.Sanphamnhapkhau;
import on_tap.service.Sanphamnhapkhauservice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sanphamnhapkhauserviceimpl implements Sanphamnhapkhauservice {
    static List<Sanphamnhapkhau> sanphamnhapkhauList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static {
        sanphamnhapkhauList=readerNhapkhau();
    }


    public void  Write(){
        try {
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\on_tap\\data\\sanphamnhapkhau.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Sanphamnhapkhau sanphamnhapkhau: sanphamnhapkhauList){
                bufferedWriter.write(sanphamnhapkhau.getId()+","+sanphamnhapkhau.getName()+","+ sanphamnhapkhau.getPrice()+","+ sanphamnhapkhau.getQuantily()+","+ sanphamnhapkhau.getProducer()+","+
                        sanphamnhapkhau.getGianhapkhau()+","+ sanphamnhapkhau.getTinhnhapkhau()+","+ sanphamnhapkhau.getThuenhapkhau());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public static  List<Sanphamnhapkhau> readerNhapkhau() {
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\on_tap\\data\\sanphamnhapkhau.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Sanphamnhapkhau sanphamnhapkhau = new Sanphamnhapkhau(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], temp[7]);
                sanphamnhapkhauList.add(sanphamnhapkhau);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return sanphamnhapkhauList;

    }

        @Override
    public void addnhapkhau() {
//        String id, String name, String price,
//        int quantily, String producer,
//        String gianhapkhau, String tinhnhapkhau,
//        String thuenhapkhau
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm ");
        String id = scanner.nextLine();


        String name;
        while (true){
            System.out.println("nhập tên sản phẩm ");
            name = scanner.nextLine();
            if (name.trim().equals("")){
                System.out.println("Nhập lại");
            }else {
                break;
            }

        }

        System.out.println("nhập giá sản phẩm ");
        String price = scanner.nextLine();

        int quantily;
        do {
            try {
                System.out.println("nhập số lượng sản phẩm");
                quantily = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập sai");
            }
        } while (true);

        String producer ;
            while (true) {
                System.out.println("nhập nhà sản xuất");
                producer = scanner.nextLine();
                if (producer.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
        System.out.println("nhập giá nhập khẩu ");
        String gianhapkhau;

            while (true) {
                System.out.println("nhập giá nhập khẩu ");
                gianhapkhau = scanner.nextLine();
                if (gianhapkhau.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }

        String tinhnhapkhau ;
            while (true) {
                System.out.println("nhập tỉnh nhập khẩu sản phẩm");
                tinhnhapkhau = scanner.nextLine();
                if (tinhnhapkhau.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }

        String thuenhapkhau ;
            while (true) {
                System.out.println("nhập thuế nhập khẩu ");
                thuenhapkhau= scanner.nextLine();
                if (thuenhapkhau.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
        Sanphamnhapkhau sanphamxuatkhau = new Sanphamnhapkhau(id, name, price,
                quantily, producer, gianhapkhau, tinhnhapkhau, thuenhapkhau);
        sanphamnhapkhauList.add(sanphamxuatkhau);
        Write();
            System.out.println("đã thêm mới thành công");
    }

    @Override
    public void displaynhapkhau() {
        for (Sanphamnhapkhau sanphamnhapkhau : sanphamnhapkhauList) {
            System.out.println(sanphamnhapkhau);

        }

    }

    @Override
    public void deletenhapkhau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần xóa");
        String xoasanpham = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < sanphamnhapkhauList.size(); i++) {
            System.out.println(sanphamnhapkhauList.get(i).getId());
            if (sanphamnhapkhauList.get(i).getId().equals(xoasanpham)) ;
            check = true;
            System.out.println("bạn có chắc không");
            System.out.println("1 có");
            System.out.println("2 không");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sanphamnhapkhauList.remove(i);
                    System.out.println("đã xóa thành công");
                    break;
                case 2:
                    quanglysanpham.displayMenu();
                    break;
            }

        }
    Write();

    }

    @Override
    public void searchnhapkhau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần tìm");
        String timsanpham = scanner.nextLine();
        for (int i = 0; i < sanphamnhapkhauList.size(); i++) {
            System.out.println(sanphamnhapkhauList.get(i).getId());
            if (sanphamnhapkhauList.get(i).getId().contains(timsanpham)) ;
            System.out.println(sanphamnhapkhauList.get(i));

        }
    }




}

