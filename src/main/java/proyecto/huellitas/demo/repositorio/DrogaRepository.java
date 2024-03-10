package proyecto.huellitas.demo.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.huellitas.demo.entidad.Droga; 



@Repository
public interface DrogaRepository extends JpaRepository< Droga , Long>{
    
}
