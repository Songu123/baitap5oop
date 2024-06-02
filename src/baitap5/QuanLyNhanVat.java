package baitap5;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVat {
    public static void main(String[] args) {
        KiemKhach kk1 = new KiemKhach("123", "sơn", "Nam", 1000, 2000,"Kamehame");
        BoBinh bb1 = new BoBinh("1234", "Xuan", "Nam", 2000, 1000);
        PhuThuy pt1 = new PhuThuy("a1324", "Thong", "Nam", 3000, 2000,"I love you");
        KyBinh kb1 = new KyBinh("sadf123", "Lu", "Nữ", 1000, "Ngựa hoang");

        List<NhanVat> danhSachNhanVat = new ArrayList<>();
        danhSachNhanVat.add(kk1);
        danhSachNhanVat.add(bb1);
        danhSachNhanVat.add(pt1);
        danhSachNhanVat.add(kb1);
        for (NhanVat nv: danhSachNhanVat){
            System.out.println(nv);
        }
//        System.out.println(danhSachNhanVat);

        System.out.println(kk1);
        kk1.hanhDong();
        System.out.println(bb1);
        bb1.hanhDong();
        System.out.println(pt1);
        pt1.hanhDong();
        System.out.println(kb1);
        kb1.hanhDong();

        kk1.sangPhai();
        kk1.sangTrai();
        kk1.nhayLen();
        kk1.boChay();

        bb1.sangPhai();
        bb1.sangTrai();
        bb1.nhayLen();
        bb1.boChay();

        pt1.sangPhai();
        pt1.sangTrai();
        pt1.nhayLen();
        pt1.boChay();

        kb1.sangPhai();
        kb1.sangTrai();
        kb1.nhayLen();
        kb1.boChay();

    }
}