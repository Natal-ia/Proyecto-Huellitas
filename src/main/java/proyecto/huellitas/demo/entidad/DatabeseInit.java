package proyecto.huellitas.demo.entidad;

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
                clienteRepository.save(new Cliente("Juan", "a@a.com", "123456789", null));
                clienteRepository.save(new Cliente("pepe", "a@aaa.com", "123456789", null));
                clienteRepository.save(new Cliente("luis", "rrrreee@a.com", "123456789", null));
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
                clienteRepository.save(new Cliente("Dorita McIlwrick", "dorita@example.com", "123456789", null));
                clienteRepository.save(new Cliente("Eddy Plett", "eddy@example.com", "123456789", null));
                clienteRepository.save(new Cliente("Cristine Curnok", "cristine@example.com", "123456789", null));
                clienteRepository.save(new Cliente("Cristine Curnok", "cristine@example.com", "123456789", null));
                clienteRepository.save(new Cliente("Inga Dodding", "idodding0@list-manage.com", "887-92-3144", null));
                clienteRepository.save(new Cliente("Linn Pucknell", "lpucknell1@dailymail.co.uk", "718-80-4949", null));
                clienteRepository.save(new Cliente("Far Batty", "fbatty2@mac.com", "102-10-7573", null));
                clienteRepository.save(new Cliente("Essa Puttrell", "eputtrell3@statcounter.com", "380-12-0773", null));
                clienteRepository.save(new Cliente("Standford Seleway", "sseleway4@va.gov", "203-59-6167", null));
                clienteRepository.save(
                                new Cliente("Donovan Avrahamov", "davrahamov5@elegantthemes.com", "331-38-6411", null));
                clienteRepository.save(
                                new Cliente("Madella Sapsforde", "msapsforde6@bloglovin.com", "495-45-4984", null));
                clienteRepository.save(new Cliente("Nikolaus Tregea", "ntregea7@webs.com", "762-15-6044", null));
                clienteRepository.save(new Cliente("Lora Wolver", "lwolver8@smugmug.com", "147-82-1698", null));
                clienteRepository.save(
                                new Cliente("Jacquelyn Pendlebery", "jpendlebery9@csmonitor.com", "321-74-7530", null));
                clienteRepository
                                .save(new Cliente("Veronike Frostdyke", "vfrostdykea@sphinn.com", "140-51-5637", null));
                clienteRepository.save(new Cliente("Teddi Rebert", "trebertb@weather.com", "768-03-4954", null));
                clienteRepository.save(new Cliente("Hattie Coulter", "hcoulterc@ted.com", "781-69-6652", null));
                clienteRepository.save(new Cliente("Angie Gabites", "agabitesd@canalblog.com", "532-52-6736", null));
                clienteRepository.save(
                                new Cliente("Bartolomeo Thomerson", "bthomersone@about.com", "619-01-0729", null));
                clienteRepository
                                .save(new Cliente("Hunfredo Barttrum", "hbarttrumf@symantec.com", "249-96-5977", null));
                clienteRepository.save(new Cliente("Eryn Deadman", "edeadmang@wunderground.com", "829-35-6354", null));
                clienteRepository.save(new Cliente("Clare Deporte", "cdeporteh@google.cn", "710-13-1688", null));
                clienteRepository.save(new Cliente("Violante Stoffels", "vstoffelsi@histats.com", "359-46-8204", null));
                clienteRepository.save(new Cliente("Lyndel Crummie", "lcrummiej@infoseek.co.jp", "855-40-0884", null));
                clienteRepository.save(
                                new Cliente("Gerik Dimblebee", "gdimblebeek@acquirethisname.com", "277-50-0922", null));
                clienteRepository.save(new Cliente("Markos Couvert", "mcouvertl@over-blog.com", "881-66-4509", null));
                clienteRepository.save(new Cliente("Arne Daunay", "adaunaym@booking.com", "331-62-5304", null));
                clienteRepository.save(
                                new Cliente("Eadmund MacCaughey", "emaccaugheyn@bizjournals.com", "310-70-3962", null));
                clienteRepository.save(new Cliente("Lamar Baulk", "lbaulko@csmonitor.com", "849-65-6156", null));
                clienteRepository.save(new Cliente("Ludovika Elger", "lelgerp@flickr.com", "558-62-1007", null));
                clienteRepository.save(new Cliente("Olympia Hebblewhite", "ohebblewhiteq@wikispaces.com", "712-41-3602",
                                null));
                clienteRepository
                                .save(new Cliente("Ronny Ivison", "rivisonr@merriam-webster.com", "287-68-1729", null));
                clienteRepository.save(new Cliente("Karina Kubat", "kkubats@tmall.com", "689-96-8771", null));
                clienteRepository.save(new Cliente("Bail Rosenberg", "brosenbergt@tinyurl.com", "613-65-5304", null));
                clienteRepository
                                .save(new Cliente("Sully Archibold", "sarchiboldu@instagram.com", "891-98-6665", null));
                clienteRepository
                                .save(new Cliente("Garrek Avramov", "gavramovv@miitbeian.gov.cn", "790-32-3602", null));
                clienteRepository.save(
                                new Cliente("Goddard Bleesing", "gbleesingw@chronoengine.com", "361-37-8942", null));
                clienteRepository.save(new Cliente("Amara Botger", "abotgerx@statcounter.com", "113-63-8727", null));
                clienteRepository.save(new Cliente("Mella Julian", "mjuliany@yellowbook.com", "220-45-7482", null));
                clienteRepository.save(new Cliente("Care Tunesi", "ctunesiz@wired.com", "177-44-8449", null));
                clienteRepository
                                .save(new Cliente("Loria Kirtley", "lkirtley10@surveymonkey.com", "341-89-6941", null));
                clienteRepository.save(new Cliente("Deidre Morena", "dmorena11@army.mil", "864-31-0722", null));
                clienteRepository.save(new Cliente("Riannon Bigrigg", "rbigrigg12@google.cn", "273-65-6716", null));
                clienteRepository.save(new Cliente("Sibeal Cranmore", "scranmore13@unesco.org", "415-62-2357", null));
                clienteRepository.save(new Cliente("Laverne Sutch", "lsutch14@themeforest.net", "215-54-7210", null));
                clienteRepository.save(new Cliente("Ashlan Brazener", "abrazener15@ucoz.ru", "134-02-7521", null));
                clienteRepository
                                .save(new Cliente("Loralyn Grinnell", "lgrinnell16@amazon.co.uk", "544-70-0423", null));
                clienteRepository.save(
                                new Cliente("Massimiliano Axtonne", "maxtonne17@scribd.com", "791-22-0192", null));
                clienteRepository.save(
                                new Cliente("Westleigh Brockway", "wbrockway18@liveinternet.ru", "712-88-4619", null));
                clienteRepository.save(
                                new Cliente("Sherie McGarrahan", "smcgarrahan19@google.com.br", "717-95-0450", null));
                clienteRepository.save(
                                new Cliente("Theodore Filipic", "tfilipic1a@ycombinator.com", "270-37-3996", null));
                clienteRepository.save(new Cliente("Caty Broggini", "cbroggini1b@cbslocal.com", "888-42-8535", null));
                clienteRepository.save(new Cliente("Davin Charke", "dcharke1c@phpbb.com", "808-37-8498", null));
                clienteRepository.save(new Cliente("Felicio Bownd", "fbownd1d@woothemes.com", "271-90-7105", null));
                clienteRepository
                                .save(new Cliente("Louise Cornelius", "lcornelius1e@twitpic.com", "680-94-7303", null));
                clienteRepository.save(
                                new Cliente("Milt Gallimore", "mgallimore1f@guardian.co.uk", "726-89-8921", null));
                clienteRepository.save(new Cliente("Correy Losebie", "closebie1g@moonfruit.com", "300-24-6075", null));
                clienteRepository.save(new Cliente("Joeann Pechacek", "jpechacek1h@columbia.edu", "273-07-7332", null));
                clienteRepository.save(new Cliente("Faydra Buller", "fbuller1i@1und1.de", "545-82-2233", null));
                clienteRepository.save(new Cliente("Felice Melia", "fmelia1j@shutterfly.com", "215-95-5766", null));
                clienteRepository.save(
                                new Cliente("Son Liddyard", "sliddyard1k@networkadvertising.org", "659-13-8102", null));
                clienteRepository.save(
                                new Cliente("Bernardina Grunwald", "bgrunwald1l@census.gov", "612-55-0571", null));
                clienteRepository.save(
                                new Cliente("Claiborne Nesfield", "cnesfield1m@sina.com.cn", "557-33-2732", null));
                clienteRepository.save(new Cliente("Constanta Jon", "cjon1n@pbs.org", "416-63-0636", null));
                clienteRepository.save(
                                new Cliente("Brennan Wetwood", "bwetwood1o@theatlantic.com", "774-73-8762", null));
                clienteRepository.save(new Cliente("Sarge Janoschek", "sjanoschek1p@dropbox.com", "533-45-0846", null));
                clienteRepository.save(new Cliente("Blondell Isakov", "bisakov1q@ft.com", "425-68-2435", null));
                clienteRepository.save(new Cliente("Jean Clevely", "jclevely1r@netlog.com", "172-89-8612", null));
                clienteRepository.save(
                                new Cliente("Leilah McWhirter", "lmcwhirter1s@biglobe.ne.jp", "419-47-2153", null));
                clienteRepository.save(new Cliente("Florida Heddan", "fheddan1t@who.int", "493-48-6448", null));
                clienteRepository.save(new Cliente("Derron Malden", "dmalden1u@ucsd.edu", "191-58-6489", null));
                clienteRepository.save(new Cliente("Jolie Gallant", "jgallant1v@youtube.com", "603-53-7874", null));
                clienteRepository.save(new Cliente("Bat Samart", "bsamart1w@istockphoto.com", "162-37-5168", null));
                clienteRepository.save(new Cliente("Lorne Henken", "lhenken1x@imgur.com", "791-17-4173", null));
                clienteRepository.save(new Cliente("Maddalena Warin", "mwarin1y@com.com", "580-21-3936", null));
                clienteRepository.save(
                                new Cliente("Giuseppe Minnette", "gminnette1z@linkedin.com", "808-09-2858", null));
                clienteRepository
                                .save(new Cliente("Angela Biasio", "abiasio20@ezinearticles.com", "667-96-2633", null));
                clienteRepository
                                .save(new Cliente("Aundrea McTiernan", "amctiernan21@sbwire.com", "393-55-8102", null));
                clienteRepository.save(new Cliente("Flossy Cheyne", "fcheyne22@soup.io", "676-34-7458", null));
                clienteRepository.save(new Cliente("Fabiano Rudgley", "frudgley23@nbcnews.com", "398-76-8281", null));
                clienteRepository.save(
                                new Cliente("Merwin Shoorbrooke", "mshoorbrooke24@furl.net", "243-37-7874", null));
                clienteRepository.save(new Cliente("Cornelius Dermot", "cdermot25@bluehost.com", "405-64-6878", null));
                clienteRepository.save(new Cliente("Valida Beart", "vbeart26@meetup.com", "478-33-6771", null));
                clienteRepository.save(new Cliente("Letizia Wattins", "lwattins27@mail.ru", "625-56-8938", null));
                clienteRepository.save(new Cliente("Valdemar Iremonger", "viremonger28@army.mil", "417-28-6206", null));
                clienteRepository.save(new Cliente("Huntley Seleway", "hseleway29@cdc.gov", "352-60-7177", null));
                clienteRepository.save(new Cliente("Gaynor Lucock", "glucock2a@sourceforge.net", "769-80-5315", null));
                clienteRepository.save(new Cliente("Katalin Casiroli", "kcasiroli2b@github.io", "308-83-8445", null));
                clienteRepository
                                .save(new Cliente("Frannie Adamowitz", "fadamowitz2c@flavors.me", "126-55-7094", null));
                clienteRepository.save(new Cliente("Shirlene Liepina", "sliepina2d@tumblr.com", "371-79-6185", null));
                clienteRepository.save(new Cliente("Levey Margetts", "lmargetts2e@foxnews.com", "676-87-2946", null));
                clienteRepository.save(new Cliente("Rozina Huncote", "rhuncote2f@forbes.com", "547-36-4024", null));
                clienteRepository.save(new Cliente("Udale Dunkerley", "udunkerley2g@bbc.co.uk", "498-31-9026", null));
                clienteRepository.save(new Cliente("Roz Cocklin", "rcocklin2h@1688.com", "695-16-2262", null));
                clienteRepository.save(new Cliente("Alexis McGinnis", "amcginnis2i@fotki.com", "576-43-8807", null));
                clienteRepository.save(new Cliente("Patty Pleace", "ppleace2j@dailymotion.com", "411-72-6120", null));
                clienteRepository.save(new Cliente("Vic Furnival", "vfurnival2k@bizjournals.com", "388-53-4533", null));
                clienteRepository.save(new Cliente("Jilly Forst", "jforst2l@blog.com", "114-31-6953", null));
                clienteRepository.save(new Cliente("Hebert Curphey", "hcurphey2m@wsj.com", "449-54-6783", null));
                clienteRepository.save(new Cliente("Elizabet Dows", "edows2n@blogtalkradio.com", "898-52-2597", null));
                clienteRepository.save(
                                new Cliente("Jessie Lorenzetti", "jlorenzetti2o@apache.org", "160-52-6615", null));
                clienteRepository.save(new Cliente("Adelle Cattermull", "acattermull2p@de.vu", "108-16-1988", null));
                clienteRepository.save(new Cliente("Carena Kemson", "ckemson2q@un.org", "836-52-1256", null));
                clienteRepository.save(new Cliente("Gianna Rubinowicz", "grubinowicz2r@php.net", "470-94-1685", null));

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

                                               tratamientoRepository.save(new Tratamiento(null, "Networked interactive conglomeration", "2023-05-25", "2023-11-14", null, null));
