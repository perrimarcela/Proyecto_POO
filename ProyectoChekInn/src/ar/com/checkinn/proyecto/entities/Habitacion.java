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
        if (tipoHabitacion.length() <= 20 && tipoHabitacion.length() >= 0)
        {
            this.tipoHabitacion = tipoHabitacion;
        } else
        {
            System.out.println("Superaste la cantidad de caracteres permitidos, el maximo es 20 caracteres");
        }
    }
    public boolean isEstado() {
        return estado;
    }
    public final void setEstado(boolean estado) {
        if (estado == true)
        {
            this.estado = estado;

        } else  
        {
            System.out.println("La habitacion no esta disponible");
        }
    }
    public double getPrecioDiario() {
        return precioDiario;
    }
    public final void setPrecio_diario(double precioDiario) {
        if (precioDiario >= 0 && precioDiario <= 9)
        {
            this.precioDiario = precioDiario;

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
