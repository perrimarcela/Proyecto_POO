package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.Conexion;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.interfaces.EmpleadoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Override
    public List<Empleado> consultarTodos() {
        Connection unaConexion = null;
        List<Empleado> lista = new ArrayList<>();
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from empleados";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (unResultado.next()) {
                System.out.println("Usuario: " + unResultado.getString("usuario"));
                System.out.println("Clave: " + unResultado.getString("clave"));
                System.out.println("Alias: " + unResultado.getString("alias"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }

    @Override
    public void consultarUno(String usuario) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from empleados where usuario = '" + usuario + "'";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (unResultado.next()) {
                System.out.println("IdEmpleado: " + unResultado.getInt(" idEmpleado"));
                System.out.println("Usuario: " + unResultado.getString(" usuario"));
                System.out.println("Clave: " + unResultado.getString("clave"));
                System.out.println("Alias: " + unResultado.getString("alias"));
                System.out.println("Estado: " + unResultado.getBoolean("estado"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void insertar(Empleado a) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaInsercion = "insert into empleados(usuario, clave, alias, estado) values(?, ?, ?, ?)";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaInsercion);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, a.getUsuario());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(2, a.getClave());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getAlias());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //unaSentencia.setBoolean(4, a.getEstado());
            unaSentencia.setBoolean(4, false);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Insercion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void actualizar(String usuarioAnterior, String usuarioNuevo) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaActualizacion = "update empleados set usuario = ? where usuario = ?";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaActualizacion);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, usuarioNuevo);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(2, usuarioAnterior);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Actualizacion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminar(String usuario) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaEliminacion = "delete from empleados where usuario = ?";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaEliminacion);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, usuario);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Eliminacion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @Override
    public ArrayList<Empleado> cargarLista() {
        ArrayList<Empleado> lista = new ArrayList<Empleado>();

        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from empleados";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (unResultado.next()) {
                int idempleado = unResultado.getInt("idEmpleado");
                String usuario = unResultado.getString("usuario");
                String clave = unResultado.getString("clave");
                String alias = unResultado.getString("alias");
                Boolean estado = false;
                
                Empleado a = new Empleado(idempleado, usuario, clave, alias, estado);
                lista.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return lista;
    }

    
    
    
    /*    
Logger.getLogger(AlumnoDAOImpl.class.getName()).log(Level.SEVERE, null, ex); es 
una instrucción típica en Java utilizada para registrar un mensaje de error en un 
archivo de registro o en la consola utilizando el sistema de registro incorporado 
de Java, conocido como el framework de registro Java Logging API (también conocido 
como java.util.logging).


Logger.getLogger(AlumnoDAOImpl.class.getName()): Esta parte obtiene una instancia 
del objeto Logger asociado a la clase AlumnoDAOImpl. El Logger es responsable de 
gestionar y registrar mensajes de registro.

.log(Level.SEVERE, null, ex): Aquí se llama al método log del objeto Logger para 
registrar un mensaje. Level.SEVERE indica que se está registrando un mensaje de 
nivel "severo" o de error. Este nivel se utiliza para mensajes de error críticos.

null: El segundo argumento es el identificador del recurso asociado con el mensaje 
de registro. En este caso, se pasa null para indicar que no hay recurso específico 
relacionado con el mensaje.

ex: El tercer argumento es el objeto Throwable (por lo general, una excepción) que 
se registra junto con el mensaje. Esto permite registrar información detallada sobre 
una excepción que ocurrió.

En resumen, esta línea de código se utiliza para registrar un mensaje de error 
(nivel "SEVERE") junto con detalles de una excepción (ex) en el registro de la 
aplicación, que puede ser útil para el diagnóstico y la depuración de problemas. 
El registro es una práctica común en el desarrollo de aplicaciones para ayudar a 
los desarrolladores a rastrear y solucionar problemas.

     */
}