tratamientoRepository.save(new Tratamiento(null, "Total neutral knowledge base", "2023-03-12", "2023-12-05", null, null));
tratamientoRepository.save(new Tratamiento(null, "Cross-group attitude-oriented protocol", "2023-10-12", "2023-07-11", null, null));
tratamientoRepository.save(new Tratamiento(null, "Vision-oriented grid-enabled Graphic Interface", "2023-10-20", "2023-07-14", null, null));
tratamientoRepository.save(new Tratamiento(null, "Inverse optimizing local area network", "2023-10-28", "2023-12-07", null, null));
tratamientoRepository.save(new Tratamiento(null, "Multi-lateral 24/7 artificial intelligence", "2023-03-22", "2023-07-17", null, null));
tratamientoRepository.save(new Tratamiento(null, "Reactive empowering firmware", "2023-08-31", "2023-03-21", null, null));
tratamientoRepository.save(new Tratamiento(null, "Seamless high-level collaboration", "2023-10-26", "2023-10-14", null, null));
tratamientoRepository.save(new Tratamiento(null, "Assimilated mobile leverage", "2024-01-04", "2024-02-22", null, null));
tratamientoRepository.save(new Tratamiento(null, "Assimilated clear-thinking paradigm", "2023-05-07", "2023-09-22", null, null));
tratamientoRepository.save(new Tratamiento(null, "Networked local forecast", "2024-02-05", "2023-08-25", null, null));
tratamientoRepository.save(new Tratamiento(null, "Public-key bi-directional hierarchy", "2023-05-16", "2023-06-05", null, null));
tratamientoRepository.save(new Tratamiento(null, "Innovative multi-state productivity", "2023-10-28", "2023-04-05", null, null));
tratamientoRepository.save(new Tratamiento(null, "Function-based logistical adapter", "2023-03-16", "2023-12-01", null, null));
tratamientoRepository.save(new Tratamiento(null, "Programmable upward-trending workforce", "2023-08-24", "2023-09-15", null, null));
tratamientoRepository.save(new Tratamiento(null, "User-friendly next generation neural-net", "2023-08-21", "2023-04-09", null, null));
tratamientoRepository.save(new Tratamiento(null, "Focused cohesive alliance", "2023-05-16", "2023-08-11", null, null));
tratamientoRepository.save(new Tratamiento(null, "Intuitive contextually-based secured line", "2023-09-28", "2023-11-18", null, null));
tratamientoRepository.save(new Tratamiento(null, "Multi-lateral explicit database", "2023-05-15", "2023-05-14", null, null));
tratamientoRepository.save(new Tratamiento(null, "Progressive composite project", "2023-06-07", "2023-12-04", null, null));

            

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

                // asociar mascotas a clientes
                Long cont = 1L;
                Boolean flag = false;
                for (Mascota ms : mascotaRepository.findAll()) {
                        Cliente asociar = clienteRepository.findById(cont).get();
                        ms.setCliente(asociar);
                        mascotaRepository.save(ms);
                        if (flag) {
                                cont += 1;
                        }
                        flag = !flag;
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
