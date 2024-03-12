package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Tratamiento;


public interface MascotaService {

    public Mascota SearchById(Long id);

    public Collection<Mascota> SearchAll();

    public void DeleteById(Long id);

    public void changeState(Long id);

    public void Update(Mascota mascota);

    public void Add(Mascota mascota);

    public void addTratamiento( Long id, Tratamiento tratamiento);

    public  Collection<Tratamiento> getAllTratamientos( Long id);

    public void deleteAllTratamientos(Long id);

  
}
