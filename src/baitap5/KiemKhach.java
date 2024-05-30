package baitap5;

public class KiemKhach extends NhanVat {
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
}
