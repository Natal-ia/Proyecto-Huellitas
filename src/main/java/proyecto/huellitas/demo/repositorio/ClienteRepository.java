package proyecto.huellitas.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    

}
