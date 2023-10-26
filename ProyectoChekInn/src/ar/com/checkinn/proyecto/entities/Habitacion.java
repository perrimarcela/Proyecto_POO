package ar.com.checkinn.proyecto.entities;

public class Habitacion {
    //Atributos
    private String idHabitacion;
    private String numero;
    private String piso;
    private String descripcion;   
    private String caracteristicas;
    private double precioDiario;
    private boolean estado;
    private String tipoHabitacion;

    //constructores
    public Habitacion() {
    }

    public Habitacion(String idHabitacion, String numero, String piso, String descripcion, String caracteristicas, double precioDiario, boolean estado, String tipoHabitacion) {
        this.setIdHabitacion(idHabitacion);
        this.setNumero(numero);
        this.setPiso(piso);
        this.setDescripcion(descripcion);
        this.setCaracteristicas(caracteristicas);
        this.setPrecio_diario(precioDiario);
        this.setEstado(estado);
        this.setTipoHabitacion(tipoHabitacion);
    }
    
    //Getters and Setters
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public final void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public boolean isEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getPrecioDiario() {
        return precioDiario;
    }
    public final void setPrecio_diario(double precioDiario) {
        this.precioDiario = precioDiario;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public final void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public final void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPiso() {
        return piso;
    }
    public final void setPiso(String piso) {
        this.piso = piso;
    }
    public String getNumero() {
        return numero;
    }
    public final void setNumero(String numero) {
        this.numero = numero;
    }
    public String getIdHabitacion() {
        return idHabitacion;
    }
    public final void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Habitacion= " + idHabitacion + "\nNumero=" + numero + "\nPiso= " + piso + "\nDescripcion= " + descripcion + "\nCaracteristicas= " + caracteristicas + "\nPrecio por Dia= " + precioDiario + "\nEstado= " + estado + "\nTipo de Habitacion= " + tipoHabitacion;
    }
    
}
