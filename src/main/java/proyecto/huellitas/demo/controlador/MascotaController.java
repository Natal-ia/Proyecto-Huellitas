package proyecto.huellitas.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.servicio.MascotaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        
        Mascota mascota = new Mascota(0, "", "", 0, 0, "", "", "");
        
        model.addAttribute("mascota", mascota);

        return "crear_mascota";
    }

    @PostMapping("/agregar{masc }")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota){ 
       mascotaService.Add(mascota);
        return "redirect:/mascotas/all";
    }

    @GetMapping("/delete")
    public String borrarMascota (@RequestParam("id") int identificacion){
        mascotaService.DeleteById(identificacion);
        return "redirect:/mascotas/all";
    }
    
    @GetMapping("/update")
    public String mostrarFormularioUpdate(Model model, @RequestParam("id") int identificacion){
        model.addAttribute("mascota", mascotaService.SearchById(identificacion));
        return "modificar_mascota";
    }

    @PostMapping("/update/{id}")
    public String modificarMascota(@PathVariable("id") int identificacion, @ModelAttribute("mascota") Mascota mascota){
        mascotaService.Update(mascota);
        return "mostrar_mascotas";        
    }
}
    

