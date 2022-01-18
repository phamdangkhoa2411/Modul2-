package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements ProductService {

    static List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id sản phẩm cần thêm:");
        String id = scanner.nextLine();
        System.out.print("Mời bạn nhập tên sản phẩm cần thêm:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm cần thêm:");
        String gia = scanner.nextLine();
        Product product = new Product(id, name, gia);
        productList.add(product);


    }

    @Override
    public void edit() {
        System.out.print("Mời bạn nhập id sản phẩm cần chỉnh sửa: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(idEdit)) {
                System.out.println("Mời bạn nhập tên cần sửa: ");
                String newName = scanner.nextLine();
                System.out.println("Mời bạn nhập giá cần sửa: ");
                String newGia = scanner.nextLine();
                productList.get(i).setName(newName);
                productList.get(i).setGia(newGia);

            }
        }
    }

        @Override
        public void delete () {
            System.out.println("nhập id sản phẩm muốn xóa");
            String id = scanner.nextLine();
            for (int i = 0; i <productList.size() ; i++) {
                if (productList.get(i).getId().equals(id));
                productList.remove(i);

            }

        }

        @Override
        public void display () {
            for (Product product:productList) {
                System.out.println(product);

            }

        }

        @Override
        public void search () {
            System.out.println("nhập tên sản phẩm cần tìm : ");
             String name = scanner.nextLine();
             Boolean check = false;
            for (Product product:productList) {
                if (product.getName().equals(name)){
                    System.out.println("sản phẩm tìm kiếm là :"+product);
                    check = true;
                }
            }
                if (!check){
                    System.out.println("không tìm thấy sản phẩm");
                }
        }
        

        @Override
        public void increase () {

        }

        @Override
        public void decrease () {

        }
    }
