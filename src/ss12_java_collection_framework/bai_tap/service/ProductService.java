package ss12_java_collection_framework.bai_tap.service;

public interface ProductService<P> {
    //   thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp tăng / giảm.
    void add();

    void edit();

    void delete();

    void display();

    void search();

    void increase(); // tăng

    void decrease();// giảm
}
