public class Estudiante extends Usuario {

    private int prestamosDisponibles;

    //Constructor

    public Estudiante (String nombre, int dni){
        super(nombre,dni);
        this.prestamosDisponibles = 2; 
    }

    @Override
    public int getPrestamosDisponibles(){
        return prestamosDisponibles;
    }  
}
