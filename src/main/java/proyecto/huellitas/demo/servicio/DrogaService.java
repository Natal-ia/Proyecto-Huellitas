package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import proyecto.huellitas.demo.entidad.Droga;
import proyecto.huellitas.demo.entidad.Mascota;

public interface DrogaService {
    
    public Droga SearchById(Long id);

    public Collection<Droga> SearchAll();

    public void DeleteById(Long id);

    public void Update(Droga droga);

    public void Add(Droga droga);

    
}
