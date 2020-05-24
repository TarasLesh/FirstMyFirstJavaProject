package lessons.lesson2;
//3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум),
// вартість, колір.
public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    public Clothes() {
    }

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
