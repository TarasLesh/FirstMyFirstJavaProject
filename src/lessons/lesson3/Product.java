package lessons.lesson3;

import java.util.Objects;

public class Product {
    private String title;
    private int price;
    private Type type;
    private Category category;

    public Product(String title, int price, Type type, Category category) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.category = category;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(title, product.title) &&
                type == product.type &&
                category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, type, category);
    }
}
