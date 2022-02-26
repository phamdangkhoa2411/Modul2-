package thi_pass_modul2.model;

public abstract class Benh_an {
//    - Số thứ tự bệnh án (sẽ tự động tăng).
//            - Mã bệnh án.
//- Mã bệnh nhân
//- Tên bệnh nhân.
//- Ngày nhập viện.
//- Ngày ra viện.
//- Lý do nhập viện.
    private int mabenhan ;
    private int mabenhnhan ;
    private  String ngaynhapvien ;
    private String ngayravien ;
    private  String lydonhapvien ;

    public Benh_an() {
    }

    public Benh_an(int mabenhan, int mabenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien) {
        this.mabenhan = mabenhan;
        this.mabenhnhan = mabenhnhan;
        this.ngaynhapvien = ngaynhapvien;
        this.ngayravien = ngayravien;
        this.lydonhapvien = lydonhapvien;

    }

    public int getMabenhan() {
        return mabenhan;
    }

    public void setMabenhan(int mabenhan) {
        this.mabenhan = mabenhan;
    }

    public int getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(int mabenhnhan) {
        this.mabenhnhan = mabenhnhan;
    }

    public String getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(String ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public String getNgayravien() {
        return ngayravien;
    }

    public void setNgayravien(String ngayravien) {
        this.ngayravien = ngayravien;
    }

    public String getLydonhapvien() {
        return lydonhapvien;
    }

    public void setLydonhapvien(String lydonhapvien) {
        this.lydonhapvien = lydonhapvien;
    }

    @Override
    public String toString() {
        return "Benh_an{" +
                "mabenhan=" + mabenhan +
                ", mabenhnhan=" + mabenhnhan +
                ", ngaynhapvien='" + ngaynhapvien + '\'' +
                ", ngayravien='" + ngayravien + '\'' +
                ", lydonhapvien='" + lydonhapvien + '\'' +
                '}';
    }
}
