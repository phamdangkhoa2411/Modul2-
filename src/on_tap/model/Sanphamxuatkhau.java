package on_tap.model;

public class Sanphamxuatkhau extends danhsachsanpham{
//    - Giá xuất khẩu.
//- Quốc gia nhập sản phẩm.
    private String giaxuatkhau ;
    private String Quocgiasanxuatsanpham;

    public Sanphamxuatkhau() {
    }

    public Sanphamxuatkhau(String id, String name, String price
            , int quantily, String producer, String giaxuatkhau
            , String quocgiasanxuatsanpham) {

        super(id, name, price, quantily, producer);
        this.giaxuatkhau = giaxuatkhau;
         this. Quocgiasanxuatsanpham = quocgiasanxuatsanpham;
    }

    public String getGiaxuatkhau() {
        return giaxuatkhau;
    }

    public void setGiaxuatkhau(String giaxuatkhau) {
        this.giaxuatkhau = giaxuatkhau;
    }

    public String getQuocgiasanxuatsanpham() {
        return Quocgiasanxuatsanpham;
    }

    public void setQuocgiasanxuatsanpham(String quocgiasanxuatsanpham) {
        Quocgiasanxuatsanpham = quocgiasanxuatsanpham;
    }

    @Override
    public String toString() {
        return "sanphamxuatkhau{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", quantily=" + getQuantily() +
                ", producer='" + getProducer()+ '\'' +
                "giaxuatkhau='" + giaxuatkhau + '\'' +
                ", Quocgiasanxuatsanpham='" + Quocgiasanxuatsanpham + '\'' +
                '}';
    }
}
