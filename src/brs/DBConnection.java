import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getDBConnection() {
        Connection connection;
        try {
//          String database="Bus.mdb";
//          String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + "";
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            
            
            Driver d = new net.ucanaccess.jdbc.UcanaccessDriver();
            DriverManager.registerDriver(d);
            connection = DriverManager.getConnection("jdbc:ucanaccess://src\\database\\Bus.mdb");
            return connection;
        } catch (Exception ex) {
            return null;
        }//try catch closed
    }//getDBConnection() closed
}//class closed
