package proyecto.huellitas.demo.entidad;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String enfermedad;
    private String foto;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private List<Tratamiento> tratamientos = new ArrayList<>();

    public Mascota(String nombre, String raza, int edad, double peso, String enfermedad, String foto, Cliente cliente,
            List<Tratamiento> tratamientos) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.foto = foto;
        this.cliente = cliente;
        this.tratamientos = tratamientos;
    }

    public Mascota(Long id, String nombre, String raza, int edad, double peso, String enfermedad, String foto,
            Cliente cliente, List<Tratamiento> tratamientos) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.foto = foto;
        this.cliente = cliente;
        this.tratamientos = tratamientos;
    }

    public Mascota() {
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
}
