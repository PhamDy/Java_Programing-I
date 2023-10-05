package Test_java01;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product("F523", "Tomato", "Food", 1.5, 589);
        Product product2 = new Product("A763", "Zara shirt", "Appearance", 12.0, 90);
        Product product3 = new Product("H320", "Kitchen table", "Household", 299.0, 13);
        Product product4 = new Product("E092", "IPhone", "Electronic", 1000.0, 4);
        Product product5 = new Product("S108", "Football", "Sport", 19.9, 2);

        Order order = new Order();
        order.setCustomerName("Mike Tyson");
        order.setTransactionTime("2023-08-08 11:30:00");
        addOrder(order, product1, 5);
        addOrder(order, product2,2);
        addOrder(order, product5,4);

        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setCustomerName("Chris Evans");
        deliveryOrder.setTransactionTime("2023-08-09 13:14:00");
        deliveryOrder.setAddress("123 Cầu Giấy");
        addOrder(deliveryOrder, product2, 3);
        addOrder(deliveryOrder, product4, 3);
    }

    public static void addOrder(Order order, Product product, int quantity) {
        boolean success = order.addProduct(product, quantity);
        String result = success? "Success" : "Fail";
        System.out.println("Adding: " + quantity + " " + order.getCustomerName());
        System.out.println("Result: " + result);
        if (result=="Success") {
            System.out.println("Total Cost of Order: " + order.cost());
        }

        System.out.println();
    }

}
