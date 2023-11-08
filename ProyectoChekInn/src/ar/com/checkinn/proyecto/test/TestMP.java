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
//        EmpleadoDAOImpl a = new EmpleadoDAOImpl();
//        HabitacionDAOImpl b = new HabitacionDAOImpl();
//        HuespedDAOImpl c = new HuespedDAOImpl();
        ReservaDAOImpl d = new ReservaDAOImpl();
        
//        Empleado empl1 = new Empleado(1, "Carlos", "Carli", "Charly", true);     
//        Habitacion hab1 = new Habitacion(1, "123", "1", "nada", "nada", 124.45, true, "nada");
//        Huesped hue1 = new Huesped(1, "Cacho", "Castaña", "DNI", "00284693", "Cucha Cucha", "0028-3876", "cachocastana@gmail.com");
        Reserva resr = new Reserva(1, 1, 1, 1, "Total", "20231101", "20231115", 1237, true);
        
//        a.insertar(empl1);
//        b.insertar(hab1);
//        c.insertar(hue1);
        d.insertar(resr);

    }            
}
