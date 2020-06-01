package lessons.lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1.Додати продукт в магазин.Але перш ніж додати його в ліст,здійснити валідацію
//        (чи ціна не від'ємна, чи в назві товару не присутні цифри).
//        2.Видалити продукт з магазину по назві.
//        3.Збільшити ціну для вказаного у параметрі типу продуктів удвічі
//        4.Усі товари,дорожчі вказаної суми,записати у окремий ліст і вивести його на екран
//        (наприклад"В нашому магазині продаються такі преміум товари:...)
//        5.Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
//        6.Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
//
//        Для роботи з колекцією варто ще створити метод,який наповнить наш магазин
//        одразу же ж певною кількістю продуктів


public class Store {
    private List<Product> productList = new ArrayList<>();

//    public void addAllProduct(List<Product> products) {
//        this.productList.addAll(products);
//    }

    public void addProduct(Product product) {
        if (product.getPrice() > 0 && product.getTitle().matches("[a-zA-Z]+$")) {
            //    (чи ціна не від'ємна, чи в назві товару не присутні цифри).
            this.productList.add(product);
        } else {
            System.out.println("Error! Your product '" + product.getTitle() + "' is NOT valid!");
        }
    }

    public void removeProduct(String title) {
        Iterator<Product> iterator = this.productList.iterator();
        while (iterator.hasNext()) {
            Product currentProduct = iterator.next();
            if (currentProduct.getTitle().equals(title)) {
                iterator.remove();
            }

        }
    }

    public void increasePrice(Type type) {
        for (Product product : productList) {
            if (product.getType().equals(type)) {
                product.setPrice(product.getPrice() * 2);
            }
        }
    }

    public void getProductsOverPrice(int overPrice) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() > overPrice) {
                products.add(product);
            }
        }
        System.out.println("В нашому магазині продаються такі преміум товари:");
        System.out.println(products);
    }

    public void totalPriceOfCurrentType(Type type) {
        int totalPrice = 0;
        for (Product product : productList) {
            if (product.getType().equals(type)) {
                totalPrice += product.getPrice();
            }
        }
        System.out.println("Загальна вартість усіх товарів вказаного типу:");
        System.out.println(totalPrice);
    }

    public void avgPrice() {
        int totalPriceOfAll = 0;
        for (Product product : productList) {
            totalPriceOfAll += product.getPrice();
        }
        System.out.println("Середня вартість усіх товарів в магазині:");
        System.out.println(totalPriceOfAll / productList.size());
    }

    public void fillStore() {
        productList.add(new Product("Lemon", 80, Type.FOOD, Category.FIRST));
        productList.add(new Product("Tomato", 40, Type.FOOD, Category.FIRST));
        productList.add(new Product("Banana", 35, Type.FOOD, Category.SECOND));
        productList.add(new Product("Praha", 180, Type.CAKES, Category.SECOND));
        productList.add(new Product("Jack", 500, Type.DRINKS, Category.FIRST));
        productList.add(new Product("Vodka", 90, Type.DRINKS, Category.THIRD));
    }

    public void getAllProducts() {
        System.out.println("Усі товари магазину:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
