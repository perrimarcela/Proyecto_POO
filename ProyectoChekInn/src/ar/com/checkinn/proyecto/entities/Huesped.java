package ar.com.checkinn.proyecto.entities;

public class Huesped {
    //atributos
    private int idHuesped;
    private String nombre;
    private String apellido;
    private String tipo_documento;
    private String nro_documento;
    private String direccion;
    private String telefono;    
    private String email;

    //constructores
    public Huesped() {
    }

    public Huesped(int idHuesped, String nombre, String apellido, String tipo_documento, String nro_documento, String direccion, String telefono, String email) {
        this.setIdHuesped(idHuesped);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.settipo_documento(tipo_documento);
        this.setnro_documento(nro_documento);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setEmail(email);
    }
    
    //getters and setters
    public String getEmail() {
        return email;
    }
    public final void setEmail(String email) {
        if (email.length()<=40) {
            this.email = email;
        } else {
            System.out.println("email demasiado largo");
        }
    }
    public String getTelefono() {
        return telefono;
    }
    public final void setTelefono(String telefono) {
        if (telefono.length()<=10) {
            this.telefono=telefono;
        } else {
            System.out.println("telefono demasiado largo");
        }
    }
    public String getDireccion() {
        return direccion;
    }
    public final void setDireccion(String direccion) {
        if (direccion.length()<=50) {
            this.direccion = direccion;
        } else {
            System.out.println("direccion demasiado largo");
        }
    }
    public String getnro_documento() {
        return nro_documento;
    }
    public final void setnro_documento(String nro_documento) {
        if (nro_documento.length()<=8) {
            this.nro_documento=nro_documento;
        } else {
            System.out.println("Documento demasiado largo");
        }
    }
    public String gettipo_documento() {
        return tipo_documento;
    }
    public final void settipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    public String getApellido() {
        return apellido;
    }
    public final void setApellido(String apellido) {
        if (apellido.length()<=20) {
           this.apellido = apellido;
        } else {
            System.out.println("Ingrese un apellido mas corto");
        }
    }
    public String getNombre() {
        return nombre;
    }
    public final void setNombre(String nombre) {
        if (nombre.length()<=20) {
           this.nombre = nombre; 
        } else {
            System.out.println("Ingrese un nombre mas corto");
        }
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
        return "idHuesped= " + idHuesped + "\nNombre=" + nombre + "'\nApellido=" + apellido + "\nTipo de documento=" + tipo_documento + "\nN° documento=" + nro_documento + "\nDirección=" + direccion + "\nTeléfono=" + telefono + "\nEmail=" + email;
    }   
}
