package on_tap.model;

public class Sanphamnhapkhau extends danhsachsanpham{
//    Nếu sản phẩm là nhập khẩu thì sẽ thêm mới thêm các thông tin:
//            - Giá nhập khẩu.
//- Tỉnh thành nhập.
//- Thuế nhập khẩu.
    private  String gianhapkhau;
    private String tinhnhapkhau;
    private String thuenhapkhau ;

    public Sanphamnhapkhau() {
    }

    public Sanphamnhapkhau(String id, String name, String price, int quantily, String producer,
                           String gianhapkhau, String tinhnhapkhau, String thuenhapkhau) {
        super(id, name, price, quantily, producer);
        this.gianhapkhau = gianhapkhau;
        this.tinhnhapkhau = tinhnhapkhau;
        this.thuenhapkhau = thuenhapkhau;
    }

    public String getGianhapkhau() {
        return gianhapkhau;
    }

    public void setGianhapkhau(String gianhapkhau) {
        this.gianhapkhau = gianhapkhau;
    }

    public String getTinhnhapkhau() {
        return tinhnhapkhau;
    }

    public void setTinhnhapkhau(String tinhnhapkhau) {
        this.tinhnhapkhau = tinhnhapkhau;
    }

    public String getThuenhapkhau() {
        return thuenhapkhau;
    }

    public void setThuenhapkhau(String thuenhapkhau) {
        this.thuenhapkhau = thuenhapkhau;
    }

    @Override
    public String toString() {

        return "Sanphamnhapkhau{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", quantily=" + getQuantily() +
                ", producer='" + getProducer()+ '\'' +
        "gianhapkhau='" + gianhapkhau + '\'' +
                ", tinhnhapkhau='" + tinhnhapkhau + '\'' +
                ", thuenhapkhau='" + thuenhapkhau + '\'' +
                '}';
    }
}
