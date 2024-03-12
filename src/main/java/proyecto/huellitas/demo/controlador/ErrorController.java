package proyecto.huellitas.demo.controlador;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    
    @ExceptionHandler(NotFoundException.class)
    public String error(NotFoundException ex){
        return ("pagina_error");     
    }
}
