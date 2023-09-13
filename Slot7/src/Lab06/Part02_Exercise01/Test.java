package Lab06.Part02_Exercise01;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

        client.canThrowUncheckedException("1");
        client.canThrowUncheckedException("a");

        client.doUnchecked("2");
        client.doUnchecked("b");

        client.doChecked();



    }
}
