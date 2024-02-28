package proyecto.huellitas.demo.servicio;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.repositorio.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    MascotaRepository repo;
    

    @Override
    public Mascota SearchById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Collection<Mascota> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(Long id) {

        repo.deleteById(id);
    }

    @Override
    public void Update(Mascota mascota) {
        
        repo.save(mascota);
    }

    @Override
    public void Add(Mascota mascota) {
        
        repo.save(mascota);
    }


    
    
}
 