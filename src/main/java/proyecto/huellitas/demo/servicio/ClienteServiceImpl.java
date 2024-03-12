package proyecto.huellitas.demo.servicio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import proyecto.huellitas.demo.controlador.NotFoundException;
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

    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public Cliente SearchById(Long id) {
        Optional<Cliente> optionalCliente = repo.findById(id);
        if (optionalCliente.isPresent()) {
            return optionalCliente.get();
        } else {
            throw new NotFoundException(); 
        }
    }

    @Override
    public Collection<Cliente> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(Long id) {
        try{
             repo.deleteById(id);
        }catch (Exception e) {
            throw new NotFoundException();
        }
    }

    @Override
    public void Update(Cliente cliente) {
        
        repo.save(cliente);
    }

    @Override
    public void Add(Cliente cliente) {
        
        repo.save(cliente);
    }

    @Override
    public void addMascotas(Long id, Mascota mascota) {
        Cliente cliente = repo.findById(id).get();
        List<Mascota> mascotas = cliente.getMascotas();
        mascotas.add(mascota);
        cliente.setMascotas(mascotas);
        repo.save(cliente);
    }

    @Override
    public  Collection<Mascota> getAllMascotas( Long id){
        Cliente cliente = repo.findById(id).get();
        return cliente.getMascotas();
    }

   

    

}
