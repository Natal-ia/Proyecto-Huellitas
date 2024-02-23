package proyecto.huellitas.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.huellitas.demo.servicio.MascotaService;

@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    
    @Autowired
    MascotaService mascotaService;

    @GetMapping("/all")
    public String mostrarMascotas(Model model){
        model.addAttribute("mascotas", mascotaService.SearchAll());
        return "mostrar_todas_mascotas";
    }

    // http://localhost:8090/mascotas/find/1
    @GetMapping("/find/{id}")
    public String mostrarInfoMascotas(Model model, @PathVariable("id") int identificacion){

        model.addAttribute("mascotas", mascotaService.SearchById(identificacion));
        return "mostrar_mascotas";
    }

        // http://localhost:8090/mascotas/find?id=1
        @GetMapping("/find")
        public String mostrarInfoMascotas2(Model model, @RequestParam("id") int identificacion){
            model.addAttribute("mascota", mascotaService.SearchById(identificacion));
            return "mostrar_mascotas";
        }

}
