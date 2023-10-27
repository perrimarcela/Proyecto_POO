package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.connectors.Conexion;
import ar.com.checkinn.proyecto.entities.Habitacion;
import ar.com.checkinn.proyecto.interfaces.HabitacionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HabitacionDAOImpl implements HabitacionDAO{
    @Override
    public List<Habitacion> consultarDisponibles() {
        Connection unaConexion = null;
        List<Habitacion> lista = new ArrayList<>();
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from habitaciones where estado = 1";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (unResultado.next()) {
                System.out.println("Numero: " + unResultado.getString("numero"));
                System.out.println("Piso: " + unResultado.getString("piso"));
                System.out.println("Descripcion: " + unResultado.getString("descripcion"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Precio x Día: " + unResultado.getString("precioDiario"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Tipo de Habitación: " + unResultado.getString("tipoHabitacion"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }
    
    @Override
    public void consultarUna(String numero) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from habitaciones where numero = '" + numero + "'";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (unResultado.next()) {
                System.out.println("Numero: " + unResultado.getString("numero"));
                System.out.println("Piso: " + unResultado.getString("piso"));
                System.out.println("Descripcion: " + unResultado.getString("descripcion"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Precio x Día: " + unResultado.getString("precioDiario"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Estado: " + unResultado.getString("estado"));
                System.out.println("Tipo de Habitación: " + unResultado.getString("tipoHabitacion"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
     public void insertar(Habitacion a) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaInsercion = "insert into empleados(numero,piso,descripcion,caracteristicas,precioDiario,estado,tipoHabitacion) values(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaInsercion);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, a.getNumero());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(2, a.getPiso());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getDescripcion());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(4, a.getCaracteristicas());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setDouble(5, a.getPrecioDiario());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //unaSentencia.setBoolean(4, a.getEstado());
            unaSentencia.setBoolean(6, false);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(7, a.getTipoHabitacion());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Insercion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    @Override
     public void eliminar(String numero) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaEliminacion = "delete from habitaciones where numero = ?";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaEliminacion);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setString(1, numero);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Eliminacion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     @Override
    public ArrayList<Habitacion> cargarListaDisponibles() {
        ArrayList<Habitacion> lista = new ArrayList<>();

        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from habitaciones";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (unResultado.next()) {
                String idHabitacion = unResultado.getString("idHabitacion");
                String numero = unResultado.getString("numero");
                String piso = unResultado.getString("piso");
                String descripcion = unResultado.getString("descripcion");
                String caracteristicas = unResultado.getString("caracteristicas");
                int precioDiario = unResultado.getInt("precioDiario");
                Boolean estado = false;
                String tipoHabitacion = unResultado.getString("tipoHabitacion");
                
                Habitacion a = new Habitacion(idHabitacion, numero, piso, descripcion, caracteristicas, precioDiario, estado, tipoHabitacion);
                lista.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return lista;
    }
}
