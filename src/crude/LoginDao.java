/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author bitl
 */
public class LoginDao {

    private static LoginDao instance = new LoginDao();

    public static LoginDao getInstance() {
        return instance;
    }

    public Person getPerson(String namee) {
        Connection connection = null;
        Statement statement = null;
        Person person = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String sql = "select * from person where name = '" + namee + "'";
            System.out.println(sql);
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                System.out.println("result found");
                person = new Person();

                person.setName(rs.getString("name"));
                person.setAddress(rs.getString("address"));
                person.setGender(rs.getString("gender"));
                person.setId(rs.getString("id"));
                person.setPhone(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return person;
    }

}
