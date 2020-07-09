package lessons.lections.lection9;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) throws IOException, SQLException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//        httpURLConnection.setRequestMethod("POST");  // якщо Request постовий

//        OutputStream outputStream = httpURLConnection.getOutputStream();
//        PrintWriter printWriter = new PrintWriter(outputStream);

        int responseCode = httpURLConnection.getResponseCode();
        StringBuilder responseBody = new StringBuilder();
        if (responseCode == HttpURLConnection.HTTP_OK) {

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                responseBody.append(s + "\n");
            }

        } else {
            System.out.println("Something WRONG. HTTP Code = " + responseCode);
        }

// --       JSONObject jsonObject = new JSONObject(responseBody.toString());  // помилка. прийшов Array
// --       System.out.println(responseBody.toString());

        JSONArray jsonArray = new JSONArray(responseBody.toString());
//        System.out.println(jsonArray);
//        jsonArray.forEach(System.out::println);
        List<User> userList = jsonArray.toList().stream().map(object -> {
            JSONObject jsonObject = new JSONObject((HashMap) object);
            User user = new User();
//           jsonObject.has() // перевірка наявності значення
            user.setId(jsonObject.getInt("id"));
            user.setUserId(jsonObject.getInt("userId"));
            user.setTitle(jsonObject.getString("title"));
            user.setBody(jsonObject.getString("body"));
            return user;
        }).collect(Collectors.toList());

//        userList.forEach(System.out::println);


        //              JDBC

        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

//        connection.createStatement().execute("CREATE TABLE `mydb`.`USER` (\n" +
//                "  `id` INT NOT NULL,\n" +
//                "  `userId` INT NOT NULL,\n" +
//                "  `title` VARCHAR(300) NOT NULL,\n" +
//                "  `body` VARCHAR(450) NOT NULL,\n" +
//                "  PRIMARY KEY (`id`));");

//        PreparedStatement preparedStatement = connection
//                .prepareStatement("INSERT INTO USER (id, userId, title, body) VALUES (?, ?, ?, ?)");
//
//        userList.forEach(user -> {
//            try {
//                preparedStatement.setInt(1, user.getId());
//                preparedStatement.setInt(2, user.getUserId());
//                preparedStatement.setString(3, user.getTitle());
//                preparedStatement.setString(4, user.getBody());
//                int i = preparedStatement.executeUpdate();
//                System.out.println(i);
//
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        });

// --       int executeUpdateRowsCount = preparedStatement.executeUpdate();
// --       System.out.println(executeUpdateRowsCount);

                                //  executeQuery повертає нам дані у вигляді таблиці
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM USER");

        List<User> usersFromDB = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            int userId = resultSet.getInt("userId");
            String title = resultSet.getString("title");
            String body = resultSet.getString("body");
            usersFromDB.add(new User(id, userId, title, body));
        }

        connection.close();

        usersFromDB.forEach(System.out::println);
    }

}
