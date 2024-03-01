package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import java.util.List;


public interface ClienteService {

    public Cliente SearchById(Long id);

    public Collection<Cliente> SearchAll();

    public void DeleteById(Long id);

    public void Update(Cliente cliente);

    public void Add(Cliente cliente);

    public void addMascotas( Long id, Mascota mascota);

    public  Collection<Mascota> getAllMascotas( Long id);

    public void deleteAllMascotas(Long id);
    
}
