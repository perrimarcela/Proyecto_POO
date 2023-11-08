package ar.com.checkinn.proyecto.test;

import ar.com.checkinn.proyecto.dao.EmpleadoDAOImpl;
import ar.com.checkinn.proyecto.dao.HabitacionDAOImpl;
import ar.com.checkinn.proyecto.dao.HuespedDAOImpl;
import ar.com.checkinn.proyecto.dao.ReservaDAOImpl;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.entities.Habitacion;
import ar.com.checkinn.proyecto.entities.Huesped;
import ar.com.checkinn.proyecto.entities.Reserva;

public class Test {
    public static void main(String[] args) {
        EmpleadoDAOImpl a = new EmpleadoDAOImpl();
        HabitacionDAOImpl b = new HabitacionDAOImpl();
        HuespedDAOImpl c = new HuespedDAOImpl();
        ReservaDAOImpl d = new ReservaDAOImpl();
        
        
//        Empleado empl1 = new Empleado(1, "Carlos", "Carli", "Charly", true);     
//        Habitacion hab1 = new Habitacion(4, "123", "1", "nada", "nada", 124.45, true, "nada");
//        Huesped hues1 = new Huesped(1, "Carlos", "Rodriguez", "DNI", "15789006", "Garay 4589", "1123456789", "Carlos.Rodrigue@gmail.com");
//        Reserva reser = new Reserva(1, hab1.getIdHabitacion(), hues1.getIdHuesped(), empl1.getIdEmpleado(), "", "1111-11-11", "1111-11-11", 123.45, true);
//        a.insertar(empl1);
//        b.insertar(hab1);
//        c.insertar(hues1);
//        d.insertar(reser);
//        d.eliminar(1);
//        b.consultarDisponibles();
        b.liberarHabitacion("0124");
        
    }            
}
