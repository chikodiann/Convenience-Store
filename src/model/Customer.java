public class Customer {
    private String customerName;
    private int customerID;
    private Order customerOrder;

    public Customer(String customerName, int customerID) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Order getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(Order customerOrder) {
        this.customerOrder = customerOrder;
    }

    //    public void startOrder() {
//        customerOrder = new Order();
//    }
//    public void addProductToOrder(Product product) {
//        customerOrder.addProduct(product);
//    }
//    public void  removeProductFromOrder(Product product) {
//        customerOrder.removeProduct(product);
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                "customerName='" + customerName + '\'' +
                ", customerOrder=" + customerOrder +
                '}';
    }
}
