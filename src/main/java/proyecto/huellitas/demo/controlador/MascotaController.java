
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
import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.servicio.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    
    @Autowired
    MascotaService mascotaService;
    @Autowired
    ClienteService clienteService;

    @GetMapping("/all")
    public String mostrarMascotas(Model model){
        model.addAttribute("mascotas", mascotaService.SearchAll());
        return "mostrar_todas_mascotas";
    }

    // http://localhost:8090/mascotas/find/1
    @GetMapping("/find/{id}")
    public String mostrarInfoMascotas(Model model, @PathVariable("id") Long identificacion){
        Mascota mascota = mascotaService.SearchById(identificacion);
        if (mascota!=null) {
            model.addAttribute("mascota", mascota);
            return "mostrar_mascotas";
    
        }else{
            return "pagina_error";
        }
    
    }

        // http://localhost:8090/mascotas/find?id=1
    @GetMapping("/find")
    public String mostrarInfoMascotas2(Model model, @RequestParam("id") Long identificacion){
        Mascota mascota = mascotaService.SearchById(identificacion);
        if (mascota!=null) {
            model.addAttribute("mascota", mascota);
            return "mostrar_mascotas";
    
        }else{
            return "pagina_error";
        }
    }
    
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        
        Mascota mascota = new Mascota( "", "", 0, 0, "", "", "");
        
        model.addAttribute("mascota", mascota);

        return "crear_mascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute ("mascota") Mascota mascota){ 
       mascotaService.Add(mascota);
        return "redirect:/mascotas/all";
    }

    @GetMapping("/delete/{id}")
    public String borrarMascota(@PathVariable("id") Long identificacion){
        mascotaService.DeleteById(identificacion);
        return "redirect:/mascotas/all";
    }
    
    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model){
        model.addAttribute("mascota", mascotaService.SearchById(identificacion));
        return "modificar_mascota";
    }

    @PostMapping("/update/{id}")
    public String modificarMascota(@PathVariable("id") Long identificacion, @ModelAttribute("mascota") Mascota mascota){
        mascotaService.Update(mascota);
        return "mostrar_mascotas";        
    }
}
    

