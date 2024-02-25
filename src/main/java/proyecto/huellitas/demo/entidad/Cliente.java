package proyecto.huellitas.demo.entidad;

import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private String celular;
    List<Mascota> mascotas;

    public Cliente(int id, String nombre, String correo, String celular){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    } 
    
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

}

