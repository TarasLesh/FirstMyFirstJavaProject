package lessons.lesson2;

public class Trousers extends Clothes implements ManClothes, WomanClothes {
    @Override
    public void dressMan() {
        System.out.println("This is trousers for Man");
    }

    @Override
    public void dressWomen() {
        System.out.println("This is trousers for Woman");

    }
}
