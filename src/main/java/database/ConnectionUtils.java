package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class ConnectionUtils {
    // "password=RJUGUW40DOJ6323D$;";

    public static final String db = "database=brucenguyen-database;";
    public static final String ur = "user=brucenguyen-server-admin;";
    public static final String pw = "password=RJUGUW40DOJ6323D$;";
    public static final String curl = "jdbc:sqlserver://brucenguyen-server.database.windows.net;"
            + db
            + ur
            + pw
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "loginTimeout=30;";
    // = "brucenguyen-server.database.windows.net";
    private String dbName;// = "database=brucenguyen-database;";
    private String userName;// = "user=brucenguyen-server-admin;";
    private String password;
    private String connectionUrl;

    public ConnectionUtils() {

    }

    public ConnectionUtils(String dbName, String userName, String password, String connectionUrl) {
        this.dbName = dbName;
        this.userName = userName;
        this.password = password;
        this.connectionUrl = connectionUrl;
    }

    /*public String getDbName() {
        return dbName;
    }
*/
    public void setDbName() {
        this.dbName = db;
    }

    /*public String getUserName() {
        return userName;
    }*/

    public void setUserName() {
        this.userName = ur;
    }

    /*public String getPassword() {
        return password;
    }*/

    public void setPassword() {
        this.password = pw;
    }

   /* public String getConnectionUrl() {
        return connectionUrl;
    }*/

    public void setConnectionUrl() {
        this.connectionUrl = curl;
    }

    public static Connection openConnection()  {
        try{

            Connection connection = getConnection(curl);
            return connection;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(Connection conn){
        try{
            if(conn!=null)
                conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
