
package model;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anderson
 */
public class ConexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbtnd","root", "");
            System.out.println("Conectado");
             
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error " + e);
        }
        return cn;
    
    }
    
}