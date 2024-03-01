package proyecto.huellitas.demo.entidad;

import java.util.Random;

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
        clienteRepository.save(new Cliente("Catarina Baignard", "catarina@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Clarine Belderfield", "clarine@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Georgia Chasen", "georgia@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pauly Biesinger", "pauly@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Marlene Kingswood", "marlene@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Merrill Cruickshank", "merrill@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Marnie Gwilliam", "marnie@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hussein Allport", "hussein@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Bianca Rochford", "bianca@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Orella Yaxley", "orella@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hedy Pattle", "hedy@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Guinevere Bulteel", "guinevere@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pinchas Whitrod", "pinchas@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Barty Trueman", "barty@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pedro Leadley", "pedro@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hattie Oxlade", "hattie@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Ulises Reddyhoff", "ulises@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Jessamine MacNucator", "jessamine@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Bernarr Grastye", "bernarr@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Bianka Tungate", "bianka@example.com", "123456789", null));
        
        
        
        mascotaRepository.save(new Mascota("Sarita", "Bichon", 14, 6, "ninguna", "https://img.freepik.com/fotos-premium/feliz-perro-bichon-frise-caminando-parque-otono_91756-4430.jpg", "ninguno"));
        mascotaRepository.save(new Mascota("Firulais", "labrador", 5, 25, "ninguna", "https://www.webconsultas.com/sites/default/files/styles/wch_image_schema/public/temas/caracteristicas-perro-labrador.jpg", "ninguno"));
        mascotaRepository.save(new Mascota("Pepito", "Pastor Aleman", 1, 24, "ninguna", "https://www.bunko.pet/__export/1626998425404/sites/debate/img/2021/07/22/pastor_aleman_cachorro_crop1626998340680.jpeg_554688468.jpeg", "ninguno"));
        mascotaRepository.save(new Mascota("Bonito", "Beagle", 11, 18, "ninguna", "https://i.pinimg.com/originals/1a/99/1c/1a991cd8128e376a350b1c76bfb4f12d.jpg", "ninguno"));
        mascotaRepository.save(new Mascota("Luna", "Golden Retriever", 3, 30, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Toby", "Poodle", 6, 15, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Max", "German Shepherd", 4, 28, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Buddy", "Boxer", 7, 22, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Lucy", "Shih Tzu", 5, 10, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Bailey", "Dachshund", 8, 12, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Rocky", "Rottweiler", 2, 32, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Molly", "Siberian Husky", 4, 35, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Daisy", "Bulldog", 6, 20, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Bailey", "Shiba Inu", 5, 17, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Lola", "Pomeranian", 3, 8, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Bella", "French Bulldog", 2, 16, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Cooper", "Chihuahua", 1, 5, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Bentley", "Pug", 3, 10, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Sophie", "Maltese", 4, 7, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Charlie", "Cocker Spaniel", 2, 14, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Lola", "Great Dane", 5, 55, "ninguna", null, "ninguno"));
        mascotaRepository.save(new Mascota("Riley", "Doberman", 3, 30, "ninguna", null, "ninguno"));
        

            

     

        //asociar mascotas a clientes
        
        for (Mascota ms : mascotaRepository.findAll()) {
            Random random = new Random();
            // Generate a random number between 1 and 20 (inclusive)
            Long randomNumber = random.nextLong(22) + 1;

            Cliente asociar = clienteRepository.findById(randomNumber).get();
            ms.setCliente(asociar); 
            mascotaRepository.save(ms);
        }
    }
}
