package edu.pxu.lthdt.bai7;

import baitap5.DiChuyen;
import baitap5.NhanVat;
import baitap5.TanCong;

public class KyBinh extends NhanVat implements edu.pxu.lthdt.bai7.DiChuyen {
    private String ngua;
    private int tocDo;

    public KyBinh(String id, String ten, String gioiTinh, double nangLuong, String ngua) {

        super(id, ten, gioiTinh, nangLuong);
        this.ngua = ngua;
        this.tocDo = tocDo;
    }

    public String getNgua() {
        return ngua;
    }

    public void setNgua(String ngua) {
        this.ngua = ngua;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return "KyBinh{" +
                "ngua='" + ngua + '\'' +
                ", tocDo=" + tocDo +
                "} " + super.toString();
    }

    @Override
    protected void hanhDong() {
        System.out.println(this.getTen() + " đang thi triển xung phong tấn công!");;
    }

    @Override
    protected void sucManh() {
        System.out.println("Sức mạnh: có tóc dộ " + this.getTocDo() + "km/h");
    }
    public void xongPha(){
        System.out.println(this.getTen() + " đang xông pha nhanh chóng trên " + this.getNgua());
    }

    @Override
    public void sangPhai() {
        System.out.println("Cưỡi ngựa sang Phải!");
    }

    @Override
    public void sangTrai() {
        System.out.println("Cưỡi ngựa sang Trái!");
    }

    @Override
    public void nhayLen() {
        System.out.println("Cưỡi ngựa Nhảy lên!");
    }

    @Override
    public void boChay() {

    }

}
