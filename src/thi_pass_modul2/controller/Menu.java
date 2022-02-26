package thi_pass_modul2.controller;


import thi_pass_modul2.service.benh_an_thuongservice;
import thi_pass_modul2.service.benh_an_vipservice;
import thi_pass_modul2.service.impl.benh_an_thuongimpl;
import thi_pass_modul2.service.impl.benh_an_vipimpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        {
            displayMenu();
        }
    }

    public static void displayMenu () {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("___QUẢN LÝ BỆNH ÁN___");
            System.out.println("1. Thêm bệnh án ");
            System.out.println("2. xóa");
            System.out.println("3. Hiển thị danh sách bệnh án ");
            System.out.println("4. thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;

                case 4:
                    System.exit(4);
            }
        }

    }


    public static void addNew() {
        benh_an_thuongservice benh_an_thuongservice = new benh_an_thuongimpl();
        benh_an_vipservice benh_an_vipservice = new benh_an_vipimpl();


        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới bệnh án thường ");
            System.out.println("2.  Thêm mới bệnh án vip");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    benh_an_thuongservice.addbenhanthuong();

                    break;

                case 2 :
                    benh_an_vipservice.addbenhanvip();

                    break;

                case 3 :
                    displayMenu();
                    break;

            }

        }
    }
    public static void display (){
        benh_an_thuongservice benh_an_thuongservice = new benh_an_thuongimpl();
        benh_an_vipservice benh_an_vipservice = new benh_an_vipimpl();
        boolean check = true;
        int choice = 0;

        while (check) {
            System.out.println("1.  Hiển thị bênh án thường  ");
            System.out.println("2.  Hiển thị  bệnh án vip");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    benh_an_thuongservice.displaybenhanthuong();
                    break;
                case 2 :
                    benh_an_vipservice.displaybenhanvip();
                    break;

                case 3 :displayMenu();
                    break;
            }

        }
    }
    public static void delete () {
        benh_an_thuongservice benh_an_thuongservice = new benh_an_thuongimpl();
        benh_an_vipservice benh_an_vipservice = new benh_an_vipimpl();
        boolean check = true;
        int choice = 0;

        while (check) {
            System.out.println("1. xóa bệnh án thường ");
            System.out.println("2. xóa  bệnh án vip ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    benh_an_thuongservice.deletebenhanthuong();
                    break;
                case 2:
                    benh_an_vipservice.deletebenhanvip();
                    break;
                case 3:displayMenu();
                    break;

            }

        }

    }

}


