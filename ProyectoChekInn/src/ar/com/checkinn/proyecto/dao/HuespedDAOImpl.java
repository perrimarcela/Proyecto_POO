package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.connectors.Conexion;
import ar.com.checkinn.proyecto.entities.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HuespedDAOImpl {
    
    public List<Huesped> consultarTodos() {
        Connection unaConexion = null;
        List<Huesped> lista = new ArrayList<>();
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from huespedes";

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
                System.out.println("Nombre: " + unResultado.getString("nombre"));
                System.out.println("Apellido: " + unResultado.getString("apellido"));
                System.out.println("Tipo Documento: " + unResultado.getString("tipoDocumento"));
                System.out.println("N° Documento: " + unResultado.getString("numDocumento"));
                System.out.println("Direccion: " + unResultado.getString("direccion"));
                System.out.println("Telefono: " + unResultado.getString("telefono"));
                System.out.println("Email" + unResultado.getString("email"));
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
    
     public void consultarUno(String numDocumento) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from huespedes where numDocumento = '"  + numDocumento + "'";

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
                System.out.println("ID Huesped: " + unResultado.getString("idHuesped"));
                System.out.println("Nombre: " + unResultado.getString("nombre"));
                System.out.println("Apellido: " + unResultado.getString("apellido"));
                System.out.println("Tipo Documento: " + unResultado.getString("tipoDocumento"));
                System.out.println("N° Documento: " + unResultado.getString("numDocumento"));
                System.out.println("Direccion: " + unResultado.getString("direccion"));
                System.out.println("Telefono: " + unResultado.getString("telefono"));
                System.out.println("Email" + unResultado.getString("email"));
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
     
     public void insertar(Huesped a) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaInsercion = "insert into huespedes(nombre, apellido, tipoDocumento, numDocumento, direccion, telefono, email) values(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaInsercion);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, a.getNombre());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(2, a.getApellido());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getTipoDocumento());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getNumDocumento());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getDireccion());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getTelefono());
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getEmail());
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
     
     public void eliminar(String numDocumento) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaEliminacion = "delete from huespedes where numDocumento = ?";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaEliminacion);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, numDocumento);
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
}
