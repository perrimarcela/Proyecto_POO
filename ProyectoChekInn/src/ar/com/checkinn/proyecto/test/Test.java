package ar.com.checkinn.proyecto.test;

import ar.com.checkinn.proyecto.dao.EmpleadoDAOImpl;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.entities.Habitacion;
import java.util.Scanner;
import ar.com.checkinn.proyecto.dao.HabitacionDAOImpl;
public class Test {
    public static void main(String[] args) {
     
        //Test Empleado
        //Empleado emp1 = new Empleado(1, "Miguel", "12345", "Mike", true);
        //Empleado emp2 = new Empleado(2, "Rafael", "67890", "Rafa", false);
        //Empleado emp3 = new Empleado(0, "Rafael", "67890", "Rafa", false);
        //EmpleadoDAOImpl empdao = new EmpleadoDAOImpl ();
        
        
        //emp1.insertar(emp1);
        //emp2.insertar(emp2);
        //emp3.insertar(emp3);
        //emp1.eliminar("Miguel");
        
        //empdao.consultarTodos();
        //empdao.consultarUno("Miguel");
        //empdao.eliminar("Rafael");
        //empdao.actualizar("Miguel", "Pedro");
        
        // Test Habitacion 
         Habitacion hab1 = new Habitacion(1, "0123", "1", "2 camas y 1 jacuzzi", "grande", 125.45, true, "Salvaje");
         HabitacionDAOImpl a = new HabitacionDAOImpl();
         Habitacion hab2 = new Habitacion(2, "0124", "2", "1 cama1 y 3 jacuzzi", "grande", 140.45, false, "Salvaje");
         
         Habitacion hab3 = new Habitacion(3, "2345", "2", "algo", "algo", 100.45, true, "Carroza");
         
//         a.eliminar("0123");
//         a.eliminar("0124");
//         a.eliminar("2345");
//         a.insertar(hab3);
//        
//         a.insertar(hab1);
//        
//         a.insertar(hab2);
            
//         a.consultarUna("0123");
//
            a.modificarEstado(hab3);
//            
//           a.consultarUna("2345");
//            
//            System.out.println(a.consultarDisponibles());


        
         
         
         
    }
            
}
