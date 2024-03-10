package proyecto.huellitas.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.huellitas.demo.entidad.Droga;
import proyecto.huellitas.demo.servicio.DrogaService;

@RequestMapping("/drogas")
@Controller
public class DrogaController {
    @Autowired
    DrogaService drogaService;

    @GetMapping("/all")
    public String mostrarDrogas(Model model) {
        model.addAttribute("drogas", drogaService.SearchAll());
        return "mostrar_todas_drogas";
    }

    @GetMapping("/find/{id}")
    public String mostrarInfoDrogaConMascotas(Model model, @PathVariable("id") Long identificacion) {
        Droga droga = drogaService.SearchById(identificacion);
        model.addAttribute("droga", droga);
        return "mostrar_droga";

    }

    // http://localhost:8090/mascotas/find?id=1
    @GetMapping("/find")
    public String mostrarInfoDrogas2(Model model, @RequestParam("id") Long identificacion) {
        model.addAttribute("droga", drogaService.SearchById(identificacion));
        return "mostrar_droga";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Droga droga = new Droga("", 0.0, 0.0, 0, 0);

        model.addAttribute("droga", droga);

        return "crear_droga";
    }

    @PostMapping("/agregar")
    public String agregarDroga(@ModelAttribute("droga") Droga droga) {
        drogaService.Add(droga);
        return "redirect:/drogas/all";
    }

    @GetMapping("/delete/{id}")
    public String borrarDroga(@PathVariable("id") Long identificacion) {
        drogaService.DeleteById(identificacion);

        return "redirect:/drogas/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model) {
        model.addAttribute("droga", drogaService.SearchById(identificacion));
        return "modificar_droga";
    }

    @PostMapping("/update/{id}")
    public String modificarDroga(@PathVariable("id") int identificacion, @ModelAttribute("droga") Droga droga) {
        drogaService.Update(droga);
        return "redirect:/drogas/find/" + identificacion;
    }

}
