package edu.pxu.lthdt.bai7;

public class NhanVat {
    private String id;
    private String ten;
    private String gioiTinh;
    private double nangLuong;

    public NhanVat(String id, String ten, String gioiTinh, double nangLuong) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.nangLuong = nangLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(double nangLuong) {
        this.nangLuong = nangLuong;
    }

    @Override
    public String toString() {
        return "NhanVat{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", nangLuong=" + nangLuong +
                '}';
    }

    protected void hanhDong(){
        System.out.println(this.getTen() + " đang hành động!");
    }

    protected void sucManh(){
        System.out.println("Sức mạnh của " + this.getTen() + " laf + " + this.nangLuong);
    }
}
