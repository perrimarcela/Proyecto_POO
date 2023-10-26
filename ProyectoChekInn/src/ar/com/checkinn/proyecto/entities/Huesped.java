package ar.com.checkinn.proyecto.entities;

public class Huesped {
    //atributos
    private int idHuesped;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numDocumento;
    private String direccion;
    private String telefono;    
    private String email;

    //constructores
    public Huesped() {
    }

    public Huesped(int idHuesped, String nombre, String apellido, String tipoDocumento, String numDocumento, String direccion, String telefono, String email) {
        this.setIdHuesped(idHuesped);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTipoDocumento(tipoDocumento);
        this.setNumDocumento(numDocumento);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setEmail(email);
    }
    
    //getters and setters
    public String getEmail() {
        return email;
    }
    public final void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public final void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public final void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNumDocumento() {
        return numDocumento;
    }
    public final void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public final void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getApellido() {
        return apellido;
    }
    public final void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdHuesped() {
        return idHuesped;
    }
    public final void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }
    
    //ToString
    @Override
    public String toString() {
        return "idHuesped= " + idHuesped + "\nNombre=" + nombre + "'\nApellido=" + apellido + "\nTipo de documento=" + tipoDocumento + "\nN° documento=" + numDocumento + "\nDirección=" + direccion + "\nTeléfono=" + telefono + "\nEmail=" + email;
    }   
}
