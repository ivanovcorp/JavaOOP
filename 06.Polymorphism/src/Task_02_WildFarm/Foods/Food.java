package Task_02_WildFarm.Foods;

/**
 * Created by ivano on 2/19/2017.
 */
public abstract class Food {
    private Integer quantity;

    protected Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
