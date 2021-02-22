public final class Product {
    private final String productName;
    private final String productDescription;
    private final double productPrice;
    private final int maximumQuantity;

    public Product(String productName, String productDescription, double productPrice, int maximumQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maximumQuantity = maximumQuantity;
    }
    public String toString(){
        return productName + productDescription + productPrice + maximumQuantity;
    }
    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

}
