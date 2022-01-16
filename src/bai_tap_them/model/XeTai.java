package bai_tap_them.model;

public class XeTai extends PhuongTienGiaoThong{
   private String TrongTai;

    public XeTai() {
    }

    public XeTai(String BienSoXe, String namehang, int yearOfmanuFacture, String chuXe, String trongTai) {
        super(BienSoXe, namehang, yearOfmanuFacture, chuXe);
        TrongTai = trongTai;
    }

    public String getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(String trongTai) {
        TrongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "TrongTai='" + TrongTai + '\'' +
                '}';
    }
}
