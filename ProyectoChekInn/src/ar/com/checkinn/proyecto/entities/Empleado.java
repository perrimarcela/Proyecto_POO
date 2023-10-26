package ar.com.checkinn.proyecto.entities;

public class Empleado {
    //atributos
    private int idEmpleado;
    private String usuario;
    private String clave;
    private String alias;
    private boolean estado;

    //constructores
    public Empleado() {
    }
    public Empleado(int idEmpleado, String usuario, String clave, String alias, boolean estado) {
        this.setIdEmpleado(idEmpleado);
        this.setUsuario(usuario);
        this.setClave(clave);
        this.setAlias(alias);
        this.setEstado(estado);
    }
    
    //getters and setters
    public boolean isEstado() {
        return estado;
    }
    public Boolean getEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getClave() {
        return clave;
    }
    public final void setClave(String clave) {
        this.clave = clave;
    }
    public String getAlias() {
        return alias;
    }
    public final void setAlias(String alias) {
        this.alias = alias;
    }
    public String getUsuario() {
        return usuario;
    }
    public final void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public final void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    //ToString
    @Override
    public String toString() {
        return "idEmpleado= " + idEmpleado + "\nUsuario= " + usuario + "\nClave= " + clave + "\nAlias= " + alias + "\nEstado= " + estado;
    }
}
