package Task_02_BookShop;

/**
 * Created by ivano on 2/13/2017.
 */
public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String title, String author, Double price) {
        super(title, author, price);
    }

    @Override
    protected Double getPrice() {
        return super.getPrice() + (super.getPrice() * 0.3);
    }
}
