

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        HinhHoc Tron = new hinhTron(12.5);
        HinhHoc ChuNhat = new HinhChuNhat(7,9);
        HinhHoc TamGiac = new HinhTamGiac(4,6,7);
        HinhHoc Tru = new HinhTruTron(4, 10);
        HinhHoc HopCN = new HinhHopChuNhat(7,9,10);
        HinhHoc TruTamGiac = new HinhTruTamGiac(4, 6, 7, 10);


        System.out.println("Chu vi hinh Tron la:" + Math.floor(Tron.tinhChuVi()*100)/100);
        System.out.println("Dien tich hinh Tron la:" + Math.floor(Tron.tinhDienTich()*100)/100);

        System.out.println("-------------------");

        System.out.println("Chu vi hinh Chu Nhat la:" + Math.floor(ChuNhat.tinhChuVi()*100)/100);
        System.out.println("Dien tich hinh Chu Nhat la:" + Math.floor(ChuNhat.tinhDienTich()*100)/100);

        System.out.println("-------------------");

        System.out.println("Chu vi hinh Tam Giac la:" + Math.floor(TamGiac.tinhChuVi()*100)/100);
        System.out.println("Dien tich hinh Tam Giac la:" + Math.floor(TamGiac.tinhDienTich()*100)/100);

        System.out.println("-------------------");

        System.out.println("Dien tich hinh Tru Tron la:" + Math.floor(Tru.tinhDienTich()*100)/100);

        System.out.println("-------------------");

        System.out.println("Dien tich hinh hop Chu Nhat la:" + Math.floor(HopCN.tinhDienTich()*100)/100);

        System.out.println("-------------------");

        System.out.println("Dien tich hinh Tru Tam Giac la:" + Math.floor(TruTamGiac.tinhDienTich()*100)/100);

    }
}
