package proyecto.huellitas.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Cliente;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    
    default void changeEstadoById(Long id) {
        Mascota mascota = findById(id).orElseThrow(() -> new RuntimeException("Mascota not found with id: " + id));
        mascota.changeEstado();
        save(mascota);
    }
} 