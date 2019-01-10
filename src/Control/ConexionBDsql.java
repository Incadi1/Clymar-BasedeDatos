/**
 * @author Ingrid Carmona Diaz
 * date 21/Diciembre/2018 Mysql
 * date 03/Enero/2019 java
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
