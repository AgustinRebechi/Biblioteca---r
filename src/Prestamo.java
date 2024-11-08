import java.time.LocalDate;

public class Prestamo {

    private int id;
    private LocalDate fechaSolicitud;
    private LocalDate fechaDevolucion;
    private boolean fueDevuelto;
    private static int idInc = 1;
    private Usuario usuario;
    private Libro libro;

    //Constructor

    public Prestamo (LocalDate fechaSolicitud, Libro libro, Usuario usuario){
        this.id = idInc;
        idInc++;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDevolucion = null;
        this.libro = libro;
        this.usuario = usuario;
        this.fueDevuelto = false;
    }

    // metodos

    public void devolverPrestamo(){
        this.fueDevuelto = true;
        this.fechaDevolucion = LocalDate.now();
    }

    // Getter

    public Libro getLibro(){
        return libro;
    }

    public Libro getTitulo(){
        return libro;
    }

    public boolean getFueDevuelto(){
        return fueDevuelto;
    }

    public Usuario getUsuario(){
        return usuario;
    }



    @Override
    public String toString(){
        return "Préstamo ID: " + id +
                ", Fecha de Solicitud: " + fechaSolicitud +
                ", Fecha de Devolución: " + (fueDevuelto ? fechaDevolucion : "No devuelto") +
                ", Usuario: " + usuario.getNombre() +
                ", Libro: " + libro.getTitulo();

    }
}
