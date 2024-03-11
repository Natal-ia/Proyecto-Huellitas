package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Droga;
import proyecto.huellitas.demo.repositorio.DrogaRepository;

@Service
public class DrogaServiceImpl implements DrogaService {

    @Autowired
    DrogaRepository repo;

    @Override
    public Droga SearchById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Collection<Droga> SearchAll() {
        return repo.findAll();

    }

    @Override
    public void DeleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void Update(Droga droga) {
        repo.save(droga);
    }

    @Override
    public void Add(Droga droga) {
        repo.save(droga);
    }
    
}
