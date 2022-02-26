package thi_pass_modul2.model;

public class Benh_an_vip extends Benh_an{
 private String loaivip;
 private String thoihanvip ;

    public Benh_an_vip() {
    }

    public Benh_an_vip(int mabenhan, int mabenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien, String loaivip, String thoihanvip) {
        super(mabenhan, mabenhnhan, ngaynhapvien, ngayravien, lydonhapvien);
        this.loaivip = loaivip;
        this.thoihanvip = thoihanvip;
    }

    public String getLoaivip() {
        return loaivip;
    }

    public void setLoaivip(String loaivip) {
        this.loaivip = loaivip;
    }

    public String getThoihanvip() {
        return thoihanvip;
    }

    public void setThoihanvip(String thoihanvip) {
        this.thoihanvip = thoihanvip;
    }

    @Override
    public String toString() {
        return "Benh_an_vip{" +
                "mabenhan=" +getMabenhan() +
                ", mabenhnhan=" + getMabenhnhan() +
                ", ngaynhapvien='" + getNgaynhapvien() + '\'' +
                ", ngayravien='" + getNgayravien() + '\'' +
                ", lydonhapvien='" + getLydonhapvien() + '\'' +
                "loaivip='" + loaivip + '\'' +
                ", thoihanvip='" + thoihanvip + '\'' +
                '}';
    }
}
