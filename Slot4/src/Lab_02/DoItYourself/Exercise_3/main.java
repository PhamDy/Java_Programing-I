package Lab_02.DoItYourself.Exercise_3;

public class main {
    public static void main(String[] args) {
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();

        switchButton.connectToLamp(electricLamp);
        for (int i = 0; i < 10; i++) {
            switchButton.switchOff();
        }

    }
}
