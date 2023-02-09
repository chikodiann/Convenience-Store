import java.util.ArrayList;

public class Store {
    public ArrayList<Product> products;
    public ArrayList<Cashier> cashiers;
    private  String storeName;
    public ArrayList<Customer>customers;

    private String manager;

    public Store(String storeName) {
        this.storeName = storeName;
        products = new ArrayList<>();
        customers = new ArrayList<>();
        cashiers = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
}
