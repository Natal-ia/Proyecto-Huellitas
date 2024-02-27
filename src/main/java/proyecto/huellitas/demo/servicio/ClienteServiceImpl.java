package proyecto.huellitas.demo.servicio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.repositorio.MascotaRepository;
import proyecto.huellitas.demo.repositorio.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repo;
    
    @Autowired
    MascotaService mascotaService;

    @Override
    public Cliente SearchById(int id) {
        return repo.findById(id);
    }

    @Override
    public Collection<Cliente> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(int id) {

        repo.deleteById(id);
    }

    @Override
    public void Update(Cliente cliente) {
        
        repo.update(cliente);
    }

    @Override
    public void Add(Cliente cliente) {
        
        repo.add(cliente);
    }

 // Método para obtener la lista de mascotas de un cliente específico
 public List<Mascota> obtenerMascotasDeCliente(int idCliente) {
    Cliente cliente = repo.findById(idCliente);
    if (cliente != null) {
        List<Mascota> mascotasCliente = new ArrayList<>();
        for (Integer mascotaId : cliente.getMascotas()) {
            Mascota mascota = mascotaService.SearchById(mascotaId); // Utilizar el servicio de mascota para obtener la mascota por ID
            if (mascota != null) {
                mascotasCliente.add(mascota);
            }
        }
        return mascotasCliente;
    } else {
        return new ArrayList<>(); // Devolver una lista vacía si el cliente no existe
    }
}
}
