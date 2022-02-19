package az.iktlab.project.connection;
import java.sql.*;

public class SQLconfig {

    public SQLconfig() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Airplane Booking System", "postgres", "1234");
        Statement st = c.createStatement();

        ResultSet rs = st.executeQuery("select * from Flights");
        c.close();
    }
    }