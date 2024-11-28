import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database";

        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);


            Statement statement = connection.createStatement();


            String sql = "SELECT * FROM student";


            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()) {

                System.out.println(resultSet.getInt(1)+" " + resultSet.getString(2)+" "+  resultSet.getInt(3));
            }


            connection.close();


        } catch (Throwable i) {

            System.out.print(i);
        }
    }
}
