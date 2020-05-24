package lessons.lesson2;

//5. Створити клас Ательє, який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
// та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
// та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).
public class CustomShop {
    private Clothes[] clothes = new Clothes[10];

    // через Clothes
    public Clothes[] womanClothes() {
        Clothes[] womanClothes = new Clothes[clothes.length];

        int i = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes) {
                womanClothes[i] = clothe;
                i++;
            }
        }
        return womanClothes;
    }


    // через ManClothes
    public ManClothes[] manClothes() {
        ManClothes[] manClothes = new ManClothes[clothes.length];

        int i = 0;

        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                manClothes[i] = (ManClothes) clothe;
                i++;
            }
        }
        return manClothes;
    }

}
