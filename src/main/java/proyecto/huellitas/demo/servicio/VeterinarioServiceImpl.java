package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Veterinario;
import proyecto.huellitas.demo.repositorio.VeterinarioRepository;
@Service

public class VeterinarioServiceImpl implements VeterinarioService {

    @Autowired
     VeterinarioRepository repo;

    @Override
    public Veterinario SearchById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Collection<Veterinario> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void Update(Veterinario veterinario) {
        repo.save(veterinario);  
    }

    @Override
    public void Add(Veterinario veterinario) {
        repo.save(veterinario);  

    }
    
}
