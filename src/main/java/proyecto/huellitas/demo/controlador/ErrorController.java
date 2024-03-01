package proyecto.huellitas.demo.controlador;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    
    @ExceptionHandler(NotFoundException.class)
    public String error(Model model, NotFoundException ex){

        model.addAttribute("id", ex.getId());

        return ("pagina_error");     
    }
}
