package Task_04_ShoppingSpree;

/**
 * Created by ivano on 2/13/2017.
 */
public class Product {
    private String productName;
    private Double priceOfProduct;

    public Product(String name, Double priceOfProduct) {
        this.setProductName(name);
        this.setPriceOfProduct(priceOfProduct);
    }

    public Double getPriceOfProduct() {
        return priceOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        if (productName.equals("")) {
            throw new IllegalArgumentException("Product name can not be empty.");
        }
        this.productName = productName;
    }

    private void setPriceOfProduct(Double priceOfProduct) {
        if (priceOfProduct <= 0) {
            throw new IllegalArgumentException("Price can not be zero or negative.");
        }
        this.priceOfProduct = priceOfProduct;
    }
}
