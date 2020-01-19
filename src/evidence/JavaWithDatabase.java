package evidence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaWithDatabase {
    public void JavaWithDatabase() {

        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            statement = connection.createStatement();

        } catch (Exception e) {
        }
        try {
            statement.executeUpdate("insert into person values('Hafizur','Satkhira','Bangladesh','Male','SSC HSC BSC')");

        } catch (Exception e) {
        }

        try {
            ResultSet rs = statement.executeQuery("select * from emp");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");

                System.out.println("Id: " + id + " Name : " + name + "Address: " + address);

            }
        } catch (Exception e) {
        }
    }

}
