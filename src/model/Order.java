import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderID;
    private Date orderDate;
    private ArrayList<Product> products;
    private double totalOrderCost;

    public Order() {
        orderID = (int) System.currentTimeMillis();
        orderDate = new Date();
        products = new ArrayList<>();
        totalOrderCost = 0;
    }

    public int getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalOrderCost -= product.getProductPrice();
    }

    public void addProduct(Product product) {
        products.add(product);
        totalOrderCost += product.getProductPrice();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public  void placeOrder() {
        for (Product product : products) {
            product.setProductQuantity(product.getProductQuantity() - 1);
        }
    }
    public double getTotalOrderCost() {
        return totalOrderCost;
    }
}
