package ar.com.checkinn.proyecto.dao;

import ar.com.checkinn.proyecto.connectors.Conexion;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.entities.Habitacion;
import ar.com.checkinn.proyecto.entities.Huesped;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservaDAOImpl {
    public void consultarUno(String numero) {
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
                System.out.println("Tipo Documento: " + unResultado.getString("tipoDocumento"));
                System.out.println("N° Documento: " + unResultado.getString("numDocumento"));
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
}
