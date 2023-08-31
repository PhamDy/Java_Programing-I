package Lab_02.Exercise_2;

public class Battery {
    private int energy;

    public Battery() {
        energy = 100;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy() {
        this.energy = energy;
    }

    public void decreaseEnergy() {
        energy--;
    }


}
