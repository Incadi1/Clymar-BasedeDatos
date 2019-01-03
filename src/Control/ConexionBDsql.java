/**
 *
 * @author Ingrid Carmona Diaz 
 */

package Control;

import java.sql.*;

public class ConexionBDsql {
    Connection Cb;
    
    public Connection conexion(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Cb = DriverManager.getConnection("jdbc:mysql://localhost/Clymar", "root", "");
        System.out.println("Se hizo la conexión exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        } return Cb;
    }
    
    Statement creStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
