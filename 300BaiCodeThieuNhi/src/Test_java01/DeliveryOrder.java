package Test_java01;

public class DeliveryOrder extends Order{
    private String address;

    public DeliveryOrder() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "address='" + address + '\'' +
                '}';
    }
}
