

public class HinhTruTron extends hinhTron{
    private double chieuCao;

    public HinhTruTron(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    double tinhDienTich() {
        return super.tinhDienTich() + 2*3.14*super.getBanKinh()*getChieuCao();
    }
}
