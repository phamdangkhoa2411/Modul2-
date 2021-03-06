package thi_pass_modul2.service.impl;



import thi_pass_modul2.controller.Menu;
import thi_pass_modul2.model.Benh_an_thuong;
import thi_pass_modul2.service.benh_an_thuongservice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class benh_an_thuongimpl implements benh_an_thuongservice {
    static List<Benh_an_thuong> benh_an_thuongList = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
   static {
       benh_an_thuongList=readerBenh_an_thuong();
   }
   public void write(){
       try {
           FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\thi_pass_modul2\\data\\benh_an_thuong.csv");
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           for (Benh_an_thuong benh_an_thuong : benh_an_thuongList){
               bufferedWriter.write(benh_an_thuong.getMabenhan()+","+benh_an_thuong.getMabenhnhan()+","+benh_an_thuong.getNgaynhapvien()+","+
                       benh_an_thuong.getNgayravien()+","+benh_an_thuong.getLydonhapvien()+","+
                       benh_an_thuong.getPhinamvien());
               bufferedWriter.newLine();
           }
       bufferedWriter.close();
       } catch (IOException exception) {
           exception.printStackTrace();
       }

   }
    public static  List<Benh_an_thuong> readerBenh_an_thuong() {
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\thi_pass_modul2\\data\\benh_an_thuong.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Benh_an_thuong benh_an_thuong = new Benh_an_thuong(Integer.parseInt(temp[0]),Integer.parseInt( temp[1]), temp[2], temp[3], temp[4], Integer.parseInt(temp[5]));
                benh_an_thuongList.add(benh_an_thuong);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return benh_an_thuongList;

    }


    @Override
    public void addbenhanthuong() {

        Scanner scanner = new Scanner(System.in);
        int mabenhan ;
        do {
            try {
                System.out.println("nh???p m?? b???nh ??n ");
                mabenhan= Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nh???p sai");
            }
        }while (true);




        int mabenhnhan ;
        do {
            try {
                System.out.println("nh???p m?? b???nh nh??n ");
                mabenhnhan = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nh???p sai");
            }
        }while (true);

        String ngaynhapvien;
        while (true){
            System.out.println("nh???p ng??y nh???p vi???n ");
            ngaynhapvien =  scanner.nextLine();
            if (ngaynhapvien.trim().equals("")){
                System.out.println("nh???p l???i");
            }else {
                break;
            }
        }

        String ngayravien ;
        while (true){
            System.out.println("nh???p ng??y ra vi???n");
            ngayravien =  scanner.nextLine();
            if (ngayravien.trim().equals("")){
                System.out.println("nh???p l???i");
            }else {
                break;
            }
        }


        String lydonhapvien ;
        while (true){
            System.out.println("nh???p l?? do nh???p vi???n ");
            lydonhapvien =  scanner.nextLine();
            if (lydonhapvien.trim().equals("")){
                System.out.println("nh???p l???i");
            }else {
                break;
            }
        }


        int phinamvien ;
        do {
            try {
                System.out.println("nh???p ph?? n???m vi???n");
                phinamvien = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nh???p sai");
            }
        }while (true);

        Benh_an_thuong benh_an_thuong= new Benh_an_thuong( mabenhan,  mabenhnhan,  ngaynhapvien,
                 ngayravien,  lydonhapvien,  phinamvien);
        benh_an_thuongList.add(benh_an_thuong);
        System.out.println("th??m m???i th??nh c??ng");
        write();
    }

    @Override
    public void deletebenhanthuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nh???p m?? b???nh ??n c???n x??a" );
        int xoabenhan = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < benh_an_thuongList.size(); i++) {
            System.out.println(benh_an_thuongList.get(i).getMabenhan());
            if (benh_an_thuongList.get(i).getMabenhan()==(xoabenhan)){
                check= true;
                System.out.println("b???n c?? ch???c kh??ng");
                System.out.println("1 c??");
                System.out.println("2 kh??ng");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                       benh_an_thuongList.remove(i);
                        System.out.println("???? x??a th??nh c??ng");
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
    public void displaybenhanthuong() {
        for (Benh_an_thuong benh_an_thuong:benh_an_thuongList) {
            System.out.println(benh_an_thuong);

        }

    }
}
