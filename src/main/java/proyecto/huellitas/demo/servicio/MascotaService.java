package proyecto.huellitas.demo.servicio;
import java.util.Collection;

import org.springframework.stereotype.Service;

import proyecto.huellitas.demo.entidad.Mascota;


public interface MascotaService {

    public Mascota SearchById(int id);

    public Collection<Mascota> SearchAll();
}
