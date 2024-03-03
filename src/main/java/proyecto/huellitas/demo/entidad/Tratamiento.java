package proyecto.huellitas.demo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tratamiento {
    private String droga;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private String veterinario;

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Mascota mascota;


    public Tratamiento() {
    }

    public Tratamiento(String droga, String descripcion, String fechaInicio, String fechaFin, String veterinario, Mascota mascota) {
        this.droga = droga;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }
    public Tratamiento(Long id, String droga, String descripcion, String fechaInicio, String fechaFin, String veterinario, Mascota mascota) {
        this.id = id;
        this.droga = droga;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    public String getDroga() {
        return droga;
    }
    public void setDroga(String droga) {
        this.droga = droga;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }







    
}
