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
    public Mascota SearchById(int id) {
        return repo.findById(id);
    }

    @Override
    public Collection<Mascota> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(int id) {

        repo.deleteById(id);
    }

    @Override
    public void Update(Mascota mascota) {
        
        repo.update(mascota);
    }

    @Override
    public void Add(Mascota mascota) {
        
        repo.add(mascota);
    }


    
    
}
 