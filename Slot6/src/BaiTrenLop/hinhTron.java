

public class hinhTron extends HinhHoc{
    private double banKinh;

    public hinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2*3.14*banKinh;
    }

    @Override
    double tinhDienTich() {
        return 3.14*banKinh*banKinh;
    }
}
