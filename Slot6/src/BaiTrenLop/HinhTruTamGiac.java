

public class HinhTruTamGiac extends HinhTamGiac{
    private double chieuCao;

    public HinhTruTamGiac(double canh1, double canh2, double canh3, double chieuCao) {
        super(canh1, canh2, canh3);
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
        return super.tinhChuVi()*getChieuCao() + 2*super.tinhDienTich();
    }
}
