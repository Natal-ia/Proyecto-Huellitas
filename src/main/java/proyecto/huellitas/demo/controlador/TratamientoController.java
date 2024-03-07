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

import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.entidad.Tratamiento;
import proyecto.huellitas.demo.repositorio.MascotaRepository;
import proyecto.huellitas.demo.servicio.MascotaService;
import proyecto.huellitas.demo.servicio.TratamientoService;

@RequestMapping("/tratamientos")
@Controller
public class TratamientoController {

    @Autowired
    TratamientoService tratamientoService;
    @Autowired
    MascotaService mascotaService;
    @Autowired
    MascotaRepository mascotaRepository;

    @GetMapping("/all")
    public String mostrarTratamiento(Model model) {
        model.addAttribute("tratamientos", tratamientoService.SearchAll());
        return "mostrar_todos_tratamientos";
    }

    // http://localhost:8090/tratamientos/find/1
    @GetMapping("/find/{id}")
    public String mostrarInfoTratamiento(Model model, @PathVariable("id") Long identificacion) {
        Tratamiento tratamiento = tratamientoService.SearchById(identificacion);
        if (tratamiento != null) {
            model.addAttribute("tratamiento", tratamiento);
            return "mostrar_tratamientos";

        } else {
            return "pagina_error";
        }

    }

    // http://localhost:8090/mascotas/find?id=1
    @GetMapping("/find")
    public String mostrarInfoTratamiento2(Model model, @RequestParam("id") Long identificacion) {
        Tratamiento tratamiento = tratamientoService.SearchById(identificacion);
        if (tratamiento != null) {
            model.addAttribute("tratamiento", tratamiento);
            return "mostrar_tratamientos";

        } else {
            return "pagina_error";
        }
    }

    @GetMapping("/add")
    public String mostrarFormularioCrearTratamiento(Model model) {

        Tratamiento tratamiento = new Tratamiento("", "", "", "", "",null);

        model.addAttribute("tratamiento", tratamiento);

        return "crear_tratamiento";
    }
    
    @GetMapping("/add/{id}")	
    public String mostrarFormularioCrearTratamientoBackDetalle(Model model, @PathVariable("id") Long identificacion) {
        

        Tratamiento tratamiento = new Tratamiento("", "", "", "", "",null);

        model.addAttribute("tratamiento", tratamiento);

        return "crear_tratamiento";
    }





    @PostMapping("/agregar")
    public String agregarTratamiento(@ModelAttribute("tratamiento") Tratamiento tratamiento) {

        Mascota asociar = mascotaRepository.findById(tratamiento.getId()).orElse(null);
        if (asociar != null) {
            tratamiento.setMascota(asociar);
            tratamiento.setId(null);
            tratamientoService.Add(tratamiento);
        } else {
            // Handle the case when the associated client is not found
        }
        return "redirect:/tratamientos/all";
    }

    

    @GetMapping("/delete/{id}")
    public String borrarTratamiento(@PathVariable("id") Long identificacion){
        tratamientoService.DeleteById(identificacion);
        return "redirect:/tratamientos/all";
    }
    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model){
        System.out.println("id: " + identificacion);
        
        model.addAttribute("tratamiento", tratamientoService.SearchById(identificacion));
        return "modificar_tratamiento";
    }
    @PostMapping("/update/{id}")
    public String modificarTratamiento(@PathVariable("id") Long identificacion, @ModelAttribute("tratamiento") Tratamiento tratamiento){
        tratamientoService.Update(tratamiento);
        return "mostrar_tratamiento";        
    }
}







