package ar.com.checkinn.proyecto.entities;

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

    public Reserva(int idReserva, Habitacion idHabitacion, Huesped idHuesped, List<Empleado> empleado, String tipoReserva, String fechaIngreso, String fechaSalida, double costoAlojamiento, boolean estado) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
        this.empleado = empleado;
        this.tipoReserva = tipoReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoAlojamiento = costoAlojamiento;
        this.estado = estado;
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
        
        if (costoAlojamiento >= 0 && costoAlojamiento <= 9999999.99)
        {
           this.costoAlojamiento = costoAlojamiento; 
        } else
        {
            System.out.println("Cantidad de digitos no permitida");
        }
        
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
        if (tipoReserva.length() >= 0 && tipoReserva.length() <= 20)
        {
            this.tipoReserva = tipoReserva;
        } else
        {
            System.out.println("cantidad de caracteres excede el maximo permitido");
        }
        
    }
     public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
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
