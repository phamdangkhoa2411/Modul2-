package ss12_java_collection_framework.bai_tap.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Product implements Comparable<Product>, Comparator<Product> {
    private String id;
    private String name;
    private double gia ;

    public Product() {
    }

    public Product(String id, String name, double gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gia='" + gia + '\'' +
                '}';

    }


    @Override
    public int compareTo(Product o) {
        if (this.gia > o.getGia()) {
            return 1;
        }else if (this.gia<o.getGia()){
            return -1;
        }else {
            return 0;
        }

    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.gia>o2.getGia()){
            return -1;
        }else if (o1.gia<o2.getGia()){
            return 1;
        }else {
        return 0;
        }
    }
}
