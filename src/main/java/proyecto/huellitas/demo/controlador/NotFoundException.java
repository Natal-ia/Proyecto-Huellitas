package proyecto.huellitas.demo.controlador;

public class NotFoundException extends RuntimeException {

    private int id;

    public NotFoundException(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
