package edu.pxu.lthdt.bai7;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGame {
    public static void main(String[] args) {
        KyBinh kyBinh1 = new KyBinh("KB01", "Lý Thường Kiệt", "Nam", 100.0, "Ngựa Xích Hạo");
        KyBinh kyBinh2 = new KyBinh("KB02", "Trần Hưng Đạo", "Nam", 95.0, "Ngựa Bạch Long");
        KyBinh kyBinh3 = new KyBinh("KB03", "Lê Lợi", "Nam", 90.0, "Ngựa Ô Vân");
        KyBinh kyBinh4 = new KyBinh("KB04", "Nguyễn Huệ", "Nam", 85.0, "Ngựa Phi Long");

        PhuThuy phuThuy1 = new PhuThuy("PT01", "Merlin", "Nữ", 80.0, 100, "Expecto Patronum");
        PhuThuy phuThuy2 = new PhuThuy("PT02", "Gandalf", "Nam", 75.0, 90, "You shall not pass!");
        PhuThuy phuThuy3 = new PhuThuy("PT03", "Morgana le Fay", "Nữ", 70.0, 80, "Avada Kedavra");
        PhuThuy phuThuy4 = new PhuThuy("PT04", "Albus Dumbledore", "Nam", 65.0, 70, "Expelliarmus!");
        PhuThuy phuThuy5 = new PhuThuy("PT05", "Severus Snape", "Nam", 60.0, 60, "Sectumsempra!");
        PhuThuy phuThuy6 = new PhuThuy("PT01", "Merlin", "Nữ", 80.0, 100, "Expecto Patronum");

        ArrayList<DiChuyen> danhsachNV = new ArrayList<>();
        danhsachNV.add((DiChuyen) kyBinh1);
        danhsachNV.add((DiChuyen) kyBinh2);
        danhsachNV.add((DiChuyen) kyBinh3);
        danhsachNV.add((DiChuyen) kyBinh4);

        danhsachNV.add((DiChuyen) phuThuy1);
        danhsachNV.add((DiChuyen) phuThuy2);
        danhsachNV.add((DiChuyen) phuThuy3);
        danhsachNV.add((DiChuyen) phuThuy4);
        danhsachNV.add((DiChuyen) phuThuy5);
        danhsachNV.add((DiChuyen) phuThuy6);

        int a = 0, b = 0;
        for (DiChuyen diChuyen: danhsachNV){
            System.out.println(diChuyen);
            if (diChuyen instanceof PhuThuy){
                a++;
            }else {
                b++;
            }
        }
        System.out.println();
        if (a == 0){
            System.out.println("Không có Phù Thuỷ nào trong danh sách!");
        }else{
            System.out.println("Trong danh sách có " + a + " Phù Thuỷ!");
        }
        if (b == 0){
            System.out.println("Không có kỵ binh nào trong danh sách!");
        }else{
            System.out.println("Trong danh sách có " + b + " Kỵ Binh!");
        }
    }
}