
package login_register;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;


public class ConexionMySql {
    
    private static String  URL   = "mysql.pino.mx";
    private static String  USUARIO     = "uv2102_a";
    private static String  PASSWORD     = "NEUDH_DJFU_DBFT";
    private static String  NOMBREBD      = "uv2102_a";
    private static Integer PUERTO  = 3306;
       
    
    public static Connection getConnection(){
        
        Connection conexion = null;
        
        MysqlDataSource datasource = new MysqlDataSource(); 
        
        datasource.setServerName(URL);
        datasource.setUser(USUARIO);
        datasource.setPassword(PASSWORD);
        datasource.setDatabaseName(NOMBREBD);
        datasource.setPortNumber(PUERTO);
        
         try {
            conexion = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return conexion;
        
    }   
}
