package on_tap.service.impl;
import on_tap.controler.quanglysanpham;
import on_tap.model.Sanphamxuatkhau;
import on_tap.service.Sanphamxuatkhauservice;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sanphamxuatkhauserviceimpl implements Sanphamxuatkhauservice {
    static List<Sanphamxuatkhau> sanphamxuatkhauList = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);
    static {
        sanphamxuatkhauList = readerXuatkhau();
    }


    public void  Write(){
        try {
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\on_tap\\data\\sanphamxuatkhau.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Sanphamxuatkhau sanphamxuatkhau: sanphamxuatkhauList){
                bufferedWriter.write(sanphamxuatkhau.getId()+","+sanphamxuatkhau.getName()+","+ sanphamxuatkhau.getPrice()
                        +","+ sanphamxuatkhau.getQuantily()+","+ sanphamxuatkhau.getProducer()+","+
                        sanphamxuatkhau.getGiaxuatkhau()+","+sanphamxuatkhau.getQuocgiasanxuatsanpham());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public static  List<Sanphamxuatkhau> readerXuatkhau() {
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\on_tap\\data\\sanphamxuatkhau.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Sanphamxuatkhau sanphamxuatkhau = new Sanphamxuatkhau(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6]);
                sanphamxuatkhauList.add(sanphamxuatkhau);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return sanphamxuatkhauList;

    }

    @Override
    public void addxuatkhau() {
//        (String id, String name, String price
//            , int quantily, String producer, String giaxuatkhau
//                , String quocgiasanxuatsanpham
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm ");
        String id = scanner.nextLine();
        System.out.println("nhập tên sản phẩm ");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm ");
        String price= scanner.nextLine();
        System.out.println("nhập số lượng sản phẩm");
        int quantily = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String producer = scanner.nextLine();
        System.out.println("nhập giá xuất khẩu ");
        String giaxuatkhau = scanner.nextLine();
        System.out.println("nhập quốc gia sản xuất sản phẩm");
        String quocgiasanxuatsanpham =scanner.nextLine();
        Sanphamxuatkhau sanphamxuatkhau = new Sanphamxuatkhau(id, name,  price
            ,  quantily,  producer,  giaxuatkhau
                , quocgiasanxuatsanpham);
        sanphamxuatkhauList.add(sanphamxuatkhau);
        Write();
        System.out.println("đã thêm mới thành công");

    }

    @Override
    public void displayxuatkhau() {
        for (Sanphamxuatkhau sanphamxuatkhau:sanphamxuatkhauList) {
            System.out.println(sanphamxuatkhau);

        }


    }

    @Override
    public void deletexuatkhau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm còn xóa" );
        String xoaidsanpham = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < sanphamxuatkhauList.size(); i++) {
            System.out.println(sanphamxuatkhauList.get(i).getId());
            if (sanphamxuatkhauList.get(i).getId().equals(xoaidsanpham)){
                check= true;
                System.out.println("bạn có chắc không");
                System.out.println("1 có");
                System.out.println("2 không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        sanphamxuatkhauList.remove(i);
                        System.out.println("đã xóa thành công");
                        break;
                    case 2 :
                        quanglysanpham.displayMenu();
                        break;
                }
            }

        }
        Write();

    }

    @Override
    public void searchxuatkhau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần tìm");
        String timsanpham = scanner.nextLine();
        for (int i = 0; i < sanphamxuatkhauList.size(); i++) {
            System.out.println(sanphamxuatkhauList.get(i).getId());
            if (sanphamxuatkhauList.get(i).getId().contains(timsanpham)) ;
            System.out.println(sanphamxuatkhauList.get(i));

        }

    }
}

