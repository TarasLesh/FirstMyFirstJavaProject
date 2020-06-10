package lessons.lections.lection6;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //  throws FileNotFoundException

        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            throw new NullPointerException();  // кинути помилку
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("ArrayIndexOutOfBoundsException | NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("I am finally");
        }


//       ============= File ================

        File file = new File("1.txt");
//        FileInputStream
//        FileOutputStream


//        try {
//            FileOutputStream fileOutputStream =  new FileOutputStream(file);
//            fileOutputStream.write("Hello world!".getBytes());
//            fileOutputStream.close();
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // закривається стрім автоматично                                   // дозаписувати файл
//        try (FileOutputStream fileOutputStream =  new FileOutputStream(file, true);){

//        try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
//            fileOutputStream.write("Hello world!".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try {
            FileInputStream fileInputStream = new FileInputStream("1.txt");
//            int read = fileInputStream.read();
//            System.out.println(read);
            int read;
            byte[] buffer = new byte[1024];
//                                                -1 є завершенням файлу
            while ((read = fileInputStream.read(buffer)) != -1) {
                System.out.println((char) read);
            }
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] != 0) {
                    System.out.println((char) buffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        PrintWriter printWriter = null;
//        try {
//            printWriter = new PrintWriter(new FileWriter("1.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        printWriter.println("qewrwq");
//        printWriter.println("sdafsa");
//        printWriter.println("zxvcxv");
//        printWriter.close();

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));
//            String s;
//            while ((s=bufferedReader.readLine()) != null) {
//                System.out.println(s+ "--"+ s.length());
//            }
//            System.out.println(s);
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String s = "Hello "+"world"+ "!!!";

//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1 == s2);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world").append(" !").append(" and").append(" underworld");
        System.out.println(stringBuilder.toString());



    }
}
