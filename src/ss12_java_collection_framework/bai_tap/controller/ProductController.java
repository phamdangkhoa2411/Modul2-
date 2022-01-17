package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.service.ProductService;
import ss12_java_collection_framework.bai_tap.service.impl.ProductImpl;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) { displayMenu();}

        public static void displayMenu(){
           ProductService productService = new ProductImpl();
            boolean check = true;
            int choice = 0;
            while (check) {
                System.out.println("--------MENU---------");
                System.out.println("1. Thêm sản phẩm: ");
                System.out.println("2. Sửa sản phảm: ");
                System.out.println("3. Xoá sản phẩm: ");
                System.out.println("4. Hiển thị sản phẩm: ");
                System.out.println("5. Tìm kiếm sản phẩm: ");
                System.out.println("6. Sắp xếp sản phẩm tăng dần: ");
                System.out.println("7. Sắp xếp sản phẩm giảm dần: ");
                System.out.println("0. Exit: ");
                Scanner scanner = new Scanner(System.in);
                try {

                    choice = Integer.parseInt(scanner.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");

                }
                switch (choice){

                    case 1:
                        productService.add();

                        break;
                    case 2:
                        productService.edit();

                        break;
                    case 3:
                        productService.delete();

                        break;
                    case 4:
                        productService.display();

                        break;
                    case 5:
                        productService.search();

                        break;
                    case 6:
                        productService.increase();

                        break;
                    case 7:
                        productService.decrease();

                        break;
                    case 0:
                        System.exit(0);
                        break;
                }



            }

        }
    }
