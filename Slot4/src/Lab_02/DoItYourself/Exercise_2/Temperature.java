package Lab_02.DoItYourself.Exercise_2;

public class Temperature {
    private double cTemp;

    public Temperature() {
    }

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getFTemp() {
        return (cTemp*9/5)+32;
    }

    public double getKTemp() {
        return cTemp+273.15;
    }

}
