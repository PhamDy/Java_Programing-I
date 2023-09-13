package Lab06.Part02_Exercise01;

public class Client {
    public Client() {

    }

    public int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }

    public void doUnchecked(String value) {
        int result = canThrowUncheckedException(value);
        System.out.println("result=" + result);
    }

    public void doChecked() {
        try {
            canThrowUncheckedException();
            System.out.println("OK");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int canThrowUncheckedException() throws Exception {
        throw new Exception("failure");
    }

}
