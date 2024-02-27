package proyecto.huellitas.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;

@Repository
public class ClienteRepository{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    private Map<Integer, Cliente> data = new HashMap<>(); // Changed to LinkedHashMap

    public ClienteRepository() {
        data.put(1, new Cliente(1,"Daniel", "daniel@gmail.com", "123456789", List.of(1,2,3,4,5,6)));
        data.put(2, new Cliente(2,"Natalia", "nata@gmail.com ", "123456789"));
        data.put(3, new Cliente(3,"María Andrea", "maria@gmail.com", "123456789"));
        data.put(4, new Cliente(4,"Jesús", "jesus@gmail.com","123456789"));
        data.put(5, new Cliente(5,"Juan", "juan@gmail.com", "123456789"));
        data.put(6, new Cliente(6,"Pedro", "pedro@gmail.com", "123456789")); 
    }

    public Cliente findById(int id){
        return data.get(id);
    }

    public Collection<Cliente> findAll(){
        return data.values();
    }

    public void deleteById(int id){
        data.remove(id);
    }
    public void update(Cliente cliente){
        data.put(cliente.getId(), cliente);
    }

    public void add(Cliente cliente){
        int tam = data.size();
        int lastId = data.get(tam).getId();
        cliente.setId(lastId+1);
        data.put(cliente.getId(), cliente);
    }
}
