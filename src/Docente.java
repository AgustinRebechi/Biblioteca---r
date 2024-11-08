import java.time.LocalDate;
import java.time.Period;

public class Docente extends Usuario {
    
    private LocalDate fechaIngreso;
    private int aniosAntiguedad;
    private int prestamosDisponibles;

    //Constructor

    public Docente (String nombre, int dni, LocalDate fechaIngreso){
        super(nombre, dni);
        this.fechaIngreso = fechaIngreso;
        this.aniosAntiguedad = calcularAnios(fechaIngreso);
        this.prestamosDiponibles = aniosAntiguedad;
    }

    // metodos

    public int calcularAnios(LocalDate fechaIngreso){
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }
    
    @Override
    public int getPrestamosDisponibles(){
        return prestamosDisponibles;
    }  

}
