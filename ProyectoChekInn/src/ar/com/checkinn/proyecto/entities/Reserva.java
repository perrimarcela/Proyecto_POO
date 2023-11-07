package ar.com.checkinn.proyecto.entities;

import java.util.List;

public class Reserva {
    //Atrbutos
    private int idReserva;
    private Habitacion idHabitacion;    
    private Huesped idHuesped;
    private List<Empleado> empleado;   
    private String tipo_reserva;
    private String fecha_ingreso;
    private String fecha_salida;   
    private double costo_alojamiento;   
    private boolean estado;

    //constructores
    public Reserva() {    
    }

    public Reserva(int idReserva, Habitacion idHabitacion, Huesped idHuesped, List<Empleado> empleado, String tipo_reserva, String fecha_ingreso, String fecha_salida, double costo_alojamiento, boolean estado) {
        this.setIdReserva(idReserva);
        this.setIdHabitacion(idHabitacion);
        this.setIdHuesped(idHuesped);
        this.empleado = empleado;
        this.settipo_reserva(tipo_reserva);
        this.setfecha_ingreso(fecha_ingreso);
        this.setfecha_salida(fecha_salida);
        this.setcosto_alojamiento(costo_alojamiento);
        this.setEstado(estado);
    }
    
    //Getters and Setters
    public boolean isEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getcosto_alojamiento() {
        return costo_alojamiento;
    }
    public final void setcosto_alojamiento(double costo_alojamiento) {
        
        if (costo_alojamiento >= 0 && costo_alojamiento <= 9999999.99)
        {
           this.costo_alojamiento = costo_alojamiento; 
        } else
        {
            System.out.println("Cantidad de digitos no permitida");
        }
        
    }
    public String getfecha_salida() {
        return fecha_salida;
    }
    public final void setfecha_salida(String fecha_salida) {
        
        
        this.fecha_salida = fecha_salida;
    }
    public String getfecha_ingreso() {
        return fecha_ingreso;
    }
    public final void setfecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    public String gettipo_reserva() {
        return tipo_reserva;
    }
    public final void settipo_reserva(String tipo_reserva) {
        if (tipo_reserva.length() >= 0 && tipo_reserva.length() <= 20)
        {
            this.tipo_reserva = tipo_reserva;
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
        return "Reserva= " + idReserva + "\nHabitacion= " + idHabitacion + "\nHuesped= " + idHuesped + "\nEmpleado= " + empleado + "\nTipo de Reserva= " + tipo_reserva + "\nFecha de Ingreso= " + fecha_ingreso + "\nFecha de Salida= " + fecha_salida + "Costo de Alojamiento= " + costo_alojamiento + "\nEstado= " + estado;
    }
    
}
