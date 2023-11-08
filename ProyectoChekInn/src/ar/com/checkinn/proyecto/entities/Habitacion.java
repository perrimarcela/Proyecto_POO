package ar.com.checkinn.proyecto.entities;

import ar.com.checkinn.proyecto.dao.HabitacionDAOImpl;

public class Habitacion extends HabitacionDAOImpl {
    //Atributos
    private int idHabitacion;
    private String numero;
    private String piso;
    private String descripcion;   
    private String caracteristicas;
    private double precio_diario;
    private boolean estado;
    private String tipo_habitacion;

    //constructores
    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String numero, String piso, String descripcion, String caracteristicas, double precio_diario, boolean estado, String tipo_habitacion) {
        this.setIdHabitacion(idHabitacion);
        this.setNumero(numero);
        this.setPiso(piso);
        this.setDescripcion(descripcion);
        this.setCaracteristicas(caracteristicas);
        this.setPrecio_diario(precio_diario);
        this.setEstado(estado);
        this.setTipo_Habitacion(tipo_habitacion);
    }
    
    //Getters and Setters
    public String getTipo_Habitacion() {
        return tipo_habitacion;
    }
    public final void setTipo_Habitacion(String tipo_habitacion) {
        if (tipo_habitacion.length() <= 20 && tipo_habitacion.length() >= 0)
        {
            this.tipo_habitacion = tipo_habitacion;
        } else
        {
            System.out.println("Superaste la cantidad de caracteres permitidos, el maximo es 20 caracteres");
        }
    }
    public boolean getEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getprecio_diario() {
        return precio_diario;
    }
    public final void setPrecio_diario(double precio_diario) {
        if (precio_diario >= 0 && precio_diario <= 9999999.99)
        {
            this.precio_diario = precio_diario;

        } else
        {
            System.out.println("cifra no permitida, deben ser 9 cifas en total");
        }
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public final void setCaracteristicas(String caracteristicas) {
        if (caracteristicas.length() >= 0 && caracteristicas.length() <= 512)
        {
            this.caracteristicas = caracteristicas;
        } else
        {
            System.out.println("Excede el limite de caracteres permitido");
        }
    }
    public String getDescripcion() {
        return descripcion;
    }
    public final void setDescripcion(String descripcion) {
        if (descripcion.length() >= 0 && descripcion.length() <= 255)
        {
            this.descripcion = descripcion;
        } else
        {
            System.out.println("Excede el limite de caracteres permitido");
        }
    }
    public String getPiso() {
        return piso;
    }
    public final void setPiso(String piso) {
        if (piso.length() >= 0 && piso.length() <= 3)
        {
            this.piso = piso;
        } else
        {
            System.out.println("Excede el limite de caracteres permitido");
        }
    }
    public String getNumero() {
        return numero;
    }
    public final void setNumero(String numero) {
        if (numero.length() >= 0 && numero.length() <= 4)
        {
            this.numero = numero;
        } else
        {
            System.out.println("Excede el limite de caracteres permitido");
        }
    }
    public int getIdHabitacion() {
        return idHabitacion;
    }
    public final void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Habitacion= " + idHabitacion + "\nNumero=" + numero + "\nPiso= " + piso + "\nDescripcion= " + descripcion + "\nCaracteristicas= " + caracteristicas + "\nPrecio por Dia= " + precio_diario + "\nEstado= " + estado + "\nTipo de Habitacion= " + tipo_habitacion;
    }
    
}
