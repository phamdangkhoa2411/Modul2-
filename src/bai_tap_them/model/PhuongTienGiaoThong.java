package bai_tap_them.model;

public abstract class PhuongTienGiaoThong {
    private String BienSoXe ;
    private String namehang ;
    private int YearOfmanuFacture ;
    private String ChuXe ;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String BienSoXe, String namehang, int yearOfmanuFacture, String chuXe) {
        this.BienSoXe = BienSoXe;
        this.namehang = namehang;
        YearOfmanuFacture = yearOfmanuFacture;
        ChuXe = chuXe;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.BienSoXe = bienSoXe;
    }

    public String getNamehang() {
        return namehang;
    }

    public void setNamehang(String namehang) {
        this.namehang = namehang;
    }

    public int getYearOfmanuFacture() {
        return YearOfmanuFacture;
    }

    public void setYearOfmanuFacture(int yearOfmanuFacture) {
        YearOfmanuFacture = yearOfmanuFacture;
    }

    public String getChuXe() {
        return ChuXe;
    }

    public void setChuXe(String chuXe) {
        ChuXe = chuXe;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "sokhung='" + BienSoXe + '\'' +
                ", namehang='" + namehang + '\'' +
                ", YearOfmanuFacture=" + YearOfmanuFacture +
                ", ChuXe='" + ChuXe + '\'' +
                '}';
    }

}
