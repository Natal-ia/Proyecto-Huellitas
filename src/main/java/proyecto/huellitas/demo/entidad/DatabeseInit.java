package proyecto.huellitas.demo.entidad;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import jakarta.transaction.Transactional;
import proyecto.huellitas.demo.repositorio.ClienteRepository;
import proyecto.huellitas.demo.repositorio.DrogaRepository;
import proyecto.huellitas.demo.repositorio.MascotaRepository;
import proyecto.huellitas.demo.repositorio.TratamientoRepository;
import proyecto.huellitas.demo.repositorio.VeterinarioRepository;

@Controller
@Transactional
public class DatabeseInit implements ApplicationRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    TratamientoRepository tratamientoRepository;

    @Autowired
    DrogaRepository drogaRepository;

    @Autowired
    VeterinarioRepository veterinarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        clienteRepository.save(new Cliente("Juan", "14422441", "a@a.com", "123456789", null));
        clienteRepository.save(new Cliente("pepe", "2115115", "a@aaa.com", "123456789", null));
        clienteRepository.save(new Cliente("luis", "44864864856", "rrrreee@a.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Catarina Baignard", "456456456", "catarina@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Clarine Belderfield", "41561456", "clarine@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Georgia Chasen", "4456456", "georgia@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pauly Biesinger", "74774574", "pauly@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Marlene Kingswood", "7448748748", "marlene@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Merrill Cruickshank", "47748748", "merrill@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Marnie Gwilliam", "75748564867486", "marnie@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hussein Allport", "754774", "hussein@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Bianca Rochford", "754774", "bianca@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Orella Yaxley", "747487485", "orella@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hedy Pattle", "74574867458", "hedy@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Guinevere Bulteel", "44745745", "guinevere@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pinchas Whitrod", "74574874", "pinchas@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Barty Trueman", "15478478", "barty@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Pedro Leadley", "457457485", "pedro@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Hattie Oxlade", "457457456", "hattie@example.com", "123456789", null));
        clienteRepository.save(new Cliente("Ulises Reddyhoff", "75745745", "ulises@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Jessamine MacNucator", "75745745", "jessamine@example.com", "123456789", null));
        clienteRepository
                .save(new Cliente("Bernarr Grastye", "457456745745", "bernarr@example.com", "123456789", null));

        mascotaRepository.save(new Mascota("Coco", "labrador", 5, 25, "ninguna",
                "https://www.webconsultas.com/sites/default/files/styles/wch_image_schema/public/temas/caracteristicas-perro-labrador.jpg",
                null, null));
        mascotaRepository.save(new Mascota("Tommy", "labrador", 5, 25, "ninguna",
                "https://www.webconsultas.com/sites/default/files/styles/wch_image_schema/public/temas/caracteristicas-perro-labrador.jpg",
                null, null));
        mascotaRepository.save(new Mascota("Firulais", "labrador", 5, 25, "ninguna",
                "https://www.webconsultas.com/sites/default/files/styles/wch_image_schema/public/temas/caracteristicas-perro-labrador.jpg",
                null, null));
        mascotaRepository.save(new Mascota("Pepito", "Pastor Aleman", 1, 24, "ninguna",
                "https://www.bunko.pet/__export/1626998425404/sites/debate/img/2021/07/22/pastor_aleman_cachorro_crop1626998340680.jpeg_554688468.jpeg",
                null, null));
        mascotaRepository.save(new Mascota("Bonito", "Beagle", 11, 18, "ninguna",
                "https://i.pinimg.com/originals/1a/99/1c/1a991cd8128e376a350b1c76bfb4f12d.jpg", null,
                null));
        mascotaRepository.save(new Mascota("Luna", "Golden Retriever", 3, 30, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Toby", "Poodle", 6, 15, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Max", "German Shepherd", 4, 28, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Buddy", "Boxer", 7, 22, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Lucy", "Shih Tzu", 5, 10, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Bailey", "Dachshund", 8, 12, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Rocky", "Rottweiler", 2, 32, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Molly", "Siberian Husky", 4, 35, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Daisy", "Bulldog", 6, 20, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Bailey", "Shiba Inu", 5, 17, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Lola", "Pomeranian", 3, 8, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Bella", "French Bulldog", 2, 16, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Cooper", "Chihuahua", 1, 5, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Bentley", "Pug", 3, 10, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Sophie", "Maltese", 4, 7, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Charlie", "Cocker Spaniel", 2, 14, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Lola", "Great Dane", 5, 55, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Riley", "Doberman", 3, 30, "ninguna", null, null, null));

        mascotaRepository.save(new Mascota("Benetta", "Globicephala melas", 7, 3, "Silverado",
                "http://dummyimage.com/109x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Damiano", "Choloepus hoffmani", 5, 3, "W201",
                "http://dummyimage.com/215x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Walker", "Agkistrodon piscivorus", 14, 3, "Cabriolet",
                "http://dummyimage.com/227x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Harli", "Corvus albus", 10, 4, "Tracker",
                "http://dummyimage.com/121x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Gabrielle", "Physignathus cocincinus", 11, 3, "Thunderbird",
                "http://dummyimage.com/177x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Jillie", "Cygnus atratus", 6, 4, "MKS",
                "http://dummyimage.com/192x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Kain", "Meles meles", 15, 3, "Sportage",
                "http://dummyimage.com/204x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Glyn", "Nesomimus trifasciatus", 7, 3, "QX56",
                "http://dummyimage.com/184x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Haskel", "Merops nubicus", 5, 3, "Windstar",
                "http://dummyimage.com/129x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Josefina", "Psittacula krameri", 15, 4, "NX",
                "http://dummyimage.com/135x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Cindelyn", "Mephitis mephitis", 13, 3, "Savana 3500",
                "http://dummyimage.com/100x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Kevan", "Hippotragus equinus", 3, 3, "Protege",
                "http://dummyimage.com/195x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Lavina", "Colobus guerza", 6, 3, "240SX",
                "http://dummyimage.com/153x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Sol", "unavailable", 13, 3, "C70",
                "http://dummyimage.com/143x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Boone", "Macropus rufogriseus", 3, 4, "Corvette",
                "http://dummyimage.com/169x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Judie", "Tachyglossus aculeatus", 5, 3, "Park Avenue",
                "http://dummyimage.com/195x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Abran", "Sylvicapra grimma", 18, 4, "Ram",
                "http://dummyimage.com/176x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Garek", "Dipodomys deserti", 9, 3, "Eclipse",
                "http://dummyimage.com/218x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Addie", "Tadorna tadorna", 12, 4, "Savana 2500",
                "http://dummyimage.com/205x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Allison", "Felis silvestris lybica", 12, 3, "XC90",
                "http://dummyimage.com/193x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Pierce", "Pelecans onocratalus", 16, 4, "DeVille",
                "http://dummyimage.com/229x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Hadria", "Coracias caudata", 2, 4, "GLC",
                "http://dummyimage.com/156x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Cassondra", "Tamiasciurus hudsonicus", 16, 3, "5 Series",
                "http://dummyimage.com/237x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Gray", "Tursiops truncatus", 10, 3, "DB9",
                "http://dummyimage.com/228x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Oswell", "Canis aureus", 9, 3, "Escape",
                "http://dummyimage.com/233x100.png/5fa2dd/ffffff", null, null));

        mascotaRepository.save(new Mascota("Dana", "Castor canadensis", 9, 3, "Focus",
                "http://dummyimage.com/182x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Lucais", "Tachyglossus aculeatus", 16, 4, "Allante",
                "http://dummyimage.com/242x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Darby", "Casmerodius albus", 1, 3, "Azera",
                "http://dummyimage.com/230x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Lelah", "Otaria flavescens", 16, 3, "Land Cruiser",
                "http://dummyimage.com/178x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Barclay", "Dasypus novemcinctus", 13, 3, "Intrepid",
                "http://dummyimage.com/138x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Dorelia", "Alligator mississippiensis", 11, 4, "Excel",
                "http://dummyimage.com/208x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Halsy", "Haliaeetus leucocephalus", 15, 4, "Silverado 1500",
                "http://dummyimage.com/174x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Holly", "Pelecans onocratalus", 20, 4, "Savana 3500",
                "http://dummyimage.com/202x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Farah", "Crotalus triseriatus", 10, 3, "Camaro",
                "http://dummyimage.com/105x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Bart", "Limnocorax flavirostra", 4, 4, "FX",
                "http://dummyimage.com/198x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Marylee", "Diomedea irrorata", 1, 4, "Blazer",
                "http://dummyimage.com/164x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Brock", "Ciconia episcopus", 9, 3, "X5 M",
                "http://dummyimage.com/123x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Orelia", "Tayassu pecari", 13, 4, "Navigator",
                "http://dummyimage.com/179x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Glenn", "Psittacula krameri", 5, 4, "CC",
                "http://dummyimage.com/173x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Carolann", "Connochaetus taurinus", 5, 3, "240",
                "http://dummyimage.com/214x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Rickey", "Globicephala melas", 15, 4, "Outlander",
                "http://dummyimage.com/129x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Al", "Sylvicapra grimma", 18, 3, "CTS",
                "http://dummyimage.com/184x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Henriette", "Dasypus septemcincus", 2, 3, "GX",
                "http://dummyimage.com/173x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Celina", "Myiarchus tuberculifer", 20, 4, "Mirage",
                "http://dummyimage.com/188x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Blake", "Panthera pardus", 7, 4, "9000",
                "http://dummyimage.com/202x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Tedmund", "Hippotragus equinus", 12, 3, "Rally Wagon 1500",
                "http://dummyimage.com/218x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Hadlee", "Prionace glauca", 16, 3, "DB9",
                "http://dummyimage.com/112x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Gillan", "Laniaurius atrococcineus", 19, 3, "Optima",
                "http://dummyimage.com/173x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Virge", "Vanessa indica", 8, 4, "Sonoma",
                "http://dummyimage.com/126x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Lucie", "Tachyglossus aculeatus", 16, 4, "S-Class",
                "http://dummyimage.com/238x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Greggory", "Speotyte cuniculata", 11, 4, "Grand Voyager",
                "http://dummyimage.com/118x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Bernardina", "Gopherus agassizii", 17, 4, "Impreza",
                "http://dummyimage.com/240x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Trefor", "Psophia viridis", 20, 3, "Eclipse",
                "http://dummyimage.com/129x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Reece", "Castor fiber", 5, 4, "Land Cruiser",
                "http://dummyimage.com/190x100.png/cc0000/ffffff", null, null));

        mascotaRepository.save(new Mascota("Humberto", "Cygnus buccinator", 17, 3, "Gallardo",
                "http://dummyimage.com/232x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Iorgo", "Lybius torquatus", 18, 4, "Talon",
                "http://dummyimage.com/157x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Melody", "Libellula quadrimaculata", 12, 3, "Yukon",
                "http://dummyimage.com/202x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Tatiana", "Chlidonias leucopterus", 1, 4, "Pathfinder",
                "http://dummyimage.com/188x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Efrem", "Grus rubicundus", 11, 3, "Roadmaster",
                "http://dummyimage.com/197x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Josiah", "Nesomimus trifasciatus", 7, 4, "Focus",
                "http://dummyimage.com/230x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Stella", "Egretta thula", 4, 3, "SJ",
                "http://dummyimage.com/176x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Lynnette", "Lamprotornis superbus", 8, 4, "Corolla",
                "http://dummyimage.com/195x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Cortie", "Thamnolaea cinnmomeiventris", 7, 4, "S80",
                "http://dummyimage.com/143x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Anallise", "Megaderma spasma", 8, 4, "Grand Marquis",
                "http://dummyimage.com/196x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Larry", "Phalacrocorax carbo", 20, 3, "C70",
                "http://dummyimage.com/168x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Delilah", "Dicrostonyx groenlandicus", 3, 4, "Civic",
                "http://dummyimage.com/119x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Stafani", "Felis silvestris lybica", 16, 4, "Loyale",
                "http://dummyimage.com/100x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Florida", "Amphibolurus barbatus", 4, 4, "VUE",
                "http://dummyimage.com/225x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Taffy", "Macropus agilis", 4, 3, "Seville",
                "http://dummyimage.com/137x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Adorne", "Uraeginthus bengalus", 5, 3, "Mazda5",
                "http://dummyimage.com/249x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Lock", "Phascogale calura", 14, 4, "Spyder",
                "http://dummyimage.com/177x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Elysha", "Dasypus septemcincus", 8, 3, "Accord",
                "http://dummyimage.com/132x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Sharai", "Petaurus norfolcensis", 17, 3, "Bravada",
                "http://dummyimage.com/186x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Brinn", "Ramphastos tucanus", 5, 4, "Intrepid",
                "http://dummyimage.com/173x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Gerik", "Cereopsis novaehollandiae", 10, 4, "Eclipse",
                "http://dummyimage.com/122x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Artur", "Haliaetus leucogaster", 3, 4, "3500 Club Coupe",
                "http://dummyimage.com/105x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Noami", "Isoodon obesulus", 5, 3, "Catera",
                "http://dummyimage.com/104x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Bogart", "Bubalus arnee", 10, 3, "Escort",
                "http://dummyimage.com/230x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Enrique", "Oryx gazella", 5, 4, "S4",
                "http://dummyimage.com/173x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Kayley", "Isoodon obesulus", 18, 3, "GT-R",
                "http://dummyimage.com/231x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Wilfrid", "Ursus arctos", 18, 4, "9-3",
                "http://dummyimage.com/201x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Amandy", "Buteo galapagoensis", 2, 3, "Civic",
                "http://dummyimage.com/184x100.png/5fa2dd/ffffff", null, null));

        mascotaRepository.save(new Mascota("Garold", "Cacatua tenuirostris", 10, 4, "XK Series",
                "http://dummyimage.com/122x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Bebe", "Cordylus giganteus", 3, 4, "300",
                "http://dummyimage.com/226x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Carina", "Nesomimus trifasciatus", 3, 3, "5 Series",
                "http://dummyimage.com/244x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Erny", "Sula nebouxii", 2, 4, "A6",
                "http://dummyimage.com/131x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Ellene", "Panthera leo", 13, 4, "Rainier",
                "http://dummyimage.com/132x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Zorah", "Lycaon pictus", 18, 3, "Sierra 2500",
                "http://dummyimage.com/147x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Luella", "Cacatua tenuirostris", 17, 3, "Sportvan G30",
                "http://dummyimage.com/136x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Lissi", "Phalacrocorax niger", 7, 4, "i-350",
                "http://dummyimage.com/122x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Rees", "Ceryle rudis", 7, 4, "LeSabre",
                "http://dummyimage.com/231x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Vasili", "Ardea golieth", 7, 4, "Focus",
                "http://dummyimage.com/116x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Denice", "Acinonyx jubatus", 10, 3, "Trooper",
                "http://dummyimage.com/155x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Madlen", "Fulica cristata", 6, 3, "Mustang",
                "http://dummyimage.com/115x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Laney", "Anas bahamensis", 11, 3, "Tacoma",
                "http://dummyimage.com/143x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Patrice", "Hystrix cristata", 4, 4, "Town & Country",
                "http://dummyimage.com/213x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Shelley", "Cebus apella", 8, 3, "Suburban 1500",
                "http://dummyimage.com/198x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Thane", "Ictonyx striatus", 7, 4, "Savana 3500",
                "http://dummyimage.com/242x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Alex", "Nesomimus trifasciatus", 4, 4, "LeSabre",
                "http://dummyimage.com/153x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Giselle", "Apteryx australis", 19, 4, "Passat",
                "http://dummyimage.com/157x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Filberte", "Laniarius ferrugineus", 16, 4, "Accord",
                "http://dummyimage.com/121x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Maible", "Megaderma spasma", 11, 3, "Neon",
                "http://dummyimage.com/207x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Moses", "Paraxerus cepapi", 13, 4, "Savana 1500",
                "http://dummyimage.com/143x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Amos", "Lorythaixoides concolor", 13, 4, "GTO",
                "http://dummyimage.com/230x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Wilbert", "Anser cygnoides", 2, 3, "Envoy",
                "http://dummyimage.com/238x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Karlee", "Ploceus intermedius", 19, 3, "900",
                "http://dummyimage.com/122x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Jordon", "Mazama gouazoubira", 16, 4, "XLR",
                "http://dummyimage.com/133x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Rouvin", "Ardea cinerea", 11, 3, "Town Car",
                "http://dummyimage.com/240x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Tracey", "Spermophilus parryii", 5, 3, "Fusion",
                "http://dummyimage.com/153x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Gerhardt", "Phascogale calura", 18, 3, "F450",
                "http://dummyimage.com/176x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Urbano", "Leptoptilos crumeniferus", 13, 4, "Suburban 1500",
                "http://dummyimage.com/116x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Estell", "Canis mesomelas", 16, 4, "Yukon",
                "http://dummyimage.com/132x100.png/cc0000/ffffff", null,

                null));
        mascotaRepository.save(new Mascota("Jewelle", "Estrilda erythronotos", 16, 4, "Trans Sport",
                "http://dummyimage.com/218x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Perry", "Acinonyx jubatus", 14, 4, "Aerio",
                "https://cdn.pixabay.com/photo/2018/03/31/06/31/dog-3277416_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Liana", "Cacatua tenuirostris", 10, 3, "Camry",
                "https://cdn.pixabay.com/photo/2016/03/27/21/16/pet-1284307_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Jasmin", "Papio ursinus", 20, 4, "Mustang",
                "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Flore", "Cervus duvauceli", 15, 4, "Pathfinder",
                "https://cdn.pixabay.com/photo/2019/09/10/09/23/dog-4465690_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Marylinda", "Plectopterus gambensis", 19, 4, "Sienna",
                "https://cdn.pixabay.com/photo/2014/03/14/20/13/dog-287420_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Elaina", "Lorythaixoides concolor", 5, 4, "Pathfinder",
                "https://cdn.pixabay.com/photo/2016/11/29/11/26/dog-1869167_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Rouvin", "Amphibolurus barbatus", 16, 3, "S-Series",
                "https://cdn.pixabay.com/photo/2014/12/10/05/50/english-bulldog-562723_1280.jpg", null,
                null));
        mascotaRepository.save(new Mascota("Henrik", "Cervus canadensis", 6, 3, "Tahoe",
                "https://cdn.pixabay.com/photo/2018/05/07/10/48/husky-3380548_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Dania", "Aonyx capensis", 6, 4, "Ram 1500",
                "https://cdn.pixabay.com/photo/2017/09/25/13/14/dog-2785077_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Diana", "Eubalaena australis", 3, 4, "Grand Prix",
                "https://cdn.pixabay.com/photo/2017/03/27/13/23/dog-2178696_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Tracie", "Anas platyrhynchos", 8, 3, "Mazda6",
                "https://cdn.pixabay.com/photo/2020/11/08/10/25/dog-5723334_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Jackie", "Larus dominicanus", 19, 3, "Club Wagon",
                "http://dummyimage.com/237x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Davida", "Panthera leo", 17, 4, "1500 Club Coupe",
                "http://dummyimage.com/218x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Giffer", "Choloepus hoffmani", 12, 4, "Neon",
                "http://dummyimage.com/204x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Sigismund", "Scolopax minor", 3, 4, "Montero Sport",
                "http://dummyimage.com/123x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Teddy", "Plegadis falcinellus", 18, 3, "Explorer",
                "http://dummyimage.com/128x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Verney", "Nesomimus trifasciatus", 18, 3, "3500",
                "http://dummyimage.com/147x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Alaric", "Cacatua tenuirostris", 3, 4, "Ram Van B150",
                "http://dummyimage.com/115x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Deloria", "Anastomus oscitans", 11, 4, "Suburban 2500",
                "http://dummyimage.com/243x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Ricki", "Larus fuliginosus", 5, 3, "Tacoma Xtra",
                "http://dummyimage.com/205x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Billie", "Canis lupus", 5, 3, "Explorer",
                "http://dummyimage.com/123x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Nanette", "Geochelone elephantopus", 2, 4, "SL-Class",
                "http://dummyimage.com/202x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Zorana", "Nycticorax nycticorax", 3, 3, "Grand Prix",
                "http://dummyimage.com/116x100.png/dddddd/000000", null, null));
        mascotaRepository.save(new Mascota("Jackie", "Cacatua tenuirostris", 17, 3, "Exige",
                "http://dummyimage.com/243x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Chico", "Varanus sp.", 16, 3, "Viper",
                "http://dummyimage.com/187x100.png/ff4444/ffffff", null, null));
        mascotaRepository.save(new Mascota("Wilone", "Columba palumbus", 4, 4, "Ranger",
                "http://dummyimage.com/147x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Andeee", "Paroaria gularis", 16, 4, "S6",
                "http://dummyimage.com/202x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Nannie", "Phoeniconaias minor", 4, 4, "Cavalier",
                "http://dummyimage.com/242x100.png/cc0000/ffffff", null, null));
        mascotaRepository.save(new Mascota("Rube", "Lutra canadensis", 3, 4, "TL",
                "http://dummyimage.com/194x100.png/dddddd/000000", null, null));

        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10",
                        null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10",
                        null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10",
                        null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10",
                        null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Dolor de cabeza", "2021-01-01", "2021-01-10",
                        null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "needs-based", "12/12/2021", "28/06/2023",
                        null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "structure", "27/11/2020", "04/09/2023",
                        null, null));

        tratamientoRepository.save(
                new Tratamiento(null, "Networked interactive conglomeration", "2023-05-25", "2023-11-14", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Total neutral knowledge base", "2023-03-12", "2023-12-05", null, null));
        tratamientoRepository.save(new Tratamiento(null, "Cross-group attitude-oriented protocol", "2023-10-12",
                "2023-07-11", null, null));
        tratamientoRepository.save(new Tratamiento(null, "Vision-oriented grid-enabled Graphic Interface", "2023-10-20",
                "2023-07-14", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Inverse optimizing local area network", "2023-10-28", "2023-12-07", null, null));
        tratamientoRepository.save(new Tratamiento(null, "Multi-lateral 24/7 artificial intelligence", "2023-03-22",
                "2023-07-17", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Reactive empowering firmware", "2023-08-31", "2023-03-21", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Seamless high-level collaboration", "2023-10-26", "2023-10-14", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Assimilated mobile leverage", "2024-01-04", "2024-02-22", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Assimilated clear-thinking paradigm", "2023-05-07", "2023-09-22", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Networked local forecast", "2024-02-05", "2023-08-25", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Public-key bi-directional hierarchy", "2023-05-16", "2023-06-05", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Innovative multi-state productivity", "2023-10-28", "2023-04-05", null, null));
        tratamientoRepository.save(
                new Tratamiento(null, "Function-based logistical adapter", "2023-03-16", "2023-12-01", null, null));
        tratamientoRepository.save(new Tratamiento(null, "Programmable upward-trending workforce", "2023-08-24",
                "2023-09-15", null, null));
        tratamientoRepository.save(new Tratamiento(null, "User-friendly next generation neural-net", "2023-08-21",
                "2023-04-09", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Focused cohesive alliance", "2023-05-16", "2023-08-11", null, null));
        tratamientoRepository.save(new Tratamiento(null, "Intuitive contextually-based secured line", "2023-09-28",
                "2023-11-18", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Multi-lateral explicit database", "2023-05-15", "2023-05-14", null, null));
        tratamientoRepository
                .save(new Tratamiento(null, "Progressive composite project", "2023-06-07", "2023-12-04", null, null));

        // drogas
        drogaRepository.save(new Droga("Paracetamol", 52.0, 80.5, 50, 5));
        drogaRepository.save(new Droga("Ibuprofeno", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("Aspirina", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("paspalum notatum pollen", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("Botrytis cinerea", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("black-eyed pea", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("carbamazepine", 52.0, 80.5, 50, 200));
        drogaRepository.save(new Droga("Nitrogen", 52.0, 80.5, 50, 200));

        veterinarioRepository.save(new Veterinario("daniel", "1000149472", "sacrificador", 500,
                "https://i.imgflip.com/612dfk.png"));
        veterinarioRepository.save(new Veterinario("daniel", "1000149472", "sacrificador", 500,
                "https://i.imgflip.com/612dfk.png"));
        veterinarioRepository.save(new Veterinario("daniel", "1000149472", "sacrificador", 500,
                "https://i.imgflip.com/612dfk.png"));

        /*
         * // asociar mascotas a clientes VIEJO
         * Long cont = 1L;
         * Boolean flag = false;
         * for (Mascota ms : mascotaRepository.findAll()) {
         * Cliente asociar = clienteRepository.findById(cont).get();
         * ms.setCliente(asociar);
         * mascotaRepository.save(ms);
         * if (flag) {
         * cont += 1;
         * }
         * flag = !flag;
         * }
         */


         // asociar mascotas a clientes NUEVO 
        // Get all clients and pets
        List<Cliente> clientes = clienteRepository.findAll();
        List<Mascota> mascotas = mascotaRepository.findAll();

        // Ensure that there are clients and pets to associate
        if (!clientes.isEmpty() && !mascotas.isEmpty()) {
            // Iterate over pets and associate them with clients
            int clientIndex = 0;
            for (Mascota mascota : mascotas) {
                // Get the current client from the list
                Cliente cliente = clientes.get(clientIndex);

                // Associate the pet with the client
                mascota.setCliente(cliente);

                // Save the updated pet
                mascotaRepository.save(mascota);

                // Increment the client index for the next iteration
                clientIndex = (clientIndex + 1) % clientes.size();
            }
        }

        Long cont2 = 1L;
        Boolean flag2 = false;
        for (Tratamiento ms1 : tratamientoRepository.findAll()) {
            Mascota asociar = mascotaRepository.findById(cont2).get();
            ms1.setMascota(asociar);
            tratamientoRepository.save(ms1);
            if (flag2) {
                cont2 += 1;
            }
            flag2 = !flag2;
        }
        Long cont3 = 1L;
        Long cont4 = 1L;

        Boolean flag3 = false;
        for (Tratamiento ms2 : tratamientoRepository.findAll()) {
            Optional<Droga> drogaOptional = drogaRepository.findById(cont3);
            if (drogaOptional.isPresent()) {
                Droga asociarD = drogaOptional.get();
                ms2.setDroga(asociarD);
                tratamientoRepository.save(ms2);
            } else {
                // Handle case where Droga is not found
                // For example: Log an error message or take appropriate action
                System.err.println("Droga with ID " + cont3 + " not found.");
            }
            if (flag3) {
                cont3 += 1;
            }
            flag3 = !flag3;
        }

        Boolean flag4 = false;
        for (Tratamiento ms3 : tratamientoRepository.findAll()) {
            Optional<Veterinario> veterinarioOptional = veterinarioRepository.findById(cont4);
            if (veterinarioOptional.isPresent()) {
                Veterinario asociarV = veterinarioOptional.get();
                ms3.setVeterinario(asociarV);
                tratamientoRepository.save(ms3);
            } else {
                // Handle case where Veterinario is not found
                // For example: Log an error message or take appropriate action
                System.err.println("Veterinario with ID " + cont4 + " not found.");
            }
            if (flag4) {
                cont4 += 1;
            }
            flag4 = !flag4;
        }

        /*
         * for (Tratamiento ms : tratamientoRepository.findAll()) {
         * Random random = new Random();
         * // Generate a random number between 1 and 20 (inclusive)
         * Long randomNumber = random.nextLong(22) + 1;
         * 
         * Mascota asociar = mascotaRepository.findById(randomNumber).get();
         * ms.setMascota(asociar);
         * tratamientoRepository.save(ms);
         * }
         */
    }
}
