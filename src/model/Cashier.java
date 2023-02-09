import java.util.ArrayList;

public class Cashier extends Staff{
    private int cashierID;
    private String cashierName;
    private ArrayList<Order> ordersProcessed;


    public Cashier(int cashierID, String cashierName) {
        this.cashierID = cashierID;
        this.cashierName = cashierName;
        this.ordersProcessed = new ArrayList<Order>();
    }

    public void processOrder(Order order) {
    ordersProcessed.add(order);
}
    public double calculateOrderTotal(Order order) {
        double total = 0;
        for (Product product : order.getProducts()) {
            total += product.getProductPrice();
        }
        return  total;
    }

    public void printReceipt(Order order) {
        System.out.println("Receipt for " + order.getOrderID());
        System.out.println("Products: ");
        for (Product product : order.getProducts()) {
            System.out.println(product.getProductName() + ": N" + product.getProductPrice());
        }
        System.out.println("Total amount: N" + calculateOrderTotal(order));
    }

    public void add(int cashier) {
    }

    public void remove(Cashier cashier) {
    }
}
