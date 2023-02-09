import java.util.ArrayList;

public class Manager extends Staff{
    private String managerName;
    private Store store;

    public Manager(String managerName, int staffID) {
        this.managerName = managerName;
    }

    public void hireCashier(Cashier cashier) {
//        cashier.add(cashier);
    }

    public void fireCashier(Cashier cashier) {
        cashier.remove(cashier);
    }

    public ArrayList<Order> viewOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        return orders;
    }

    public ArrayList<Product> viewInventory() {
        return store.products;
    }
    public ArrayList<Cashier> viewCashiers() {
        return store.cashiers;
    }

    public String getName() {
        return managerName;
    }

    public void addProduct(Product product1) {
    }

    public void removerProduct(Product product1) {
    }
}
