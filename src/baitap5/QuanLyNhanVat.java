package baitap5;

public class QuanLyNhanVat {
    public static void main(String[] args) {
        KiemKhach kk1 = new KiemKhach("123", "sơn", "Nam", 1000, 2000,"Kamehame");
        BoBinh bb1 = new BoBinh("1234", "Xuan", "Nam", 2000, 1000);
        PhuThuy pt1 = new PhuThuy("a1324", "Thong", "Nam", 3000, 2000,"I love you");
        KyBinh kb1 = new KyBinh("sadf123", "Lu", "Nữ", 1000, "Ngựa hoang");
        System.out.println(kk1);
        kk1.hanhDong();
        System.out.println(bb1);
        bb1.hanhDong();
        System.out.println(pt1);
        pt1.hanhDong();
        System.out.println(kb1);
        kb1.hanhDong();
    }
}