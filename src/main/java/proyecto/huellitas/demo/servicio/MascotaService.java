package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import proyecto.huellitas.demo.entidad.Mascota;


public interface MascotaService {

    public Mascota SearchById(Long id);

    public Collection<Mascota> SearchAll();

    public void DeleteById(Long id);

    public void Update(Mascota mascota);

    public void Add(Mascota mascota);

  
}
