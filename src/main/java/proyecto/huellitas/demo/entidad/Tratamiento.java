package proyecto.huellitas.demo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Tratamiento {
 
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private Droga droga;

    @ManyToOne
    private Veterinario veterinario;



    public Tratamiento() {
    }

    public Tratamiento(Droga droga, String descripcion, String fechaInicio, String fechaFin, Veterinario veterinario, Mascota mascota) {
        this.droga = droga;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }
    public Tratamiento( String descripcion, String fechaInicio, String fechaFin, Mascota mascota) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.mascota = mascota;
    }
    public Tratamiento(Long id, Droga droga, String descripcion, String fechaInicio, String fechaFin, Veterinario veterinario, Mascota mascota) {
        this.id = id;
        this.droga = droga;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    public Droga getDroga() {
        return droga;
    }
    public void setDroga(Droga droga) {
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
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
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
