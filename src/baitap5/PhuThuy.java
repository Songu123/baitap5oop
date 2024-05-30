package baitap5;

public class PhuThuy extends NhanVat{
    private int luongMana;
    private String cauThanChu;

    public PhuThuy(String id, String ten, String gioiTinh, double nangLuong, int luongMana, String cauThanChu) {
        super(id, ten, gioiTinh, nangLuong);
        this.luongMana = luongMana;
        this.cauThanChu = cauThanChu;
    }

    public int getLuongMana() {
        return luongMana;
    }

    public void setLuongMana(int luongMana) {
        this.luongMana = luongMana;
    }

    public String getCauThanChu() {
        return cauThanChu;
    }

    public void setCauThanChu(String cauThanChu) {
        this.cauThanChu = cauThanChu;
    }

    @Override
    public String toString() {
        return "PhuThuy{" +
                "luongMana=" + luongMana +
                ", cauThanChu='" + cauThanChu + '\'' +
                "} " + super.toString();
    }

    @Override
    protected void hanhDong() {
        System.out.println(this.getTen() + " hoá phép thuật tới các nạn nhân!");
    }

    @Override
    protected void sucManh() {
        System.out.println("Cầu thần chú chữa lành với thương với lượng Mana " + this.getLuongMana());
    }

    public void phuPhep(){
        System.out.println(this.getTen() + " sử dụng câu thần chú " + this.getCauThanChu() + "  để phù phép!");

    }
}