package on_tap.model;

public abstract class danhsachsanpham {
//    - Id sản phẩm (sẽ tự động tăng).
//            - Mã sản phẩm.
//- Tên sản phẩm.
//- Giá bán
//- Số lượng
//- Nhà sản xuất
    private String id ;
    private String name ;
    private String price ;
    private int quantily ;
    private String producer;

    public danhsachsanpham() {
    }

    public danhsachsanpham(String id, String name, String price, int quantily, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.producer = producer;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "danhsachsanpham{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantily=" + quantily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
