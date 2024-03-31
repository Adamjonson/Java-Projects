import org.postgresql.Driver;

import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        int sid = 102;
        String sname = "Julia";
        int marks = 48;
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "insert into student values (?, ?, ?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();
        System.out.println();
        con.close();
        System.out.println("Connections established");

    }
}
