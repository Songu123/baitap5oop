package baitap5;

public class BoBinh extends NhanVat implements DiChuyen, TanCong{
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
    @Override
    public void sangPhai() {
        System.out.println("Bộ binh cầm khiên sang Phải!");
    }

    @Override
    public void sangTrai() {
        System.out.println("Bộ binh cầm khiên sang Trái!");
    }

    @Override
    public void nhayLen() {
        System.out.println("Bộ binh cầm khiên Nhảy lên!");
    }

    @Override
    public void boChay() {
        System.out.println("Bộ binh cầm khiên bỏ chạy!");
    }

    @Override
    public void tanCongKhongVuKhi() {
        System.out.println("Bộ binh nói không với vũ khí!");
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Bộ binh có vũ khí mới chơi được!");
    }
}
