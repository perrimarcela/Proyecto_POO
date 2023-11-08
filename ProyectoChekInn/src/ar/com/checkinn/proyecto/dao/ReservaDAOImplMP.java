package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.connectors.Conexion;
import ar.com.checkinn.proyecto.entities.Reserva;
import ar.com.checkinn.proyecto.interfaces.ReservaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservaDAOImpl implements ReservaDAO{
    public void consultarUno(int idReserva) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from reservas where idReserva = " + idReserva;
        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (unResultado.next()) {
                System.out.println("ID Reserva: " + unResultado.getString("idReserva"));
                System.out.println("ID Habitacion" + unResultado.getString("idHabitacion"));
                System.out.println("ID Huesped: " + unResultado.getString("idHuesped"));
                System.out.println("ID Empleado: " + unResultado.getString("idEmpleado"));
                System.out.println("Tipo Reserva: " + unResultado.getString("tipo_reserva"));
                System.out.println("Fecha Ingreso: " + unResultado.getString("fecha_ingreso"));
                System.out.println("Fecha Salida: " + unResultado.getString("fecha_salida"));
                System.out.println("Costo: " + unResultado.getString("costo_alojamiento"));
                System.out.println("Estado: " + unResultado.getString("estado"));              
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void consultarUna(int idReserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar(Reserva a) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaInsercion = "insert into reservas(idreserva, idhabitacion, idhuesped, idempleado, tipo_reserva, fecha_ingreso, fecha_salida, costo_alojamiento, estado) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaInsercion);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setInt(1, a.getIdReserva());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setInt(2, a.getIdHabitacion());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setInt(3, a.getIdHuesped());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setInt(4, a.getIdEmpleado());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(5, a.gettipo_reserva());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(6, a.getfecha_ingreso());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setString(7, a.getfecha_salida());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setDouble(8, a.getcosto_alojamiento());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            unaSentencia.setBoolean(9, a.getEstado());
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Insercion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(int idReserva) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaEliminacion = "delete from reservas where idreserva = ?";

        PreparedStatement unaSentencia = null;
        try {
            unaSentencia = unaConexion.prepareStatement(unaEliminacion);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.setInt(1, idReserva);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaSentencia.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Eliminacion correcta");

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Reserva> cargarLista() {
        ArrayList<Reserva> lista = new ArrayList<Reserva>();

        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from reservas";

        Statement unaSentencia = null;
        try {
            unaSentencia = unaConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet unResultado = null;
        try {
            unResultado = unaSentencia.executeQuery(unaConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (unResultado.next()) {
                int idreserva = unResultado.getInt("idreserva");
                int idhabitacion = unResultado.getInt("idhabitacion");
                int idhuesped = unResultado.getInt("idhuesped");
                int idempleado = unResultado.getInt("idempleado");
                String tipo_reserva = unResultado.getString("tipo_reserva");
                String fecha_ingreso = unResultado.getString("fecha_ingreso");
                String fecha_salida = unResultado.getString("fecha_salida");
                Double costo_alojamiento = unResultado.getDouble("costo_alojamiento");
                Boolean estado = false;
                
                Reserva a = new Reserva(idreserva, idhabitacion, idhuesped, idempleado, tipo_reserva, fecha_ingreso, fecha_salida, costo_alojamiento, estado);
                lista.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            unaConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}
