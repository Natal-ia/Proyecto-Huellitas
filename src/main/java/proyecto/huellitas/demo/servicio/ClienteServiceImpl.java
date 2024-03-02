package proyecto.huellitas.demo.servicio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
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
        return repo.findById(id).orElse(null);
    }

    @Override
    public Collection<Cliente> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(Long id) {

        repo.deleteById(id);
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

    @Override
    @Transactional
    public void deleteAllMascotas(Long id) {   
        Cliente cliente = repo.findById(id).orElse(null);
        if (cliente != null) {
            // Delete all Mascotas associated with the Cliente
            cliente.getMascotas().clear();
            // Save the Cliente to remove the associations
            repo.save(cliente);
            
            // Now delete all Mascotas associated with the Cliente from the database
            mascotaRepository.deleteByCliente(cliente);
        } else {
            // Handle the case when the Cliente with the given ID does not exist
        }
    }

    

}
