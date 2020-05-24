package lessons.lesson2;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    @Override
    public void dressMan() {
        System.out.println("This is TShirt for Man");
    }

    @Override
    public void dressWomen() {
        System.out.println("This is TShirt for Woman");

    }
}
