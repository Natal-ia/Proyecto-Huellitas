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

    void deleteByCliente(Cliente cliente);

} 