package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Tratamiento;
import proyecto.huellitas.demo.repositorio.TratamientoRepository;

@Service
public class TratamientoServiceImpl implements TratamientoService{

    
@Autowired
TratamientoRepository repo;
    @Override
    public Tratamiento SearchById(Long id) {
        return repo.findById(id).get();

    }

    @Override
    public Collection<Tratamiento> SearchAll() {
        return repo.findAll();
    }

    @Override
    public void DeleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void Update(Tratamiento mascota) {
        repo.save(mascota);
    }

    @Override
    public void Add(Tratamiento mascota) {
        repo.save(mascota);

    }


    
    
}


