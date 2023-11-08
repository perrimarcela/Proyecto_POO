package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Reserva;
import java.util.ArrayList;

public interface ReservaDAO {
    void consultarUna(int idReserva);
    void insertar(Reserva a);
    void eliminar(int idReserva);
    ArrayList<Reserva> cargarLista();
}
