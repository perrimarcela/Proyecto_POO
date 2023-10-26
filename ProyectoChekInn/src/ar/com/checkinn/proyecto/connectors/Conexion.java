

package ar.com.checkinn.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection obtenerConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String conexion = null;
        String usuario = null;
        String clave = null;
        
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            conexion = "jdbc:mysql://127.0.0.1:3306/basereservas";
            usuario = "root";
            clave = "";
            
            Class.forName(driver).newInstance();
            
            
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("error");
        }
        return DriverManager.getConnection(conexion, usuario, clave);
    }
}
