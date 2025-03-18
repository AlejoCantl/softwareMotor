package softwaremotor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://btqcql8bq51cxkrkfscs-mysql.services.clever-cloud.com:3306/btqcql8bq51cxkrkfscs?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "uhrtd7htt4qbgwnd";
    private static final String PASSWORD = "Z2ojG0yJFp2KFd1TLUxb";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
