package Lab_02.DoItYourself.Exercise_3;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
        status = false;
    }

    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOff() {
        lamp.turnOff();
    }

    public void switchOn() {
        lamp.turnOn();
    }

}
