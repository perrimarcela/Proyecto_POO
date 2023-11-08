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

        String unaConsulta = "select * from habitaciones where estado = "+true;

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
                System.out.println("Precio x Día: " + unResultado.getString("precio_diario"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Tipo de Habitación: " + unResultado.getString("tipo_habitacion"));
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
                
                System.out.println("IdHabitacion: " + unResultado.getString("IdHabitacion"));
                System.out.println("Numero: " + unResultado.getString("numero"));
                System.out.println("Piso: " + unResultado.getString("piso"));
                System.out.println("Descripcion: " + unResultado.getString("descripcion"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Precio x Día: " + unResultado.getString("precio_diario"));
                System.out.println("Caracteristicas: " + unResultado.getString("caracteristicas"));
                System.out.println("Estado: " + unResultado.getString("estado"));
                System.out.println("Tipo de Habitación: " + unResultado.getString("tipo_habitacion"));
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

        String unaInsercion = "insert into habitaciones(idHabitacion,numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion) values(?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaInsercion);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            unaSentencia.setInt(1, a.getIdHabitacion());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(2, a.getNumero());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(3, a.getPiso());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(4, a.getDescripcion());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(5, a.getCaracteristicas());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setDouble(6, a.getprecio_diario());
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setBoolean(7, true);
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(8, a.getTipo_Habitacion());
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
                int idHabitacion = unResultado.getInt("idHabitacion");
                String numero = unResultado.getString("numero");
                String piso = unResultado.getString("piso");
                String descripcion = unResultado.getString("descripcion");
                String caracteristicas = unResultado.getString("caracteristicas");
                int precio_diario = unResultado.getInt("precio_diario");
                Boolean estado = false;
                String tipoHabitacion = unResultado.getString("tipo_habitacion");
                
                Habitacion a = new Habitacion(idHabitacion, numero, piso, descripcion, caracteristicas, precio_diario, estado, tipoHabitacion);
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

    @Override
    public void ocuparHabitacion(String numero) {         
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String unaConsulta = "update habitaciones set estado = "+false+" where numero="+numero;
        
        PreparedStatement unaSentencia = null;
        
        try {
            unaSentencia = unaConexion.prepareStatement(unaConsulta);
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
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void liberarHabitacion(String numero) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String unaConsulta = "update habitaciones set estado = "+true+" where numero="+numero;
        
        PreparedStatement unaSentencia = null;
        
        try {
            unaSentencia = unaConexion.prepareStatement(unaConsulta);
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
            Logger.getLogger(HabitacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
       

