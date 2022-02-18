package on_tap.controler;
import on_tap.service.Sanphamxuatkhauservice;
import on_tap.service.impl.sanphamxuatkhauserviceimpl;
import on_tap.service.Sanphamnhapkhauservice;
import on_tap.service.impl.sanphamnhapkhauserviceimpl;

import java.util.Scanner;

public class quanglysanpham {
    public static void main(String[] args) {
        {
            displayMenu();
        }
    }

    public static void displayMenu () {
            boolean check = true;
            int choice = 0;
            while (check) {
                System.out.println("___CHƯƠNG TRÌNH QUẢN SẢN PHẨM__");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị sản phẩm");
                System.out.println("3. Xóa sản phẩm");
                System.out.println("4. tìm kiếm");
                System.out.println("5. thoát");
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
                        display();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        search();
                        break;
                    case 5:
                        System.exit(5);
                }
            }

        }


    public static void addNew() {
        Sanphamnhapkhauservice sanphamnhapkhauservice = new sanphamnhapkhauserviceimpl();
        Sanphamxuatkhauservice sanphamxuatkhauservice = new sanphamxuatkhauserviceimpl();

        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới sản phẩm nhập khẩu ");
            System.out.println("2.  Thêm mới sản  phẩm xuất khẩu");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
               case 1 :
                   sanphamnhapkhauservice.addnhapkhau();
                   break;

               case 2 :
                   sanphamxuatkhauservice.addxuatkhau();
                   break;

                case 3 :
                    displayMenu();
                    break;

            }

        }
    }
    public static void display (){
        boolean check = true;
        int choice = 0;
       Sanphamnhapkhauservice sanphamnhapkhauservice = new sanphamnhapkhauserviceimpl();
       Sanphamxuatkhauservice sanphamxuatkhauservice = new sanphamxuatkhauserviceimpl();
        while (check) {
            System.out.println("1.  Hiển thị sản phẩm nhập khẩu ");
            System.out.println("2.  Hiển thị sản  phẩm xuất khẩu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    sanphamnhapkhauservice.displaynhapkhau();

                    break;
                case 2 :
                    sanphamxuatkhauservice.displayxuatkhau();
                    break;

                case 3 :displayMenu();
                    break;
            }

        }
    }
    public static void delete () {
        boolean check = true;
        int choice = 0;
        Sanphamnhapkhauservice sanphamnhapkhauservice = new sanphamnhapkhauserviceimpl();
        Sanphamxuatkhauservice sanphamxuatkhauservice = new sanphamxuatkhauserviceimpl();
        while (check) {
            System.out.println("1. xóa sản phẩm nhập khẩu");
            System.out.println("2.  xóa sản  phẩm xuất khẩu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    sanphamnhapkhauservice.deletenhapkhau();
                    break;
                case 2:
                    sanphamxuatkhauservice.deletexuatkhau();
                    break;
                case 3:
                    displayMenu();
                    break;

            }

        }

    }
    public static void search (){
        boolean check = true;
        int choice = 0;
        Sanphamnhapkhauservice sanphamnhapkhauservice = new sanphamnhapkhauserviceimpl();
        Sanphamxuatkhauservice sanphamxuatkhauservice = new sanphamxuatkhauserviceimpl();
        while (check) {
            System.out.println("1.  tìm kiếm sản phẩm nhập khẩu ");
            System.out.println("2.  tìm kiếm sản  phẩm xuất khẩu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                    sanphamnhapkhauservice.searchnhapkhau();

                    break;
                case 2 :
                    sanphamxuatkhauservice.searchxuatkhau();
                    break;

                case 3 :displayMenu();
                    break;
            }

        }
    }
}
