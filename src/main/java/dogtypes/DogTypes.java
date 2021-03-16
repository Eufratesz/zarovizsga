package dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {




    public static void main(String[] args) {


        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (
                SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }


    }

    public List<String> getDogsByCountry(String country) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try (

                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select name from dog_types where country = HUNGARY")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("name");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select names", se);
        }
    }
}

