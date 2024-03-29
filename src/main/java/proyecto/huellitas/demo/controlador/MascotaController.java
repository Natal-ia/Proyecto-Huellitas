
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
import proyecto.huellitas.demo.repositorio.ClienteRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    
    @Autowired
    MascotaService mascotaService;
    @Autowired
    ClienteService clienteService;

    @Autowired
    ClienteRepository clienteRepository;


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
            throw new NotFoundException();
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
            throw new NotFoundException();
        }
    }
    
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        
        Mascota mascota = new Mascota( "", "", 0, 0, "", "",null, null);
        
        model.addAttribute("mascota", mascota);

        return "crear_mascota";
    }

    @PostMapping("/agregar")
public String agregarMascota(@ModelAttribute("mascota") Mascota mascota) { 
    
    Cliente asociar = clienteRepository.findById(mascota.getId()).orElse(null);
    if (asociar != null) {
        mascota.setCliente(asociar);
        mascota.setId(null);
        mascotaService.Add(mascota);
    } else {    
        // Handle the case when the associated client is not found
    }
    return "redirect:/mascotas/all";
}
    
    @GetMapping("/delete/{id}")
    public String borrarMascota(@PathVariable("id") Long identificacion){
        mascotaService.DeleteById(identificacion);
        return "redirect:/mascotas/all";
    }
    @GetMapping("/deactivate/{id}")
    public String changeStateMascota(@PathVariable("id") Long identificacion){
        mascotaService.changeState(identificacion);
        return "redirect:/mascotas/all";
    }

    @GetMapping("/activate/{mascotaId}/{clientId}")
    public String changeStateMascota2(@PathVariable("mascotaId") Long mascotaId, @PathVariable("clientId") Long clientId) {
        mascotaService.changeState(mascotaId);
        return "redirect:/clientes/find?id=" + clientId;
    }
    
    
    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model){
        System.out.println("id: " + identificacion);
        
        model.addAttribute("mascota", mascotaService.SearchById(identificacion));
        return "modificar_mascota";
        
    }

    @PostMapping("/update/{id}")
    public String modificarMascota(@PathVariable("id") Long identificacion, @ModelAttribute("mascota") Mascota mascota){
        mascotaService.Update(mascota);
        //return "mostrar_mascotas";  
        return "redirect:/mascotas/find/" + identificacion;      
    }
}
    

