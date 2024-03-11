package proyecto.huellitas.demo.entidad;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Veterinario {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nombre;
    private String cedula;
    private String especialidad;
    private int numAtenciones;
    private String foto;

    @OneToMany (mappedBy = "veterinario")
    private List<Tratamiento> tratamientos = new ArrayList<>();


    public Veterinario() {
    }

    
    public Veterinario(String nombre, String cedula, String especialidad, int numAtenciones, String foto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.numAtenciones = numAtenciones;
        this.foto = foto;
    }

    
    public Veterinario(Long id, String nombre, String cedula, String especialidad, int numAtenciones, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.numAtenciones = numAtenciones;
        this.foto = foto;
    }
    


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getNumAtenciones() {
        return numAtenciones;
    }
    public void setNumAtenciones(int numAtenciones) {
        this.numAtenciones = numAtenciones;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }


    
}
