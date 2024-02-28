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

    @Override
    public void addMascotas(int id, Mascota mascota) {
        Cliente cliente = repo.findById(id);
        List<Mascota> mascotas = cliente.getMascotas();
        mascotas.add(mascota);
        cliente.setMascotas(mascotas);
        repo.update(cliente);
    }



}
