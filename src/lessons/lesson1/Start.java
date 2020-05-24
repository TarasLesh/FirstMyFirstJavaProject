package lessons.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        System.out.println("MyFirstApp");
//        sout

//        int[] ints = new int[5];
//        ints[0] = 100;

//        int[] ints = {100, 200, 300}; // new int[3]

//            String[] str = new String[3];
//        String[] str = {"qrqwr", "awf", "qfw"};

//        double p = 3.14;

//        final int X = 100;   //const

//        switch ("ad") {
//            case "ad":
//                System.out.println("ad");
//                break;
//            default:
//                System.out.println("default");
//        }

//        double a = (double) 100 / (double) 3;
//        double b = 100.0 / 3.0;
//        System.out.println(a);
//        System.out.println(b);


        //        itar
//        for (int i = 0; i < args.length; i++) {
//            String arg = args[i];
//        }

        //      iter
//        for (String arg : args) {
//        }


//        int[] ints = {100, 200, 300};
//        try {
//            System.out.println(ints[10]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("________");


//                                     User user = new User();
//        user.id = 1;
//        user.name = "Vasya";


//        User user1 = new User(2, "kokos");

//                                System.out.println(user.toString());
//        System.out.println(user1);

//                                user.calculate(1, 2, 3);
//                                user.calculate(1, 2);

//        User.X;

//                                    SuperUser superUser = new SuperUser();
//                                    superUser.getName();
//                                    superUser.setLogin("asd");
//
//                                    User user2 = new SuperUser();
//
//                                    foobar(new SuperUser());
//                                    foobar(new User());

        User petya = new User();
        petya.setId(1);
        petya.setName("petya");
        User vasya = new User();
        vasya.setId(2);
        vasya.setName("vasya");
        User taras = new User();
        taras.setId(3);
        taras.setName("taras");
        User haly = new User(4, "halyna");

        User[] user1 = {petya, vasya, taras, haly};
        System.out.println(Arrays.toString(user1));

        User[] users = new User[3];

        users[0] = new User();
        users[0].setId(1);
        users[0].setName("vasya");
        users[1] = new User();
        users[1].setId(2);
        users[2] = new User();
        users[2].setId(3);
        users[2].setName("vova");

        System.out.println(Arrays.toString(users));

        for (int i = 0; i < users.length; i++) {
            System.out.println("Element at index " + users[i]);
        }
//        System.out.println(users.toString());

    }

//    public static void foobar(User user) {
//        user.greeting();
//    }
}
