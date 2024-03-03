package proyecto.huellitas.demo.servicio;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Tratamiento;
import proyecto.huellitas.demo.repositorio.MascotaRepository;
import proyecto.huellitas.demo.repositorio.TratamientoRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    MascotaRepository repo;

    @Autowired
    TratamientoService tratamientoService;

    @Autowired
    TratamientoRepository TratamientoRepository;
    

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

    @Override
    public void addTratamiento(Long id, Tratamiento tratamiento) {
        Mascota mascota = repo.findById(id).get();
        List<Tratamiento> tratamientos = mascota.getTratamientos();
        tratamientos.add(tratamiento);
        mascota.setTratamientos(tratamientos);
        repo.save(mascota);
    }

    @Override
    public Collection<Tratamiento> getAllTratamientos(Long id) {
        Mascota mascota = repo.findById(id).get();
        return mascota.getTratamientos();
    }

    @Override
    public void deleteAllTratamientos(Long id) {
        Mascota mascota = repo.findById(id).orElse(null);
        if (mascota != null) {
            // Delete all Mascotas associated with the Cliente
            mascota.getTratamientos().clear();
            // Save the Cliente to remove the associations
            repo.save(mascota);
            
            // Now delete all Mascotas associated with the Cliente from the database
            TratamientoRepository.deleteByMascota(mascota);
        } else {
            // Handle the case when the Cliente with the given ID does not exist
        }
    }


    
    
}
 