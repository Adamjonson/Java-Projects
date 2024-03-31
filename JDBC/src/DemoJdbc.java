import org.postgresql.Driver;

import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "delete from student where sid=5";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        boolean status = st.execute(sql);
        System.out.println(status);
        con.close();
        System.out.println("Connections established");

    }
}
