package thi_pass_modul2.model;

public class Benh_an_thuong  extends Benh_an {
    private int phinamvien ;

    public Benh_an_thuong() {
    }

    public Benh_an_thuong(int mabenhan, int mabenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien, int phinamvien) {
        super(mabenhan, mabenhnhan, ngaynhapvien, ngayravien, lydonhapvien);
        this.phinamvien = phinamvien;
    }

    public int getPhinamvien() {
        return phinamvien;
    }

    public void setPhinamvien(int phinamvien) {
        this.phinamvien = phinamvien;
    }

    @Override
    public String toString() {
        return "Benh_an_thuong{" +
                "mabenhan=" + getMabenhan() +
                ", mabenhnhan=" +getMabenhnhan()+
                ", ngaynhapvien='" + getNgaynhapvien() + '\'' +
                ", ngayravien='" + getNgayravien() + '\'' +
                ", lydonhapvien='" +getLydonhapvien() + '\'' +
                "phinamvien=" + phinamvien +
                '}';
    }
}
