package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Reserva;
import java.util.ArrayList;

public interface ReservaDAO {
    void consultarUna(String numero);
    void insertar(Reserva a);
    void eliminar(String numero);
    ArrayList<Reserva> cargarLista();
}
