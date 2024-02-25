package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import proyecto.huellitas.demo.entidad.Mascota;


public interface MascotaService {

    public Mascota SearchById(int id);

    public Collection<Mascota> SearchAll();

    public void DeleteById(int id);

    public void Update(Mascota mascota);

    public void Add(Mascota mascota);
}
