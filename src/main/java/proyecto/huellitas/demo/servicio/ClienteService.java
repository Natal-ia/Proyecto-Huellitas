package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import java.util.List;


public interface ClienteService {

    public Cliente SearchById(int id);

    public Collection<Cliente> SearchAll();

    public void DeleteById(int id);

    public void Update(Cliente cliente);

    public void Add(Cliente cliente);
    
    public List<Mascota> obtenerMascotasDeCliente(int idCliente);
}
