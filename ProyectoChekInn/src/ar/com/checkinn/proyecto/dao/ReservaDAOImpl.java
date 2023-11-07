package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.connectors.Conexion;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.entities.Habitacion;
import ar.com.checkinn.proyecto.entities.Huesped;
import ar.com.checkinn.proyecto.entities.Reserva;
import ar.com.checkinn.proyecto.interfaces.ReservaDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservaDAOImpl implements ReservaDAO{
    public void consultarUno(int IdReserva) {
        Connection unaConexion = null;
        try {
            unaConexion = Conexion.obtenerConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String unaConsulta = "select * from reservas where  = '"  + numero + "'"; //falta hacer consulta para traer a traves del id el numero de habitacion

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
                System.out.println("ID Huesped: " + unResultado.getString("apellido"));
                System.out.println("Tipo Documento: " + unResultado.getString("tipo_documento"));
                System.out.println("N° Documento: " + unResultado.getString("nro_documento"));
                System.out.println("Direccion: " + unResultado.getString("direccion"));
                System.out.println("Telefono: " + unResultado.getString("telefono"));
                System.out.println("Email" + unResultado.getString("email"));
                System.out.println("--------------------------------");
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int idReserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Reserva> cargarLista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
