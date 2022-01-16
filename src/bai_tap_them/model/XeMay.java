package bai_tap_them.model;

public class XeMay extends  PhuongTienGiaoThong{
    private String CongXuat ;

    public XeMay() {
    }

    public XeMay(String BienSoXe, String namehang, int yearOfmanuFacture, String chuXe, String congXuat) {
        super(BienSoXe, namehang, yearOfmanuFacture, chuXe);
        CongXuat = congXuat;
    }

    public String getCongXuat() {
        return CongXuat;
    }

    public void setCongXuat(String congXuat) {
        CongXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "CongXuat='" + CongXuat + '\'' +
                '}';
    }
}
