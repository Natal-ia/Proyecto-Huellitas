package proyecto.huellitas.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Tratamiento;
import proyecto.huellitas.demo.entidad.Veterinario;

public interface TratamientoRepository extends JpaRepository <Tratamiento, Long>{
        void deleteByMascota(Mascota mascota);
        void deleteByDroga(Tratamiento tratamiento);
        void deleteByVeterinario(Veterinario veterinario);
        

}
