package proyecto.huellitas.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.huellitas.demo.entidad.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

    
}
