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
        mascotaRepository.save(new Mascota("Luna", "Golden Retriever", 3, 30, "ninguna", "https://cdn.pixabay.com/photo/2017/09/25/13/14/dog-2785077_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Toby", "Poodle", 6, 15, "ninguna", "https://cdn.pixabay.com/photo/2019/02/06/15/18/puppy-3979350_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Max", "Daschund", 4, 28, "ninguna", "https://cdn.pixabay.com/photo/2016/07/15/15/55/dachshund-1519374_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Buddy", "Pomeranian", 7, 22, "ninguna", "https://cdn.pixabay.com/photo/2018/08/20/14/08/dog-3619020_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Lucy", "Husky", 5, 10, "ninguna", "https://cdn.pixabay.com/photo/2019/05/21/05/07/animal-4218265_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Bailey", "Bulldog", 8, 12, "ninguna", "https://cdn.pixabay.com/photo/2020/07/20/06/42/english-bulldog-5422018_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Rocky", "Rottweiler", 2, 32, "ninguna", "https://cdn.pixabay.com/photo/2016/11/26/23/45/dog-1861839_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Molly", "Shih Tzu", 4, 35, "ninguna", "https://cdn.pixabay.com/photo/2019/11/16/04/32/shihtzu-4629612_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Daisy", "Bulldog", 6, 20, "ninguna", "https://cdn.pixabay.com/photo/2017/06/24/09/13/continental-bulldog-2437110_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Bailey", "Shiba Inu", 5, 17, "ninguna", "https://cdn.pixabay.com/photo/2021/05/29/07/06/shiba-6292660_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Lola", "Pomeranian", 3, 8, "ninguna", "https://cdn.pixabay.com/photo/2016/07/26/02/01/pomeranian-1541798_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Bella", "French Bulldog", 2, 16, "ninguna", "https://cdn.pixabay.com/photo/2019/12/22/17/13/french-bulldog-4713013_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Cooper", "Akita", 1, 5, "ninguna", "https://cdn.pixabay.com/photo/2017/07/24/15/07/akita-2534986_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Bentley", "Corgi", 3, 10, "ninguna", "https://cdn.pixabay.com/photo/2021/10/13/09/01/corgi-6705821_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Sophie", "Maltese", 4, 7, "ninguna", "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Charlie", "Cocker Spaniel", 2, 14, "ninguna", "https://cdn.pixabay.com/photo/2018/12/15/16/01/beagle-3877115_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Lola", "Great Dane", 5, 55, "ninguna", null, null, null));
        mascotaRepository.save(new Mascota("Riley", "Doberman", 3, 30, "ninguna", "https://cdn.pixabay.com/photo/2016/06/05/20/35/doberman-dog-1438132_1280.jpg", null, null));

        mascotaRepository.save(new Mascota("Benetta", "Globicephala melas", 7, 3, "Silverado",
                "https://cdn.pixabay.com/photo/2016/11/19/00/21/dog-1837445_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Damiano", "Choloepus hoffmani", 5, 3, "W201",
                "https://cdn.pixabay.com/photo/2018/08/27/21/16/pet-3635985_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Walker", "Agkistrodon piscivorus", 14, 3, "Cabriolet",
                "https://cdn.pixabay.com/photo/2022/05/28/07/33/shiba-inu-7226742_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Harli", "Corvus albus", 10, 4, "Tracker",
                "https://cdn.pixabay.com/photo/2016/12/03/07/45/dog-1879244_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Gabrielle", "Physignathus cocincinus", 11, 3, "Thunderbird",
                "https://cdn.pixabay.com/photo/2019/09/08/05/04/siberian-husky-4460138_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Jillie", "Cygnus atratus", 6, 4, "MKS",
                "https://cdn.pixabay.com/photo/2016/03/05/17/52/rescue-1238145_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Kain", "Meles meles", 15, 3, "Sportage",
                "https://cdn.pixabay.com/photo/2023/07/15/08/43/labrador-8128379_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Glyn", "Nesomimus trifasciatus", 7, 3, "QX56",
                "https://cdn.pixabay.com/photo/2017/06/19/20/32/frank-2420802_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Haskel", "Merops nubicus", 5, 3, "Windstar",
                "https://cdn.pixabay.com/photo/2020/01/02/14/01/siberian-husky-4735878_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Josefina", "Psittacula krameri", 15, 4, "NX",
                "https://cdn.pixabay.com/photo/2016/06/27/14/35/french-bulldog-1482630_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Cindelyn", "Mephitis mephitis", 13, 3, "Savana 3500",
                "https://cdn.pixabay.com/photo/2016/03/05/17/52/rescue-1238145_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Kevan", "Hippotragus equinus", 3, 3, "Protege",
                "https://cdn.pixabay.com/photo/2016/08/21/22/24/dog-1610937_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Lavina", "Colobus guerza", 6, 3, "240SX",
                "https://cdn.pixabay.com/photo/2016/08/14/04/06/shiba-inu-1592018_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Sol", "unavailable", 13, 3, "C70",
                "https://cdn.pixabay.com/photo/2016/03/18/10/53/dog-1264667_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Boone", "Macropus rufogriseus", 3, 4, "Corvette",
                "https://cdn.pixabay.com/photo/2019/12/03/22/22/dog-4671215_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Judie", "Tachyglossus aculeatus", 5, 3, "Park Avenue",
                "https://cdn.pixabay.com/photo/2018/05/11/08/11/pets-3389730_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Abran", "Sylvicapra grimma", 18, 4, "Ram",
                "https://cdn.pixabay.com/photo/2014/06/23/19/17/pug-375462_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Garek", "Dipodomys deserti", 9, 3, "Eclipse",
                "https://cdn.pixabay.com/photo/2019/07/21/14/05/french-bulldog-4352827_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Addie", "Tadorna tadorna", 12, 4, "Savana 2500",
                "https://cdn.pixabay.com/photo/2016/11/21/12/04/animal-1844929_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Allison", "Felis silvestris lybica", 12, 3, "XC90",
                "https://cdn.pixabay.com/photo/2015/12/18/16/54/dog-1098804_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Pierce", "Pelecans onocratalus", 16, 4, "DeVille",
                "https://cdn.pixabay.com/photo/2021/02/03/03/32/dog-5976489_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Hadria", "Coracias caudata", 2, 4, "GLC",
                "https://cdn.pixabay.com/photo/2018/04/06/13/07/dog-3295799_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Cassondra", "Tamiasciurus hudsonicus", 16, 3, "5 Series",
                "https://cdn.pixabay.com/photo/2016/01/25/10/46/dog-1160443_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Gray", "Tursiops truncatus", 10, 3, "DB9",
                "https://cdn.pixabay.com/photo/2015/06/24/19/30/dog-820564_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Oswell", "Canis aureus", 9, 3, "Escape",
                "https://cdn.pixabay.com/photo/2016/07/26/02/01/pomeranian-1541798_1280.jpg", null, null));

        mascotaRepository.save(new Mascota("Dana", "Castor canadensis", 9, 3, "Focus",
                "https://cdn.pixabay.com/photo/2019/02/25/14/45/french-bulldog-4019784_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Lucais", "Tachyglossus aculeatus", 16, 4, "Allante",
                "https://cdn.pixabay.com/photo/2020/11/12/13/44/dog-5735582_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Darby", "Casmerodius albus", 1, 3, "Azera",
                "https://cdn.pixabay.com/photo/2014/03/20/23/48/siberian-husky-291721_960_720.jpg", null, null));
        mascotaRepository.save(new Mascota("Lelah", "Otaria flavescens", 16, 3, "Land Cruiser",
                "https://cdn.pixabay.com/photo/2018/07/08/21/18/labradoodle-3524825_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Barclay", "Dasypus novemcinctus", 13, 3, "Intrepid",
                "https://cdn.pixabay.com/photo/2017/09/01/21/51/golden-retriever-2705639_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Dorelia", "Alligator mississippiensis", 11, 4, "Excel",
                "https://cdn.pixabay.com/photo/2017/07/15/07/47/pug-2505763_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Halsy", "Haliaeetus leucocephalus", 15, 4, "Silverado 1500",
                "http://dummyimage.com/174x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Holly", "Pelecans onocratalus", 20, 4, "Savana 3500",
                "https://cdn.pixabay.com/photo/2016/12/27/03/04/pet-1933138_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Farah", "Crotalus triseriatus", 10, 3, "Camaro",
                "https://cdn.pixabay.com/photo/2020/03/31/19/19/dog-4988984_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Bart", "Limnocorax flavirostra", 4, 4, "FX",
                "https://cdn.pixabay.com/photo/2019/03/22/14/05/golden-doodle-4073353_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Marylee", "Diomedea irrorata", 1, 4, "Blazer",
                "https://cdn.pixabay.com/photo/2014/02/28/22/45/french-bulldog-277255_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Brock", "Ciconia episcopus", 9, 3, "X5 M",
                "https://cdn.pixabay.com/photo/2021/12/21/16/38/dog-6885621_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Orelia", "Tayassu pecari", 13, 4, "Navigator",
                "https://cdn.pixabay.com/photo/2013/12/22/10/57/german-shepherd-232393_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Glenn", "Psittacula krameri", 5, 4, "CC",
                "https://cdn.pixabay.com/photo/2017/09/25/13/11/dog-2785066_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Carolann", "Connochaetus taurinus", 5, 3, "240",
                "https://cdn.pixabay.com/photo/2019/12/03/22/22/dog-4671215_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Rickey", "Globicephala melas", 15, 4, "Outlander",
                "https://cdn.pixabay.com/photo/2016/12/21/17/54/miniature-schnauzer-1923470_1280.jpg", null, null));
        mascotaRepository.save(new Mascota("Al", "Sylvicapra grimma", 18, 3, "CTS",
                "http://dummyimage.com/184x100.png/5fa2dd/ffffff", null, null));
        mascotaRepository.save(new Mascota("Henriette", "Dasypus septemcincus", 2, 3, "GX",
                "https://cdn.pixabay.com/photo/2016/03/05/17/52/rescue-1238145_1280.jpg", null, null));

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
