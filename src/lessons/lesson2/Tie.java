package lessons.lesson2;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan() {
        System.out.println("This is Tie for Man");
    }
}
