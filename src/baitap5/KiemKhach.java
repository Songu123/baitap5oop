package baitap5;

public class KiemKhach extends NhanVat implements DiChuyen, TanCong {
    private int diemKinhNghiem;
    private String thuatDauKiem;

    public KiemKhach(String id, String ten, String gioiTinh, double nangLuong, int diemKinhNghiem, String thuatDauKiem) {
        super(id, ten, gioiTinh, nangLuong);
        this.diemKinhNghiem = diemKinhNghiem;
        this.thuatDauKiem = thuatDauKiem;
    }

    public int getDiemKinhNghiem() {
        return diemKinhNghiem;
    }

    public void setDiemKinhNghiem(int diemKinhNghiem) {
        this.diemKinhNghiem = diemKinhNghiem;
    }

    public String getThuatDauKiem() {
        return thuatDauKiem;
    }

    public void setThuatDauKiem(String thuatDauKiem) {
        this.thuatDauKiem = thuatDauKiem;
    }

    @Override
    public String toString() {
        return "KiemKhach{" +
                "diemKinhNghiem=" + diemKinhNghiem +
                ", thuatDauKiem='" + thuatDauKiem + '\'' +
                "} " + super.toString();
    }

    public void capDo(){
        System.out.println(this.getTen() + " đang sử dụng " + this.thuatDauKiem + " để chiêến dấu!");
    }

    @Override
    protected void hanhDong() {
        System.out.println(this.getTen() + " đang chém lộn với thuf địch!");
    }

    @Override
    protected void sucManh() {
        System.out.println("Có sức mạnh với kinh nghiệm: " + diemKinhNghiem);
    }
    @Override
    public void sangPhai() {
        System.out.println("Kiếm khách cầm kiếm sang Phải!");
    }

    @Override
    public void sangTrai() {
        System.out.println("Kiếm khách cầm kiếm sang Trái!");
    }

    @Override
    public void nhayLen() {
        System.out.println("Kiếm khách cầm kiếm Nhảy lên!");
    }

    @Override
    public void boChay() {
        System.out.println("Kiếm khách cầm kiếm bỏ chạy!");
    }

    @Override
    public void tanCongKhongVuKhi() {
        System.out.println("Kiếm khách chơi lớn với việc tấn công không cần vũ khí");
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Kiếm khách sợ nên cần vũ khí!");
    }
}
