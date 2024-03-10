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

import proyecto.huellitas.demo.entidad.Veterinario;
import proyecto.huellitas.demo.servicio.VeterinarioService;

@RequestMapping("/veterinarios")
@Controller
public class VeterinarioController {
    @Autowired
    VeterinarioService veterinarioService;
    @GetMapping("/all")
    public String mostrarVeterinarios(Model model) {
        model.addAttribute("veterinarios", veterinarioService.SearchAll());
        return "mostrar_todos_veterinarios";
    }

    @GetMapping("/find/{id}")
    public String mostrarInfoVeterinarioConMascotas(Model model, @PathVariable("id") Long identificacion) {
        Veterinario veterinario = veterinarioService.SearchById(identificacion);
        model.addAttribute("veterinario", veterinario);
        return "mostrar_veterinario";

    }

    // http://localhost:8090/mascotas/find?id=1
    @GetMapping("/find")
    public String mostrarInfoVeterinarios2(Model model, @RequestParam("id") Long identificacion) {
        model.addAttribute("veterinario", veterinarioService.SearchById(identificacion));
        return "mostrar_veterinario";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Veterinario veterinario = new Veterinario("", "", "", 0,"");

        model.addAttribute("veterinario", veterinario);

        return "crear_veterinario";
    }

    @PostMapping("/agregar")
    public String agregarVeterinario(@ModelAttribute("veterinario") Veterinario veterinario) {
        veterinarioService.Add(veterinario);
        return "redirect:/veterinarios/all";
    }

    @GetMapping("/delete/{id}")
    public String borrarVeterinario(@PathVariable("id") Long identificacion) {
        veterinarioService.DeleteById(identificacion);

        return "redirect:/veterinarios/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model) {
        model.addAttribute("veterinario", veterinarioService.SearchById(identificacion));
        return "modificar_veterinario";
    }

    @PostMapping("/update/{id}")
    public String modificarVeterinario(@PathVariable("id") int identificacion, @ModelAttribute("veterinario") Veterinario veterinario) {
        veterinarioService.Update(veterinario);
        return "redirect:/veterinarios/find/" + identificacion;
    }



}
