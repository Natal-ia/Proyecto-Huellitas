package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Tratamiento;

public interface TratamientoService   {
    
    public Tratamiento SearchById(Long id);

    public Collection<Tratamiento> SearchAll();

    public void DeleteById(Long id);

    public void Update(Tratamiento mascota);

    public void Add(Tratamiento mascota);




    
}
