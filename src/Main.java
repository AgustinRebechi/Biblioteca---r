import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Docente ana = biblioteca.registrarDocente("Ana López",35234111, LocalDate.of(2010, 1, 1));
        Docente carlos = biblioteca.registrarDocente("Carlos Pérez", 40234111, LocalDate.of(2015, 1, 1));

        Estudiante laura = biblioteca.registrarEstudiante("Laura Gómez", 45234111);
        Estudiante juan = biblioteca.registrarEstudiante("Juan Rodríguez", 50234111);
 
        Libro cien_anios = biblioteca.registrarLibro("Cien años de soledad", "Gabriel García Márquez");
        Libro sapiens = biblioteca.registrarLibro("Sapiens: De animales a dioses", "Yuval Noah Harari");
        Libro nombre_de_la_rosa = biblioteca.registrarLibro("El nombre de la rosa", "Umberto Eco");
        Libro breves_respuestas = biblioteca.registrarLibro("Breves respuestas a las grandes preguntas", "Stephen Hawking");

        Prestamo prestamo1 = biblioteca.registrarPrestamo(ana, cien_anios);
        Prestamo prestamo2 = biblioteca.registrarPrestamo(carlos, sapiens);
        Prestamo prestamo3 = biblioteca.registrarPrestamo(laura, nombre_de_la_rosa);
        Prestamo prestamo4 = biblioteca.registrarPrestamo(ana, breves_respuestas);

        biblioteca.devolverPrestamo(prestamo1);  // Ana devuelve el libro "Cien años de soledad"
        biblioteca.devolverPrestamo(prestamo2);  // Carlos devuelve "Sapiens: De animales a dioses"

        System.out.println("Préstamos registrados de la Biblioteca Central:");
        biblioteca.mostrarPrestamos();

        System.out.println("\nPréstamos activos (no devueltos):");
        biblioteca.mostrarPrestamosActivos();

        System.out.println("\nUsuarios con prestamos activos:");
        biblioteca.mostrarUsuariosConPrestamos();

    }
}