package Task_02_BookShop;

/**
 * Created by ivano on 2/13/2017.
 */
public class Book {
    private String title;
    private String author;
    private Double price;

    public Book(String title, String author, Double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    protected void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    protected void setAuthor(String author) {
        String[] currAuthor = author.split(" ");
        if (Character.isDigit(currAuthor[0].charAt(0))) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    protected void setPrice(Double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    protected Double getPrice() {
        return price;
    }

    protected String getAuthor() {
        return author;
    }

    protected String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();

    }
}
