package ar.com.checkinn.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    //Atrbutos
    private int idReserva;
    private Habitacion idHabitacion;    
    private Huesped idHuesped;
    private List<Empleado> empleado;   
    private String tipoReserva;
    private String fechaIngreso;
    private String fechaSalida;   
    private double costoAlojamiento;   
    private boolean estado;

    //constructores
    public Reserva() {    
    }

    public Reserva(int idreserva, Habitacion idHabitacion, Huesped idHuesped, List<Empleado> empleado, String tipoReserva, String fechaIngreso, String fechaSalida, double costoAlojamiento, boolean estado) {
        this.setIdReserva(idReserva);
        this.setIdHabitacion(idHabitacion);
        this.setInCliente(idHuesped);
        this.empleado = new ArrayList<>();
        this.setTipoReserva(tipoReserva);
        this.setFechaIngreso(fechaIngreso);
        this.setFechaSalida(fechaSalida);
        this.setCostoAlojamiento(costoAlojamiento);
        this.setEstado(estado);
    }
    
    //Getters and Setters
    public boolean isEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getCostoAlojamiento() {
        return costoAlojamiento;
    }
    public final void setCostoAlojamiento(double costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }
    public String getFechaSalida() {
        return fechaSalida;
    }
    public final void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public final void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getTipoReserva() {
        return tipoReserva;
    }
    public final void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    public Huesped getInCliente() {
        return idHuesped;
    }
    public final void setInCliente(Huesped inCliente) {
        this.idHuesped= inCliente;
    }
    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }
    public final void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public int getIdReserva() {
        return idReserva;
    }
    public final void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Reserva= " + idReserva + "\nHabitacion= " + idHabitacion + "\nHuesped= " + idHuesped + "\nEmpleado= " + empleado + "\nTipo de Reserva= " + tipoReserva + "\nFecha de Ingreso= " + fechaIngreso + "\nFecha de Salida= " + fechaSalida + "Costo de Alojamiento= " + costoAlojamiento + "\nEstado= " + estado;
    }
    
}
