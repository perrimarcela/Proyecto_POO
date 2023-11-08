package ar.com.checkinn.proyecto.interfaces;

import ar.com.checkinn.proyecto.entities.Empleado;
import java.util.ArrayList;
import java.util.List;

public interface EmpleadoDAO {
    List<Empleado> consultarTodos();
    void consultarUno(String usuario);
    void insertar(Empleado usuario);
    void eliminar(String usuario);
    void actualizar(String usuarioAnterior, String usuarioNuevo);
    ArrayList<Empleado> cargarLista();
}
