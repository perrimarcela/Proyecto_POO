package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Huesped;
import java.util.List;

public interface HuespedDAO {
    List<Huesped> consultarTodos();
    void consultarUno(String nro_documento);
    void insertar(Huesped a);
    void eliminar(String nro_documento);
}
