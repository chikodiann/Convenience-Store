public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private Cashier products;

    public Product(int productID, String productName, double productPrice, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity){
        this.productQuantity = productQuantity;
    }
    public void  addProduct(String productName, double productPrice, int productQuantity) {
        products.add(productID);
    }
}
