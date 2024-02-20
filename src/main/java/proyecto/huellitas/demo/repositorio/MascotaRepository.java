package proyecto.huellitas.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import proyecto.huellitas.demo.entidad.Mascota;

@Repository
public class MascotaRepository {
    
    private Map<Integer, Mascota> data = new HashMap<>(); // Changed to LinkedHashMap

    public MascotaRepository() {
        data.put(1, new Mascota("Pepito", "Beagle", 10, 14.57, "Tos", "foto1", "Jarabe"));
        data.put(2, new Mascota("Firulais", "Pastor Aleman", 9, 20.57, "Diarrea", "foto2", "Pastillas"));
        data.put(3, new Mascota("Lola", "Pitbull", 3, 25.57, "Vomito", "foto3", "Inyeccion"));
        data.put(4, new Mascota("Luna", "Golden Retriever", 5, 25.57, "Dolor", "foto4", "Inyeccion"));
        data.put(5, new Mascota("Max", "Corgi", 8, 10.57, "Malestar", "foto5", "Pastillas"));
        data.put(6, new Mascota("Rocky", "Bulldog", 7, 15.57, "Tos", "foto6", "Jarabe")); 
    }

    public Mascota findById(int id){
        return data.get(id);
    }

    public Collection<Mascota> findAll(){
        return data.values();
    }
}
