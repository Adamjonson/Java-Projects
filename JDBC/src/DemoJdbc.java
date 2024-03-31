import org.postgresql.Driver;

import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "Select sname from student where sid=1";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("Name of the student is " + name);
        con.close();
        System.out.println("Connections established");

    }
}
