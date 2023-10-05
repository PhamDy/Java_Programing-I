package Test_java01;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private String transactionTime;
    private ArrayList<LineItem> lineItems;

    public Order() {
        lineItems = new ArrayList<LineItem>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", transactionTime='" + transactionTime + '\'' +
                ", lineItems=" + lineItems +
                '}';
    }

    public double cost() {
        double sumCost = 0;
        for (LineItem i: lineItems
             ) {
            sumCost+= i.cost();
        }
        return sumCost;
    }

    public boolean addProduct(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            LineItem newItem = new LineItem(product, quantity);
            lineItems.add(newItem);

            product.setQuantity(product.getQuantity()-quantity);
            return true;

        } else {
            return false;
        }
    }


}
