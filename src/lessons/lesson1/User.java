package lessons.lesson1;

public class User {

    //    public int id;         // публічна
//    protected int idd;     // доступна в нащадках і в пакеті
//    private int iddp;      // не доступна
    private int id;

//    public void setId(int id) {
//        if (id < 0) {
//            this.id = 0;
//        } else {
//            this.id = id;
//        }
//    }
//
//    public int getId() {
//        return id;
//    }


    private String name;

    static int X = 100500;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static int calculate(int a, int b) {
//        System.out.println(id);  // ---------
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        System.out.println(User.X);
        return a + b + c;
    }

    public void greeting() {

        System.out.println("hello!!");
    }
}
