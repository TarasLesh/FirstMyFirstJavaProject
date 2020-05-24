package lessons.lesson2;

public class Dress extends Clothes implements WomanClothes {
    @Override
    public void dressWomen() {
        System.out.println("Small beautiful Dress for Woman");
    }
}
