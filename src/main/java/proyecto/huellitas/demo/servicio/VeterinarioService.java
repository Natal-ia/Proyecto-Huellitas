package proyecto.huellitas.demo.servicio;

import java.util.Collection;

import proyecto.huellitas.demo.entidad.Veterinario;

public interface VeterinarioService {

    public Veterinario SearchById(Long id);

    public Collection<Veterinario> SearchAll();

    public void DeleteById(Long id);

    public void Update(Veterinario veterinario);

    public void Add(Veterinario veterinario);

    
}
