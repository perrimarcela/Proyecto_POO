package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Habitacion;
import java.util.ArrayList;
import java.util.List;

public interface HabitacionDAO {
    List<Habitacion> consultarDisponibles();
    void consultarUna(String numero);
    void insertar(Habitacion a);
    void eliminar(String numero);
    void ocuparHabitacion(Habitacion a);
    void liberarHabitacion(Habitacion a);
    ArrayList<Habitacion> cargarListaDisponibles();
}
