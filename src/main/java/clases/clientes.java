package clases;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table(name="clientes")

public class clientes{
    
    /*Atributos_____________________________________________________*/
    @Id
    @Column(name="Id")
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    
    @Column(name="apellido")
    private String apellido;
    
    
    @Column(name="telefono")
    private String telefono;

    
    /*contructor_____________________________________________________*/
    public clientes() {
    }

    public clientes( String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    
    
    
    
    /*getter and _____________________________________________________*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
    
}