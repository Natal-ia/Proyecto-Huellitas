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
        
        mascotaRepository.save(new Mascota("Sarita", "Bichon", 14, 6, "ninguna", "https://img.freepik.com/fotos-premium/feliz-perro-bichon-frise-caminando-parque-otono_91756-4430.jpg", "ninguno"));
        mascotaRepository.save(new Mascota("Firulais", "labrador", 5, 25, "ninguna", "https://www.webconsultas.com/sites/default/files/styles/wch_image_schema/public/temas/caracteristicas-perro-labrador.jpg", "ninguno"));
        mascotaRepository.save(new Mascota("Pepito", "Pastor Aleman", 1, 24, "ninguna", "https://www.bunko.pet/__export/1626998425404/sites/debate/img/2021/07/22/pastor_aleman_cachorro_crop1626998340680.jpeg_554688468.jpeg", "ninguno"));
        mascotaRepository.save(new Mascota("Bonito", "Beagle", 11, 18, "ninguna", "https://i.pinimg.com/originals/1a/99/1c/1a991cd8128e376a350b1c76bfb4f12d.jpg", "ninguno"));
        
        //asociar mascotas a clientes
        Cliente asociar = clienteRepository.findById(1L).get();
        for (Mascota ms : mascotaRepository.findAll()) {
           ms.setCliente(asociar); 
           mascotaRepository.save(ms);
        }
    }
}
