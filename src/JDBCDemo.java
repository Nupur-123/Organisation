import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws  Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sys";
        String uname = "root";
        String password = "nupur123456";
       Connection connection = DriverManager.getConnection(url,uname,password);
       Statement statement = connection.createStatement();
       ResultSet set = statement.executeQuery("select * from employee");
       while (set.next()) {
           System.out.println("Employee Name : " + set.getString(1));
           System.out.println("Employee Department:" + set.getString(2));
       }


    }
}
