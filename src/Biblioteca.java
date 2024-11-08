import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Docente> docentes;
    private List<Prestamo> prestamos;
    private List<Libro> libros;

    //Constructor

    public Biblioteca (String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    // metodos

    public Estudiante registrarEstudiante(String nombre, int dni){
        Estudiante estudiante = new Estudiante(nombre,dni);
        for(Estudiante otroEstudiante : estudiantes){
            if(estudiante.equals(otroEstudiante)){
                System.out.println("el estudiante ya exite");
                return null;
            }
        }
        estudiantes.add(estudiante);
        return estudiante;
    }

    public Docente registrarDocente(String nombre, int dni, LocalDate fechaIngreso){
        Docente docente = new Docente(nombre,dni,fechaIngreso);
        for(Docente otroDocente : docentes){
            if(docente.equals(otroDocente)){
                System.out.println("el docente ya exite");
                return null;
            }
        }
        docentes.add(docente);
        return docente;
    }

    public Libro registrarLibro(String titulo, String autor){
        Libro libro = new Libro (titulo,autor);
        for(Libro otroLibro : libros){
            if(libro.equals(otroLibro)){
                System.out.println("el libro ya exite");
                libro.yaNoEsUnico();
                return null;
            }
        }
        libros.add(libro);
        return libro;
    }

    public Prestamo registrarPrestamo(Usuario usuario, Libro libro){
        Prestamo prestamo = new Prestamo(LocalDate.now(), libro, usuario);
        //usuario puede pedir prestamos?
        if(usuario.getPrestamosDisponibles() > 0 ){
            if(libro.getEsUnico()){
                if(libro.getEstado()){
                    prestamos.add(prestamo);
                    libro.estaPrestado();
                    return prestamo;
                }else{
                    System.out.println("no esta disponiible el libraco");
                    return null;
                }
            }else{
                prestamos.add(prestamo);
                libro.estaPrestado();
                return prestamo;
            }
        }else{
            System.out.println("No tienes mas prestamos disponibles");
            return null;
        }
    }

    public void devolverPrestamo(Prestamo prestamo){
        prestamo.devolverPrestamo();
        prestamo.getLibro().estaDisponible(); //a
    }

    


}
