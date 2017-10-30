package Task_04_ShoppingSpree;

import java.util.ArrayList;

/**
 * Created by ivano on 2/13/2017.
 */
public class Person {
    private String name;
    private Double money;
    private ArrayList<Product> bagOfProducts;

    public Person(String name, Double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Product name can not be empty.");
        }
        this.name = name;
    }

    private void setMoney(Double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money can not be zero or negative.");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    private Double getMoney() {
        return money;
    }

    public void buyProduct(Product product) {
        if (product.getPriceOfProduct() > this.getMoney()) {
            System.out.printf("%s can't afford %s%n", this.getName(), product.getProductName());
        } else {
            Double newMoney = this.getMoney() - product.getPriceOfProduct();
            this.setMoney(newMoney);
            bagOfProducts.add(product);
            System.out.println(this.getName() + " bought " + product.getProductName());
        }
    }
}
