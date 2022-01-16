package bai_tap_them.model;

public class Oto extends PhuongTienGiaoThong {
    private int SoChoNgoi ;
    private String LoaiXe ;

    public Oto() {
    }

    public Oto(String BienSoXe, String namehang, int yearOfmanuFacture, String chuXe, int soChoNgoi, String loaiXe) {
        super(BienSoXe, namehang, yearOfmanuFacture, chuXe);
        SoChoNgoi = soChoNgoi;
        LoaiXe = loaiXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "SoChoNgoi=" + SoChoNgoi +
                ", LoaiXe='" + LoaiXe + '\'' +
                '}';
    }
}
