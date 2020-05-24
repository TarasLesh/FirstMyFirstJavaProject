package lessons.lesson2;

//1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L).
// Написати в ньому абстрактий метод getDescription.
// Оверрайднути метод getDescription для всіх об'єктів енума,
// який повертатиме стрічку - опис розміра (просто якийсь текст).
// Додати в енум в поле int euroSize, написати конструктор,
// який параметром буде приймати значення для поля.
public enum Size {
    XS(44) {
        @Override
        public String getDescription() {
            return "Extra Small Size";
        }
    }, S(46) {
        @Override
        public String getDescription() {
            return "Small Size";
        }
    }, M(48) {
        @Override
        public String getDescription() {
            return "Medium Size";
        }
    }, L(50) {
        @Override
        public String getDescription() {
            return "Large Size";
        }
    };

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract String getDescription();

}
