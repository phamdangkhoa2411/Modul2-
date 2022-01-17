package ss12_java_collection_framework.bai_tap.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id;
    private String name;
    private String gia ;

    public Product() {
    }

    public Product(String id, String name, String gia) {
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

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
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
}
