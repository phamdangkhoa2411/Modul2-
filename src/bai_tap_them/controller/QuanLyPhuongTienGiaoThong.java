package bai_tap_them.controller;

import bai_tap_them.service.impl.OtoServiceimpl;
import bai_tap_them.service.impl.XeMayServiceimpl;
import bai_tap_them.service.impl.XeTaiServiceimpl;

import java.util.Scanner;

public class QuanLyPhuongTienGiaoThong {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("___CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG__");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
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
                case 2 :
                    display();
                break;
                case 3 :
                    delete();
                break;
                case 4 :
                    System.exit(4);
                    break;
            }
        }

    }

    public static void addNew() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới oto ");
            System.out.println("2.  Thêm mới xe máy ");
            System.out.println("3. Thêm mới xe tải");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    new OtoServiceimpl().addNewOto();
                    break;
                case 2 :
                    new XeMayServiceimpl().addNewXeMay();
                    break;
                case 3:
                    new XeTaiServiceimpl().addNewXeTai();
                case 4 :
                    displayMenu();
                    break;

            }

        }
    }
    public static void display (){
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Hiển thị oto ");
            System.out.println("2.  Hiển thị xe máy ");
            System.out.println("3. Hiển thị xe tải");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    new OtoServiceimpl().displayOto();
                    break;
                case 2 :
                    new XeMayServiceimpl().displayXeMay();
                    break;
                case 3 :
                    new XeTaiServiceimpl().displayXeTai();
                    break;
                case 4 :displayMenu();
                break;
            }

        }
    }
    public static void delete (){
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. xóa oto ");
            System.out.println("2.  xóa xe máy ");
            System.out.println("3. xóa xe tải");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice){
                case 1 :
                    new OtoServiceimpl().deleteOto();
                    break;
                case 2 :
                    new XeMayServiceimpl().deleteXeMay();
                    break;
                case 3 :
                    new XeTaiServiceimpl().deleteXeTai();
                    break;
                case 4 :
                   displayMenu();
                   break;

            }

        }
    }


}
