package proyecto.huellitas.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.huellitas.demo.entidad.Cliente;
import proyecto.huellitas.demo.entidad.Mascota;
import proyecto.huellitas.demo.servicio.ClienteService;
import proyecto.huellitas.demo.servicio.MascotaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/clientes")
@Controller
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    @Autowired
    ClienteService mascotaService;

    @GetMapping("/all")
    public String mostrarClientes(Model model) {
        model.addAttribute("clientes", clienteService.SearchAll());
        return "mostrar_clientes";
    }

    

   
    // http://localhost:8090/mascotas/find/1
   /* 
    @GetMapping("/find/{id}")
    public String mostrarInfoClientes(Model model, @PathVariable("id") int identificacion) {

        model.addAttribute("clientes", clienteService.SearchById(identificacion));
        return "mostrar_cliente";
    }
    */

    @GetMapping("/find/{id}")
    public String mostrarInfoClienteConMascotas(Model model, @PathVariable("id") Long identificacion) {
        Cliente cliente = clienteService.SearchById(identificacion);
        if (cliente!=null) {
            model.addAttribute("cliente", cliente);
            return "mostrar_cliente";
        }else{
            throw new NotFoundException();
        }
     
    }

    @GetMapping("/loginCliente")
    public String mostrarInfoClienteLogin(Model model, @RequestParam("id") Long identificacion) {
        Cliente cliente = clienteService.SearchById(identificacion);
        model.addAttribute("cliente", cliente);
       
        if(cliente != null){
            return "mostrar_cliente_vista";
        }
        else{
            return "login";
        }
    }
    // http://localhost:8090/mascotas/find?id=1
    @GetMapping("/find")
    public String mostrarInfoClientes2(Model model, @RequestParam("id") Long identificacion) {
        model.addAttribute("cliente", clienteService.SearchById(identificacion));
        return "mostrar_cliente";
    }
        
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Cliente cliente = new Cliente("", "", "", "", null);

        model.addAttribute("cliente", cliente);

        return "crear_cliente";
    }

    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("cliente") Cliente cliente) {
        clienteService.Add(cliente);
        return "redirect:/clientes/all";
    }
    
    @GetMapping("/delete/{id}")
    public String borrarCliente(@PathVariable("id") Long identificacion) {
        clienteService.DeleteById(identificacion);
        return "redirect:/clientes/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long identificacion, Model model) {
        model.addAttribute("cliente", clienteService.SearchById(identificacion));
        return "modificar_cliente";
    }


    @PostMapping("/update/{id}")
    public String modificarCliente(@PathVariable("id") int identificacion, @ModelAttribute("cliente") Cliente cliente) {
        clienteService.Update(cliente);
        return "redirect:/clientes/find/" + identificacion;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
