package baitap5;

public class BoBinh extends NhanVat{
    private int sucManhPhongThu;
    private String giap;

    public BoBinh(String id, String ten, String gioiTinh, double nangLuong, int sucManhPhongThu) {
        super(id, ten, gioiTinh, nangLuong);
        this.sucManhPhongThu = sucManhPhongThu;
        this.giap = giap;
    }


    public int getSucManhPhongThu() {
        return sucManhPhongThu;
    }

    public void setSucManhPhongThu(int sucManhPhongThu) {
        this.sucManhPhongThu = sucManhPhongThu;
    }

    public String getGiap() {
        return giap;
    }

    public void setGiap(String giap) {
        this.giap = giap;
    }

    @Override
    public String toString() {
        return "BoBinh{" +
                "sucManhPhongThu=" + sucManhPhongThu +
                ", giap='" + giap + '\'' +
                "} " + super.toString();
    }

    @Override
    protected void hanhDong() {
        System.out.println(this.getTen() + " đang phòng thử vững chắc");
    }

    @Override
    protected void sucManh() {
        System.out.println("Vói bộ giáp " + this.giap + " tang sức mạnh chiến đấu");
    }

    public void phongThu(){
        System.out.println(this.getTen() + " đang sử dụng " + this.giap + " với sức mạnh " + this.getSucManhPhongThu() + " để phòng thử!");
    }
}
