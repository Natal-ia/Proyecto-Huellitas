package proyecto.huellitas.demo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import jakarta.transaction.Transactional;
import proyecto.huellitas.demo.repositorio.ClienteRepository;
import proyecto.huellitas.demo.repositorio.MascotaRepository;

@Controller
@Transactional
public class DatabeseInit implements ApplicationRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        clienteRepository.save(new Cliente("Juan", "a@a.com", "123456789",null));
        clienteRepository.save(new Cliente("pepe", "a@aaa.com", "123456789",null));
        clienteRepository.save(new Cliente("luis", "rrrreee@a.com", "123456789",null));
        
        mascotaRepository.save(new Mascota("firulais", "labrador", 5, 10, "ninguna", "foto", "ninguno"));
        mascotaRepository.save(new Mascota("firulais", "labrador", 5, 10, "ninguna", "foto", "ninguno"));
        mascotaRepository.save(new Mascota("firulais", "labrador", 5, 10, "ninguna", "foto", "ninguno"));
    
        //asosiar mascotas a clientes
        Cliente asosiar = clienteRepository.findById(1L).get();
        for (Mascota ms : mascotaRepository.findAll()) {
           ms.setCliente(asosiar); 
           mascotaRepository.save(ms);}
    }

    
}
