package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Huesped;
import java.util.ArrayList;
import java.util.List;

public interface HuespedDAO {
    List<Huesped> consultarTodos();
    void consultarUno(String numDocumento);
    void insertar(Huesped a);
    void eliminar(String numDocumento);
    ArrayList<Huesped> cargarLista();
}
