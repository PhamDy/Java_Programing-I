

public class HinhHopChuNhat extends HinhChuNhat{
    private double chieuCao;

    public HinhHopChuNhat(double chieuDai, double chieuRong, double chieuCao) {
        super(chieuDai, chieuRong);
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
        return super.tinhDienTich() + 2*getChieuCao()*(super.getChieuDai()+super.getChieuRong());
    }
}
